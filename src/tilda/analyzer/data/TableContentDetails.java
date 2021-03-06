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

package tilda.analyzer.data;

import java.util.ArrayList;
import java.util.List;

import tilda.analyzer.bean.Database;
import tilda.analyzer.bean.Table;
import tilda.analyzer.helper.DateHelper;
import com.google.gson.annotations.SerializedName;

import tilda.db.Connection;

public class TableContentDetails
  {
    /*@formatter:off*/
    @SerializedName("name"    )public String _Name;
    @SerializedName("created"    )public String _Created;
    @SerializedName("timingNS"    )public long  _Timing;
    @SerializedName("columns"    )public List<String> _Columns = new ArrayList<String>();
    @SerializedName("totalrows"    )public Long   _TotalRows ;
    @SerializedName("totalrulerowcount"    )public List<Long> _TotalRuleRows = new ArrayList<Long>();
    @SerializedName("fk_in"    )    public List<String> _FkInList  = new ArrayList<String>();
    @SerializedName("fk_out"    )    public List<String>_FkOutList = new ArrayList<String>();
    /*@formatter:on*/
    
      public TableContentDetails(String Name, Long TotalRows)
      {
        _Name = Name;
        _Created = DateHelper.getTimeNow();
        _TotalRows = TotalRows;
      }
      public void setContentDetails(Connection C,Database DB, Table T, long T0) throws Exception
      {
        List<String> ColNames = T.getColumnNames();

        List<String> Rules = DB._TableRuleMap.get(T.getFullyQualifiedName().toLowerCase());
        
        List<Long> RuleCountList =new ArrayList<Long>();
        if(Rules !=null && Rules.size() >0 )
            for(String SubQ: Rules)
              {
                RuleCountList.add(T.getRuleRowCount(C, SubQ));
              }        
        
        
        _FkInList = T.FkInList;
        _FkOutList = T.FkOutList;
        _Columns = ColNames;
        _TotalRuleRows = RuleCountList;
        _Timing = System.nanoTime() - T0;
      }
  }
