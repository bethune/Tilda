
package tilda.data_test._Tilda;

import java.math.*;
import java.util.*;
import java.time.*;

import org.apache.logging.log4j.*;

import com.google.gson.annotations.*;

import tilda.db.*;
import tilda.enums.*;
import tilda.performance.*;
import tilda.types.*;
import tilda.utils.*;
import tilda.utils.json.*;
import tilda.utils.pairs.*;


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

@SuppressWarnings({ "unused" })
public class TILDA__TESTING3REALIZED_Factory
 {
   protected static final Logger LOG = LogManager.getLogger(TILDA__TESTING3REALIZED_Factory.class.getName());

   protected TILDA__TESTING3REALIZED_Factory() { }

   public static final Class<TILDA__TESTING3REALIZED> DATA_CLASS= TILDA__TESTING3REALIZED.class;
   public static final String SCHEMA_LABEL = TextUtil.print("TILDATEST", "");
   public static final String TABLENAME_LABEL = TextUtil.print("Testing3Realized", "");
   public static final String SCHEMA_TABLENAME_LABEL = TextUtil.print("TILDATEST.Testing3Realized", "");
   public static void getFullTableNameVar(Connection C, StringBuilder S) { C.getFullTableVar(S, "TILDATEST", "Testing3Realized"); }

   public static abstract class COLS {
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing3Realized.refnum -> TILDATEST.Testing3Realized."refnum"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing3Realized.refnum of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing3Realized.refnum of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The primary key for this record (from TILDATEST.Testing3View.refnum)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_LongPrimitiveNull      REFNUM        = new Type_LongPrimitiveNull     (SCHEMA_LABEL, TABLENAME_LABEL, "refnum"        , 0/*0*/, "The primary key for this record (from TILDATEST.Testing3View.refnum)");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing3Realized.name -> TILDATEST.Testing3Realized."name"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing3Realized.name of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing3Realized.name of type varchar(10)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>10</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Medical system unique enterprise id (from TILDATEST.Testing3View.name)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitiveNull    NAME          = new Type_StringPrimitiveNull   (SCHEMA_LABEL, TABLENAME_LABEL, "name"          , 1/*1*/, "Medical system unique enterprise id (from TILDATEST.Testing3View.name)");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing3Realized.a8bTZ -> TILDATEST.Testing3Realized."a8bTZ"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing3Realized.a8bTZ of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing3Realized.a8bTZ of type varchar(10)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>10</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Generated helper column to hold the time zone ID for 'a8b'. (from TILDATEST.Testing3View.a8bTZ)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitiveNull    A8BTZ         = new Type_StringPrimitiveNull   (SCHEMA_LABEL, TABLENAME_LABEL, "a8bTZ"         , 2/*2*/, "Generated helper column to hold the time zone ID for 'a8b'. (from TILDATEST.Testing3View.a8bTZ)");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing3Realized.a8b -> TILDATEST.Testing3Realized."a8b"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing3Realized.a8b of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing3Realized.a8b of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah (from TILDATEST.Testing3View.a8b)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_DatetimePrimitiveNull  A8B           = new Type_DatetimePrimitiveNull (SCHEMA_LABEL, TABLENAME_LABEL, "a8b"           , 3/*3*/, "The blah (from TILDATEST.Testing3View.a8b)", A8BTZ);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing3Realized.lastUpdated -> TILDATEST.Testing3Realized."lastUpdated"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing3Realized.lastUpdated of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing3Realized.lastUpdated of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The timestamp for when the record was last updated. (TILDATEST.Testing) (from TILDATEST.Testing3View.lastUpdated)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_DatetimePrimitiveNull  LASTUPDATED   = new Type_DatetimePrimitiveNull (SCHEMA_LABEL, TABLENAME_LABEL, "lastUpdated"   , 4/*4*/, "The timestamp for when the record was last updated. (TILDATEST.Testing) (from TILDATEST.Testing3View.lastUpdated)");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing3Realized.xxxLastUpdated -> TILDATEST.Testing3Realized."xxxLastUpdated"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing3Realized.xxxLastUpdated of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing3Realized.xxxLastUpdated of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The timestamp for when the record was last updated. (TILDATEST.Testing) (from TILDATEST.Testing3View.xxxLastUpdated)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_DatetimePrimitiveNull  XXXLASTUPDATED= new Type_DatetimePrimitiveNull (SCHEMA_LABEL, TABLENAME_LABEL, "xxxLastUpdated", 5/*5*/, "The timestamp for when the record was last updated. (TILDATEST.Testing) (from TILDATEST.Testing3View.xxxLastUpdated)");
;
   }

   public static final ColumnDefinition[] COLUMNS = { COLS.REFNUM,COLS.NAME,COLS.A8BTZ,COLS.A8B,COLS.LASTUPDATED,COLS.XXXLASTUPDATED };

   public static final ColumnDefinition[] COLUMNS_PRIMARY = {  };

   public static final ColumnDefinition[][] COLUMNS_UNIQUE_INDICES = { 
                   {COLS.REFNUM}
        };

   public static final ColumnDefinition[] COLUMNS_FIRST_IDENTITY = COLUMNS_UNIQUE_INDICES[0];

   private static Boolean  __INITIALIZED = false;
   protected static void initObject(Connection C) throws Exception
     {
       if (__INITIALIZED == false)
        synchronized(__INITIALIZED)
         {
           if (__INITIALIZED == false)
            {
              tilda.data_test.Testing3Realized_Factory.init(C);
              __INITIALIZED = true;
            }
         }
     }
   private static class RecordProcessorInternal implements tilda.db.processors.RecordProcessor
     {
       public RecordProcessorInternal(Connection C, int start)
         {
           _C = C;
           _L = new ArrayListResults<tilda.data_test.Testing3Realized_Data>(start);
         }
       public RecordProcessorInternal(Connection C, tilda.db.processors.ObjectProcessor<tilda.data_test.Testing3Realized_Data> OP)
         {
           _C = C;
           _OP = OP;
         }
       protected Connection _C = null;
       protected tilda.db.processors.ObjectProcessor<tilda.data_test.Testing3Realized_Data> _OP;
       protected ArrayListResults<tilda.data_test.Testing3Realized_Data> _L = null;
       public void    start  () { if (_OP != null) _OP.start(); }
       public void    end    (boolean hasMore, int maxCount) { if (_OP == null) _L.wrapup(hasMore, maxCount); else _OP.end(hasMore, maxCount); }
       public boolean process(int count, java.sql.ResultSet RS) throws Exception
        {
          tilda.data_test.Testing3Realized_Data Obj = new tilda.data_test.Testing3Realized_Data();
          boolean OK = ((tilda.data_test._Tilda.TILDA__TESTING3REALIZED)Obj).init(_C, RS);
          if (OK == true)
           {
             if (_OP == null)
              _L.add(Obj);
             else
              _OP.process(count, Obj);
           }
          return OK;
        }
     }

   protected static final void processMany(Connection C, String fullSelectQuery, int start, int size, tilda.db.processors.RecordProcessor RP) throws Exception
     {
       readMany(C, -77, RP, null, fullSelectQuery, start, size);
     }
   protected static final ListResults<tilda.data_test.Testing3Realized_Data> readMany(Connection C, String fullSelectQuery, int start, int size) throws Exception
     {
       RecordProcessorInternal RPI = new RecordProcessorInternal(C, start);
       readMany(C, -77, RPI, null, fullSelectQuery, start, size);
       return RPI._L;
     }

   private static final void readMany(Connection C, int LookupId, tilda.db.processors.RecordProcessor RP, tilda.data_test._Tilda.TILDA__TESTING3REALIZED Obj, Object ExtraParams, int start, int size) throws Exception
     {
       long T0 = System.nanoTime();
       StringBuilder S = new StringBuilder(1024);
       if (LookupId == -77)
        {
          S.append((String)ExtraParams);
        }
       else
        {
          S.append("select ");
          S.append(" "); C.getFullColumnVar(S, "TILDATEST", "Testing3Realized", "refnum");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing3Realized", "name");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing3Realized", "a8bTZ");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing3Realized", "a8b");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing3Realized", "lastUpdated");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing3Realized", "xxxLastUpdated");
          S.append(" from "); C.getFullTableVar(S, "TILDATEST", "Testing3Realized");
          switch (LookupId)
           {
             case -7:
                String clause = ((SelectQuery)ExtraParams).getWhereClause();
                if (TextUtil.isNullOrEmpty(clause) == false) S.append(clause);
                break;
             case 1:
                S.append(" order by "); C.getFullColumnVar(S, "TILDATEST", "Testing3Realized", "lastUpdated"); S.append(" DESC");
                break;
             case -77: 
             case -666: break;
             default: throw new Exception("Invalid LookupId "+LookupId+" found. Cannot create where clause.");
           }
        }

       String Q = S.toString() + C.getSelectLimitClause(start, size+1);
       S.setLength(0);
       S = null;
       QueryDetails.setLastQuery(SCHEMA_TABLENAME_LABEL, Q);
       QueryDetails.logQuery("TILDATEST.Testing3Realized", Q, null);
       java.sql.PreparedStatement PS=null;
       int count = 0;
       try
        {
          PS = C.prepareStatement(Q);
          if (size < 0 || size > 5000)
           PS.setFetchSize(5000);
          switch (LookupId)
           {
             case -77:
             case -7:
                break;
             case 1: {
               break;
             }
             case -666: break;
             default: throw new Exception("Invalid LookupId "+LookupId+" found. Cannot prepare statement.");
           }


          count = JDBCHelper.process(PS.executeQuery(), RP, start, true, size, true);
        }
       catch (java.sql.SQLException E)
        {
          C.handleCatch(E, "selected");
        }
       finally
        {
          tilda.data_test._Tilda.TILDA__1_0.handleFinally(PS, T0, TILDA__TESTING3REALIZED_Factory.SCHEMA_TABLENAME_LABEL, StatementType.SELECT, count, null);
          PS = null;
        }

    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/**
The generic init method is typically run when there is a general data structure of data available, for example, a CSV
data file read in memory, or run from a servlet using a Map<String, String[]> object obtained from an ServletRequest
object. The generic init method defaults to this general data structure as a genegic representation.
*/
   static public tilda.data_test.Testing3Realized_Data init(Map<String, String[]> Values, List<StringStringPair> Errors)
   throws Exception
     {
       tilda.data_test._Tilda.TILDA__TESTING3REALIZED Obj = new tilda.data_test.Testing3Realized_Data();
       String[] vals = null;

       vals = Values.get("refnum");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("refnum", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Long _refnum = ParseUtil.parseLong("refnum", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_refnum != null) Obj.setRefnum(_refnum);

       vals = Values.get("name");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("name", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       String _name = ParseUtil.parseString("name", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_name != null) Obj.setName(_name);

       vals = Values.get("a8b");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a8b", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       ZonedDateTime _a8b = ParseUtil.parseZonedDateTime("a8b", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a8b != null) Obj.setA8b(_a8b);


       return (tilda.data_test.Testing3Realized_Data) Obj;
     }

/**
 Creates a new object in memory, which you can subsequently {@link #write()} to the data store.
 current object to the destination. 
*/
   static public tilda.data_test.Testing3Realized_Data create() throws Exception
     {
       tilda.data_test._Tilda.TILDA__TESTING3REALIZED Obj = new tilda.data_test.Testing3Realized_Data();
       Obj.initForCreate();


       return (tilda.data_test.Testing3Realized_Data) Obj;
     }

   public static int writeBatch(Connection C, List<tilda.data_test.Testing3Realized_Data> L, int batchSize, int commitSize) throws Exception
     {
       long T0 = System.nanoTime();

       if (L == null || L.isEmpty() == true)
         return -1;

       java.sql.PreparedStatement PS = null;
       List<java.sql.Array> AllocatedArrays = new ArrayList<java.sql.Array>();
       int count = 0;
       int batchStart = 0;
       TILDA__TESTING3REALIZED lastObj = null;
       BitSet firstChangeList = (BitSet) ((TILDA__TESTING3REALIZED) L.get(0)).__Changes.clone();
       String firstTimeStampSignature = ((TILDA__TESTING3REALIZED) L.get(0)).getTimeStampSignature();

       try
         {
           C.setSavepoint();
           String Q = L.get(0).getWriteQuery(C);
           PS = C.prepareStatement(Q);
           int insertCount = 0;

           int index = -1;
           for (tilda.data_test.Testing3Realized_Data d : L)
             {
               ++index;
               if (d == null || d.hasChanged() == false)
                 continue;

               lastObj = ((TILDA__TESTING3REALIZED) d);

               if (((TILDA__TESTING3REALIZED) d).__Init != InitMode.CREATE)
                 {
                   LOG.debug(QueryDetails._LOGGING_HEADER + "The 'tilda.data_test.Testing3Realized_Data' object at positon #" + index + " was not in an insertable state. Only inserts are allowed in batch writes (i.e., no updates).");
                   QueryDetails.setLastQuery(TILDA__TESTING3REALIZED_Factory.SCHEMA_TABLENAME_LABEL, "");
                   return index;
                 }

               if (((TILDA__TESTING3REALIZED) d).beforeWrite(C) == false)
                 {
                   LOG.debug(QueryDetails._LOGGING_HEADER + "The 'tilda.data_test.Testing3Realized_Data' object at positon #" + index + " failed in its beforeWrite() method.");
                   QueryDetails.setLastQuery(TILDA__TESTING3REALIZED_Factory.SCHEMA_TABLENAME_LABEL, "");
                   return index;
                 }

               if (firstChangeList.equals(((TILDA__TESTING3REALIZED) d).__Changes) == false)
                 {
                   LOG.debug(QueryDetails._LOGGING_HEADER + "The 'tilda.data_test.Testing3Realized_Data' object at positon #" + index + " failed matching the list of columns being changed compared to the first object passed.");
                   QueryDetails.setLastQuery(TILDA__TESTING3REALIZED_Factory.SCHEMA_TABLENAME_LABEL, "");
                   return index;
                 }

               if (firstTimeStampSignature.equals(((TILDA__TESTING3REALIZED) d).getTimeStampSignature()) == false)
                 {
                   LOG.debug(QueryDetails._LOGGING_HEADER + "The 'tilda.data_test.Testing3Realized_Data' object at positon #" + index + " failed matching the list of updated current vs value based timestamps.");
                   QueryDetails.setLastQuery(TILDA__TESTING3REALIZED_Factory.SCHEMA_TABLENAME_LABEL, "");
                   return index;
                 }

               int i = d.populatePreparedStatement(C, PS, AllocatedArrays);

               PS.addBatch();
               if (index != 0 && (index + 1) % batchSize == 0)
                 {
                   int[] results = PS.executeBatch();
                   int failedRec = JDBCHelper.batchWriteDone(results, batchSize);
                   if (failedRec != -1)
                     {
                       LOG.debug(QueryDetails._LOGGING_HEADER + "A batch of tilda.data_test.Testing3Realized_Data objects between positions #" + batchStart + " and #" + index + " failed being written to the database.");
                       return insertCount+failedRec;
                     }
                   for (int index2 = batchStart; index2 <= index; ++index2)
                     L.get(index2).stateUpdatePostWrite();
                   LOG.debug("Batch-inserted objects between positions #" + insertCount + " and #" + index + ".");
                   batchStart = 0;
                   insertCount+=batchSize;
                 }
               if (commitSize > 0 && index != 0 && (index + 1) % commitSize == 0)
                 {
                   C.commit();
                   LOG.debug("Commited " + commitSize + " batch records. At insert count " + (index-commitSize+1));
                 }
               PS.clearParameters();
             }

           if ((index + 1) % batchSize != 0)
             {
               int[] results = PS.executeBatch();
               int failedRec = JDBCHelper.batchWriteDone(results, L.size() - insertCount);
               if (failedRec != -1)
                 {
                   LOG.debug(QueryDetails._LOGGING_HEADER + "A batch of 'Testing3Realized_Data' objects ending at position #" + index + " failed being written to the database.");
                   return L.size() - insertCount+failedRec;
                 }
               for (int index2 = batchStart; index2 <= index; ++index2)
                 L.get(index2).stateUpdatePostWrite();

               if(commitSize > 0)
                 {
                   C.commit();
                   LOG.debug("Commited " + insertCount + " batch records.");
                 }
               LOG.debug("Final Batch-inserted objects between positions #" + insertCount + " and #" + index + ".");
             }

           C.releaseSavepoint(true);
           return -1;
         }
       catch (java.sql.SQLException E)
         {
           C.releaseSavepoint(false);
           C.handleCatch(E, "updated or inserted");
           return 1;
         }
       finally
         {
           TILDA__1_0.handleFinally(PS, T0, TILDA__TESTING3REALIZED_Factory.SCHEMA_TABLENAME_LABEL, lastObj != null && lastObj.__Init == InitMode.CREATE ? StatementType.INSERT : StatementType.UPDATE, count, AllocatedArrays);
           PS = null;
           AllocatedArrays = null;
         }
       }

   static public tilda.data_test.Testing3Realized_Data lookupByRefnum(long refnum) throws Exception
     {
       tilda.data_test._Tilda.TILDA__TESTING3REALIZED Obj = new tilda.data_test.Testing3Realized_Data();
       Obj.initForLookup(0);

       Obj.setRefnum        (refnum        ); 

       return (tilda.data_test.Testing3Realized_Data) Obj;
     }


   static public ListResults<tilda.data_test.Testing3Realized_Data> lookupWhereLastUpdated(Connection C, int start, int size) throws Exception
     {
       tilda.data_test._Tilda.TILDA__TESTING3REALIZED Obj = new tilda.data_test.Testing3Realized_Data();
       Obj.initForLookup(tilda.utils.SystemValues.EVIL_VALUE);



       RecordProcessorInternal RPI = new RecordProcessorInternal(C, start);
       readMany(C, 1, RPI, Obj, null, start, size);
       return RPI._L;
     }

   static public void lookupWhereLastUpdated(Connection C, tilda.db.processors.ObjectProcessor<tilda.data_test.Testing3Realized_Data> OP, int start, int size) throws Exception
     {
       tilda.data_test._Tilda.TILDA__TESTING3REALIZED Obj = new tilda.data_test.Testing3Realized_Data();
       Obj.initForLookup(tilda.utils.SystemValues.EVIL_VALUE);



       RecordProcessorInternal RPI = new RecordProcessorInternal(C, OP);
       readMany(C, 1, RPI, Obj, null, start, size);
     }


   public static SelectQuery newSelectQuery(Connection C) throws Exception { return new SelectQuery(C, SCHEMA_LABEL, TABLENAME_LABEL, true); }
   public static SelectQuery newWhereQuery (Connection C) throws Exception { return new SelectQuery(C, SCHEMA_LABEL, TABLENAME_LABEL, false); }
   public static ListResults<tilda.data_test.Testing3Realized_Data> runSelect(Connection C, SelectQuery Q, int start, int size) throws Exception
     {
       RecordProcessorInternal RPI = new RecordProcessorInternal(C, start);
       readMany(C, -7, RPI, null, Q, start, size);
       return RPI._L;
     }
   public static void runSelect(Connection C, SelectQuery Q, tilda.db.processors.ObjectProcessor<tilda.data_test.Testing3Realized_Data> OP, int start, int size) throws Exception
     {
       RecordProcessorInternal RPI = new RecordProcessorInternal(C, OP);
       readMany(C, -7, RPI, null, Q, start, size);
     }
   public static UpdateQuery newUpdateQuery(Connection C) throws Exception { return new UpdateQuery(C, SCHEMA_LABEL, TABLENAME_LABEL); }
   public static DeleteQuery newDeleteQuery(Connection C) throws Exception { return new DeleteQuery(C, SCHEMA_LABEL, TABLENAME_LABEL); }


 }
