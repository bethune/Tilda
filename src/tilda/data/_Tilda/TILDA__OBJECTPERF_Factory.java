
package tilda.data._Tilda;

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
public class TILDA__OBJECTPERF_Factory
 {
   protected static final Logger LOG = LogManager.getLogger(TILDA__OBJECTPERF_Factory.class.getName());

   protected TILDA__OBJECTPERF_Factory() { }

   public static final Class<TILDA__OBJECTPERF> DATA_CLASS= TILDA__OBJECTPERF.class;
   public static final String SCHEMA_LABEL = TextUtil.print("TILDA", "");
   public static final String TABLENAME_LABEL = TextUtil.print("ObjectPerf", "");
   public static final String SCHEMA_TABLENAME_LABEL = TextUtil.print("TILDA.ObjectPerf", "");
   public static void getFullTableNameVar(Connection C, StringBuilder S) { C.getFullTableVar(S, "TILDA", "ObjectPerf"); }

   public static abstract class COLS {
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.schemaName -> TILDA.ObjectPerf."schemaName"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.schemaName of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.schemaName of type varchar(64)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>64</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The name of the schema tracked</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>true</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive        SCHEMANAME   = new Type_StringPrimitive       (SCHEMA_LABEL, TABLENAME_LABEL, "schemaName"   , 0/*0*/, "The name of the schema tracked");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.objectName -> TILDA.ObjectPerf."objectName"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.objectName of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.objectName of type varchar(64)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>64</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The name of the table/object tracked</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>true</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive        OBJECTNAME   = new Type_StringPrimitive       (SCHEMA_LABEL, TABLENAME_LABEL, "objectName"   , 1/*1*/, "The name of the table/object tracked");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.startPeriodTZ -> TILDA.ObjectPerf."startPeriodTZ"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.startPeriodTZ of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.startPeriodTZ of type character(5)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>5</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Generated helper column to hold the time zone ID for 'startPeriod'.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>AUTO</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>true</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive        STARTPERIODTZ= new Type_StringPrimitive       (SCHEMA_LABEL, TABLENAME_LABEL, "startPeriodTZ", 2/*2*/, "Generated helper column to hold the time zone ID for 'startPeriod'.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.startPeriod -> TILDA.ObjectPerf."startPeriod"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.startPeriod of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.startPeriod of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The timestamp for when the record was created.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>true</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_DatetimePrimitive      STARTPERIOD  = new Type_DatetimePrimitive     (SCHEMA_LABEL, TABLENAME_LABEL, "startPeriod"  , 3/*3*/, "The timestamp for when the record was created.", STARTPERIODTZ);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.endPeriodTZ -> TILDA.ObjectPerf."endPeriodTZ"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.endPeriodTZ of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.endPeriodTZ of type character(5)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>5</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Generated helper column to hold the time zone ID for 'endPeriod'.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>AUTO</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive        ENDPERIODTZ  = new Type_StringPrimitive       (SCHEMA_LABEL, TABLENAME_LABEL, "endPeriodTZ"  , 4/*4*/, "Generated helper column to hold the time zone ID for 'endPeriod'.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.endPeriod -> TILDA.ObjectPerf."endPeriod"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.endPeriod of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.endPeriod of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The timestamp for when the record was created.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_DatetimePrimitive      ENDPERIOD    = new Type_DatetimePrimitive     (SCHEMA_LABEL, TABLENAME_LABEL, "endPeriod"    , 5/*5*/, "The timestamp for when the record was created.", ENDPERIODTZ);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.selectNano -> TILDA.ObjectPerf."selectNano"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.selectNano of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.selectNano of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Blah...</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>selectNano_CreateDefault</B>&nbsp;&nbsp;</TD><TD>0&nbsp;&nbsp;</TD><TD>selectNano_CreateDefault&nbsp;&nbsp;</TD><TD>CREATE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>selectNano_CreateDefault</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_LongPrimitive          SELECTNANO   = new Type_LongPrimitive         (SCHEMA_LABEL, TABLENAME_LABEL, "selectNano"   , 6/*6*/, "Blah...");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.selectCount -> TILDA.ObjectPerf."selectCount"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.selectCount of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.selectCount of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Blah...</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>selectCount_CreateDefault</B>&nbsp;&nbsp;</TD><TD>0&nbsp;&nbsp;</TD><TD>selectCount_CreateDefault&nbsp;&nbsp;</TD><TD>CREATE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>selectCount_CreateDefault</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_IntegerPrimitive       SELECTCOUNT  = new Type_IntegerPrimitive      (SCHEMA_LABEL, TABLENAME_LABEL, "selectCount"  , 7/*7*/, "Blah...");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.selectRecords -> TILDA.ObjectPerf."selectRecords"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.selectRecords of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.selectRecords of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Blah...</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>selectRecords_CreateDefault</B>&nbsp;&nbsp;</TD><TD>0&nbsp;&nbsp;</TD><TD>selectRecords_CreateDefault&nbsp;&nbsp;</TD><TD>CREATE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>selectRecords_CreateDefault</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_IntegerPrimitive       SELECTRECORDS= new Type_IntegerPrimitive      (SCHEMA_LABEL, TABLENAME_LABEL, "selectRecords", 8/*8*/, "Blah...");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.insertNano -> TILDA.ObjectPerf."insertNano"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.insertNano of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.insertNano of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Blah...</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>insertNano_CreateDefault</B>&nbsp;&nbsp;</TD><TD>0&nbsp;&nbsp;</TD><TD>insertNano_CreateDefault&nbsp;&nbsp;</TD><TD>CREATE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>insertNano_CreateDefault</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_LongPrimitive          INSERTNANO   = new Type_LongPrimitive         (SCHEMA_LABEL, TABLENAME_LABEL, "insertNano"   , 9/*9*/, "Blah...");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.insertCount -> TILDA.ObjectPerf."insertCount"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.insertCount of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.insertCount of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Blah...</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>insertCount_CreateDefault</B>&nbsp;&nbsp;</TD><TD>0&nbsp;&nbsp;</TD><TD>insertCount_CreateDefault&nbsp;&nbsp;</TD><TD>CREATE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>insertCount_CreateDefault</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_IntegerPrimitive       INSERTCOUNT  = new Type_IntegerPrimitive      (SCHEMA_LABEL, TABLENAME_LABEL, "insertCount"  , 10/*10*/, "Blah...");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.insertRecords -> TILDA.ObjectPerf."insertRecords"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.insertRecords of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.insertRecords of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Blah...</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>insertRecords_CreateDefault</B>&nbsp;&nbsp;</TD><TD>0&nbsp;&nbsp;</TD><TD>insertRecords_CreateDefault&nbsp;&nbsp;</TD><TD>CREATE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>insertRecords_CreateDefault</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_IntegerPrimitive       INSERTRECORDS= new Type_IntegerPrimitive      (SCHEMA_LABEL, TABLENAME_LABEL, "insertRecords", 11/*11*/, "Blah...");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.updateNano -> TILDA.ObjectPerf."updateNano"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.updateNano of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.updateNano of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Blah...</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>updateNano_CreateDefault</B>&nbsp;&nbsp;</TD><TD>0&nbsp;&nbsp;</TD><TD>updateNano_CreateDefault&nbsp;&nbsp;</TD><TD>CREATE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>updateNano_CreateDefault</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_LongPrimitive          UPDATENANO   = new Type_LongPrimitive         (SCHEMA_LABEL, TABLENAME_LABEL, "updateNano"   , 12/*12*/, "Blah...");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.updateCount -> TILDA.ObjectPerf."updateCount"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.updateCount of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.updateCount of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Blah...</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>updateCount_CreateDefault</B>&nbsp;&nbsp;</TD><TD>0&nbsp;&nbsp;</TD><TD>updateCount_CreateDefault&nbsp;&nbsp;</TD><TD>CREATE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>updateCount_CreateDefault</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_IntegerPrimitive       UPDATECOUNT  = new Type_IntegerPrimitive      (SCHEMA_LABEL, TABLENAME_LABEL, "updateCount"  , 13/*13*/, "Blah...");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.updateRecords -> TILDA.ObjectPerf."updateRecords"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.updateRecords of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.updateRecords of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Blah...</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>updateRecords_CreateDefault</B>&nbsp;&nbsp;</TD><TD>0&nbsp;&nbsp;</TD><TD>updateRecords_CreateDefault&nbsp;&nbsp;</TD><TD>CREATE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>updateRecords_CreateDefault</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_IntegerPrimitive       UPDATERECORDS= new Type_IntegerPrimitive      (SCHEMA_LABEL, TABLENAME_LABEL, "updateRecords", 14/*14*/, "Blah...");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.deleteNano -> TILDA.ObjectPerf."deleteNano"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.deleteNano of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.deleteNano of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Blah...</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>deleteNano_CreateDefault</B>&nbsp;&nbsp;</TD><TD>0&nbsp;&nbsp;</TD><TD>deleteNano_CreateDefault&nbsp;&nbsp;</TD><TD>CREATE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>deleteNano_CreateDefault</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_LongPrimitive          DELETENANO   = new Type_LongPrimitive         (SCHEMA_LABEL, TABLENAME_LABEL, "deleteNano"   , 15/*15*/, "Blah...");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.deleteCount -> TILDA.ObjectPerf."deleteCount"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.deleteCount of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.deleteCount of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Blah...</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>deleteCount_CreateDefault</B>&nbsp;&nbsp;</TD><TD>0&nbsp;&nbsp;</TD><TD>deleteCount_CreateDefault&nbsp;&nbsp;</TD><TD>CREATE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>deleteCount_CreateDefault</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_IntegerPrimitive       DELETECOUNT  = new Type_IntegerPrimitive      (SCHEMA_LABEL, TABLENAME_LABEL, "deleteCount"  , 16/*16*/, "Blah...");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.deleteRecords -> TILDA.ObjectPerf."deleteRecords"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.deleteRecords of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.deleteRecords of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Blah...</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>deleteRecords_CreateDefault</B>&nbsp;&nbsp;</TD><TD>0&nbsp;&nbsp;</TD><TD>deleteRecords_CreateDefault&nbsp;&nbsp;</TD><TD>CREATE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>deleteRecords_CreateDefault</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_IntegerPrimitive       DELETERECORDS= new Type_IntegerPrimitive      (SCHEMA_LABEL, TABLENAME_LABEL, "deleteRecords", 17/*17*/, "Blah...");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.created -> TILDA.ObjectPerf."created"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.created of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.created of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The timestamp for when the record was created. (TILDA.ObjectPerf)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>AUTO</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>true</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>Creation</B>&nbsp;&nbsp;</TD><TD>NOW&nbsp;&nbsp;</TD><TD>Creation&nbsp;&nbsp;</TD><TD>CREATE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>Creation time</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_DatetimePrimitive      CREATED      = new Type_DatetimePrimitive     (SCHEMA_LABEL, TABLENAME_LABEL, "created"      , 18/*18*/, "The timestamp for when the record was created. (TILDA.ObjectPerf)");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.lastUpdated -> TILDA.ObjectPerf."lastUpdated"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.lastUpdated of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.lastUpdated of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The timestamp for when the record was last updated. (TILDA.ObjectPerf)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>AUTO</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>Update</B>&nbsp;&nbsp;</TD><TD>NOW&nbsp;&nbsp;</TD><TD>Update&nbsp;&nbsp;</TD><TD>ALWAYS&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>Last updated time</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_DatetimePrimitive      LASTUPDATED  = new Type_DatetimePrimitive     (SCHEMA_LABEL, TABLENAME_LABEL, "lastUpdated"  , 19/*19*/, "The timestamp for when the record was last updated. (TILDA.ObjectPerf)");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data.TILDA.ObjectPerf.deleted -> TILDA.ObjectPerf."deleted"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data.TILDA.ObjectPerf.deleted of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDA.ObjectPerf.deleted of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The timestamp for when the record was deleted. (TILDA.ObjectPerf)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>AUTO</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_DatetimePrimitiveNull  DELETED      = new Type_DatetimePrimitiveNull (SCHEMA_LABEL, TABLENAME_LABEL, "deleted"      , 20/*20*/, "The timestamp for when the record was deleted. (TILDA.ObjectPerf)");
;
   }

   public static final ColumnDefinition[] COLUMNS = { COLS.SCHEMANAME,COLS.OBJECTNAME,COLS.STARTPERIODTZ,COLS.STARTPERIOD,COLS.ENDPERIODTZ,COLS.ENDPERIOD,COLS.SELECTNANO,COLS.SELECTCOUNT,COLS.SELECTRECORDS,COLS.INSERTNANO,COLS.INSERTCOUNT,COLS.INSERTRECORDS,COLS.UPDATENANO,COLS.UPDATECOUNT,COLS.UPDATERECORDS,COLS.DELETENANO,COLS.DELETECOUNT,COLS.DELETERECORDS,COLS.CREATED,COLS.LASTUPDATED,COLS.DELETED };

   public static final ColumnDefinition[] COLUMNS_PRIMARY = { COLS.SCHEMANAME,COLS.OBJECTNAME,COLS.STARTPERIOD };

   public static final ColumnDefinition[][] COLUMNS_UNIQUE_INDICES = { 
        };

   public static final ColumnDefinition[] COLUMNS_FIRST_IDENTITY = COLUMNS_PRIMARY;

   private static Boolean  __INITIALIZED = false;
   protected static void initObject(Connection C) throws Exception
     {
       if (__INITIALIZED == false)
        synchronized(__INITIALIZED)
         {
           if (__INITIALIZED == false)
            {
              tilda.data.ObjectPerf_Factory.init(C);
              __INITIALIZED = true;
            }
         }
     }
   private static class RecordProcessorInternal implements tilda.db.processors.RecordProcessor
     {
       public RecordProcessorInternal(Connection C, int start)
         {
           _C = C;
           _L = new ArrayListResults<tilda.data.ObjectPerf_Data>(start);
         }
       public RecordProcessorInternal(Connection C, tilda.db.processors.ObjectProcessor<tilda.data.ObjectPerf_Data> OP)
         {
           _C = C;
           _OP = OP;
         }
       protected Connection _C = null;
       protected tilda.db.processors.ObjectProcessor<tilda.data.ObjectPerf_Data> _OP;
       protected ArrayListResults<tilda.data.ObjectPerf_Data> _L = null;
       public void    start  () { if (_OP != null) _OP.start(); }
       public void    end    (boolean hasMore, int maxCount) { if (_OP == null) _L.wrapup(hasMore, maxCount); else _OP.end(hasMore, maxCount); }
       public boolean process(int count, java.sql.ResultSet RS) throws Exception
        {
          tilda.data.ObjectPerf_Data Obj = new tilda.data.ObjectPerf_Data();
          boolean OK = ((tilda.data._Tilda.TILDA__OBJECTPERF)Obj).init(_C, RS);
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
   protected static final ListResults<tilda.data.ObjectPerf_Data> readMany(Connection C, String fullSelectQuery, int start, int size) throws Exception
     {
       RecordProcessorInternal RPI = new RecordProcessorInternal(C, start);
       readMany(C, -77, RPI, null, fullSelectQuery, start, size);
       return RPI._L;
     }

   private static final void readMany(Connection C, int LookupId, tilda.db.processors.RecordProcessor RP, tilda.data._Tilda.TILDA__OBJECTPERF Obj, Object ExtraParams, int start, int size) throws Exception
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
          S.append(" "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "schemaName");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "objectName");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "startPeriodTZ");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "startPeriod");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "endPeriodTZ");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "endPeriod");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "selectNano");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "selectCount");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "selectRecords");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "insertNano");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "insertCount");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "insertRecords");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "updateNano");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "updateCount");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "updateRecords");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "deleteNano");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "deleteCount");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "deleteRecords");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "created");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "lastUpdated");
          S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "deleted");
          S.append(" from "); C.getFullTableVar(S, "TILDA", "ObjectPerf");
          switch (LookupId)
           {
             case -7:
                String clause = ((SelectQuery)ExtraParams).getWhereClause();
                if (TextUtil.isNullOrEmpty(clause) == false) S.append(clause);
                break;
             case 1:
                S.append(" where ("); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "schemaName"); S.append("=?)");
                S.append(" order by "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "objectName"); S.append(" ASC");S.append(", "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "startPeriod"); S.append(" DESC");
                break;
             case 2:
                S.append(" where ("); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "schemaName"); S.append("=? AND "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "objectName"); S.append("=?)");
                S.append(" order by "); C.getFullColumnVar(S, "TILDA", "ObjectPerf", "startPeriod"); S.append(" DESC");
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
       QueryDetails.logQuery("TILDA.ObjectPerf", Q, null);
       java.sql.PreparedStatement PS=null;
       int count = 0;
       try
        {
          PS = C.prepareStatement(Q);
          if (size < 0 || size > 5000)
           PS.setFetchSize(5000);
          int i = 0;
          switch (LookupId)
           {
             case -77:
             case -7:
                break;
             case 1: {
               PS.setString    (++i, Obj._schemaName   );
               break;
             }
             case 2: {
               PS.setString    (++i, Obj._schemaName   );
               PS.setString    (++i, Obj._objectName   );
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
          tilda.data._Tilda.TILDA__1_0.handleFinally(PS, T0, TILDA__OBJECTPERF_Factory.SCHEMA_TABLENAME_LABEL, StatementType.SELECT, count, null);
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
   static public tilda.data.ObjectPerf_Data init(Map<String, String[]> Values, List<StringStringPair> Errors)
   throws Exception
     {
       tilda.data._Tilda.TILDA__OBJECTPERF Obj = new tilda.data.ObjectPerf_Data();
       String[] vals = null;

       vals = Values.get("schemaName");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("schemaName", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       String _schemaName = ParseUtil.parseString("schemaName", true, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_schemaName != null) Obj.setSchemaName(_schemaName);

       vals = Values.get("objectName");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("objectName", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       String _objectName = ParseUtil.parseString("objectName", true, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_objectName != null) Obj.setObjectName(_objectName);

       vals = Values.get("startPeriod");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("startPeriod", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       ZonedDateTime _startPeriod = ParseUtil.parseZonedDateTime("startPeriod", true, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_startPeriod != null) Obj.setStartPeriod(_startPeriod);

       vals = Values.get("endPeriod");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("endPeriod", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       ZonedDateTime _endPeriod = ParseUtil.parseZonedDateTime("endPeriod", true, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_endPeriod != null) Obj.setEndPeriod(_endPeriod);

       vals = Values.get("selectNano");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("selectNano", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Long _selectNano = ParseUtil.parseLong("selectNano", true, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_selectNano != null) Obj.setSelectNano(_selectNano);

       vals = Values.get("selectCount");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("selectCount", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Integer _selectCount = ParseUtil.parseInteger("selectCount", true, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_selectCount != null) Obj.setSelectCount(_selectCount);

       vals = Values.get("selectRecords");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("selectRecords", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Integer _selectRecords = ParseUtil.parseInteger("selectRecords", true, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_selectRecords != null) Obj.setSelectRecords(_selectRecords);

       vals = Values.get("insertNano");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("insertNano", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Long _insertNano = ParseUtil.parseLong("insertNano", true, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_insertNano != null) Obj.setInsertNano(_insertNano);

       vals = Values.get("insertCount");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("insertCount", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Integer _insertCount = ParseUtil.parseInteger("insertCount", true, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_insertCount != null) Obj.setInsertCount(_insertCount);

       vals = Values.get("insertRecords");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("insertRecords", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Integer _insertRecords = ParseUtil.parseInteger("insertRecords", true, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_insertRecords != null) Obj.setInsertRecords(_insertRecords);

       vals = Values.get("updateNano");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("updateNano", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Long _updateNano = ParseUtil.parseLong("updateNano", true, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_updateNano != null) Obj.setUpdateNano(_updateNano);

       vals = Values.get("updateCount");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("updateCount", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Integer _updateCount = ParseUtil.parseInteger("updateCount", true, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_updateCount != null) Obj.setUpdateCount(_updateCount);

       vals = Values.get("updateRecords");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("updateRecords", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Integer _updateRecords = ParseUtil.parseInteger("updateRecords", true, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_updateRecords != null) Obj.setUpdateRecords(_updateRecords);

       vals = Values.get("deleteNano");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("deleteNano", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Long _deleteNano = ParseUtil.parseLong("deleteNano", true, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_deleteNano != null) Obj.setDeleteNano(_deleteNano);

       vals = Values.get("deleteCount");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("deleteCount", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Integer _deleteCount = ParseUtil.parseInteger("deleteCount", true, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_deleteCount != null) Obj.setDeleteCount(_deleteCount);

       vals = Values.get("deleteRecords");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("deleteRecords", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Integer _deleteRecords = ParseUtil.parseInteger("deleteRecords", true, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_deleteRecords != null) Obj.setDeleteRecords(_deleteRecords);


       return (tilda.data.ObjectPerf_Data) Obj;
     }

/**
 Creates a new object in memory, which you can subsequently {@link #write()} to the data store.
 current object to the destination. 
 @param schemaName    (max size 64) The name of the schema tracked
 @param objectName    (max size 64) The name of the table/object tracked
 @param startPeriod   The timestamp for when the record was created.
 @param endPeriod     The timestamp for when the record was created.
*/
   static public tilda.data.ObjectPerf_Data create(String schemaName, String objectName, ZonedDateTime startPeriod, ZonedDateTime endPeriod) throws Exception
     {
       tilda.data._Tilda.TILDA__OBJECTPERF Obj = new tilda.data.ObjectPerf_Data();
       Obj.initForCreate();


       // Explicit setters
       Obj.setSchemaName   (schemaName   );
       Obj.setObjectName   (objectName   );
       Obj.setStartPeriod  (startPeriod  );
       Obj.setEndPeriod    (endPeriod    );

       // Default Create-time setters
       Obj.setSelectNanoSelectNano_CreateDefault      ();
       Obj.setSelectCountSelectCount_CreateDefault    ();
       Obj.setSelectRecordsSelectRecords_CreateDefault();
       Obj.setInsertNanoInsertNano_CreateDefault      ();
       Obj.setInsertCountInsertCount_CreateDefault    ();
       Obj.setInsertRecordsInsertRecords_CreateDefault();
       Obj.setUpdateNanoUpdateNano_CreateDefault      ();
       Obj.setUpdateCountUpdateCount_CreateDefault    ();
       Obj.setUpdateRecordsUpdateRecords_CreateDefault();
       Obj.setDeleteNanoDeleteNano_CreateDefault      ();
       Obj.setDeleteCountDeleteCount_CreateDefault    ();
       Obj.setDeleteRecordsDeleteRecords_CreateDefault();
       Obj.setCreatedNow                              ();
       Obj.setLastUpdatedNow                          ();

       return (tilda.data.ObjectPerf_Data) Obj;
     }

   public static int writeBatch(Connection C, List<tilda.data.ObjectPerf_Data> L, int batchSize, int commitSize) throws Exception
     {
       long T0 = System.nanoTime();

       if (L == null || L.isEmpty() == true)
         return -1;

       java.sql.PreparedStatement PS = null;
       List<java.sql.Array> AllocatedArrays = new ArrayList<java.sql.Array>();
       int count = 0;
       int batchStart = 0;
       TILDA__OBJECTPERF lastObj = null;
       BitSet firstChangeList = (BitSet) ((TILDA__OBJECTPERF) L.get(0)).__Changes.clone();
       String firstTimeStampSignature = ((TILDA__OBJECTPERF) L.get(0)).getTimeStampSignature();

       try
         {
           C.setSavepoint();
           String Q = L.get(0).getWriteQuery(C);
           PS = C.prepareStatement(Q);
           int insertCount = 0;

           int index = -1;
           for (tilda.data.ObjectPerf_Data d : L)
             {
               ++index;
               if (d == null || d.hasChanged() == false)
                 continue;

               lastObj = ((TILDA__OBJECTPERF) d);

               if (((TILDA__OBJECTPERF) d).__Init != InitMode.CREATE)
                 {
                   LOG.debug(QueryDetails._LOGGING_HEADER + "The 'tilda.data.ObjectPerf_Data' object at positon #" + index + " was not in an insertable state. Only inserts are allowed in batch writes (i.e., no updates).");
                   QueryDetails.setLastQuery(TILDA__OBJECTPERF_Factory.SCHEMA_TABLENAME_LABEL, "");
                   return index;
                 }


               if (((TILDA__OBJECTPERF) d).beforeWrite(C) == false)
                 {
                   LOG.debug(QueryDetails._LOGGING_HEADER + "The 'tilda.data.ObjectPerf_Data' object at positon #" + index + " failed in its beforeWrite() method.");
                   QueryDetails.setLastQuery(TILDA__OBJECTPERF_Factory.SCHEMA_TABLENAME_LABEL, "");
                   return index;
                 }

               if (firstChangeList.equals(((TILDA__OBJECTPERF) d).__Changes) == false)
                 {
                   LOG.debug(QueryDetails._LOGGING_HEADER + "The 'tilda.data.ObjectPerf_Data' object at positon #" + index + " failed matching the list of columns being changed compared to the first object passed.");
                   QueryDetails.setLastQuery(TILDA__OBJECTPERF_Factory.SCHEMA_TABLENAME_LABEL, "");
                   return index;
                 }

               if (firstTimeStampSignature.equals(((TILDA__OBJECTPERF) d).getTimeStampSignature()) == false)
                 {
                   LOG.debug(QueryDetails._LOGGING_HEADER + "The 'tilda.data.ObjectPerf_Data' object at positon #" + index + " failed matching the list of updated current vs value based timestamps.");
                   QueryDetails.setLastQuery(TILDA__OBJECTPERF_Factory.SCHEMA_TABLENAME_LABEL, "");
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
                       LOG.debug(QueryDetails._LOGGING_HEADER + "A batch of tilda.data.ObjectPerf_Data objects between positions #" + batchStart + " and #" + index + " failed being written to the database.");
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
                   LOG.debug(QueryDetails._LOGGING_HEADER + "A batch of 'ObjectPerf_Data' objects ending at position #" + index + " failed being written to the database.");
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
           TILDA__1_0.handleFinally(PS, T0, TILDA__OBJECTPERF_Factory.SCHEMA_TABLENAME_LABEL, lastObj != null && lastObj.__Init == InitMode.CREATE ? StatementType.INSERT : StatementType.UPDATE, count, AllocatedArrays);
           PS = null;
           AllocatedArrays = null;
         }
       }

   static public tilda.data.ObjectPerf_Data lookupByPrimaryKey(String schemaName, String objectName, ZonedDateTime startPeriod) throws Exception
     {
       tilda.data._Tilda.TILDA__OBJECTPERF Obj = new tilda.data.ObjectPerf_Data();
       Obj.initForLookup(0);

       Obj.setSchemaName   (schemaName   ); Obj.__Saved_schemaName    = Obj._schemaName   ;
       Obj.setObjectName   (objectName   ); Obj.__Saved_objectName    = Obj._objectName   ;
       Obj.setStartPeriod  (startPeriod  ); Obj.__Saved_startPeriod   = Obj._startPeriod  ;

       return (tilda.data.ObjectPerf_Data) Obj;
     }


   static public ListResults<tilda.data.ObjectPerf_Data> lookupWhereSchemaByObjectStart(Connection C, String schemaName, int start, int size) throws Exception
     {
       tilda.data._Tilda.TILDA__OBJECTPERF Obj = new tilda.data.ObjectPerf_Data();
       Obj.initForLookup(tilda.utils.SystemValues.EVIL_VALUE);

       Obj.setSchemaName   (schemaName   );


       RecordProcessorInternal RPI = new RecordProcessorInternal(C, start);
       readMany(C, 1, RPI, Obj, null, start, size);
       return RPI._L;
     }

   static public void lookupWhereSchemaByObjectStart(Connection C, tilda.db.processors.ObjectProcessor<tilda.data.ObjectPerf_Data> OP, String schemaName, int start, int size) throws Exception
     {
       tilda.data._Tilda.TILDA__OBJECTPERF Obj = new tilda.data.ObjectPerf_Data();
       Obj.initForLookup(tilda.utils.SystemValues.EVIL_VALUE);

       Obj.setSchemaName   (schemaName   );


       RecordProcessorInternal RPI = new RecordProcessorInternal(C, OP);
       readMany(C, 1, RPI, Obj, null, start, size);
     }



   static public ListResults<tilda.data.ObjectPerf_Data> lookupWhereSchemaObjectByStart(Connection C, String schemaName, String objectName, int start, int size) throws Exception
     {
       tilda.data._Tilda.TILDA__OBJECTPERF Obj = new tilda.data.ObjectPerf_Data();
       Obj.initForLookup(tilda.utils.SystemValues.EVIL_VALUE);

       Obj.setSchemaName   (schemaName   );
       Obj.setObjectName   (objectName   );


       RecordProcessorInternal RPI = new RecordProcessorInternal(C, start);
       readMany(C, 2, RPI, Obj, null, start, size);
       return RPI._L;
     }

   static public void lookupWhereSchemaObjectByStart(Connection C, tilda.db.processors.ObjectProcessor<tilda.data.ObjectPerf_Data> OP, String schemaName, String objectName, int start, int size) throws Exception
     {
       tilda.data._Tilda.TILDA__OBJECTPERF Obj = new tilda.data.ObjectPerf_Data();
       Obj.initForLookup(tilda.utils.SystemValues.EVIL_VALUE);

       Obj.setSchemaName   (schemaName   );
       Obj.setObjectName   (objectName   );


       RecordProcessorInternal RPI = new RecordProcessorInternal(C, OP);
       readMany(C, 2, RPI, Obj, null, start, size);
     }




   public static SelectQuery newSelectQuery(Connection C) throws Exception { return new SelectQuery(C, SCHEMA_LABEL, TABLENAME_LABEL, true); }
   public static SelectQuery newWhereQuery (Connection C) throws Exception { return new SelectQuery(C, SCHEMA_LABEL, TABLENAME_LABEL, false); }
   public static ListResults<tilda.data.ObjectPerf_Data> runSelect(Connection C, SelectQuery Q, int start, int size) throws Exception
     {
       RecordProcessorInternal RPI = new RecordProcessorInternal(C, start);
       readMany(C, -7, RPI, null, Q, start, size);
       return RPI._L;
     }
   public static void runSelect(Connection C, SelectQuery Q, tilda.db.processors.ObjectProcessor<tilda.data.ObjectPerf_Data> OP, int start, int size) throws Exception
     {
       RecordProcessorInternal RPI = new RecordProcessorInternal(C, OP);
       readMany(C, -7, RPI, null, Q, start, size);
     }
   public static UpdateQuery newUpdateQuery(Connection C) throws Exception { return new UpdateQuery(C, SCHEMA_LABEL, TABLENAME_LABEL); }
   public static DeleteQuery newDeleteQuery(Connection C) throws Exception { return new DeleteQuery(C, SCHEMA_LABEL, TABLENAME_LABEL); }


 }
