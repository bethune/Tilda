
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
public class TILDA__TESTING_Factory
 {
   protected static final Logger LOG = LogManager.getLogger(TILDA__TESTING_Factory.class.getName());

   protected TILDA__TESTING_Factory() { }

   public static final Class<TILDA__TESTING> DATA_CLASS= TILDA__TESTING.class;
   public static final String SCHEMA_LABEL = TextUtil.print("TILDATEST", "");
   public static final String TABLENAME_LABEL = TextUtil.print("Testing", "");
   public static final String SCHEMA_TABLENAME_LABEL = TextUtil.print("TILDATEST.Testing", "");
   public static void getFullTableNameVar(Connection C, StringBuilder S) { C.getFullTableVar(S, "TILDATEST", "Testing"); }

   public static abstract class COLS {
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.refnum -> TILDATEST.Testing."refnum"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.refnum of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.refnum of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The primary key for this record</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>true</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_LongPrimitive          REFNUM     = new Type_LongPrimitive         (SCHEMA_LABEL, TABLENAME_LABEL, "refnum"     , 0/*0*/, "The primary key for this record");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.refnum2 -> TILDATEST.Testing."refnum2"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.refnum2 of type List<Long></TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.refnum2 of type bigint[]</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The person's primary key</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>true</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_LongCollection         REFNUM2    = new Type_LongCollection        (SCHEMA_LABEL, TABLENAME_LABEL, "refnum2"    , 1/*1*/, "The person's primary key");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.name -> TILDATEST.Testing."name"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.name of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.name of type varchar(10)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>10</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Medical system unique enterprise id</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitive        NAME       = new Type_StringPrimitive       (SCHEMA_LABEL, TABLENAME_LABEL, "name"       , 2/*2*/, "Medical system unique enterprise id");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.description -> TILDATEST.Testing."description"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.description of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.description of type varchar(250)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>250</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The title for a person, i.e., Mr, Miss, Mrs...</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitiveNull    DESCRIPTION= new Type_StringPrimitiveNull   (SCHEMA_LABEL, TABLENAME_LABEL, "description", 3/*3*/, "The title for a person, i.e., Mr, Miss, Mrs...");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.desc2 -> TILDATEST.Testing."desc2"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.desc2 of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.desc2 of type varchar(3000)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>3000</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The title for a person, i.e., Mr, Miss, Mrs...</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitiveNull    DESC2      = new Type_StringPrimitiveNull   (SCHEMA_LABEL, TABLENAME_LABEL, "desc2"      , 4/*4*/, "The title for a person, i.e., Mr, Miss, Mrs...");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.desc3 -> TILDATEST.Testing."desc3"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.desc3 of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.desc3 of type text</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>5000</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The title for a person, i.e., Mr, Miss, Mrs...</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitiveNull    DESC3      = new Type_StringPrimitiveNull   (SCHEMA_LABEL, TABLENAME_LABEL, "desc3"      , 5/*5*/, "The title for a person, i.e., Mr, Miss, Mrs...");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.desc4 -> TILDATEST.Testing."desc4"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.desc4 of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.desc4 of type text</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>9000</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The title for a person, i.e., Mr, Miss, Mrs...</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitiveNull    DESC4      = new Type_StringPrimitiveNull   (SCHEMA_LABEL, TABLENAME_LABEL, "desc4"      , 6/*6*/, "The title for a person, i.e., Mr, Miss, Mrs...");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.desc5 -> TILDATEST.Testing."desc5"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.desc5 of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.desc5 of type text</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>17000</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The title for a person, i.e., Mr, Miss, Mrs...</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitiveNull    DESC5      = new Type_StringPrimitiveNull   (SCHEMA_LABEL, TABLENAME_LABEL, "desc5"      , 7/*7*/, "The title for a person, i.e., Mr, Miss, Mrs...");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.desc6 -> TILDATEST.Testing."desc6"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.desc6 of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.desc6 of type text</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>33000</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The title for a person, i.e., Mr, Miss, Mrs...</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>SMART</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>String</B>&nbsp;&nbsp;</TD><TD>STR&nbsp;&nbsp;</TD><TD>String&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>String</TD></TR>
  <TR bgcolor="#EEEEEE"><TD>1&nbsp;&nbsp;</TD><TD align="right"><B>DateTime</B>&nbsp;&nbsp;</TD><TD>DTM&nbsp;&nbsp;</TD><TD>DateTime&nbsp;&nbsp;</TD><TD>NONE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>DateTime</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_StringPrimitiveNull    DESC6      = new Type_StringPrimitiveNull   (SCHEMA_LABEL, TABLENAME_LABEL, "desc6"      , 8/*8*/, "The title for a person, i.e., Mr, Miss, Mrs...");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.tops -> TILDATEST.Testing."tops"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.tops of type List<String></TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.tops of type text[]</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>null</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringCollectionNull   TOPS       = new Type_StringCollectionNull  (SCHEMA_LABEL, TABLENAME_LABEL, "tops"       , 9/*9*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.tops2 -> TILDATEST.Testing."tops2"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.tops2 of type Set <String></TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.tops2 of type text[]</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>null</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringCollectionNull   TOPS2      = new Type_StringCollectionNull  (SCHEMA_LABEL, TABLENAME_LABEL, "tops2"      , 10/*10*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a1 -> TILDATEST.Testing."a1"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a1 of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a1 of type INTEGER</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_BitfieldPrimitiveNull  A1         = new Type_BitfieldPrimitiveNull (SCHEMA_LABEL, TABLENAME_LABEL, "a1"         , 11/*11*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a2 -> TILDATEST.Testing."a2"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a2 of type char</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a2 of type character</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_CharPrimitiveNull      A2         = new Type_CharPrimitiveNull     (SCHEMA_LABEL, TABLENAME_LABEL, "a2"         , 12/*12*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a2b -> TILDATEST.Testing."a2b"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a2b of type List<Character></TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a2b of type character[]</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_CharCollectionNull     A2B        = new Type_CharCollectionNull    (SCHEMA_LABEL, TABLENAME_LABEL, "a2b"        , 13/*13*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a2c -> TILDATEST.Testing."a2c"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a2c of type Set <Character></TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a2c of type character[]</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_CharCollectionNull     A2C        = new Type_CharCollectionNull    (SCHEMA_LABEL, TABLENAME_LABEL, "a2c"        , 14/*14*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a3 -> TILDATEST.Testing."a3"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a3 of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a3 of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_BooleanPrimitiveNull   A3         = new Type_BooleanPrimitiveNull  (SCHEMA_LABEL, TABLENAME_LABEL, "a3"         , 15/*15*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a3b -> TILDATEST.Testing."a3b"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a3b of type List<Boolean></TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a3b of type boolean[]</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_BooleanCollectionNull  A3B        = new Type_BooleanCollectionNull (SCHEMA_LABEL, TABLENAME_LABEL, "a3b"        , 16/*16*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a4 -> TILDATEST.Testing."a4"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a4 of type double</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a4 of type double precision</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_DoublePrimitiveNull    A4         = new Type_DoublePrimitiveNull   (SCHEMA_LABEL, TABLENAME_LABEL, "a4"         , 17/*17*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a4b -> TILDATEST.Testing."a4b"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a4b of type List<Double></TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a4b of type double precision[]</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_DoubleCollectionNull   A4B        = new Type_DoubleCollectionNull  (SCHEMA_LABEL, TABLENAME_LABEL, "a4b"        , 18/*18*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a5 -> TILDATEST.Testing."a5"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a5 of type float</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a5 of type real</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_FloatPrimitiveNull     A5         = new Type_FloatPrimitiveNull    (SCHEMA_LABEL, TABLENAME_LABEL, "a5"         , 19/*19*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a5b -> TILDATEST.Testing."a5b"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a5b of type List<Float></TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a5b of type real[]</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_FloatCollectionNull    A5B        = new Type_FloatCollectionNull   (SCHEMA_LABEL, TABLENAME_LABEL, "a5b"        , 20/*20*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a6 -> TILDATEST.Testing."a6"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a6 of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a6 of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_LongPrimitiveNull      A6         = new Type_LongPrimitiveNull     (SCHEMA_LABEL, TABLENAME_LABEL, "a6"         , 21/*21*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a6b -> TILDATEST.Testing."a6b"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a6b of type List<Long></TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a6b of type bigint[]</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_LongCollectionNull     A6B        = new Type_LongCollectionNull    (SCHEMA_LABEL, TABLENAME_LABEL, "a6b"        , 22/*22*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a6c -> TILDATEST.Testing."a6c"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a6c of type Set <Long></TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a6c of type bigint[]</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_LongCollectionNull     A6C        = new Type_LongCollectionNull    (SCHEMA_LABEL, TABLENAME_LABEL, "a6c"        , 23/*23*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a6dTZ -> TILDATEST.Testing."a6dTZ"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a6dTZ of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a6dTZ of type character(5)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>5</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Generated helper column to hold the time zone ID for 'a6d'.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>AUTO</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitiveNull    A6DTZ      = new Type_StringPrimitiveNull   (SCHEMA_LABEL, TABLENAME_LABEL, "a6dTZ"      , 24/*24*/, "Generated helper column to hold the time zone ID for 'a6d'.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a6d -> TILDATEST.Testing."a6d"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a6d of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a6d of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_DatetimePrimitiveNull  A6D        = new Type_DatetimePrimitiveNull (SCHEMA_LABEL, TABLENAME_LABEL, "a6d"        , 25/*25*/, "The blah", A6DTZ);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a7 -> TILDATEST.Testing."a7"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a7 of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a7 of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_IntegerPrimitiveNull   A7         = new Type_IntegerPrimitiveNull  (SCHEMA_LABEL, TABLENAME_LABEL, "a7"         , 26/*26*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a7b -> TILDATEST.Testing."a7b"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a7b of type List<Integer></TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a7b of type integer[]</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_IntegerCollectionNull  A7B        = new Type_IntegerCollectionNull (SCHEMA_LABEL, TABLENAME_LABEL, "a7b"        , 27/*27*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a8 -> TILDATEST.Testing."a8"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a8 of type byte[]</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a8 of type BYTEA</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_BinaryPrimitiveNull    A8         = new Type_BinaryPrimitiveNull   (SCHEMA_LABEL, TABLENAME_LABEL, "a8"         , 28/*28*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a8bTZ -> TILDATEST.Testing."a8bTZ"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a8bTZ of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a8bTZ of type character(5)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>5</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Generated helper column to hold the time zone ID for 'a8b'.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>AUTO</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitiveNull    A8BTZ      = new Type_StringPrimitiveNull   (SCHEMA_LABEL, TABLENAME_LABEL, "a8bTZ"      , 29/*29*/, "Generated helper column to hold the time zone ID for 'a8b'.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a8b -> TILDATEST.Testing."a8b"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a8b of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a8b of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_DatetimePrimitiveNull  A8B        = new Type_DatetimePrimitiveNull (SCHEMA_LABEL, TABLENAME_LABEL, "a8b"        , 30/*30*/, "The blah", A8BTZ);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a9TZ -> TILDATEST.Testing."a9TZ"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a9TZ of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a9TZ of type character(5)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>5</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Generated helper column to hold the time zone ID for 'a9'.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>AUTO</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitiveNull    A9TZ       = new Type_StringPrimitiveNull   (SCHEMA_LABEL, TABLENAME_LABEL, "a9TZ"       , 31/*31*/, "Generated helper column to hold the time zone ID for 'a9'.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a9 -> TILDATEST.Testing."a9"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a9 of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a9 of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>a9_CreateDefault</B>&nbsp;&nbsp;</TD><TD>NOW&nbsp;&nbsp;</TD><TD>a9_CreateDefault&nbsp;&nbsp;</TD><TD>CREATE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>a9_CreateDefault</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_DatetimePrimitiveNull  A9         = new Type_DatetimePrimitiveNull (SCHEMA_LABEL, TABLENAME_LABEL, "a9"         , 32/*32*/, "The blah", A9TZ);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a9a1TZ -> TILDATEST.Testing."a9a1TZ"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a9a1TZ of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a9a1TZ of type character(5)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>5</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Generated helper column to hold the time zone ID for 'a9a1'.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>AUTO</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitiveNull    A9A1TZ     = new Type_StringPrimitiveNull   (SCHEMA_LABEL, TABLENAME_LABEL, "a9a1TZ"     , 33/*33*/, "Generated helper column to hold the time zone ID for 'a9a1'.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a9a1 -> TILDATEST.Testing."a9a1"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a9a1 of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a9a1 of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
  <TR valign="top"><TD align="right"><B>Values</B></TD><TD>

<TABLE border="0px" cellpadding="2px" cellspacing="0px">   <TR align="left"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH>Value&nbsp;&nbsp;</TH><TH>Label&nbsp;&nbsp;</TH><TH>Default&nbsp;&nbsp;</TH><TH>Groupings&nbsp;&nbsp;</TH><TH>Description</TH></TR>
  <TR bgcolor="#FFFFFF"><TD>0&nbsp;&nbsp;</TD><TD align="right"><B>a9a1_CreateDefault</B>&nbsp;&nbsp;</TD><TD>UNDEFINED&nbsp;&nbsp;</TD><TD>a9a1_CreateDefault&nbsp;&nbsp;</TD><TD>CREATE&nbsp;&nbsp;</TD><TD>&nbsp;&nbsp;</TD><TD>a9a1_CreateDefault</TD></TR>
</TABLE>
</TD></TR>

</TABLE>
*/
     public static Type_DatetimePrimitiveNull  A9A1       = new Type_DatetimePrimitiveNull (SCHEMA_LABEL, TABLENAME_LABEL, "a9a1"       , 34/*34*/, "The blah", A9A1TZ);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a9bTZ -> TILDATEST.Testing."a9bTZ"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a9bTZ of type List<String></TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a9bTZ of type text[]</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>0</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Generated helper column to hold the time zone ID for 'a9b'.</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>AUTO</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringCollectionNull   A9BTZ      = new Type_StringCollectionNull  (SCHEMA_LABEL, TABLENAME_LABEL, "a9bTZ"      , 35/*35*/, "Generated helper column to hold the time zone ID for 'a9b'.");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a9b -> TILDATEST.Testing."a9b"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a9b of type List<ZonedDateTime></TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a9b of type timestamptz[]</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_DatetimeCollectionNull A9B        = new Type_DatetimeCollectionNull(SCHEMA_LABEL, TABLENAME_LABEL, "a9b"        , 36/*36*/, "The blah", A9BTZ);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a9c -> TILDATEST.Testing."a9c"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a9c of type LocalDate</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a9c of type date</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_DatePrimitiveNull      A9C        = new Type_DatePrimitiveNull     (SCHEMA_LABEL, TABLENAME_LABEL, "a9c"        , 37/*37*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a9d -> TILDATEST.Testing."a9d"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a9d of type List<LocalDate></TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a9d of type date[]</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_DateCollectionNull     A9D        = new Type_DateCollectionNull    (SCHEMA_LABEL, TABLENAME_LABEL, "a9d"        , 38/*38*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a10a -> TILDATEST.Testing."a10a"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a10a of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a10a of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_IntegerPrimitiveNull   A10A       = new Type_IntegerPrimitiveNull  (SCHEMA_LABEL, TABLENAME_LABEL, "a10a"       , 39/*39*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a10b -> TILDATEST.Testing."a10b"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a10b of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a10b of type varchar(10)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>10</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_StringPrimitiveNull    A10B       = new Type_StringPrimitiveNull   (SCHEMA_LABEL, TABLENAME_LABEL, "a10b"       , 40/*40*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a10c -> TILDATEST.Testing."a10c"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a10c of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a10c of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_IntegerPrimitiveNull   A10C       = new Type_IntegerPrimitiveNull  (SCHEMA_LABEL, TABLENAME_LABEL, "a10c"       , 41/*41*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a11 -> TILDATEST.Testing."a11"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a11 of type BigDecimal</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a11 of type numeric(8,4)</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_NumericPrimitiveNull   A11        = new Type_NumericPrimitiveNull  (SCHEMA_LABEL, TABLENAME_LABEL, "a11"        , 42/*42*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a11b -> TILDATEST.Testing."a11b"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a11b of type List<BigDecimal></TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a11b of type numeric(6,3)[]</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_NumericCollectionNull  A11B       = new Type_NumericCollectionNull (SCHEMA_LABEL, TABLENAME_LABEL, "a11b"       , 43/*43*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a11c -> TILDATEST.Testing."a11c"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a11c of type BigDecimal</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a11c of type numeric(5,0)</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_NumericPrimitiveNull   A11C       = new Type_NumericPrimitiveNull  (SCHEMA_LABEL, TABLENAME_LABEL, "a11c"       , 44/*44*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a12 -> TILDATEST.Testing."a12"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a12 of type short</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a12 of type smallint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_ShortPrimitiveNull     A12        = new Type_ShortPrimitiveNull    (SCHEMA_LABEL, TABLENAME_LABEL, "a12"        , 45/*45*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a12b -> TILDATEST.Testing."a12b"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a12b of type List<Short></TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a12b of type smallint[]</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_ShortCollectionNull    A12B       = new Type_ShortCollectionNull   (SCHEMA_LABEL, TABLENAME_LABEL, "a12b"       , 46/*46*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a13 -> TILDATEST.Testing."a13"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a13 of type UUID</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a13 of type UUID</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_UuidPrimitiveNull      A13        = new Type_UuidPrimitiveNull     (SCHEMA_LABEL, TABLENAME_LABEL, "a13"        , 47/*47*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.a13b -> TILDATEST.Testing."a13b"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.a13b of type List<UUID></TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.a13b of type UUID[]</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The blah</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_UuidCollectionNull     A13B       = new Type_UuidCollectionNull    (SCHEMA_LABEL, TABLENAME_LABEL, "a13b"       , 48/*48*/, "The blah");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.created -> TILDATEST.Testing."created"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.created of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.created of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The timestamp for when the record was created. (TILDATEST.Testing)</TD></TR>
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
     public static Type_DatetimePrimitive      CREATED    = new Type_DatetimePrimitive     (SCHEMA_LABEL, TABLENAME_LABEL, "created"    , 49/*49*/, "The timestamp for when the record was created. (TILDATEST.Testing)");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.lastUpdated -> TILDATEST.Testing."lastUpdated"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.lastUpdated of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.lastUpdated of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The timestamp for when the record was last updated. (TILDATEST.Testing)</TD></TR>
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
     public static Type_DatetimePrimitive      LASTUPDATED= new Type_DatetimePrimitive     (SCHEMA_LABEL, TABLENAME_LABEL, "lastUpdated", 50/*50*/, "The timestamp for when the record was last updated. (TILDATEST.Testing)");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.data_test.TILDATEST.Testing.deleted -> TILDATEST.Testing."deleted"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the column definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.data_test.TILDATEST.Testing.deleted of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATEST.Testing.deleted of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The timestamp for when the record was deleted. (TILDATEST.Testing)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>AUTO</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
     public static Type_DatetimePrimitiveNull  DELETED    = new Type_DatetimePrimitiveNull (SCHEMA_LABEL, TABLENAME_LABEL, "deleted"    , 51/*51*/, "The timestamp for when the record was deleted. (TILDATEST.Testing)");
;
   }

   public static final ColumnDefinition[] COLUMNS = { COLS.REFNUM,COLS.REFNUM2,COLS.NAME,COLS.DESCRIPTION,COLS.DESC2,COLS.DESC3,COLS.DESC4,COLS.DESC5,COLS.DESC6,COLS.TOPS,COLS.TOPS2,COLS.A1,COLS.A2,COLS.A2B,COLS.A2C,COLS.A3,COLS.A3B,COLS.A4,COLS.A4B,COLS.A5,COLS.A5B,COLS.A6,COLS.A6B,COLS.A6C,COLS.A6DTZ,COLS.A6D,COLS.A7,COLS.A7B,COLS.A8,COLS.A8BTZ,COLS.A8B,COLS.A9TZ,COLS.A9,COLS.A9A1TZ,COLS.A9A1,COLS.A9BTZ,COLS.A9B,COLS.A9C,COLS.A9D,COLS.A10A,COLS.A10B,COLS.A10C,COLS.A11,COLS.A11B,COLS.A11C,COLS.A12,COLS.A12B,COLS.A13,COLS.A13B,COLS.CREATED,COLS.LASTUPDATED,COLS.DELETED };

   public static final ColumnDefinition[] COLUMNS_PRIMARY = { COLS.REFNUM };

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
              tilda.data_test.Testing_Factory.init(C);
              __INITIALIZED = true;
            }
         }
     }
   private static class RecordProcessorInternal implements tilda.db.processors.RecordProcessor
     {
       public RecordProcessorInternal(Connection C, int start)
         {
           _C = C;
           _L = new ArrayListResults<tilda.data_test.Testing_Data>(start);
         }
       public RecordProcessorInternal(Connection C, tilda.db.processors.ObjectProcessor<tilda.data_test.Testing_Data> OP)
         {
           _C = C;
           _OP = OP;
         }
       protected Connection _C = null;
       protected tilda.db.processors.ObjectProcessor<tilda.data_test.Testing_Data> _OP;
       protected ArrayListResults<tilda.data_test.Testing_Data> _L = null;
       public void    start  () { if (_OP != null) _OP.start(); }
       public void    end    (boolean hasMore, int maxCount) { if (_OP == null) _L.wrapup(hasMore, maxCount); else _OP.end(hasMore, maxCount); }
       public boolean process(int count, java.sql.ResultSet RS) throws Exception
        {
          tilda.data_test.Testing_Data Obj = new tilda.data_test.Testing_Data();
          boolean OK = ((tilda.data_test._Tilda.TILDA__TESTING)Obj).init(_C, RS);
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
   protected static final ListResults<tilda.data_test.Testing_Data> readMany(Connection C, String fullSelectQuery, int start, int size) throws Exception
     {
       RecordProcessorInternal RPI = new RecordProcessorInternal(C, start);
       readMany(C, -77, RPI, null, fullSelectQuery, start, size);
       return RPI._L;
     }

   private static final void readMany(Connection C, int LookupId, tilda.db.processors.RecordProcessor RP, tilda.data_test._Tilda.TILDA__TESTING Obj, Object ExtraParams, int start, int size) throws Exception
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
          S.append(" "); C.getFullColumnVar(S, "TILDATEST", "Testing", "refnum");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "refnum2");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "name");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "description");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "desc2");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "desc3");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "desc4");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "desc5");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "desc6");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "tops");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "tops2");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a1");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a2");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a2b");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a2c");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a3");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a3b");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a4");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a4b");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a5");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a5b");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a6");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a6b");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a6c");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a6dTZ");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a6d");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a7");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a7b");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a8");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a8bTZ");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a8b");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a9TZ");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a9");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a9a1TZ");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a9a1");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a9bTZ");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a9b");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a9c");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a9d");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a10a");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a10b");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a10c");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a11");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a11b");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a11c");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a12");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a12b");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a13");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "a13b");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "created");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "lastUpdated");
          S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "deleted");
          S.append(" from "); C.getFullTableVar(S, "TILDATEST", "Testing");
          switch (LookupId)
           {
             case -7:
                String clause = ((SelectQuery)ExtraParams).getWhereClause();
                if (TextUtil.isNullOrEmpty(clause) == false) S.append(clause);
                break;
             case 1:
                S.append(" order by "); C.getFullColumnVar(S, "TILDATEST", "Testing", "name"); S.append(" ASC");
                break;
             case 2:
                S.append(" order by "); C.getFullColumnVar(S, "TILDATEST", "Testing", "name"); S.append(" ASC");
                break;
             case 3:
                S.append(" order by "); C.getFullColumnVar(S, "TILDATEST", "Testing", "name"); S.append(" DESC");
                break;
             case 4:
                S.append(" where ("); C.getFullColumnVar(S, "TILDATEST", "Testing", "deleted"); S.append(" is null and "); C.getFullColumnVar(S, "TILDATEST", "Testing", "name"); S.append(" = 'Hello' and "); C.getFullColumnVar(S, "TILDATEST", "Testing", "created"); S.append(" > '2018-01-01')");
                S.append(" order by "); C.getFullColumnVar(S, "TILDATEST", "Testing", "name"); S.append(" ASC");S.append(", "); C.getFullColumnVar(S, "TILDATEST", "Testing", "description"); S.append(" DESC");
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
       QueryDetails.logQuery("TILDATEST.Testing", Q, null);
       java.sql.PreparedStatement PS=null;
       List<java.sql.Array> AllocatedArrays = new ArrayList<java.sql.Array>();
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
             case 2: {
               break;
             }
             case 3: {
               break;
             }
             case 4: {
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
          tilda.data_test._Tilda.TILDA__1_0.handleFinally(PS, T0, TILDA__TESTING_Factory.SCHEMA_TABLENAME_LABEL, StatementType.SELECT, count, AllocatedArrays);
          PS = null;
          AllocatedArrays = null;
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
   static public tilda.data_test.Testing_Data init(Map<String, String[]> Values, List<StringStringPair> Errors)
   throws Exception
     {
       tilda.data_test._Tilda.TILDA__TESTING Obj = new tilda.data_test.Testing_Data();
       String[] vals = null;

       vals = Values.get("refnum");
       // Even though this is a primary key, and is by definition not-null, we nevertheless check it as optional in case
       // this object is being initialized generically for a create.
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("refnum", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Long _refnum = ParseUtil.parseLong("refnum", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_refnum != null) Obj.setRefnum(_refnum);

       vals = Values.get("refnum2");
       List<Long> _refnum2 = CollectionUtil.toList(ParseUtil.parseLong("refnum2", true, vals, Errors));
       if (_refnum2 != null) Obj.setRefnum2(_refnum2);

       vals = Values.get("name");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("name", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       String _name = ParseUtil.parseString("name", true, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_name != null) Obj.setName(_name);

       vals = Values.get("description");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("description", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       String _description = ParseUtil.parseString("description", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_description != null) Obj.setDescription(_description);

       vals = Values.get("desc2");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("desc2", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       String _desc2 = ParseUtil.parseString("desc2", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_desc2 != null) Obj.setDesc2(_desc2);

       vals = Values.get("desc3");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("desc3", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       String _desc3 = ParseUtil.parseString("desc3", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_desc3 != null) Obj.setDesc3(_desc3);

       vals = Values.get("desc4");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("desc4", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       String _desc4 = ParseUtil.parseString("desc4", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_desc4 != null) Obj.setDesc4(_desc4);

       vals = Values.get("desc5");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("desc5", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       String _desc5 = ParseUtil.parseString("desc5", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_desc5 != null) Obj.setDesc5(_desc5);

       vals = Values.get("desc6");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("desc6", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       String _desc6 = ParseUtil.parseString("desc6", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_desc6 != null) Obj.setDesc6(_desc6);

       vals = Values.get("tops");
       List<String> _tops = CollectionUtil.toList(ParseUtil.parseString("tops", false, vals, Errors));
       if (_tops != null) Obj.setTops(_tops);

       vals = Values.get("tops2");
       Set <String> _tops2 = CollectionUtil.toSet (ParseUtil.parseString("tops2", false, vals, Errors));
       if (_tops2 != null) Obj.setTops2(_tops2);

       vals = Values.get("a1");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a1", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Integer _a1 = ParseUtil.parseInteger("a1", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a1 != null) Obj.setA1(_a1);

       vals = Values.get("a2");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a2", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Character _a2 = ParseUtil.parseCharacter("a2", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a2 != null) Obj.setA2(_a2);

       vals = Values.get("a2b");
       List<Character> _a2b = CollectionUtil.toList(ParseUtil.parseCharacter("a2b", false, vals, Errors));
       if (_a2b != null) Obj.setA2b(_a2b);

       vals = Values.get("a2c");
       Set <Character> _a2c = CollectionUtil.toSet (ParseUtil.parseCharacter("a2c", false, vals, Errors));
       if (_a2c != null) Obj.setA2c(_a2c);

       vals = Values.get("a3");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a3", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Boolean _a3 = ParseUtil.parseBoolean("a3", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a3 != null) Obj.setA3(_a3);

       vals = Values.get("a3b");
       List<Boolean> _a3b = CollectionUtil.toList(ParseUtil.parseBoolean("a3b", false, vals, Errors));
       if (_a3b != null) Obj.setA3b(_a3b);

       vals = Values.get("a4");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a4", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Double _a4 = ParseUtil.parseDouble("a4", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a4 != null) Obj.setA4(_a4);

       vals = Values.get("a4b");
       List<Double> _a4b = CollectionUtil.toList(ParseUtil.parseDouble("a4b", false, vals, Errors));
       if (_a4b != null) Obj.setA4b(_a4b);

       vals = Values.get("a5");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a5", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Float _a5 = ParseUtil.parseFloat("a5", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a5 != null) Obj.setA5(_a5);

       vals = Values.get("a5b");
       List<Float> _a5b = CollectionUtil.toList(ParseUtil.parseFloat("a5b", false, vals, Errors));
       if (_a5b != null) Obj.setA5b(_a5b);

       vals = Values.get("a6");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a6", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Long _a6 = ParseUtil.parseLong("a6", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a6 != null) Obj.setA6(_a6);

       vals = Values.get("a6b");
       List<Long> _a6b = CollectionUtil.toList(ParseUtil.parseLong("a6b", false, vals, Errors));
       if (_a6b != null) Obj.setA6b(_a6b);

       vals = Values.get("a6c");
       Set <Long> _a6c = CollectionUtil.toSet (ParseUtil.parseLong("a6c", false, vals, Errors));
       if (_a6c != null) Obj.setA6c(_a6c);

       vals = Values.get("a6d");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a6d", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       ZonedDateTime _a6d = ParseUtil.parseZonedDateTime("a6d", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a6d != null) Obj.setA6d(_a6d);

       vals = Values.get("a7");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a7", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Integer _a7 = ParseUtil.parseInteger("a7", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a7 != null) Obj.setA7(_a7);

       vals = Values.get("a7b");
       List<Integer> _a7b = CollectionUtil.toList(ParseUtil.parseInteger("a7b", false, vals, Errors));
       if (_a7b != null) Obj.setA7b(_a7b);

       vals = Values.get("a8");
       if (vals != null)
        throw new Exception("Column 'a8' is of a binary type and cannot be initialized with a generic String value.");
       vals = Values.get("a8b");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a8b", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       ZonedDateTime _a8b = ParseUtil.parseZonedDateTime("a8b", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a8b != null) Obj.setA8b(_a8b);

       vals = Values.get("a9");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a9", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       ZonedDateTime _a9 = ParseUtil.parseZonedDateTime("a9", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a9 != null) Obj.setA9(_a9);

       vals = Values.get("a9a1");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a9a1", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       ZonedDateTime _a9a1 = ParseUtil.parseZonedDateTime("a9a1", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a9a1 != null) Obj.setA9a1(_a9a1);

       vals = Values.get("a9b");
       List<ZonedDateTime> _a9b = CollectionUtil.toList(ParseUtil.parseZonedDateTime("a9b", false, vals, Errors));
       if (_a9b != null) Obj.setA9b(_a9b);

       vals = Values.get("a9c");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a9c", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       LocalDate _a9c = ParseUtil.parseLocalDate("a9c", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a9c != null) Obj.setA9c(_a9c);

       vals = Values.get("a9d");
       List<LocalDate> _a9d = CollectionUtil.toList(ParseUtil.parseLocalDate("a9d", false, vals, Errors));
       if (_a9d != null) Obj.setA9d(_a9d);

       vals = Values.get("a10a");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a10a", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Integer _a10a = ParseUtil.parseInteger("a10a", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a10a != null) Obj.setA10a(_a10a);

       vals = Values.get("a10b");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a10b", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       String _a10b = ParseUtil.parseString("a10b", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a10b != null) Obj.setA10b(_a10b);

       vals = Values.get("a10c");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a10c", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Integer _a10c = ParseUtil.parseInteger("a10c", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a10c != null) Obj.setA10c(_a10c);

       vals = Values.get("a11");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a11", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       BigDecimal _a11 = ParseUtil.parseBigDecimal("a11", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a11 != null) Obj.setA11(_a11);

       vals = Values.get("a11b");
       List<BigDecimal> _a11b = CollectionUtil.toList(ParseUtil.parseBigDecimal("a11b", false, vals, Errors));
       if (_a11b != null) Obj.setA11b(_a11b);

       vals = Values.get("a11c");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a11c", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       BigDecimal _a11c = ParseUtil.parseBigDecimal("a11c", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a11c != null) Obj.setA11c(_a11c);

       vals = Values.get("a12");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a12", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       Short _a12 = ParseUtil.parseShort("a12", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a12 != null) Obj.setA12(_a12);

       vals = Values.get("a12b");
       List<Short> _a12b = CollectionUtil.toList(ParseUtil.parseShort("a12b", false, vals, Errors));
       if (_a12b != null) Obj.setA12b(_a12b);

       vals = Values.get("a13");
       if (vals!=null && vals.length > 1)
        Errors.add(new StringStringPair("a13", "Parameter is not a list or a set and yet received "+vals.length+" values"));
       UUID _a13 = ParseUtil.parseUUID("a13", false, vals!=null && vals.length > 0 ? vals[0] : null, Errors);
       if (_a13 != null) Obj.setA13(_a13);

       vals = Values.get("a13b");
       List<UUID> _a13b = CollectionUtil.toList(ParseUtil.parseUUID("a13b", false, vals, Errors));
       if (_a13b != null) Obj.setA13b(_a13b);


       return (tilda.data_test.Testing_Data) Obj;
     }

/**
 Creates a new object in memory, which you can subsequently {@link #write()} to the data store.
 current object to the destination. 
 @param refnum2     The person's primary key
 @param name        (max size 10) Medical system unique enterprise id
*/
   static public tilda.data_test.Testing_Data create(List<Long> refnum2, String name) throws Exception
     {
       tilda.data_test._Tilda.TILDA__TESTING Obj = new tilda.data_test.Testing_Data();
       Obj.initForCreate();


       // Auto PK
       Obj.setRefnum(tilda.db.KeysManager.getKey("TILDATEST.TESTING"));

       // Explicit setters
       Obj.setRefnum2    (refnum2    );
       Obj.setName       (name       );

       // Default Create-time setters
       Obj.setA9Now                 ();
       Obj.setA9a1Undefined         ();
       Obj.setCreatedNow            ();
       Obj.setLastUpdatedNow        ();

       return (tilda.data_test.Testing_Data) Obj;
     }

   public static int writeBatch(Connection C, List<tilda.data_test.Testing_Data> L, int batchSize, int commitSize) throws Exception
     {
       long T0 = System.nanoTime();

       if (L == null || L.isEmpty() == true)
         return -1;

       java.sql.PreparedStatement PS = null;
       List<java.sql.Array> AllocatedArrays = new ArrayList<java.sql.Array>();
       int count = 0;
       int batchStart = 0;
       TILDA__TESTING lastObj = null;
       BitSet firstChangeList = (BitSet) ((TILDA__TESTING) L.get(0)).__Changes.clone();
       String firstTimeStampSignature = ((TILDA__TESTING) L.get(0)).getTimeStampSignature();

       try
         {
           C.setSavepoint();
           String Q = L.get(0).getWriteQuery(C);
           PS = C.prepareStatement(Q);
           int insertCount = 0;

           int index = -1;
           for (tilda.data_test.Testing_Data d : L)
             {
               ++index;
               if (d == null || d.hasChanged() == false)
                 continue;

               lastObj = ((TILDA__TESTING) d);

               if (((TILDA__TESTING) d).__Init != InitMode.CREATE)
                 {
                   LOG.debug(QueryDetails._LOGGING_HEADER + "The 'tilda.data_test.Testing_Data' object at positon #" + index + " was not in an insertable state. Only inserts are allowed in batch writes (i.e., no updates).");
                   QueryDetails.setLastQuery(TILDA__TESTING_Factory.SCHEMA_TABLENAME_LABEL, "");
                   return index;
                 }


               if (((TILDA__TESTING) d).beforeWrite(C) == false)
                 {
                   LOG.debug(QueryDetails._LOGGING_HEADER + "The 'tilda.data_test.Testing_Data' object at positon #" + index + " failed in its beforeWrite() method.");
                   QueryDetails.setLastQuery(TILDA__TESTING_Factory.SCHEMA_TABLENAME_LABEL, "");
                   return index;
                 }

               if (firstChangeList.equals(((TILDA__TESTING) d).__Changes) == false)
                 {
                   LOG.debug(QueryDetails._LOGGING_HEADER + "The 'tilda.data_test.Testing_Data' object at positon #" + index + " failed matching the list of columns being changed compared to the first object passed.");
                   QueryDetails.setLastQuery(TILDA__TESTING_Factory.SCHEMA_TABLENAME_LABEL, "");
                   return index;
                 }

               if (firstTimeStampSignature.equals(((TILDA__TESTING) d).getTimeStampSignature()) == false)
                 {
                   LOG.debug(QueryDetails._LOGGING_HEADER + "The 'tilda.data_test.Testing_Data' object at positon #" + index + " failed matching the list of updated current vs value based timestamps.");
                   QueryDetails.setLastQuery(TILDA__TESTING_Factory.SCHEMA_TABLENAME_LABEL, "");
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
                       LOG.debug(QueryDetails._LOGGING_HEADER + "A batch of tilda.data_test.Testing_Data objects between positions #" + batchStart + " and #" + index + " failed being written to the database.");
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
                   LOG.debug(QueryDetails._LOGGING_HEADER + "A batch of 'Testing_Data' objects ending at position #" + index + " failed being written to the database.");
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
           TILDA__1_0.handleFinally(PS, T0, TILDA__TESTING_Factory.SCHEMA_TABLENAME_LABEL, lastObj != null && lastObj.__Init == InitMode.CREATE ? StatementType.INSERT : StatementType.UPDATE, count, AllocatedArrays);
           PS = null;
           AllocatedArrays = null;
         }
       }

   static public tilda.data_test.Testing_Data lookupByPrimaryKey(long refnum) throws Exception
     {
       tilda.data_test._Tilda.TILDA__TESTING Obj = new tilda.data_test.Testing_Data();
       Obj.initForLookup(0);

       Obj.setRefnum     (refnum     ); Obj.__Saved_refnum      = Obj._refnum     ;

       return (tilda.data_test.Testing_Data) Obj;
     }


   static public ListResults<tilda.data_test.Testing_Data> lookupWhereAllByName(Connection C, int start, int size) throws Exception
     {
       tilda.data_test._Tilda.TILDA__TESTING Obj = new tilda.data_test.Testing_Data();
       Obj.initForLookup(tilda.utils.SystemValues.EVIL_VALUE);



       RecordProcessorInternal RPI = new RecordProcessorInternal(C, start);
       readMany(C, 1, RPI, Obj, null, start, size);
       return RPI._L;
     }

   static public void lookupWhereAllByName(Connection C, tilda.db.processors.ObjectProcessor<tilda.data_test.Testing_Data> OP, int start, int size) throws Exception
     {
       tilda.data_test._Tilda.TILDA__TESTING Obj = new tilda.data_test.Testing_Data();
       Obj.initForLookup(tilda.utils.SystemValues.EVIL_VALUE);



       RecordProcessorInternal RPI = new RecordProcessorInternal(C, OP);
       readMany(C, 1, RPI, Obj, null, start, size);
     }



   static public ListResults<tilda.data_test.Testing_Data> lookupWhereAllByName2(Connection C, int start, int size) throws Exception
     {
       tilda.data_test._Tilda.TILDA__TESTING Obj = new tilda.data_test.Testing_Data();
       Obj.initForLookup(tilda.utils.SystemValues.EVIL_VALUE);



       RecordProcessorInternal RPI = new RecordProcessorInternal(C, start);
       readMany(C, 2, RPI, Obj, null, start, size);
       return RPI._L;
     }

   static public void lookupWhereAllByName2(Connection C, tilda.db.processors.ObjectProcessor<tilda.data_test.Testing_Data> OP, int start, int size) throws Exception
     {
       tilda.data_test._Tilda.TILDA__TESTING Obj = new tilda.data_test.Testing_Data();
       Obj.initForLookup(tilda.utils.SystemValues.EVIL_VALUE);



       RecordProcessorInternal RPI = new RecordProcessorInternal(C, OP);
       readMany(C, 2, RPI, Obj, null, start, size);
     }



   static public ListResults<tilda.data_test.Testing_Data> lookupWhereAllByName3(Connection C, int start, int size) throws Exception
     {
       tilda.data_test._Tilda.TILDA__TESTING Obj = new tilda.data_test.Testing_Data();
       Obj.initForLookup(tilda.utils.SystemValues.EVIL_VALUE);



       RecordProcessorInternal RPI = new RecordProcessorInternal(C, start);
       readMany(C, 3, RPI, Obj, null, start, size);
       return RPI._L;
     }

   static public void lookupWhereAllByName3(Connection C, tilda.db.processors.ObjectProcessor<tilda.data_test.Testing_Data> OP, int start, int size) throws Exception
     {
       tilda.data_test._Tilda.TILDA__TESTING Obj = new tilda.data_test.Testing_Data();
       Obj.initForLookup(tilda.utils.SystemValues.EVIL_VALUE);



       RecordProcessorInternal RPI = new RecordProcessorInternal(C, OP);
       readMany(C, 3, RPI, Obj, null, start, size);
     }



   static public ListResults<tilda.data_test.Testing_Data> lookupWhereAllByName4(Connection C, int start, int size) throws Exception
     {
       tilda.data_test._Tilda.TILDA__TESTING Obj = new tilda.data_test.Testing_Data();
       Obj.initForLookup(tilda.utils.SystemValues.EVIL_VALUE);



       RecordProcessorInternal RPI = new RecordProcessorInternal(C, start);
       readMany(C, 4, RPI, Obj, null, start, size);
       return RPI._L;
     }

   static public void lookupWhereAllByName4(Connection C, tilda.db.processors.ObjectProcessor<tilda.data_test.Testing_Data> OP, int start, int size) throws Exception
     {
       tilda.data_test._Tilda.TILDA__TESTING Obj = new tilda.data_test.Testing_Data();
       Obj.initForLookup(tilda.utils.SystemValues.EVIL_VALUE);



       RecordProcessorInternal RPI = new RecordProcessorInternal(C, OP);
       readMany(C, 4, RPI, Obj, null, start, size);
     }






   public static SelectQuery newSelectQuery(Connection C) throws Exception { return new SelectQuery(C, SCHEMA_LABEL, TABLENAME_LABEL, true); }
   public static SelectQuery newWhereQuery (Connection C) throws Exception { return new SelectQuery(C, SCHEMA_LABEL, TABLENAME_LABEL, false); }
   public static ListResults<tilda.data_test.Testing_Data> runSelect(Connection C, SelectQuery Q, int start, int size) throws Exception
     {
       RecordProcessorInternal RPI = new RecordProcessorInternal(C, start);
       readMany(C, -7, RPI, null, Q, start, size);
       return RPI._L;
     }
   public static void runSelect(Connection C, SelectQuery Q, tilda.db.processors.ObjectProcessor<tilda.data_test.Testing_Data> OP, int start, int size) throws Exception
     {
       RecordProcessorInternal RPI = new RecordProcessorInternal(C, OP);
       readMany(C, -7, RPI, null, Q, start, size);
     }
   public static UpdateQuery newUpdateQuery(Connection C) throws Exception { return new UpdateQuery(C, SCHEMA_LABEL, TABLENAME_LABEL); }
   public static DeleteQuery newDeleteQuery(Connection C) throws Exception { return new DeleteQuery(C, SCHEMA_LABEL, TABLENAME_LABEL); }


   public static String getCSVHeaderCCC()
    {
      return "\"refnum\",\"name\",\"description\",\"desc2\"";
    }

   public static void toCSVCCC(java.io.Writer out, List<tilda.data_test.Testing_Data> L, boolean includeHeader) throws java.io.IOException
    {
      long T0 = System.nanoTime();
      if (includeHeader == true)
        out.write(getCSVHeaderCCC() + "\n");
      for (tilda.data_test.Testing_Data O : L)
       if (O!=null)
        {
          toCSVCCC(out, O);
          out.write("\n");
        }
      PerfTracker.add(TransactionType.TILDA_TOCSV, System.nanoTime() - T0);
    }

   public static void toCSVCCC(java.io.Writer out, tilda.data_test.Testing_Data obj) throws java.io.IOException
    {
      long T0 = System.nanoTime();
      StringBuilder Str = new StringBuilder();

      TextUtil.escapeDoubleQuoteForCSV(Str, "" + obj.getRefnum());
      Str.append(",");
      TextUtil.escapeDoubleQuoteForCSV(Str, obj.getName());
      Str.append(",");
      TextUtil.escapeDoubleQuoteForCSV(Str, obj.getDescription());
      Str.append(",");
      TextUtil.escapeDoubleQuoteForCSV(Str, obj.getDesc2());
      out.write(Str.toString());
      PerfTracker.add(TransactionType.TILDA_TOCSV, System.nanoTime() - T0);
    }
   public static void toJSONCCC(java.io.Writer out, List<tilda.data_test.Testing_Data> L, String lead, boolean fullList) throws java.io.IOException
    {
      long T0 = System.nanoTime();
      if (fullList == true)
        {
          if (L == null)
           {
             out.write("null\n");
             return;
           }
          if (L.isEmpty() == true)
           {
             out.write("[]\n");
             return;
           }
          out.write("[\n");
        }
      boolean First = true;
      for (tilda.data_test.Testing_Data O : L)
       if (O!=null)
        {
          out.write(lead);
          toJSONCCC(out, O, First == true ? "   " : "  ,", true);
          if (First == true)
           First = false;
        }
      if (fullList == true)
       { 
          out.write(lead);
          out.write("]\n");
       } 
      PerfTracker.add(TransactionType.TILDA_TOJSON, System.nanoTime() - T0);
    }

   public static void toJSONCCC(java.io.Writer out, tilda.data_test.Testing_Data obj, boolean fullObject) throws java.io.IOException
    {
      toJSONCCC(out, obj, "", fullObject, false);
    }

   public static void toJSONCCC(java.io.Writer out, tilda.data_test.Testing_Data obj, String lead, boolean fullObject) throws java.io.IOException
    {
      toJSONCCC(out, obj, "", fullObject, false);
    }

   public static void toJSONCCC(java.io.Writer out, tilda.data_test.Testing_Data obj, String lead, boolean fullObject, boolean noNullArrays) throws java.io.IOException
    {
      long T0 = System.nanoTime();
      tilda.data_test._Tilda.TILDA__TESTING Obj = (tilda.data_test._Tilda.TILDA__TESTING) obj;
      if (fullObject == true)
       {
          out.write(lead);
          out.write("{");
       }

      int i = -1;
        JSONUtil.print(out, "refnum", ++i==0, Obj.getRefnum());

        JSONUtil.print(out, "name", ++i==0, Obj.getName());

      if (Obj.isDescriptionNull() == false && Obj.getDescription() != null)
        JSONUtil.print(out, "description", ++i==0, Obj.getDescription());

      if (Obj.isDesc2Null() == false && Obj.getDesc2() != null)
        JSONUtil.print(out, "desc2", ++i==0, Obj.getDesc2());

      if (fullObject == true)
       out.write(" }\n");
      PerfTracker.add(TransactionType.TILDA_TOJSON, System.nanoTime() - T0);
    }

   public static Map<Character, Float> toNVPDDD(List<tilda.data_test.Testing_Data> L) throws Exception
    {
      Map<Character, Float> M = new HashMap<Character, Float>();
      for (tilda.data_test.Testing_Data D : L)
        {
          if(D.isA2Null() == false)
            if (M.put(D.getA2(), D.getA5()) != null)
             throw new Exception("The key " + D.getA2() + " with value " + D.getA5() + " already exists in the Map. Key values must be unique.");
        }
      return M;
    }

   public static Map<String, String> toNVPEEE(tilda.data_test.Testing_Data D) throws Exception
    {
      Map<String, String> M = new HashMap<String, String>();
      M.put("a4", String.valueOf(D.getA4()));
      M.put("a6", String.valueOf(D.getA6()));
      M.put("name", D.getName());
      M.put("a7", String.valueOf(D.getA7()));
      return M;
    }

   public static void toJSONAAA(java.io.Writer out, List<tilda.data_test.Testing_Data> L, String lead, boolean fullList) throws java.io.IOException
    {
      long T0 = System.nanoTime();
      if (fullList == true)
        {
          if (L == null)
           {
             out.write("null\n");
             return;
           }
          if (L.isEmpty() == true)
           {
             out.write("[]\n");
             return;
           }
          out.write("[\n");
        }
      boolean First = true;
      for (tilda.data_test.Testing_Data O : L)
       if (O!=null)
        {
          out.write(lead);
          toJSONAAA(out, O, First == true ? "   " : "  ,", true);
          if (First == true)
           First = false;
        }
      if (fullList == true)
       { 
          out.write(lead);
          out.write("]\n");
       } 
      PerfTracker.add(TransactionType.TILDA_TOJSON, System.nanoTime() - T0);
    }

   public static void toJSONAAA(java.io.Writer out, tilda.data_test.Testing_Data obj, boolean fullObject) throws java.io.IOException
    {
      toJSONAAA(out, obj, "", fullObject, false);
    }

   public static void toJSONAAA(java.io.Writer out, tilda.data_test.Testing_Data obj, String lead, boolean fullObject) throws java.io.IOException
    {
      toJSONAAA(out, obj, "", fullObject, false);
    }

   public static void toJSONAAA(java.io.Writer out, tilda.data_test.Testing_Data obj, String lead, boolean fullObject, boolean noNullArrays) throws java.io.IOException
    {
      long T0 = System.nanoTime();
      tilda.data_test._Tilda.TILDA__TESTING Obj = (tilda.data_test._Tilda.TILDA__TESTING) obj;
      if (fullObject == true)
       {
          out.write(lead);
          out.write("{");
       }

      int i = -1;
        JSONUtil.print(out, "refnum", ++i==0, Obj.getRefnum());

        JSONUtil.print(out, "refnum2", ++i==0, Obj.getRefnum2AsArray());

        JSONUtil.print(out, "name", ++i==0, Obj.getName());

      if (Obj.isDescriptionNull() == false && Obj.getDescription() != null)
        JSONUtil.print(out, "description", ++i==0, Obj.getDescription());

      if (Obj.isDesc2Null() == false && Obj.getDesc2() != null)
        JSONUtil.print(out, "desc2", ++i==0, Obj.getDesc2());

      if (Obj.isDesc3Null() == false && Obj.getDesc3() != null)
        JSONUtil.print(out, "desc3", ++i==0, Obj.getDesc3());

      if (Obj.isDesc4Null() == false && Obj.getDesc4() != null)
        JSONUtil.print(out, "desc4", ++i==0, Obj.getDesc4());

      if (Obj.isDesc5Null() == false && Obj.getDesc5() != null)
        JSONUtil.print(out, "desc5", ++i==0, Obj.getDesc5());

      if (Obj.isDesc6Null() == false && Obj.getDesc6() != null)
        JSONUtil.print(out, "desc6", ++i==0, Obj.getDesc6());

      if (Obj.isTopsNull() == false && Obj.getTops() != null)
        JSONUtil.print(out, "tops", ++i==0, Obj.getTopsAsArray());
      else if (noNullArrays == true)
        {
          JSONUtil.print(out, "tops", ++i==0);
          out.write("[]");
        }

      if (Obj.isTops2Null() == false && Obj.getTops2() != null)
        JSONUtil.print(out, "tops2", ++i==0, Obj.getTops2AsArray());
      else if (noNullArrays == true)
        {
          JSONUtil.print(out, "tops2", ++i==0);
          out.write("[]");
        }

      if (Obj.isA1Null() == false)
        JSONUtil.print(out, "a1", ++i==0, Obj.getA1());

      if (Obj.isA2Null() == false)
        JSONUtil.print(out, "a2", ++i==0, Obj.getA2());

      if (Obj.isA2bNull() == false && Obj.getA2b() != null)
        JSONUtil.print(out, "a2b", ++i==0, Obj.getA2bAsArray());
      else if (noNullArrays == true)
        {
          JSONUtil.print(out, "a2b", ++i==0);
          out.write("[]");
        }

      if (Obj.isA2cNull() == false && Obj.getA2c() != null)
        JSONUtil.print(out, "a2c", ++i==0, Obj.getA2cAsArray());
      else if (noNullArrays == true)
        {
          JSONUtil.print(out, "a2c", ++i==0);
          out.write("[]");
        }

      if (Obj.isA3Null() == false)
        JSONUtil.print(out, "a3", ++i==0, Obj.getA3());

      if (Obj.isA3bNull() == false && Obj.getA3b() != null)
        JSONUtil.print(out, "a3b", ++i==0, Obj.getA3bAsArray());
      else if (noNullArrays == true)
        {
          JSONUtil.print(out, "a3b", ++i==0);
          out.write("[]");
        }

      if (Obj.isA4Null() == false)
        JSONUtil.print(out, "a4", ++i==0, Obj.getA4());

      if (Obj.isA4bNull() == false && Obj.getA4b() != null)
        JSONUtil.print(out, "a4b", ++i==0, Obj.getA4bAsArray());
      else if (noNullArrays == true)
        {
          JSONUtil.print(out, "a4b", ++i==0);
          out.write("[]");
        }

      if (Obj.isA5Null() == false)
        JSONUtil.print(out, "a5", ++i==0, Obj.getA5());

      if (Obj.isA5bNull() == false && Obj.getA5b() != null)
        JSONUtil.print(out, "a5b", ++i==0, Obj.getA5bAsArray());
      else if (noNullArrays == true)
        {
          JSONUtil.print(out, "a5b", ++i==0);
          out.write("[]");
        }

      if (Obj.isA6Null() == false)
        JSONUtil.print(out, "a6", ++i==0, Obj.getA6());

      if (Obj.isA6bNull() == false && Obj.getA6b() != null)
        JSONUtil.print(out, "a6b", ++i==0, Obj.getA6bAsArray());
      else if (noNullArrays == true)
        {
          JSONUtil.print(out, "a6b", ++i==0);
          out.write("[]");
        }

      if (Obj.isA6cNull() == false && Obj.getA6c() != null)
        JSONUtil.print(out, "a6c", ++i==0, Obj.getA6cAsArray());
      else if (noNullArrays == true)
        {
          JSONUtil.print(out, "a6c", ++i==0);
          out.write("[]");
        }

      if (Obj.isA7Null() == false)
        JSONUtil.print(out, "a7", ++i==0, Obj.getA7());

      if (Obj.isA7bNull() == false && Obj.getA7b() != null)
        JSONUtil.print(out, "a7b", ++i==0, Obj.getA7bAsArray());
      else if (noNullArrays == true)
        {
          JSONUtil.print(out, "a7b", ++i==0);
          out.write("[]");
        }

      if (Obj.isA9Null() == false && Obj.getA9() != null)
        JSONUtil.print(out, "a9", ++i==0, Obj.getA9());

        JSONUtil.print(out, "created", ++i==0, Obj.getCreated());

        JSONUtil.print(out, "lastUpdated", ++i==0, Obj.getLastUpdated());

      if (fullObject == true)
       out.write(" }\n");
      PerfTracker.add(TransactionType.TILDA_TOJSON, System.nanoTime() - T0);
    }

   public static String getCSVHeaderBBB()
    {
      return "\"refnum\",\"refnum2\",\"name\",\"description\",\"desc2\",\"desc3\"";
    }

   public static void toCSVBBB(java.io.Writer out, List<tilda.data_test.Testing_Data> L, boolean includeHeader) throws java.io.IOException
    {
      long T0 = System.nanoTime();
      if (includeHeader == true)
        out.write(getCSVHeaderBBB() + "\n");
      for (tilda.data_test.Testing_Data O : L)
       if (O!=null)
        {
          toCSVBBB(out, O);
          out.write("\n");
        }
      PerfTracker.add(TransactionType.TILDA_TOCSV, System.nanoTime() - T0);
    }

   public static void toCSVBBB(java.io.Writer out, tilda.data_test.Testing_Data obj) throws java.io.IOException
    {
      long T0 = System.nanoTime();
      StringBuilder Str = new StringBuilder();

      TextUtil.escapeDoubleQuoteForCSV(Str, "" + obj.getRefnum());
      Str.append(",");
      TextUtil.escapeDoubleQuoteForCSV(Str, "" + obj.getRefnum2());
      Str.append(",");
      TextUtil.escapeDoubleQuoteForCSV(Str, obj.getName());
      Str.append(",");
      TextUtil.escapeDoubleQuoteForCSV(Str, obj.getDescription());
      Str.append(",");
      TextUtil.escapeDoubleQuoteForCSV(Str, obj.getDesc2());
      Str.append(",");
      TextUtil.escapeDoubleQuoteForCSV(Str, obj.getDesc3());
      out.write(Str.toString());
      PerfTracker.add(TransactionType.TILDA_TOCSV, System.nanoTime() - T0);
    }

 }
