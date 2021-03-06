/* ===========================================================================
 * Copyright (C) 2017 CapsicoHealth Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tilda.loader.csv;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import tilda.db.Connection;
import tilda.loader.csv.stores.CSVImporter.Results;
import tilda.loader.parser.DataObject;
import tilda.utils.DurationUtil;
import tilda.utils.NumberFormatUtil;
import tilda.utils.TextUtil;

public class ImportProcessor
  {
    protected static final Logger LOG = LogManager.getLogger(ImportProcessor.class.getName());

    /*
     * Launch and Shutdown threads
     */
    public static long parallelProcess(List<String> connectionIds, String rootFolder, int threadsCount, List<DataObject> CMSDataList)
      {
        ExecutorService pool = Executors.newFixedThreadPool(threadsCount);
        List<Future<List<Results>>> futures = new ArrayList<>();

        List<Results> Results = new ArrayList<Results>();
        for (DataObject Data : CMSDataList)
          {
            validate(Data);
            for (String connectionId : connectionIds)
              {
                Callable<List<Results>> thread = new ImporterThread(connectionId, rootFolder, Data);
                Future<List<Results>> future = pool.submit(thread);
                futures.add(future);
              }
          }

        Iterator<Future<List<Results>>> iterator = futures.iterator();
        while (iterator.hasNext())
          {
            Future<List<Results>> future = iterator.next();
            List<Results> Res;
            try
              {
                Res = future.get();
              }
            catch (InterruptedException | ExecutionException e)
              {
                LOG.error("Exception in one of the ImporterThread's..", e);
                Res = null;
              }
            if (Res == null)
              break;
            Results.addAll(Res);
          }

        pool.shutdownNow();

        long totalCount = 0;
        long totalNano = 0;
        Set<String> Names = new HashSet<String>();
        List<String> errFiles = new ArrayList<String>();
        for (Results R : Results)
          {
            Names.add(R._SchemaName + "." + R._TableName);
            totalCount += R._RecordsCount;
            totalNano += R._TimeNano;
            if (R._RecordsCount == 0)
              {
                errFiles.add("       - "+R._FileName);
              }
            else
              {
                LOG.debug("Processed file " + R._FileName + " into table " + R._TableName
                + " with " + NumberFormatUtil.printWith000Sep(R._RecordsCount) + " records in CPU-Time of " + DurationUtil.printDuration(R._TimeNano) +
                " (" + DurationUtil.printPerformancePerMinute(R._TimeNano, R._RecordsCount) + " Records/min)");
              }
          }
        LOG.debug("\n--------------------------------------------------------------------------------------------------------------\n"
        + "   In total, Processed " + Results.size() + " file(s) populating " + Names.size() + " table(s)"+(errFiles.isEmpty() == true ? ".":" with "+errFiles.size()+" error(s):")+"\n"
        + (errFiles.isEmpty() == true ? "" : TextUtil.print(errFiles.iterator(), "\n")+"\n")
        + "   In total, processed " + NumberFormatUtil.printWith000Sep(totalCount) + " records in CPU-Time of " + DurationUtil.printDuration(totalNano) + " (" + DurationUtil.printPerformancePerMinute(totalNano, totalCount) + " Records/min)\n");
        return totalCount;
      }


    public static boolean truncateTable(Connection C, String SchemaName, String TableName, boolean Cascade)
      {
        try
          {
            C.truncateTable(SchemaName, TableName, Cascade);
            C.commit();
          }
        catch (Exception e)
          {
            LOG.error("Error in the truncating tables: ", e);
            return false;
          }
        return true;
      }

    private static void validate(DataObject data)
      {
        // TODO Auto-generated method stub

      }
  }
