
package tilda.data._Tilda;


import tilda.db.*;
import tilda.enums.*;
import tilda.types.*;
import tilda.utils.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

@SuppressWarnings({ "unused" })
public class TILDA__MEASUREFORMULAVIEW_Factory
 {
   protected static final Logger LOG = LogManager.getLogger(TILDA__MEASUREFORMULAVIEW_Factory.class.getName());

   protected TILDA__MEASUREFORMULAVIEW_Factory() { }

   public static final Class<TILDA__MEASUREFORMULAVIEW> DATA_CLASS= TILDA__MEASUREFORMULAVIEW.class;
   public static final String SCHEMA_LABEL = TextUtil.Print("TILDA", "");
   public static final String TABLENAME_LABEL = TextUtil.Print("MeasureFormulaView", "");
   public static final String SCHEMA_TABLENAME_LABEL = TextUtil.Print("TILDA.MeasureFormulaView", "");
   public static void getFullTableNameVar(Connection C, StringBuilder S) { C.getFullTableVar(S, "TILDA", "MeasureFormulaView"); }

   public static abstract class COLS {
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.MeasureFormulaView.measureRefnum -> TILDA.MeasureFormulaView."measureRefnum"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.MeasureFormulaView.measureRefnum of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.MeasureFormulaView.measureRefnum of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The measure.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>true</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_LongPrimitive            MEASUREREFNUM   = new Type_LongPrimitive           (SCHEMA_LABEL, TABLENAME_LABEL, "measureRefnum"   , 0/*0*/, "The measure.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.MeasureFormulaView.measureSchema -> TILDA.MeasureFormulaView."measureSchema"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.MeasureFormulaView.measureSchema of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.MeasureFormulaView.measureSchema of type varchar(64)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>64</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The Schema wher ethe measure is defined.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive          MEASURESCHEMA   = new Type_StringPrimitive         (SCHEMA_LABEL, TABLENAME_LABEL, "measureSchema"   , 1/*1*/, "The Schema wher ethe measure is defined.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.MeasureFormulaView.measureName -> TILDA.MeasureFormulaView."measureName"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.MeasureFormulaView.measureName of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.MeasureFormulaView.measureName of type varchar(64)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>64</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The name of the measure.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive          MEASURENAME     = new Type_StringPrimitive         (SCHEMA_LABEL, TABLENAME_LABEL, "measureName"     , 2/*2*/, "The name of the measure.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.MeasureFormulaView.formulaRefnum -> TILDA.MeasureFormulaView."formulaRefnum"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.MeasureFormulaView.formulaRefnum of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.MeasureFormulaView.formulaRefnum of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The primary key for this record</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>true</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_LongPrimitive            FORMULAREFNUM   = new Type_LongPrimitive           (SCHEMA_LABEL, TABLENAME_LABEL, "formulaRefnum"   , 3/*3*/, "The primary key for this record");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.MeasureFormulaView.formulaLocation -> TILDA.MeasureFormulaView."formulaLocation"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.MeasureFormulaView.formulaLocation of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.MeasureFormulaView.formulaLocation of type varchar(64)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>64</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The name of the primary table/view this formula is defined in.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>true</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive          FORMULALOCATION = new Type_StringPrimitive         (SCHEMA_LABEL, TABLENAME_LABEL, "formulaLocation" , 4/*4*/, "The name of the primary table/view this formula is defined in.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.MeasureFormulaView.formulaLocation2 -> TILDA.MeasureFormulaView."formulaLocation2"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.MeasureFormulaView.formulaLocation2 of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.MeasureFormulaView.formulaLocation2 of type varchar(64)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>64</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The name of the secondary table/view (a derived view, a realized table), if appropriate.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>true</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive          FORMULALOCATION2= new Type_StringPrimitive         (SCHEMA_LABEL, TABLENAME_LABEL, "formulaLocation2", 5/*5*/, "The name of the secondary table/view (a derived view, a realized table), if appropriate.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.MeasureFormulaView.formulaName -> TILDA.MeasureFormulaView."formulaName"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.MeasureFormulaView.formulaName of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.MeasureFormulaView.formulaName of type varchar(64)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>64</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The name of the formula/column.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive          FORMULANAME     = new Type_StringPrimitive         (SCHEMA_LABEL, TABLENAME_LABEL, "formulaName"     , 6/*6*/, "The name of the formula/column.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.MeasureFormulaView.title -> TILDA.MeasureFormulaView."title"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.MeasureFormulaView.title of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.MeasureFormulaView.title of type varchar(128)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>128</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The title of the formula/column.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive          TITLE           = new Type_StringPrimitive         (SCHEMA_LABEL, TABLENAME_LABEL, "title"           , 7/*7*/, "The title of the formula/column.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.MeasureFormulaView.description -> TILDA.MeasureFormulaView."description"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.MeasureFormulaView.description of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.MeasureFormulaView.description of type text</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>32000</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The description of the formula/column.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive          DESCRIPTION     = new Type_StringPrimitive         (SCHEMA_LABEL, TABLENAME_LABEL, "description"     , 8/*8*/, "The description of the formula/column.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.MeasureFormulaView.type -> TILDA.MeasureFormulaView."type"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.MeasureFormulaView.type of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.MeasureFormulaView.type of type character(3)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>3</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The type of the formula/column value/outcome.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>String</B>&nbsp;&nbsp;</TD><TD>STR&nbsp;&nbsp;</TD><TD>String&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>String</TD></TR>
  <TR bgcolor="#EEEEEE"><TD>1&nbsp;&nbsp;</TD><TD align="right"><B>Character</B>&nbsp;&nbsp;</TD><TD>CHR&nbsp;&nbsp;</TD><TD>Character&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>Character</TD></TR>
  <TR bgcolor="#FFFFFF"><TD>2&nbsp;&nbsp;</TD><TD align="right"><B>Boolean</B>&nbsp;&nbsp;</TD><TD>BOL&nbsp;&nbsp;</TD><TD>Boolean&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>Boolean</TD></TR>
  <TR bgcolor="#EEEEEE"><TD>3&nbsp;&nbsp;</TD><TD align="right"><B>Short</B>&nbsp;&nbsp;</TD><TD>SHT&nbsp;&nbsp;</TD><TD>Short&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>Short</TD></TR>
  <TR bgcolor="#FFFFFF"><TD>4&nbsp;&nbsp;</TD><TD align="right"><B>Integer</B>&nbsp;&nbsp;</TD><TD>INT&nbsp;&nbsp;</TD><TD>Integer&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>Integer</TD></TR>
  <TR bgcolor="#EEEEEE"><TD>5&nbsp;&nbsp;</TD><TD align="right"><B>Long</B>&nbsp;&nbsp;</TD><TD>LNG&nbsp;&nbsp;</TD><TD>Long&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>Long</TD></TR>
  <TR bgcolor="#FFFFFF"><TD>6&nbsp;&nbsp;</TD><TD align="right"><B>Float</B>&nbsp;&nbsp;</TD><TD>FLT&nbsp;&nbsp;</TD><TD>Float&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>Float</TD></TR>
  <TR bgcolor="#EEEEEE"><TD>7&nbsp;&nbsp;</TD><TD align="right"><B>Double</B>&nbsp;&nbsp;</TD><TD>DBL&nbsp;&nbsp;</TD><TD>Double&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>Double</TD></TR>
  <TR bgcolor="#FFFFFF"><TD>8&nbsp;&nbsp;</TD><TD align="right"><B>Date</B>&nbsp;&nbsp;</TD><TD>DT&nbsp;&nbsp;</TD><TD>Date&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>Date</TD></TR>
  <TR bgcolor="#EEEEEE"><TD>9&nbsp;&nbsp;</TD><TD align="right"><B>DateTime</B>&nbsp;&nbsp;</TD><TD>DTM&nbsp;&nbsp;</TD><TD>DateTime&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>DateTime</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_StringPrimitive          TYPE            = new Type_StringPrimitive         (SCHEMA_LABEL, TABLENAME_LABEL, "type"            , 9/*9*/, "The type of the formula/column value/outcome.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.MeasureFormulaView.formula -> TILDA.MeasureFormulaView."formula"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.MeasureFormulaView.formula of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.MeasureFormulaView.formula of type text</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>32000</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The formula.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitiveNull      FORMULA         = new Type_StringPrimitiveNull     (SCHEMA_LABEL, TABLENAME_LABEL, "formula"         , 10/*10*/, "The formula.");
;
   }

   public static final ColumnDefinition[] COLUMNS = { COLS.MEASUREREFNUM,COLS.MEASURESCHEMA,COLS.MEASURENAME,COLS.FORMULAREFNUM,COLS.FORMULALOCATION,COLS.FORMULALOCATION2,COLS.FORMULANAME,COLS.TITLE,COLS.DESCRIPTION,COLS.TYPE,COLS.FORMULA };

   public static final ColumnDefinition[] COLUMNS_PRIMARY = {  };

   public static final ColumnDefinition[][] COLUMNS_UNIQUE_INDICES = { 
        };

   public static final ColumnDefinition[] COLUMNS_FIRST_IDENTITY = {};

   private static Boolean  __INITIALIZED = false;
   protected static void initObject(Connection C) throws Exception
     {
       if (__INITIALIZED == false)
        synchronized(__INITIALIZED)
         {
           if (__INITIALIZED == false)
            {
              tilda.data.MeasureFormulaView_Factory.init(C);
              __INITIALIZED = true;
            }
         }
     }
   private static class RecordProcessorInternal implements tilda.db.processors.RecordProcessor
     {
       public RecordProcessorInternal(Connection C, int Start)
         {
           _C = C;
           _L = new ArrayListResults<tilda.data.MeasureFormulaView_Data>(Start);
         }
       public RecordProcessorInternal(Connection C, tilda.db.processors.ObjectProcessor<tilda.data.MeasureFormulaView_Data> OP)
         {
           _C = C;
           _OP = OP;
         }
       protected Connection _C = null;
       protected tilda.db.processors.ObjectProcessor<tilda.data.MeasureFormulaView_Data> _OP;
       protected ArrayListResults<tilda.data.MeasureFormulaView_Data> _L = null;
       public void    Start  () { }
       public void    End    (boolean HasMore, int Max) { if (_OP == null) _L.wrapup(HasMore, Max); }
       public boolean Process(int Index, java.sql.ResultSet RS) throws Exception
        {
          tilda.data.MeasureFormulaView_Data Obj = new tilda.data.MeasureFormulaView_Data();
          boolean OK = ((tilda.data._Tilda.TILDA__MEASUREFORMULAVIEW)Obj).Init(_C, RS);
          if (OK == true)
           {
             if (_OP == null)
              _L.add(Obj);
             else
              _OP.Process(Index, Obj);
           }
          return OK;
        }
     }

   protected static final void ProcessMany(Connection C, String FullSelectQuery, int Start, int Size, tilda.db.processors.RecordProcessor RP) throws Exception
     {
       ReadMany(C, -77, RP, null, FullSelectQuery, Start, Size);
     }
   protected static final ListResults<tilda.data.MeasureFormulaView_Data> ReadMany(Connection C, String FullSelectQuery, int Start, int Size) throws Exception
     {
       RecordProcessorInternal RPI = new RecordProcessorInternal(C, Start);
       ReadMany(C, -77, RPI, null, FullSelectQuery, Start, Size);
       return RPI._L;
     }

   private static final void ReadMany(Connection C, int LookupId, tilda.db.processors.RecordProcessor RP, tilda.data._Tilda.TILDA__MEASUREFORMULAVIEW Obj, Object ExtraParams, int Start, int Size) throws Exception
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
          S.append(" "); C.getFullColumnVar(S, "TILDA", "MeasureFormulaView", "measureRefnum");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "MeasureFormulaView", "measureSchema");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "MeasureFormulaView", "measureName");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "MeasureFormulaView", "formulaRefnum");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "MeasureFormulaView", "formulaLocation");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "MeasureFormulaView", "formulaLocation2");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "MeasureFormulaView", "formulaName");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "MeasureFormulaView", "title");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "MeasureFormulaView", "description");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "MeasureFormulaView", "type");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "MeasureFormulaView", "formula");
          S.append(" from "); C.getFullTableVar(S, "TILDA", "MeasureFormulaView");
          switch (LookupId)
           {
             case -7:
                String clause = ((SelectQuery)ExtraParams).getWhereClause();
                if (TextUtil.isNullOrEmpty(clause) == false) S.append(clause);
                break;
             case -77: 
             case -666: break;
             default: throw new Exception("Invalid LookupId "+LookupId+" found. Cannot create where clause.");
           }
        }

       String Q = S.toString() + C.getSelectLimitClause(Start, Size+1);
       S.setLength(0);
       S = null;
       QueryDetails.setLastQuery(SCHEMA_TABLENAME_LABEL, Q);
       QueryDetails.logQuery("TILDA.MeasureFormulaView", Q, null);
       java.sql.PreparedStatement PS=null;
       int count = 0;
       try
        {
          PS = C.prepareStatement(Q);
          switch (LookupId)
           {
             case -77:
             case -7:
                break;
             case -666: break;
             default: throw new Exception("Invalid LookupId "+LookupId+" found. Cannot prepare statement.");
           }


          count = JDBCHelper.Process(PS.executeQuery(), RP, Start, true, Size, true);
        }
       catch (java.sql.SQLException E)
        {
          tilda.data._Tilda.TILDA__1_0.HandleCatch(C, E, "selected");
        }
       finally
        {
          tilda.data._Tilda.TILDA__1_0.HandleFinally(PS, T0, TILDA__MEASUREFORMULAVIEW_Factory.SCHEMA_TABLENAME_LABEL, StatementType.SELECT, count, null);
          PS = null;
        }

    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   public static SelectQuery newSelectQuery(Connection C) throws Exception { return new SelectQuery(C, SCHEMA_LABEL, TABLENAME_LABEL, true); }
   public static SelectQuery newWhereQuery (Connection C) throws Exception { return new SelectQuery(C, SCHEMA_LABEL, TABLENAME_LABEL, false); }
   public static ListResults<tilda.data.MeasureFormulaView_Data> runSelect(Connection C, SelectQuery Q, int Start, int Size) throws Exception
     {
       RecordProcessorInternal RPI = new RecordProcessorInternal(C, Start);
       ReadMany(C, -7, RPI, null, Q, Start, Size);
       return RPI._L;
     }
   public static void runSelect(Connection C, SelectQuery Q, tilda.db.processors.ObjectProcessor<tilda.data.MeasureFormulaView_Data> OP, int Start, int Size) throws Exception
     {
       RecordProcessorInternal RPI = new RecordProcessorInternal(C, OP);
       ReadMany(C, -7, RPI, null, Q, Start, Size);
     }

 }
