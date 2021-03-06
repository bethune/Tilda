/*
 Tilda V1.0 data object.

 Code is generated: do not modify! Instead, create a derived class and override desired functionality
*/

package tilda.tutorial.data._Tilda;

import java.time.*;
import java.sql.Timestamp;
import java.util.*;

import tilda.db.*;
import tilda.enums.*;
import tilda.performance.*;
import tilda.utils.*;

import org.apache.logging.log4j.*;

import com.google.gson.*;
import com.google.gson.annotations.*;
import java.math.*;


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/**
<TABLE id="Test_XYZ_Realized_DIV" class="tables">
<SCRIPT>registerStickyHeader("Test_XYZ_Realized_DIV");</SCRIPT>
<TR valign="top"><TD><H2>Test_XYZ_Realized&nbsp;&nbsp;&nbsp;&nbsp;<SUP style="font-size: 70%;"><SPAN class="BackToDetails"><A href="#Test_XYZ_Realized_CNT">details</A>&nbsp;&nbsp;&nbsp;&nbsp;</SPAN><A href="#">top</A></SUP></H2></TD><TD align="right"></TD></TR>
</TABLE>
<DIV id="Test_XYZ_Realized_CNT" class="content">
The Table TILDATUTORIAL.Test_XYZ_Realized:<UL>
<LI>Is mapped to the generated Java 8/PostgreSQL Tilda classes <B>Test_XYZ_Realized_Factory</B>, <B>Test_XYZ_Realized_Data</B> in the package <B>tilda.tutorial.data</B>.
<LI>Is Realized from <B><A href="TILDA___Docs.TILDATUTORIAL.html#Test_XYZ_PivotView_CNT">TILDATUTORIAL<B>&nbsp;&#8226;&nbsp;</B>Test_XYZ_PivotView</A></B> through DB function <B>TILDATUTORIAL<B>&nbsp;&#8226;&nbsp;</B>Refill_Test_XYZ_Realized()</B>.</LI>
<LI>Is configured for normal <B>read/write</B> access.</LI>
<LI>Is not OCC-Enabled. No record lifecycle columns (created/updated/deleted) have been generated.</LI>
<LI>Defines foreign key(s) to <A href="TILDA___Docs.TILDATUTORIAL.html#Form_CNT">TILDATUTORIAL<B>&nbsp;&#8226;&nbsp;</B>Form</A>, <A href="TILDA___Docs.TILDATUTORIAL.html#User_CNT">TILDATUTORIAL<B>&nbsp;&#8226;&nbsp;</B>User</A> </LI>
<LI>Has the following identity:<UL><LI>Primary Key: formRefnum</LI>
</UL></LI>
</UL>
<B>Description</B>: Realized table for view TILDATUTORIAL.Test_XYZ_PivotView: A pivoted view of XYZ forms<BR>
<BR>
This Table contains the following columns:<BLOCKQUOTE>
 <TABLE id="Test_XYZ_Realized_TBL" border="0px" cellpadding="3px" cellspacing="0px" style="border:1px solid grey;">
   <TR valign="bottom"><TH>&nbsp;</TH><TH align="right">Name&nbsp;&nbsp;</TH><TH align="left">Type</TH><TH align="left">Nullable</TH><TH align="left">Mode</TH><TH align="left">Invariant</TH><TH align="left">Protect</TH><TH align="left">Description</TH></TR>
  <TR valign="top" style="background-color:rgba(160, 199, 234, 0.2);">
    <TD>1&nbsp;&nbsp;</TD>
<TD align="right"><B id='Test_XYZ_Realized-formRefnum_DIV' class='columns'>formRefnum</B>&nbsp;&nbsp;</TD>
<TD>long&nbsp;/&nbsp;bigint&nbsp;&nbsp;</TD>
<TD align="center">&#x2610&nbsp;&nbsp;</TD>
<TD align="left">-&nbsp;&nbsp;</TD>
<TD align="center">&#x2611;&nbsp;&nbsp;</TD>
<TD align="center">-&nbsp;&nbsp;</TD>
<TD>The primary key for this record (from TILDATUTORIAL.Test_XYZ_PivotView.formRefnum)</TD>
</TR>
  <TR valign="top" style="background-color:#FFFFFF;">
    <TD>2&nbsp;&nbsp;</TD>
<TD align="right"><B id='Test_XYZ_Realized-formType_DIV' class='columns'>formType</B>&nbsp;&nbsp;</TD>
<TD>String&nbsp;/&nbsp;varchar(40)&nbsp;&nbsp;</TD>
<TD align="center">&#x2611;&nbsp;&nbsp;</TD>
<TD align="left">-&nbsp;&nbsp;</TD>
<TD align="center">&#x2610&nbsp;&nbsp;</TD>
<TD align="center">-&nbsp;&nbsp;</TD>
<TD>Form template type (from TILDATUTORIAL.Test_XYZ_PivotView.formType)</TD>
</TR>
  <TR valign="top" style="background-color:rgba(160, 199, 234, 0.2);">
    <TD>3&nbsp;&nbsp;</TD>
<TD align="right"><B id='Test_XYZ_Realized-formFillDateTZ_DIV' class='columns'>formFillDateTZ</B>&nbsp;&nbsp;</TD>
<TD>String&nbsp;/&nbsp;varchar(10)&nbsp;&nbsp;</TD>
<TD align="center">&#x2611;&nbsp;&nbsp;</TD>
<TD align="left">-&nbsp;&nbsp;</TD>
<TD align="center">&#x2610&nbsp;&nbsp;</TD>
<TD align="center">-&nbsp;&nbsp;</TD>
<TD>Generated helper column to hold the time zone ID for 'formFillDate'. (from TILDATUTORIAL.Test_XYZ_PivotView.formFillDateTZ)</TD>
</TR>
  <TR valign="top" style="background-color:#FFFFFF;">
    <TD>4&nbsp;&nbsp;</TD>
<TD align="right"><B id='Test_XYZ_Realized-formFillDate_DIV' class='columns'>formFillDate</B>&nbsp;&nbsp;</TD>
<TD>ZonedDateTime&nbsp;/&nbsp;timestamptz&nbsp;&nbsp;</TD>
<TD align="center">&#x2611;&nbsp;&nbsp;</TD>
<TD align="left">-&nbsp;&nbsp;</TD>
<TD align="center">&#x2610&nbsp;&nbsp;</TD>
<TD align="center">-&nbsp;&nbsp;</TD>
<TD>The date the form was filled (from TILDATUTORIAL.Test_XYZ_PivotView.formFillDate)</TD>
</TR>
  <TR valign="top" style="background-color:rgba(160, 199, 234, 0.2);">
    <TD>5&nbsp;&nbsp;</TD>
<TD align="right"><B id='Test_XYZ_Realized-formUserRefnum_DIV' class='columns'>formUserRefnum</B>&nbsp;&nbsp;</TD>
<TD>long&nbsp;/&nbsp;bigint&nbsp;&nbsp;</TD>
<TD align="center">&#x2611;&nbsp;&nbsp;</TD>
<TD align="left">-&nbsp;&nbsp;</TD>
<TD align="center">&#x2610&nbsp;&nbsp;</TD>
<TD align="center">-&nbsp;&nbsp;</TD>
<TD>The primary key for this record (from TILDATUTORIAL.Test_XYZ_PivotView.formUserRefnum)</TD>
</TR>
  <TR valign="top" style="background-color:#FFFFFF;">
    <TD>6&nbsp;&nbsp;</TD>
<TD align="right"><B id='Test_XYZ_Realized-formUserEmail_DIV' class='columns'>formUserEmail</B>&nbsp;&nbsp;</TD>
<TD>String&nbsp;/&nbsp;varchar(255)&nbsp;&nbsp;</TD>
<TD align="center">&#x2611;&nbsp;&nbsp;</TD>
<TD align="left">-&nbsp;&nbsp;</TD>
<TD align="center">&#x2610&nbsp;&nbsp;</TD>
<TD align="center">-&nbsp;&nbsp;</TD>
<TD>The user's email (from TILDATUTORIAL.Test_XYZ_PivotView.formUserEmail)</TD>
</TR>
  <TR valign="top" style="background-color:rgba(160, 199, 234, 0.2);">
    <TD>7&nbsp;&nbsp;</TD>
<TD align="right"><B id='Test_XYZ_Realized-countCorrect_DIV' class='columns'>countCorrect</B>&nbsp;&nbsp;</TD>
<TD>long&nbsp;/&nbsp;bigint&nbsp;&nbsp;</TD>
<TD align="center">&#x2611;&nbsp;&nbsp;</TD>
<TD align="left">-&nbsp;&nbsp;</TD>
<TD align="center">&#x2610&nbsp;&nbsp;</TD>
<TD align="center">-&nbsp;&nbsp;</TD>
<TD>Whether the answer is correct or not (from TILDATUTORIAL.Test_XYZ_PivotView.countCorrect)</TD>
</TR>
  <TR valign="top" style="background-color:#FFFFFF;">
    <TD>8&nbsp;&nbsp;</TD>
<TD align="right"><B id='Test_XYZ_Realized-countIncorrect_DIV' class='columns'>countIncorrect</B>&nbsp;&nbsp;</TD>
<TD>long&nbsp;/&nbsp;bigint&nbsp;&nbsp;</TD>
<TD align="center">&#x2611;&nbsp;&nbsp;</TD>
<TD align="left">-&nbsp;&nbsp;</TD>
<TD align="center">&#x2610&nbsp;&nbsp;</TD>
<TD align="center">-&nbsp;&nbsp;</TD>
<TD>Whether the answer is correct or not (from TILDATUTORIAL.Test_XYZ_PivotView.countIncorrect)</TD>
</TR>
  <TR valign="top" style="background-color:rgba(160, 199, 234, 0.2);">
    <TD>9&nbsp;&nbsp;</TD>
<TD align="right"><B id='Test_XYZ_Realized-timeMillisTotal_DIV' class='columns'>timeMillisTotal</B>&nbsp;&nbsp;</TD>
<TD>long&nbsp;/&nbsp;bigint&nbsp;&nbsp;</TD>
<TD align="center">&#x2611;&nbsp;&nbsp;</TD>
<TD align="left">-&nbsp;&nbsp;</TD>
<TD align="center">&#x2610&nbsp;&nbsp;</TD>
<TD align="center">-&nbsp;&nbsp;</TD>
<TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisTotal)</TD>
</TR>
  <TR valign="top" style="background-color:#FFFFFF;">
    <TD>10&nbsp;&nbsp;</TD>
<TD align="right"><B id='Test_XYZ_Realized-timeMillisAvg_DIV' class='columns'>timeMillisAvg</B>&nbsp;&nbsp;</TD>
<TD>double&nbsp;/&nbsp;double precision&nbsp;&nbsp;</TD>
<TD align="center">&#x2611;&nbsp;&nbsp;</TD>
<TD align="left">-&nbsp;&nbsp;</TD>
<TD align="center">&#x2610&nbsp;&nbsp;</TD>
<TD align="center">-&nbsp;&nbsp;</TD>
<TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisAvg)</TD>
</TR>
  <TR valign="top" style="background-color:rgba(160, 199, 234, 0.2);">
    <TD>11&nbsp;&nbsp;</TD>
<TD align="right"><B id='Test_XYZ_Realized-timeMillisMin_DIV' class='columns'>timeMillisMin</B>&nbsp;&nbsp;</TD>
<TD>int&nbsp;/&nbsp;integer&nbsp;&nbsp;</TD>
<TD align="center">&#x2611;&nbsp;&nbsp;</TD>
<TD align="left">-&nbsp;&nbsp;</TD>
<TD align="center">&#x2610&nbsp;&nbsp;</TD>
<TD align="center">-&nbsp;&nbsp;</TD>
<TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisMin)</TD>
</TR>
  <TR valign="top" style="background-color:#FFFFFF;">
    <TD>12&nbsp;&nbsp;</TD>
<TD align="right"><B id='Test_XYZ_Realized-QX_correct_DIV' class='columns'>QX_correct</B>&nbsp;&nbsp;</TD>
<TD>boolean&nbsp;/&nbsp;boolean&nbsp;&nbsp;</TD>
<TD align="center">&#x2611;&nbsp;&nbsp;</TD>
<TD align="left">-&nbsp;&nbsp;</TD>
<TD align="center">&#x2610&nbsp;&nbsp;</TD>
<TD align="center">-&nbsp;&nbsp;</TD>
<TD>Question X (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QX') (from TILDATUTORIAL.Test_XYZ_PivotView.QX_correct)</TD>
</TR>
  <TR valign="top" style="background-color:rgba(160, 199, 234, 0.2);">
    <TD>13&nbsp;&nbsp;</TD>
<TD align="right"><B id='Test_XYZ_Realized-QX_timeMillis_DIV' class='columns'>QX_timeMillis</B>&nbsp;&nbsp;</TD>
<TD>int&nbsp;/&nbsp;integer&nbsp;&nbsp;</TD>
<TD align="center">&#x2611;&nbsp;&nbsp;</TD>
<TD align="left">-&nbsp;&nbsp;</TD>
<TD align="center">&#x2610&nbsp;&nbsp;</TD>
<TD align="center">-&nbsp;&nbsp;</TD>
<TD>Question X (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QX') (from TILDATUTORIAL.Test_XYZ_PivotView.QX_timeMillis)</TD>
</TR>
  <TR valign="top" style="background-color:#FFFFFF;">
    <TD>14&nbsp;&nbsp;</TD>
<TD align="right"><B id='Test_XYZ_Realized-QY_correct_DIV' class='columns'>QY_correct</B>&nbsp;&nbsp;</TD>
<TD>boolean&nbsp;/&nbsp;boolean&nbsp;&nbsp;</TD>
<TD align="center">&#x2611;&nbsp;&nbsp;</TD>
<TD align="left">-&nbsp;&nbsp;</TD>
<TD align="center">&#x2610&nbsp;&nbsp;</TD>
<TD align="center">-&nbsp;&nbsp;</TD>
<TD>Question Y (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QY') (from TILDATUTORIAL.Test_XYZ_PivotView.QY_correct)</TD>
</TR>
  <TR valign="top" style="background-color:rgba(160, 199, 234, 0.2);">
    <TD>15&nbsp;&nbsp;</TD>
<TD align="right"><B id='Test_XYZ_Realized-QY_timeMillis_DIV' class='columns'>QY_timeMillis</B>&nbsp;&nbsp;</TD>
<TD>int&nbsp;/&nbsp;integer&nbsp;&nbsp;</TD>
<TD align="center">&#x2611;&nbsp;&nbsp;</TD>
<TD align="left">-&nbsp;&nbsp;</TD>
<TD align="center">&#x2610&nbsp;&nbsp;</TD>
<TD align="center">-&nbsp;&nbsp;</TD>
<TD>Question Y (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QY') (from TILDATUTORIAL.Test_XYZ_PivotView.QY_timeMillis)</TD>
</TR>
  <TR valign="top" style="background-color:#FFFFFF;">
    <TD>16&nbsp;&nbsp;</TD>
<TD align="right"><B id='Test_XYZ_Realized-QZ_correct_DIV' class='columns'>QZ_correct</B>&nbsp;&nbsp;</TD>
<TD>boolean&nbsp;/&nbsp;boolean&nbsp;&nbsp;</TD>
<TD align="center">&#x2611;&nbsp;&nbsp;</TD>
<TD align="left">-&nbsp;&nbsp;</TD>
<TD align="center">&#x2610&nbsp;&nbsp;</TD>
<TD align="center">-&nbsp;&nbsp;</TD>
<TD>Question Z (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QZ') (from TILDATUTORIAL.Test_XYZ_PivotView.QZ_correct)</TD>
</TR>
  <TR valign="top" style="background-color:rgba(160, 199, 234, 0.2);">
    <TD>17&nbsp;&nbsp;</TD>
<TD align="right"><B id='Test_XYZ_Realized-QZ_timeMillis_DIV' class='columns'>QZ_timeMillis</B>&nbsp;&nbsp;</TD>
<TD>int&nbsp;/&nbsp;integer&nbsp;&nbsp;</TD>
<TD align="center">&#x2611;&nbsp;&nbsp;</TD>
<TD align="left">-&nbsp;&nbsp;</TD>
<TD align="center">&#x2610&nbsp;&nbsp;</TD>
<TD align="center">-&nbsp;&nbsp;</TD>
<TD>Question Z (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QZ') (from TILDATUTORIAL.Test_XYZ_PivotView.QZ_timeMillis)</TD>
</TR>
</TABLE></BLOCKQUOTE>
</DIV>

*/
@SuppressWarnings({ "unused" })
public abstract class TILDA__TEST_XYZ_REALIZED implements tilda.interfaces.WriterObject
 {
   protected transient static final Logger LOG = LogManager.getLogger(TILDA__TEST_XYZ_REALIZED.class.getName());

   public transient static final Class<TILDA__TEST_XYZ_REALIZED_Factory> FACTORY_CLASS= TILDA__TEST_XYZ_REALIZED_Factory.class;
   public transient static final String TABLENAME = TextUtil.print("TILDATUTORIAL.Test_XYZ_Realized", "");

   protected TILDA__TEST_XYZ_REALIZED() { }

   transient InitMode __Init        = null;
   transient BitSet   __Nulls       = new BitSet(64);
   transient BitSet   __Changes     = new BitSet(64);
   transient boolean  __NewlyCreated= false;

   transient int      __LookupId;

   public  boolean hasChanged    () { return __Changes.isEmpty() == false; }
   public  boolean isNewlyCreated() { return __NewlyCreated; }

   void initForCreate()
     {
       __Init         = InitMode.CREATE;
       __NewlyCreated = true ;
       __LookupId     = SystemValues.EVIL_VALUE;
     }
   void initForLookup(int LookupId)
     {
       __Init     = InitMode.LOOKUP;
       __LookupId = LookupId       ;
     }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formRefnum -> TILDATUTORIAL.Test_XYZ_Realized."formRefnum"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formRefnum of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formRefnum of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The primary key for this record (from TILDATUTORIAL.Test_XYZ_PivotView.formRefnum)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>true</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   @SerializedName("formRefnum")
   Long _formRefnum=null;
   protected Long __Saved_formRefnum;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formRefnum -> TILDATUTORIAL.Test_XYZ_Realized."formRefnum"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the getter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formRefnum of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formRefnum of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The primary key for this record (from TILDATUTORIAL.Test_XYZ_PivotView.formRefnum)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>true</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final long getFormRefnum()
      { return _formRefnum==null?0l:_formRefnum; }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formRefnum -> TILDATUTORIAL.Test_XYZ_Realized."formRefnum"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formRefnum of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formRefnum of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>false</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The primary key for this record (from TILDATUTORIAL.Test_XYZ_PivotView.formRefnum)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>true</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   protected void setFormRefnum(long v) throws Exception
     {
       long T0 = System.nanoTime();
       if (__Init == InitMode.CREATE || _formRefnum == null || v != _formRefnum)
        {
          if (__Init != InitMode.CREATE && __Init != InitMode.LOOKUP && __Init != null)
           throw new Exception("Cannot set field 'tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formRefnum' that is invariant, or part of a read-only or pre-existing WORM object.");
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMREFNUM._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMREFNUM._Mask);
       _formRefnum = v;
        }
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

   /**
    * Being invariant, the field formRefnum doesn't have a public setter. To support deserialization however, 
    * we may need to set that field after a create/deserialization and before any write. The init methods allows
    * to do so.
   */
   public void initFormRefnum(long v) throws Exception
     {
       setFormRefnum(v);
     }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formType -> TILDATUTORIAL.Test_XYZ_Realized."formType"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formType of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formType of type varchar(40)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>40</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Form template type (from TILDATUTORIAL.Test_XYZ_PivotView.formType)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   @SerializedName("formType")
   String _formType=null;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formType -> TILDATUTORIAL.Test_XYZ_Realized."formType"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the getter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formType of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formType of type varchar(40)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>40</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Form template type (from TILDATUTORIAL.Test_XYZ_PivotView.formType)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final String getFormType()
      { return _formType; }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formType -> TILDATUTORIAL.Test_XYZ_Realized."formType"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the isNull for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formType of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formType of type varchar(40)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>40</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Form template type (from TILDATUTORIAL.Test_XYZ_PivotView.formType)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final boolean isFormTypeNull()
     { return __Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMTYPE._Mask); }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formType -> TILDATUTORIAL.Test_XYZ_Realized."formType"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formType of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formType of type varchar(40)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>40</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Form template type (from TILDATUTORIAL.Test_XYZ_PivotView.formType)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setFormType(String v) throws Exception
     {
       long T0 = System.nanoTime();
       if (v == null)
        {
          setFormTypeNull();
        }
       else if (v.length() > 40)
        throw new Exception("Cannot set tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formType: the size "+v.length()+" is larger than the max allowed of 40: "+TextUtil.escapeDoubleQuoteWithSlash(TextUtil.toMaxLength(v, 250)));
       else if (v.equals(_formType) == false)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMTYPE._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMTYPE._Mask);
       _formType = v;
        }
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formType -> TILDATUTORIAL.Test_XYZ_Realized."formType"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the null setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formType of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formType of type varchar(40)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>40</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Form template type (from TILDATUTORIAL.Test_XYZ_PivotView.formType)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setFormTypeNull()
     {
       long T0 = System.nanoTime();
       if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMTYPE._Mask) == true) // already NULL
        return;
       __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMTYPE._Mask);
       __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMTYPE._Mask);
       _formType=null;
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formType -> TILDATUTORIAL.Test_XYZ_Realized."formType"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the hasChanged for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formType of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formType of type varchar(40)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>40</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Form template type (from TILDATUTORIAL.Test_XYZ_PivotView.formType)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public boolean hasChangedFormType()
     { return __Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMTYPE._Mask); }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDateTZ -> TILDATUTORIAL.Test_XYZ_Realized."formFillDateTZ"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDateTZ of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formFillDateTZ of type varchar(10)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>10</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Generated helper column to hold the time zone ID for 'formFillDate'. (from TILDATUTORIAL.Test_XYZ_PivotView.formFillDateTZ)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   String _formFillDateTZ=null;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDateTZ -> TILDATUTORIAL.Test_XYZ_Realized."formFillDateTZ"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the getter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDateTZ of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formFillDateTZ of type varchar(10)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>10</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Generated helper column to hold the time zone ID for 'formFillDate'. (from TILDATUTORIAL.Test_XYZ_PivotView.formFillDateTZ)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final String getFormFillDateTZ()
      { return _formFillDateTZ; }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDateTZ -> TILDATUTORIAL.Test_XYZ_Realized."formFillDateTZ"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the isNull for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDateTZ of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formFillDateTZ of type varchar(10)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>10</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Generated helper column to hold the time zone ID for 'formFillDate'. (from TILDATUTORIAL.Test_XYZ_PivotView.formFillDateTZ)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final boolean isFormFillDateTZNull()
     { return __Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATETZ._Mask); }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDateTZ -> TILDATUTORIAL.Test_XYZ_Realized."formFillDateTZ"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDateTZ of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formFillDateTZ of type varchar(10)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>10</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Generated helper column to hold the time zone ID for 'formFillDate'. (from TILDATUTORIAL.Test_XYZ_PivotView.formFillDateTZ)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
    void setFormFillDateTZ(String v) throws Exception
     {
       long T0 = System.nanoTime();
       if (v == null)
        {
          setFormFillDateTZNull();
        }
       else if (v.length() > 10)
        throw new Exception("Cannot set tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDateTZ: the size "+v.length()+" is larger than the max allowed of 10: "+TextUtil.escapeDoubleQuoteWithSlash(TextUtil.toMaxLength(v, 250)));
       else if (v.equals(_formFillDateTZ) == false)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATETZ._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATETZ._Mask);
       _formFillDateTZ = v;
        }
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDateTZ -> TILDATUTORIAL.Test_XYZ_Realized."formFillDateTZ"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the null setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDateTZ of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formFillDateTZ of type varchar(10)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>10</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Generated helper column to hold the time zone ID for 'formFillDate'. (from TILDATUTORIAL.Test_XYZ_PivotView.formFillDateTZ)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
    void setFormFillDateTZNull()
     {
       long T0 = System.nanoTime();
       if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATETZ._Mask) == true) // already NULL
        return;
       __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATETZ._Mask);
       __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATETZ._Mask);
       _formFillDateTZ=null;
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDateTZ -> TILDATUTORIAL.Test_XYZ_Realized."formFillDateTZ"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the hasChanged for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDateTZ of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formFillDateTZ of type varchar(10)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>10</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Generated helper column to hold the time zone ID for 'formFillDate'. (from TILDATUTORIAL.Test_XYZ_PivotView.formFillDateTZ)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public boolean hasChangedFormFillDateTZ()
     { return __Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATETZ._Mask); }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate -> TILDATUTORIAL.Test_XYZ_Realized."formFillDate"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formFillDate of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The date the form was filled (from TILDATUTORIAL.Test_XYZ_PivotView.formFillDate)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   @SerializedName("formFillDate")
   String  Str_formFillDate;
   public void initFormFillDate(String v) { Str_formFillDate = v; }
   public String initFormFillDateVal() { return Str_formFillDate; }
   transient ZonedDateTime _formFillDate = null;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate -> TILDATUTORIAL.Test_XYZ_Realized."formFillDate"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the getter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formFillDate of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The date the form was filled (from TILDATUTORIAL.Test_XYZ_PivotView.formFillDate)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final ZonedDateTime getFormFillDate()
      { return _formFillDate; }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate -> TILDATUTORIAL.Test_XYZ_Realized."formFillDate"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the isNull for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formFillDate of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The date the form was filled (from TILDATUTORIAL.Test_XYZ_PivotView.formFillDate)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final boolean isFormFillDateNull()
     { return __Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE._Mask); }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate -> TILDATUTORIAL.Test_XYZ_Realized."formFillDate"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formFillDate of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The date the form was filled (from TILDATUTORIAL.Test_XYZ_PivotView.formFillDate)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setFormFillDate(ZonedDateTime v) throws Exception
     {
       long T0 = System.nanoTime();
       if (v == null)
        {
          setFormFillDateNull();
        }
       else if (v.equals(_formFillDate) == false)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE._Mask);
       _formFillDate = v;
          tilda.data.ZoneInfo_Data ZI = tilda.data.ZoneInfo_Factory.getEnumerationByValue(v.getZone().getId());
          if (ZI == null)
           throw new Exception("Cannot set field 'tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate' because the timezone value '"+v.getZone().getId()+"' is unknown. Make sure it is mapped properly in the ZoneInfo table.");
          setFormFillDateTZ(ZI.getId());
        }
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate -> TILDATUTORIAL.Test_XYZ_Realized."formFillDate"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the null setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formFillDate of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The date the form was filled (from TILDATUTORIAL.Test_XYZ_PivotView.formFillDate)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setFormFillDateNull()
     {
       long T0 = System.nanoTime();
       if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE._Mask) == true) // already NULL
        return;
       __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE._Mask);
       __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE._Mask);
       _formFillDate=null;
       setFormFillDateTZNull();
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate -> TILDATUTORIAL.Test_XYZ_Realized."formFillDate"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the NOW setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formFillDate of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The date the form was filled (from TILDATUTORIAL.Test_XYZ_PivotView.formFillDate)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final void setFormFillDateNow() throws Exception
    {
      setFormFillDate(DateTimeUtil.NOW_PLACEHOLDER_ZDT);
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate -> TILDATUTORIAL.Test_XYZ_Realized."formFillDate"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the UNDEFINED setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formFillDate of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The date the form was filled (from TILDATUTORIAL.Test_XYZ_PivotView.formFillDate)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final void setFormFillDateUndefined() throws Exception
    {
      setFormFillDate(DateTimeUtil.UNDEFINED_PLACEHOLDER_ZDT);
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate -> TILDATUTORIAL.Test_XYZ_Realized."formFillDate"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the explicit setter %%CALENDAR_SETTER%% for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formFillDate of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The date the form was filled (from TILDATUTORIAL.Test_XYZ_PivotView.formFillDate)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final void setFormFillDate(int year, int month, int date, int hourOfDay, int minute, int second, int millis, ZoneId z) throws Exception
    {
      setFormFillDate(DateTimeUtil.newTZ(year, month, date, hourOfDay, minute, second, millis, z));
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate -> TILDATUTORIAL.Test_XYZ_Realized."formFillDate"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the hasChanged for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate of type ZonedDateTime</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formFillDate of type timestamptz</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The date the form was filled (from TILDATUTORIAL.Test_XYZ_PivotView.formFillDate)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public boolean hasChangedFormFillDate()
     { return __Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE._Mask); }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserRefnum -> TILDATUTORIAL.Test_XYZ_Realized."formUserRefnum"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserRefnum of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formUserRefnum of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The primary key for this record (from TILDATUTORIAL.Test_XYZ_PivotView.formUserRefnum)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   @SerializedName("formUserRefnum")
   Long _formUserRefnum=null;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserRefnum -> TILDATUTORIAL.Test_XYZ_Realized."formUserRefnum"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the getter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserRefnum of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formUserRefnum of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The primary key for this record (from TILDATUTORIAL.Test_XYZ_PivotView.formUserRefnum)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final long getFormUserRefnum()
      { return _formUserRefnum==null?0l:_formUserRefnum; }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserRefnum -> TILDATUTORIAL.Test_XYZ_Realized."formUserRefnum"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the isNull for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserRefnum of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formUserRefnum of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The primary key for this record (from TILDATUTORIAL.Test_XYZ_PivotView.formUserRefnum)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final boolean isFormUserRefnumNull()
     { return __Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSERREFNUM._Mask); }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserRefnum -> TILDATUTORIAL.Test_XYZ_Realized."formUserRefnum"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserRefnum of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formUserRefnum of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The primary key for this record (from TILDATUTORIAL.Test_XYZ_PivotView.formUserRefnum)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setFormUserRefnum(long v) throws Exception
     {
       long T0 = System.nanoTime();
       if (__Init == InitMode.CREATE || _formUserRefnum == null || v != _formUserRefnum)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSERREFNUM._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSERREFNUM._Mask);
       _formUserRefnum = v;
        }
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserRefnum -> TILDATUTORIAL.Test_XYZ_Realized."formUserRefnum"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the null setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserRefnum of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formUserRefnum of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The primary key for this record (from TILDATUTORIAL.Test_XYZ_PivotView.formUserRefnum)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setFormUserRefnumNull()
     {
       long T0 = System.nanoTime();
       if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSERREFNUM._Mask) == true) // already NULL
        return;
       __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSERREFNUM._Mask);
       __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSERREFNUM._Mask);
       _formUserRefnum=null;
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserRefnum -> TILDATUTORIAL.Test_XYZ_Realized."formUserRefnum"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the hasChanged for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserRefnum of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formUserRefnum of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The primary key for this record (from TILDATUTORIAL.Test_XYZ_PivotView.formUserRefnum)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public boolean hasChangedFormUserRefnum()
     { return __Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSERREFNUM._Mask); }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserEmail -> TILDATUTORIAL.Test_XYZ_Realized."formUserEmail"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserEmail of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formUserEmail of type varchar(255)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>255</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The user's email (from TILDATUTORIAL.Test_XYZ_PivotView.formUserEmail)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   @SerializedName("formUserEmail")
   String _formUserEmail=null;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserEmail -> TILDATUTORIAL.Test_XYZ_Realized."formUserEmail"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the getter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserEmail of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formUserEmail of type varchar(255)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>255</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The user's email (from TILDATUTORIAL.Test_XYZ_PivotView.formUserEmail)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final String getFormUserEmail()
      { return _formUserEmail; }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserEmail -> TILDATUTORIAL.Test_XYZ_Realized."formUserEmail"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the isNull for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserEmail of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formUserEmail of type varchar(255)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>255</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The user's email (from TILDATUTORIAL.Test_XYZ_PivotView.formUserEmail)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final boolean isFormUserEmailNull()
     { return __Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSEREMAIL._Mask); }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserEmail -> TILDATUTORIAL.Test_XYZ_Realized."formUserEmail"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserEmail of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formUserEmail of type varchar(255)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>255</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The user's email (from TILDATUTORIAL.Test_XYZ_PivotView.formUserEmail)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setFormUserEmail(String v) throws Exception
     {
       long T0 = System.nanoTime();
       if (v == null)
        {
          setFormUserEmailNull();
        }
       else if (v.length() > 255)
        throw new Exception("Cannot set tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserEmail: the size "+v.length()+" is larger than the max allowed of 255: "+TextUtil.escapeDoubleQuoteWithSlash(TextUtil.toMaxLength(v, 250)));
       else if (v.equals(_formUserEmail) == false)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSEREMAIL._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSEREMAIL._Mask);
       _formUserEmail = v;
        }
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserEmail -> TILDATUTORIAL.Test_XYZ_Realized."formUserEmail"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the null setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserEmail of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formUserEmail of type varchar(255)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>255</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The user's email (from TILDATUTORIAL.Test_XYZ_PivotView.formUserEmail)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setFormUserEmailNull()
     {
       long T0 = System.nanoTime();
       if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSEREMAIL._Mask) == true) // already NULL
        return;
       __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSEREMAIL._Mask);
       __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSEREMAIL._Mask);
       _formUserEmail=null;
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserEmail -> TILDATUTORIAL.Test_XYZ_Realized."formUserEmail"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the hasChanged for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formUserEmail of type String</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.formUserEmail of type varchar(255)</TD></TR>

  <TR><TD align="right"><B>Size</B></TD><TD>255</TD></TR>
  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>The user's email (from TILDATUTORIAL.Test_XYZ_PivotView.formUserEmail)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public boolean hasChangedFormUserEmail()
     { return __Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSEREMAIL._Mask); }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countCorrect -> TILDATUTORIAL.Test_XYZ_Realized."countCorrect"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countCorrect of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.countCorrect of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Whether the answer is correct or not (from TILDATUTORIAL.Test_XYZ_PivotView.countCorrect)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   @SerializedName("countCorrect")
   Long _countCorrect=null;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countCorrect -> TILDATUTORIAL.Test_XYZ_Realized."countCorrect"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the getter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countCorrect of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.countCorrect of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Whether the answer is correct or not (from TILDATUTORIAL.Test_XYZ_PivotView.countCorrect)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final long getCountCorrect()
      { return _countCorrect==null?0l:_countCorrect; }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countCorrect -> TILDATUTORIAL.Test_XYZ_Realized."countCorrect"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the isNull for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countCorrect of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.countCorrect of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Whether the answer is correct or not (from TILDATUTORIAL.Test_XYZ_PivotView.countCorrect)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final boolean isCountCorrectNull()
     { return __Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTCORRECT._Mask); }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countCorrect -> TILDATUTORIAL.Test_XYZ_Realized."countCorrect"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countCorrect of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.countCorrect of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Whether the answer is correct or not (from TILDATUTORIAL.Test_XYZ_PivotView.countCorrect)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setCountCorrect(long v) throws Exception
     {
       long T0 = System.nanoTime();
       if (__Init == InitMode.CREATE || _countCorrect == null || v != _countCorrect)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTCORRECT._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTCORRECT._Mask);
       _countCorrect = v;
        }
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countCorrect -> TILDATUTORIAL.Test_XYZ_Realized."countCorrect"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the null setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countCorrect of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.countCorrect of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Whether the answer is correct or not (from TILDATUTORIAL.Test_XYZ_PivotView.countCorrect)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setCountCorrectNull()
     {
       long T0 = System.nanoTime();
       if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTCORRECT._Mask) == true) // already NULL
        return;
       __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTCORRECT._Mask);
       __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTCORRECT._Mask);
       _countCorrect=null;
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countCorrect -> TILDATUTORIAL.Test_XYZ_Realized."countCorrect"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the hasChanged for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countCorrect of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.countCorrect of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Whether the answer is correct or not (from TILDATUTORIAL.Test_XYZ_PivotView.countCorrect)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public boolean hasChangedCountCorrect()
     { return __Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTCORRECT._Mask); }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countIncorrect -> TILDATUTORIAL.Test_XYZ_Realized."countIncorrect"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countIncorrect of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.countIncorrect of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Whether the answer is correct or not (from TILDATUTORIAL.Test_XYZ_PivotView.countIncorrect)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   @SerializedName("countIncorrect")
   Long _countIncorrect=null;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countIncorrect -> TILDATUTORIAL.Test_XYZ_Realized."countIncorrect"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the getter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countIncorrect of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.countIncorrect of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Whether the answer is correct or not (from TILDATUTORIAL.Test_XYZ_PivotView.countIncorrect)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final long getCountIncorrect()
      { return _countIncorrect==null?0l:_countIncorrect; }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countIncorrect -> TILDATUTORIAL.Test_XYZ_Realized."countIncorrect"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the isNull for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countIncorrect of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.countIncorrect of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Whether the answer is correct or not (from TILDATUTORIAL.Test_XYZ_PivotView.countIncorrect)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final boolean isCountIncorrectNull()
     { return __Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTINCORRECT._Mask); }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countIncorrect -> TILDATUTORIAL.Test_XYZ_Realized."countIncorrect"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countIncorrect of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.countIncorrect of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Whether the answer is correct or not (from TILDATUTORIAL.Test_XYZ_PivotView.countIncorrect)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setCountIncorrect(long v) throws Exception
     {
       long T0 = System.nanoTime();
       if (__Init == InitMode.CREATE || _countIncorrect == null || v != _countIncorrect)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTINCORRECT._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTINCORRECT._Mask);
       _countIncorrect = v;
        }
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countIncorrect -> TILDATUTORIAL.Test_XYZ_Realized."countIncorrect"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the null setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countIncorrect of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.countIncorrect of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Whether the answer is correct or not (from TILDATUTORIAL.Test_XYZ_PivotView.countIncorrect)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setCountIncorrectNull()
     {
       long T0 = System.nanoTime();
       if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTINCORRECT._Mask) == true) // already NULL
        return;
       __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTINCORRECT._Mask);
       __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTINCORRECT._Mask);
       _countIncorrect=null;
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countIncorrect -> TILDATUTORIAL.Test_XYZ_Realized."countIncorrect"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the hasChanged for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.countIncorrect of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.countIncorrect of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Whether the answer is correct or not (from TILDATUTORIAL.Test_XYZ_PivotView.countIncorrect)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public boolean hasChangedCountIncorrect()
     { return __Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTINCORRECT._Mask); }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisTotal -> TILDATUTORIAL.Test_XYZ_Realized."timeMillisTotal"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisTotal of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.timeMillisTotal of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisTotal)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   @SerializedName("timeMillisTotal")
   Long _timeMillisTotal=null;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisTotal -> TILDATUTORIAL.Test_XYZ_Realized."timeMillisTotal"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the getter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisTotal of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.timeMillisTotal of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisTotal)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final long getTimeMillisTotal()
      { return _timeMillisTotal==null?0l:_timeMillisTotal; }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisTotal -> TILDATUTORIAL.Test_XYZ_Realized."timeMillisTotal"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the isNull for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisTotal of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.timeMillisTotal of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisTotal)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final boolean isTimeMillisTotalNull()
     { return __Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISTOTAL._Mask); }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisTotal -> TILDATUTORIAL.Test_XYZ_Realized."timeMillisTotal"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisTotal of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.timeMillisTotal of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisTotal)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setTimeMillisTotal(long v) throws Exception
     {
       long T0 = System.nanoTime();
       if (__Init == InitMode.CREATE || _timeMillisTotal == null || v != _timeMillisTotal)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISTOTAL._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISTOTAL._Mask);
       _timeMillisTotal = v;
        }
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisTotal -> TILDATUTORIAL.Test_XYZ_Realized."timeMillisTotal"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the null setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisTotal of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.timeMillisTotal of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisTotal)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setTimeMillisTotalNull()
     {
       long T0 = System.nanoTime();
       if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISTOTAL._Mask) == true) // already NULL
        return;
       __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISTOTAL._Mask);
       __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISTOTAL._Mask);
       _timeMillisTotal=null;
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisTotal -> TILDATUTORIAL.Test_XYZ_Realized."timeMillisTotal"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the hasChanged for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisTotal of type long</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.timeMillisTotal of type bigint</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisTotal)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public boolean hasChangedTimeMillisTotal()
     { return __Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISTOTAL._Mask); }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisAvg -> TILDATUTORIAL.Test_XYZ_Realized."timeMillisAvg"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisAvg of type double</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.timeMillisAvg of type double precision</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisAvg)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   @SerializedName("timeMillisAvg")
   Double _timeMillisAvg=null;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisAvg -> TILDATUTORIAL.Test_XYZ_Realized."timeMillisAvg"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the getter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisAvg of type double</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.timeMillisAvg of type double precision</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisAvg)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final double getTimeMillisAvg()
      { return _timeMillisAvg==null?0d:_timeMillisAvg; }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisAvg -> TILDATUTORIAL.Test_XYZ_Realized."timeMillisAvg"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the isNull for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisAvg of type double</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.timeMillisAvg of type double precision</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisAvg)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final boolean isTimeMillisAvgNull()
     { return __Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISAVG._Mask); }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisAvg -> TILDATUTORIAL.Test_XYZ_Realized."timeMillisAvg"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisAvg of type double</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.timeMillisAvg of type double precision</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisAvg)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setTimeMillisAvg(double v) throws Exception
     {
       long T0 = System.nanoTime();
       if (__Init == InitMode.CREATE || _timeMillisAvg == null || v != _timeMillisAvg)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISAVG._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISAVG._Mask);
       _timeMillisAvg = v;
        }
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisAvg -> TILDATUTORIAL.Test_XYZ_Realized."timeMillisAvg"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the null setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisAvg of type double</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.timeMillisAvg of type double precision</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisAvg)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setTimeMillisAvgNull()
     {
       long T0 = System.nanoTime();
       if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISAVG._Mask) == true) // already NULL
        return;
       __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISAVG._Mask);
       __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISAVG._Mask);
       _timeMillisAvg=null;
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisAvg -> TILDATUTORIAL.Test_XYZ_Realized."timeMillisAvg"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the hasChanged for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisAvg of type double</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.timeMillisAvg of type double precision</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisAvg)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public boolean hasChangedTimeMillisAvg()
     { return __Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISAVG._Mask); }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisMin -> TILDATUTORIAL.Test_XYZ_Realized."timeMillisMin"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisMin of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.timeMillisMin of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisMin)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   @SerializedName("timeMillisMin")
   Integer _timeMillisMin=null;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisMin -> TILDATUTORIAL.Test_XYZ_Realized."timeMillisMin"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the getter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisMin of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.timeMillisMin of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisMin)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final int getTimeMillisMin()
      { return _timeMillisMin==null?0:_timeMillisMin; }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisMin -> TILDATUTORIAL.Test_XYZ_Realized."timeMillisMin"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the isNull for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisMin of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.timeMillisMin of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisMin)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final boolean isTimeMillisMinNull()
     { return __Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISMIN._Mask); }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisMin -> TILDATUTORIAL.Test_XYZ_Realized."timeMillisMin"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisMin of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.timeMillisMin of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisMin)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setTimeMillisMin(int v) throws Exception
     {
       long T0 = System.nanoTime();
       if (__Init == InitMode.CREATE || _timeMillisMin == null || v != _timeMillisMin)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISMIN._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISMIN._Mask);
       _timeMillisMin = v;
        }
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisMin -> TILDATUTORIAL.Test_XYZ_Realized."timeMillisMin"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the null setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisMin of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.timeMillisMin of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisMin)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setTimeMillisMinNull()
     {
       long T0 = System.nanoTime();
       if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISMIN._Mask) == true) // already NULL
        return;
       __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISMIN._Mask);
       __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISMIN._Mask);
       _timeMillisMin=null;
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisMin -> TILDATUTORIAL.Test_XYZ_Realized."timeMillisMin"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the hasChanged for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.timeMillisMin of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.timeMillisMin of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Time in milliseconds for the time spent answering the question (from TILDATUTORIAL.Test_XYZ_PivotView.timeMillisMin)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public boolean hasChangedTimeMillisMin()
     { return __Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISMIN._Mask); }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_correct -> TILDATUTORIAL.Test_XYZ_Realized."QX_correct"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_correct of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QX_correct of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question X (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QX') (from TILDATUTORIAL.Test_XYZ_PivotView.QX_correct)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   @SerializedName("QX_correct")
   Boolean _QX_correct=null;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_correct -> TILDATUTORIAL.Test_XYZ_Realized."QX_correct"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the getter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_correct of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QX_correct of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question X (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QX') (from TILDATUTORIAL.Test_XYZ_PivotView.QX_correct)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final boolean getQX_correct()
      { return _QX_correct==null?false:_QX_correct; }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_correct -> TILDATUTORIAL.Test_XYZ_Realized."QX_correct"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the isNull for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_correct of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QX_correct of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question X (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QX') (from TILDATUTORIAL.Test_XYZ_PivotView.QX_correct)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final boolean isQX_correctNull()
     { return __Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_CORRECT._Mask); }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_correct -> TILDATUTORIAL.Test_XYZ_Realized."QX_correct"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_correct of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QX_correct of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question X (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QX') (from TILDATUTORIAL.Test_XYZ_PivotView.QX_correct)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setQX_correct(boolean v) throws Exception
     {
       long T0 = System.nanoTime();
       if (__Init == InitMode.CREATE || _QX_correct == null || v != _QX_correct)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_CORRECT._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_CORRECT._Mask);
       _QX_correct = v;
        }
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_correct -> TILDATUTORIAL.Test_XYZ_Realized."QX_correct"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the null setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_correct of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QX_correct of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question X (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QX') (from TILDATUTORIAL.Test_XYZ_PivotView.QX_correct)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setQX_correctNull()
     {
       long T0 = System.nanoTime();
       if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_CORRECT._Mask) == true) // already NULL
        return;
       __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_CORRECT._Mask);
       __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_CORRECT._Mask);
       _QX_correct=null;
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_correct -> TILDATUTORIAL.Test_XYZ_Realized."QX_correct"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the hasChanged for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_correct of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QX_correct of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question X (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QX') (from TILDATUTORIAL.Test_XYZ_PivotView.QX_correct)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public boolean hasChangedQX_correct()
     { return __Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_CORRECT._Mask); }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_timeMillis -> TILDATUTORIAL.Test_XYZ_Realized."QX_timeMillis"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_timeMillis of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QX_timeMillis of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question X (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QX') (from TILDATUTORIAL.Test_XYZ_PivotView.QX_timeMillis)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   @SerializedName("QX_timeMillis")
   Integer _QX_timeMillis=null;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_timeMillis -> TILDATUTORIAL.Test_XYZ_Realized."QX_timeMillis"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the getter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_timeMillis of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QX_timeMillis of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question X (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QX') (from TILDATUTORIAL.Test_XYZ_PivotView.QX_timeMillis)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final int getQX_timeMillis()
      { return _QX_timeMillis==null?0:_QX_timeMillis; }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_timeMillis -> TILDATUTORIAL.Test_XYZ_Realized."QX_timeMillis"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the isNull for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_timeMillis of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QX_timeMillis of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question X (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QX') (from TILDATUTORIAL.Test_XYZ_PivotView.QX_timeMillis)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final boolean isQX_timeMillisNull()
     { return __Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_TIMEMILLIS._Mask); }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_timeMillis -> TILDATUTORIAL.Test_XYZ_Realized."QX_timeMillis"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_timeMillis of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QX_timeMillis of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question X (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QX') (from TILDATUTORIAL.Test_XYZ_PivotView.QX_timeMillis)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setQX_timeMillis(int v) throws Exception
     {
       long T0 = System.nanoTime();
       if (__Init == InitMode.CREATE || _QX_timeMillis == null || v != _QX_timeMillis)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_TIMEMILLIS._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_TIMEMILLIS._Mask);
       _QX_timeMillis = v;
        }
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_timeMillis -> TILDATUTORIAL.Test_XYZ_Realized."QX_timeMillis"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the null setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_timeMillis of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QX_timeMillis of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question X (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QX') (from TILDATUTORIAL.Test_XYZ_PivotView.QX_timeMillis)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setQX_timeMillisNull()
     {
       long T0 = System.nanoTime();
       if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_TIMEMILLIS._Mask) == true) // already NULL
        return;
       __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_TIMEMILLIS._Mask);
       __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_TIMEMILLIS._Mask);
       _QX_timeMillis=null;
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_timeMillis -> TILDATUTORIAL.Test_XYZ_Realized."QX_timeMillis"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the hasChanged for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QX_timeMillis of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QX_timeMillis of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question X (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QX') (from TILDATUTORIAL.Test_XYZ_PivotView.QX_timeMillis)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public boolean hasChangedQX_timeMillis()
     { return __Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_TIMEMILLIS._Mask); }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_correct -> TILDATUTORIAL.Test_XYZ_Realized."QY_correct"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_correct of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QY_correct of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Y (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QY') (from TILDATUTORIAL.Test_XYZ_PivotView.QY_correct)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   @SerializedName("QY_correct")
   Boolean _QY_correct=null;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_correct -> TILDATUTORIAL.Test_XYZ_Realized."QY_correct"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the getter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_correct of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QY_correct of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Y (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QY') (from TILDATUTORIAL.Test_XYZ_PivotView.QY_correct)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final boolean getQY_correct()
      { return _QY_correct==null?false:_QY_correct; }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_correct -> TILDATUTORIAL.Test_XYZ_Realized."QY_correct"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the isNull for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_correct of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QY_correct of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Y (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QY') (from TILDATUTORIAL.Test_XYZ_PivotView.QY_correct)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final boolean isQY_correctNull()
     { return __Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_CORRECT._Mask); }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_correct -> TILDATUTORIAL.Test_XYZ_Realized."QY_correct"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_correct of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QY_correct of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Y (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QY') (from TILDATUTORIAL.Test_XYZ_PivotView.QY_correct)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setQY_correct(boolean v) throws Exception
     {
       long T0 = System.nanoTime();
       if (__Init == InitMode.CREATE || _QY_correct == null || v != _QY_correct)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_CORRECT._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_CORRECT._Mask);
       _QY_correct = v;
        }
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_correct -> TILDATUTORIAL.Test_XYZ_Realized."QY_correct"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the null setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_correct of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QY_correct of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Y (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QY') (from TILDATUTORIAL.Test_XYZ_PivotView.QY_correct)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setQY_correctNull()
     {
       long T0 = System.nanoTime();
       if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_CORRECT._Mask) == true) // already NULL
        return;
       __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_CORRECT._Mask);
       __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_CORRECT._Mask);
       _QY_correct=null;
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_correct -> TILDATUTORIAL.Test_XYZ_Realized."QY_correct"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the hasChanged for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_correct of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QY_correct of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Y (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QY') (from TILDATUTORIAL.Test_XYZ_PivotView.QY_correct)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public boolean hasChangedQY_correct()
     { return __Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_CORRECT._Mask); }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_timeMillis -> TILDATUTORIAL.Test_XYZ_Realized."QY_timeMillis"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_timeMillis of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QY_timeMillis of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Y (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QY') (from TILDATUTORIAL.Test_XYZ_PivotView.QY_timeMillis)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   @SerializedName("QY_timeMillis")
   Integer _QY_timeMillis=null;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_timeMillis -> TILDATUTORIAL.Test_XYZ_Realized."QY_timeMillis"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the getter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_timeMillis of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QY_timeMillis of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Y (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QY') (from TILDATUTORIAL.Test_XYZ_PivotView.QY_timeMillis)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final int getQY_timeMillis()
      { return _QY_timeMillis==null?0:_QY_timeMillis; }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_timeMillis -> TILDATUTORIAL.Test_XYZ_Realized."QY_timeMillis"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the isNull for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_timeMillis of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QY_timeMillis of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Y (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QY') (from TILDATUTORIAL.Test_XYZ_PivotView.QY_timeMillis)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final boolean isQY_timeMillisNull()
     { return __Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_TIMEMILLIS._Mask); }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_timeMillis -> TILDATUTORIAL.Test_XYZ_Realized."QY_timeMillis"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_timeMillis of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QY_timeMillis of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Y (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QY') (from TILDATUTORIAL.Test_XYZ_PivotView.QY_timeMillis)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setQY_timeMillis(int v) throws Exception
     {
       long T0 = System.nanoTime();
       if (__Init == InitMode.CREATE || _QY_timeMillis == null || v != _QY_timeMillis)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_TIMEMILLIS._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_TIMEMILLIS._Mask);
       _QY_timeMillis = v;
        }
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_timeMillis -> TILDATUTORIAL.Test_XYZ_Realized."QY_timeMillis"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the null setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_timeMillis of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QY_timeMillis of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Y (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QY') (from TILDATUTORIAL.Test_XYZ_PivotView.QY_timeMillis)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setQY_timeMillisNull()
     {
       long T0 = System.nanoTime();
       if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_TIMEMILLIS._Mask) == true) // already NULL
        return;
       __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_TIMEMILLIS._Mask);
       __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_TIMEMILLIS._Mask);
       _QY_timeMillis=null;
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_timeMillis -> TILDATUTORIAL.Test_XYZ_Realized."QY_timeMillis"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the hasChanged for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QY_timeMillis of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QY_timeMillis of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Y (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QY') (from TILDATUTORIAL.Test_XYZ_PivotView.QY_timeMillis)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public boolean hasChangedQY_timeMillis()
     { return __Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_TIMEMILLIS._Mask); }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_correct -> TILDATUTORIAL.Test_XYZ_Realized."QZ_correct"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_correct of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QZ_correct of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Z (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QZ') (from TILDATUTORIAL.Test_XYZ_PivotView.QZ_correct)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   @SerializedName("QZ_correct")
   Boolean _QZ_correct=null;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_correct -> TILDATUTORIAL.Test_XYZ_Realized."QZ_correct"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the getter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_correct of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QZ_correct of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Z (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QZ') (from TILDATUTORIAL.Test_XYZ_PivotView.QZ_correct)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final boolean getQZ_correct()
      { return _QZ_correct==null?false:_QZ_correct; }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_correct -> TILDATUTORIAL.Test_XYZ_Realized."QZ_correct"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the isNull for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_correct of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QZ_correct of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Z (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QZ') (from TILDATUTORIAL.Test_XYZ_PivotView.QZ_correct)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final boolean isQZ_correctNull()
     { return __Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_CORRECT._Mask); }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_correct -> TILDATUTORIAL.Test_XYZ_Realized."QZ_correct"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_correct of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QZ_correct of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Z (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QZ') (from TILDATUTORIAL.Test_XYZ_PivotView.QZ_correct)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setQZ_correct(boolean v) throws Exception
     {
       long T0 = System.nanoTime();
       if (__Init == InitMode.CREATE || _QZ_correct == null || v != _QZ_correct)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_CORRECT._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_CORRECT._Mask);
       _QZ_correct = v;
        }
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_correct -> TILDATUTORIAL.Test_XYZ_Realized."QZ_correct"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the null setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_correct of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QZ_correct of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Z (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QZ') (from TILDATUTORIAL.Test_XYZ_PivotView.QZ_correct)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setQZ_correctNull()
     {
       long T0 = System.nanoTime();
       if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_CORRECT._Mask) == true) // already NULL
        return;
       __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_CORRECT._Mask);
       __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_CORRECT._Mask);
       _QZ_correct=null;
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_correct -> TILDATUTORIAL.Test_XYZ_Realized."QZ_correct"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the hasChanged for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_correct of type boolean</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QZ_correct of type boolean</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Z (pivot of MIN(TILDATUTORIAL.TestAnswer.correct) on TILDATUTORIAL.TestAnswer.questionId='QZ') (from TILDATUTORIAL.Test_XYZ_PivotView.QZ_correct)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public boolean hasChangedQZ_correct()
     { return __Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_CORRECT._Mask); }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_timeMillis -> TILDATUTORIAL.Test_XYZ_Realized."QZ_timeMillis"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the definition for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_timeMillis of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QZ_timeMillis of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Z (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QZ') (from TILDATUTORIAL.Test_XYZ_PivotView.QZ_timeMillis)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   @SerializedName("QZ_timeMillis")
   Integer _QZ_timeMillis=null;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_timeMillis -> TILDATUTORIAL.Test_XYZ_Realized."QZ_timeMillis"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the getter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_timeMillis of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QZ_timeMillis of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Z (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QZ') (from TILDATUTORIAL.Test_XYZ_PivotView.QZ_timeMillis)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final int getQZ_timeMillis()
      { return _QZ_timeMillis==null?0:_QZ_timeMillis; }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_timeMillis -> TILDATUTORIAL.Test_XYZ_Realized."QZ_timeMillis"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the isNull for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_timeMillis of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QZ_timeMillis of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Z (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QZ') (from TILDATUTORIAL.Test_XYZ_PivotView.QZ_timeMillis)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public final boolean isQZ_timeMillisNull()
     { return __Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_TIMEMILLIS._Mask); }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_timeMillis -> TILDATUTORIAL.Test_XYZ_Realized."QZ_timeMillis"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_timeMillis of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QZ_timeMillis of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Z (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QZ') (from TILDATUTORIAL.Test_XYZ_PivotView.QZ_timeMillis)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setQZ_timeMillis(int v) throws Exception
     {
       long T0 = System.nanoTime();
       if (__Init == InitMode.CREATE || _QZ_timeMillis == null || v != _QZ_timeMillis)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_TIMEMILLIS._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_TIMEMILLIS._Mask);
       _QZ_timeMillis = v;
        }
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_timeMillis -> TILDATUTORIAL.Test_XYZ_Realized."QZ_timeMillis"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the null setter for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_timeMillis of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QZ_timeMillis of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Z (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QZ') (from TILDATUTORIAL.Test_XYZ_PivotView.QZ_timeMillis)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public void setQZ_timeMillisNull()
     {
       long T0 = System.nanoTime();
       if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_TIMEMILLIS._Mask) == true) // already NULL
        return;
       __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_TIMEMILLIS._Mask);
       __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_TIMEMILLIS._Mask);
       _QZ_timeMillis=null;
       PerfTracker.add(TransactionType.TILDA_SETTER, System.nanoTime() - T0);
     }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Field tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_timeMillis -> TILDATUTORIAL.Test_XYZ_Realized."QZ_timeMillis"
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/**
This is the hasChanged for:<BR>
<TABLE border="0px" cellpadding="3px" cellspacing="0px">
  <TR><TD align="right"><B>Name</B></TD><TD>tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.QZ_timeMillis of type int</TD></TR>
  <TR><TD align="right"><B>Column</B></TD><TD>TILDATUTORIAL.Test_XYZ_Realized.QZ_timeMillis of type integer</TD></TR>

  <TR><TD align="right"><B>Nullable</B></TD><TD>true</TD></TR>
  <TR valign="top"><TD align="right"><B>Description</B></TD><TD>Question Z (pivot of MAX(TILDATUTORIAL.TestAnswer.timeMillis) on TILDATUTORIAL.TestAnswer.questionId='QZ') (from TILDATUTORIAL.Test_XYZ_PivotView.QZ_timeMillis)</TD></TR>
  <TR><TD align="right"><B>Mode</B></TD><TD>NORMAL</TD></TR>
  <TR><TD align="right"><B>Invariant</B></TD><TD>false</TD></TR>
  <TR><TD align="right"><B>Protect</B></TD><TD>NONE</TD></TR>
</TABLE>
*/
   public boolean hasChangedQZ_timeMillis()
     { return __Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_TIMEMILLIS._Mask); }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/**
 Copies all the field which are not part of the primary key, not are CALCULATED and not invariant, from the 
 current object to the destination. 
*/
   public void copyTo(tilda.tutorial.data._Tilda.TILDA__TEST_XYZ_REALIZED Dst) throws Exception
     {
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMTYPE._Mask) == true) Dst.setFormTypeNull       (); else        Dst.setFormType       (_formType       );
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATETZ._Mask) == true) Dst.setFormFillDateTZNull (); else        Dst.setFormFillDateTZ (_formFillDateTZ );
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE._Mask) == true) Dst.setFormFillDateNull   (); else        Dst.setFormFillDate   (_formFillDate   );
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSERREFNUM._Mask) == true) Dst.setFormUserRefnumNull (); else        Dst.setFormUserRefnum (_formUserRefnum );
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSEREMAIL._Mask) == true) Dst.setFormUserEmailNull  (); else        Dst.setFormUserEmail  (_formUserEmail  );
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTCORRECT._Mask) == true) Dst.setCountCorrectNull   (); else        Dst.setCountCorrect   (_countCorrect   );
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTINCORRECT._Mask) == true) Dst.setCountIncorrectNull (); else        Dst.setCountIncorrect (_countIncorrect );
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISTOTAL._Mask) == true) Dst.setTimeMillisTotalNull(); else        Dst.setTimeMillisTotal(_timeMillisTotal);
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISAVG._Mask) == true) Dst.setTimeMillisAvgNull  (); else        Dst.setTimeMillisAvg  (_timeMillisAvg  );
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISMIN._Mask) == true) Dst.setTimeMillisMinNull  (); else        Dst.setTimeMillisMin  (_timeMillisMin  );
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_CORRECT._Mask) == true) Dst.setQX_correctNull     (); else        Dst.setQX_correct     (_QX_correct     );
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_TIMEMILLIS._Mask) == true) Dst.setQX_timeMillisNull  (); else        Dst.setQX_timeMillis  (_QX_timeMillis  );
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_CORRECT._Mask) == true) Dst.setQY_correctNull     (); else        Dst.setQY_correct     (_QY_correct     );
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_TIMEMILLIS._Mask) == true) Dst.setQY_timeMillisNull  (); else        Dst.setQY_timeMillis  (_QY_timeMillis  );
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_CORRECT._Mask) == true) Dst.setQZ_correctNull     (); else        Dst.setQZ_correct     (_QZ_correct     );
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_TIMEMILLIS._Mask) == true) Dst.setQZ_timeMillisNull  (); else        Dst.setQZ_timeMillis  (_QZ_timeMillis  );
     }

/**
 Sets the 'lastUpdated' column to now and causes a Write to occur to update the object in the data store.
*/
   public abstract boolean touch(Connection C) throws Exception;

/**
 Writes the object to the data store if any changes has occurred since the object was initially
 read from the data store or last written. 
 If the object was deserialized (i.e., not created via the factory lookup() or create() methods, 
 then this method assumes a create() and will check that all non-null columns have been provided. If you 
 need more flexibility for an upsert, use the upsert(Connection, boolean) version of write 
 which will try a combination of insert/update to get the object to the DB. 
 Note that if you use write() right after a create, lookup or deserialization initialization, only the
 template fields (not null, natural identity and/or any field set prior to calling this method) exist 
  in memory. Call refresh() to force a select and retrieve all the fields for that record.
*/
   public final boolean write(Connection C) throws Exception
     {
       long T0 = System.nanoTime();

       if (__Init == null && __LookupId==0) // Loaded via some other mechamism, e.g., Json or CSV loader
        {
          validateDeserialization();
          initForCreate();
        }

       if (hasChanged() == false)
        {
          LOG.debug(QueryDetails._LOGGING_HEADER + "The tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized has not changed: no writing will occur.");
          QueryDetails.setLastQuery(TILDA__TEST_XYZ_REALIZED_Factory.SCHEMA_TABLENAME_LABEL, "");
          return true;
        }

       if (beforeWrite(C) == false)
        {
          LOG.debug(QueryDetails._LOGGING_HEADER + "The tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized object's beforeWrite() failed.");
          QueryDetails.setLastQuery(TILDA__TEST_XYZ_REALIZED_Factory.SCHEMA_TABLENAME_LABEL, "");
          return false;
        }

       String Q = getWriteQuery(C);

       java.sql.PreparedStatement PS = null;
       int count = 0;
       List<java.sql.Array> AllocatedArrays = new ArrayList<java.sql.Array>();
       try
        {
          PS = C.prepareStatement(Q);
          int i = populatePreparedStatement(C, PS, AllocatedArrays);

          switch (__LookupId)
           {
             case 0:
               PS.setLong      (++i, _formRefnum     );
               break;
             case -666: if (__Init == InitMode.CREATE) break;
             default: throw new Exception("Invalid LookupId "+__LookupId+" found. Cannot prepare statement.");
           }

          C.setSavepoint();
          count = PS.executeUpdate();
          C.releaseSavepoint(true);
          if (count == 0)
           return false;
        }
       catch (java.sql.SQLException E)
        {
          C.releaseSavepoint(false);
          return C.handleCatch(E, "updated or inserted");
        }
       finally
        {
          tilda.tutorial.data._Tilda.TILDA__1_0.handleFinally(PS, T0, TILDA__TEST_XYZ_REALIZED_Factory.SCHEMA_TABLENAME_LABEL, __Init == InitMode.CREATE ? StatementType.INSERT : StatementType.UPDATE, count, null);
          PS = null;
        }

       stateUpdatePostWrite();
       return true;
     }

   protected abstract boolean beforeWrite(Connection C) throws Exception;

   protected void validateDeserialization() throws Exception
     {

       if (_formRefnum == null)
        throw new Exception("Incoming value for 'tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formRefnum' was null or empty. It's not nullable in the model.\n"+toString());
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMREFNUM._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMREFNUM._Mask);

       if (TextUtil.isNullOrEmpty(_formType) == false)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMTYPE._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMTYPE._Mask);
        }

       if (TextUtil.isNullOrEmpty(Str_formFillDate) == false)
        {
          _formFillDate = DateTimeUtil.parsefromJSON(Str_formFillDate);
          if (   _formFillDate == null)
           throw new Exception("Incoming value for 'tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate' was not in the expected format. Dates should follow the ISO format.\n"+toString());
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE._Mask);
          tilda.data.ZoneInfo_Data ZI = tilda.data.ZoneInfo_Factory.getEnumerationByValue(_formFillDate.getZone().getId());
          if (ZI == null)
           throw new Exception("Cannot set field 'tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate' because the timezone value '"+_formFillDate.getZone().getId()+"' is unknown. Make sure it is mapped properly in the ZoneInfo table.");
          setFormFillDateTZ(ZI.getId());
        }

       if (_formUserRefnum != null)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSERREFNUM._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSERREFNUM._Mask);
        }

       if (TextUtil.isNullOrEmpty(_formUserEmail) == false)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSEREMAIL._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSEREMAIL._Mask);
        }

       if (_countCorrect != null)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTCORRECT._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTCORRECT._Mask);
        }

       if (_countIncorrect != null)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTINCORRECT._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTINCORRECT._Mask);
        }

       if (_timeMillisTotal != null)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISTOTAL._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISTOTAL._Mask);
        }

       if (_timeMillisAvg != null)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISAVG._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISAVG._Mask);
        }

       if (_timeMillisMin != null)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISMIN._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISMIN._Mask);
        }

       if (_QX_correct != null)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_CORRECT._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_CORRECT._Mask);
        }

       if (_QX_timeMillis != null)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_TIMEMILLIS._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_TIMEMILLIS._Mask);
        }

       if (_QY_correct != null)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_CORRECT._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_CORRECT._Mask);
        }

       if (_QY_timeMillis != null)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_TIMEMILLIS._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_TIMEMILLIS._Mask);
        }

       if (_QZ_correct != null)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_CORRECT._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_CORRECT._Mask);
        }

       if (_QZ_timeMillis != null)
        {
          __Changes.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_TIMEMILLIS._Mask);
          __Nulls.andNot(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_TIMEMILLIS._Mask);
        }
     }
   protected String getTimeStampSignature() throws Exception
     {
       StringBuilder S = new StringBuilder(1024);
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE._Mask) == true) S.append(DateTimeUtil.isNowPlaceholder(_formFillDate) == true ? "C" : "X");
       return S.toString();
     }
   protected String getWriteQuery(Connection C) throws Exception
     {
       StringBuilder S = new StringBuilder(1024);

       if (__Init == InitMode.CREATE)
        {
          StringBuilder V = new StringBuilder(1024);
          S.append("insert into "); C.getFullTableVar(S, "TILDATUTORIAL", "Test_XYZ_Realized");
          int Pos = S.length();
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMREFNUM._Mask) == true) { TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMREFNUM.getFullColumnVarForInsert(C, S); V.append(tilda.tutorial.data._Tilda.TILDA__1_0._COMMAQUESTION);  }
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMTYPE._Mask) == true) { TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMTYPE.getFullColumnVarForInsert(C, S); V.append(tilda.tutorial.data._Tilda.TILDA__1_0._COMMAQUESTION);  }
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATETZ._Mask) == true) { TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATETZ.getFullColumnVarForInsert(C, S); V.append(tilda.tutorial.data._Tilda.TILDA__1_0._COMMAQUESTION);  }

          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE._Mask) == true) { TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE.getFullColumnVarForInsert(C, S);
             V.append(__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE._Mask) == false && DateTimeUtil.isNowPlaceholder(_formFillDate) == true ? C.getCommaCurrentTimestamp() : tilda.tutorial.data._Tilda.TILDA__1_0._COMMAQUESTION);
           }
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSERREFNUM._Mask) == true) { TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSERREFNUM.getFullColumnVarForInsert(C, S); V.append(tilda.tutorial.data._Tilda.TILDA__1_0._COMMAQUESTION);  }
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSEREMAIL._Mask) == true) { TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSEREMAIL.getFullColumnVarForInsert(C, S); V.append(tilda.tutorial.data._Tilda.TILDA__1_0._COMMAQUESTION);  }
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTCORRECT._Mask) == true) { TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTCORRECT.getFullColumnVarForInsert(C, S); V.append(tilda.tutorial.data._Tilda.TILDA__1_0._COMMAQUESTION);  }
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTINCORRECT._Mask) == true) { TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTINCORRECT.getFullColumnVarForInsert(C, S); V.append(tilda.tutorial.data._Tilda.TILDA__1_0._COMMAQUESTION);  }
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISTOTAL._Mask) == true) { TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISTOTAL.getFullColumnVarForInsert(C, S); V.append(tilda.tutorial.data._Tilda.TILDA__1_0._COMMAQUESTION);  }
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISAVG._Mask) == true) { TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISAVG.getFullColumnVarForInsert(C, S); V.append(tilda.tutorial.data._Tilda.TILDA__1_0._COMMAQUESTION);  }
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISMIN._Mask) == true) { TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISMIN.getFullColumnVarForInsert(C, S); V.append(tilda.tutorial.data._Tilda.TILDA__1_0._COMMAQUESTION);  }
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_CORRECT._Mask) == true) { TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_CORRECT.getFullColumnVarForInsert(C, S); V.append(tilda.tutorial.data._Tilda.TILDA__1_0._COMMAQUESTION);  }
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_TIMEMILLIS._Mask) == true) { TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_TIMEMILLIS.getFullColumnVarForInsert(C, S); V.append(tilda.tutorial.data._Tilda.TILDA__1_0._COMMAQUESTION);  }
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_CORRECT._Mask) == true) { TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_CORRECT.getFullColumnVarForInsert(C, S); V.append(tilda.tutorial.data._Tilda.TILDA__1_0._COMMAQUESTION);  }
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_TIMEMILLIS._Mask) == true) { TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_TIMEMILLIS.getFullColumnVarForInsert(C, S); V.append(tilda.tutorial.data._Tilda.TILDA__1_0._COMMAQUESTION);  }
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_CORRECT._Mask) == true) { TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_CORRECT.getFullColumnVarForInsert(C, S); V.append(tilda.tutorial.data._Tilda.TILDA__1_0._COMMAQUESTION);  }
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_TIMEMILLIS._Mask) == true) { TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_TIMEMILLIS.getFullColumnVarForInsert(C, S); V.append(tilda.tutorial.data._Tilda.TILDA__1_0._COMMAQUESTION);  }

          S.setCharAt(Pos, '(');
          V.setCharAt(0, '(');
          S.append(") values ").append(V).append(')');
          V.setLength(0);
          V = null;
        }
       else // InitMode can be anything else
        {
          S.append("update "); C.getFullTableVar(S, "TILDATUTORIAL", "Test_XYZ_Realized"); S.append(" set");
          int Pos = S.length();
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMREFNUM._Mask) == true) TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMREFNUM.getFullColumnVarForUpdate(C, S);
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMTYPE._Mask) == true) TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMTYPE.getFullColumnVarForUpdate(C, S);
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATETZ._Mask) == true) TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATETZ.getFullColumnVarForUpdate(C, S);

          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE._Mask) == true)
           {
             if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE._Mask) == false && DateTimeUtil.isNowPlaceholder(_formFillDate) == true)
              { TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE.getFullColumnVarForInsert(C, S); S.append(C.getEqualCurrentTimestamp()); }
             else
              TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE.getFullColumnVarForUpdate(C, S);
           }
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSERREFNUM._Mask) == true) TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSERREFNUM.getFullColumnVarForUpdate(C, S);
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSEREMAIL._Mask) == true) TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSEREMAIL.getFullColumnVarForUpdate(C, S);
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTCORRECT._Mask) == true) TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTCORRECT.getFullColumnVarForUpdate(C, S);
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTINCORRECT._Mask) == true) TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTINCORRECT.getFullColumnVarForUpdate(C, S);
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISTOTAL._Mask) == true) TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISTOTAL.getFullColumnVarForUpdate(C, S);
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISAVG._Mask) == true) TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISAVG.getFullColumnVarForUpdate(C, S);
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISMIN._Mask) == true) TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISMIN.getFullColumnVarForUpdate(C, S);
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_CORRECT._Mask) == true) TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_CORRECT.getFullColumnVarForUpdate(C, S);
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_TIMEMILLIS._Mask) == true) TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_TIMEMILLIS.getFullColumnVarForUpdate(C, S);
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_CORRECT._Mask) == true) TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_CORRECT.getFullColumnVarForUpdate(C, S);
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_TIMEMILLIS._Mask) == true) TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_TIMEMILLIS.getFullColumnVarForUpdate(C, S);
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_CORRECT._Mask) == true) TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_CORRECT.getFullColumnVarForUpdate(C, S);
          if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_TIMEMILLIS._Mask) == true) TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_TIMEMILLIS.getFullColumnVarForUpdate(C, S);

          switch (__LookupId)
           {
             case 0:
                S.append(" where ("); C.getFullColumnVar(S, "TILDATUTORIAL", "Test_XYZ_Realized", "formRefnum"); S.append("=?)");
                break;
             case -77: 
             case -666: if (__Init == InitMode.CREATE) break;
             default: throw new Exception("Invalid LookupId "+__LookupId+" found. Cannot create where clause.");
           }
          S.setCharAt(Pos, ' ');
        }

       String Q = S.toString();
       S.setLength(0);
       S = null;
       QueryDetails.setLastQuery(TILDA__TEST_XYZ_REALIZED_Factory.SCHEMA_TABLENAME_LABEL, Q);
       QueryDetails.logQuery("TILDATUTORIAL.Test_XYZ_Realized", Q, toString());

       return Q;
     }
   protected int populatePreparedStatement(Connection C, java.sql.PreparedStatement PS, List<java.sql.Array> AllocatedArrays) throws Exception
     {
       int i = 0;
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMREFNUM._Mask) == true) 
        { 
          if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMREFNUM._Mask) == true) PS.setNull(++i, java.sql.Types.BIGINT    ); else PS.setLong      (++i, _formRefnum);
        } 
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMTYPE._Mask) == true) 
        { 
          if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMTYPE._Mask) == true) PS.setNull(++i, java.sql.Types.CHAR      ); else PS.setString    (++i, _formType);
        } 
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATETZ._Mask) == true) 
        { 
          if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATETZ._Mask) == true) PS.setNull(++i, java.sql.Types.CHAR      ); else PS.setString    (++i, _formFillDateTZ);
        } 
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE._Mask) == true) 
        { 
          if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE._Mask) == true) PS.setNull(++i, java.sql.Types.TIMESTAMP_WITH_TIMEZONE); else if (DateTimeUtil.isNowPlaceholder(_formFillDate) == false) PS.setTimestamp(++i, java.sql.Timestamp.from(_formFillDate.toInstant()), DateTimeUtil._UTC_CALENDAR);
        } 
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSERREFNUM._Mask) == true) 
        { 
          if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSERREFNUM._Mask) == true) PS.setNull(++i, java.sql.Types.BIGINT    ); else PS.setLong      (++i, _formUserRefnum);
        } 
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSEREMAIL._Mask) == true) 
        { 
          if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSEREMAIL._Mask) == true) PS.setNull(++i, java.sql.Types.CHAR      ); else PS.setString    (++i, _formUserEmail);
        } 
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTCORRECT._Mask) == true) 
        { 
          if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTCORRECT._Mask) == true) PS.setNull(++i, java.sql.Types.BIGINT    ); else PS.setLong      (++i, _countCorrect);
        } 
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTINCORRECT._Mask) == true) 
        { 
          if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTINCORRECT._Mask) == true) PS.setNull(++i, java.sql.Types.BIGINT    ); else PS.setLong      (++i, _countIncorrect);
        } 
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISTOTAL._Mask) == true) 
        { 
          if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISTOTAL._Mask) == true) PS.setNull(++i, java.sql.Types.BIGINT    ); else PS.setLong      (++i, _timeMillisTotal);
        } 
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISAVG._Mask) == true) 
        { 
          if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISAVG._Mask) == true) PS.setNull(++i, java.sql.Types.DOUBLE    ); else PS.setDouble    (++i, _timeMillisAvg);
        } 
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISMIN._Mask) == true) 
        { 
          if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISMIN._Mask) == true) PS.setNull(++i, java.sql.Types.INTEGER   ); else PS.setInt       (++i, _timeMillisMin);
        } 
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_CORRECT._Mask) == true) 
        { 
          if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_CORRECT._Mask) == true) PS.setNull(++i, java.sql.Types.BOOLEAN   ); else PS.setBoolean   (++i, _QX_correct);
        } 
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_TIMEMILLIS._Mask) == true) 
        { 
          if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_TIMEMILLIS._Mask) == true) PS.setNull(++i, java.sql.Types.INTEGER   ); else PS.setInt       (++i, _QX_timeMillis);
        } 
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_CORRECT._Mask) == true) 
        { 
          if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_CORRECT._Mask) == true) PS.setNull(++i, java.sql.Types.BOOLEAN   ); else PS.setBoolean   (++i, _QY_correct);
        } 
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_TIMEMILLIS._Mask) == true) 
        { 
          if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_TIMEMILLIS._Mask) == true) PS.setNull(++i, java.sql.Types.INTEGER   ); else PS.setInt       (++i, _QY_timeMillis);
        } 
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_CORRECT._Mask) == true) 
        { 
          if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_CORRECT._Mask) == true) PS.setNull(++i, java.sql.Types.BOOLEAN   ); else PS.setBoolean   (++i, _QZ_correct);
        } 
       if (__Changes.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_TIMEMILLIS._Mask) == true) 
        { 
          if (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_TIMEMILLIS._Mask) == true) PS.setNull(++i, java.sql.Types.INTEGER   ); else PS.setInt       (++i, _QZ_timeMillis);
        } 
       return i;
     }
   protected void stateUpdatePostWrite() throws Exception
     {
       if (__Init == InitMode.CREATE)
        {
          __Init = InitMode.WRITTEN;
          __LookupId = 0;
        }
       else
        {
          __Init = __Init == InitMode.READ ? InitMode.READ_WRITTEN : InitMode.WRITTEN;
        }

       switch (__LookupId)
        {
          case 0:
             __Saved_formRefnum      = _formRefnum     ;
             break;
          case -666: if (__Init == InitMode.CREATE) break;
          default: throw new Exception("Invalid LookupId "+__LookupId+" found. Cannot prepare statement.");
        }

       __Changes.clear();
       __Nulls.clear();
     }
/**
 Writes the object to the data store using an upsert approach and assumes the object is either
 in create or deserialized mode. 
 The parameter createFirst controls whether the logic should do an insert first and if it fails, then do 
 an update, or the opposite (update first and if it fails, then an insert). This is necessary for databases
 without a robust upsert SQL syntax where separate insert/update statements must be issued.
 The method will figure out based on the fields set which natural identity (a unique index) is applicable for
 the lookup operation.
 Note that when you use upsert() (right after a create or deserialization initialization), only the template
 fields (not null, natural identity and/or any field set prior to calling this method) exist in memory. Call
 refresh() to force a select and retrieve all the fields for that record.
*/
   public final boolean upsert(Connection C, boolean updateFirst) throws Exception
     {
       boolean OK =    __Init == InitMode.CREATE && __NewlyCreated == true && __LookupId == SystemValues.EVIL_VALUE // Create() through factory
                    || __Init == null && __LookupId==0 // Loaded via some deserialization mechamism, e.g., Json or CSV loader
               ;
       if (OK == false)
        throw new Exception("Object has not been instanciated via deserialization or the factory create() method.");

       if (__Init == null && __LookupId==0);  // object deserialized
        validateDeserialization();

       int lookupId = getFirstValidLookupBy();
       if (lookupId == SystemValues.EVIL_VALUE)
        throw new Exception("Object has not been intialized with sufficient data for any natural key to be available for a lookup.");

       if (updateFirst == true)
        {
          initForLookup(lookupId);
          if (write(C) == false)
           {
             initForCreate();
             return write(C);
           }
        }
       else
        {
          initForCreate();
          if (write(C) == false)
           {
             initForLookup(lookupId);
             return write(C);
           }
        }

       return true;
     }

   /**
   * Returns the first satisfied natural identify (i.e., unique indices), or if defined, the PK. by 'satisfied',
   * we mean an identity whose columns have all been provided (i.e., not null). We prioritize natural identities
   * over the PK since PKs are typically not stable across systems. For example, one might model a user with a PK
   * but also an identify over an email address for example. That email address for a given logical user should be
   * constant across multiple environments (e.g., a dev, staging or prod), where as a PK might be generated based
   * on dynamic factors that are very likely to be different across systems.
   */
   protected int getFirstValidLookupBy() throws Exception
     {

       // Testing if primary key has been set - Id: 0
       if (_formRefnum != null)
        return 0;

       return SystemValues.EVIL_VALUE;
     }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// THIS CODE IS GENERATED AND **MUST NOT** BE MODIFIED
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   public final boolean refresh(Connection C) throws Exception
     {
       return readOne(C, true);
     }

   public final boolean read(Connection C) throws Exception
     {
       return readOne(C, false);
     }

   private final boolean readOne(Connection C, boolean Force) throws Exception
     {
       long T0 = System.nanoTime();
       if (__Init == InitMode.CREATE)
        throw new Exception("This TILDATUTORIAL.Test_XYZ_Realized object is being read() after a create(), which doesn't make sense.");
       if (__Init == InitMode.READ == true && Force == false && hasChanged()==false)
        {
          LOG.debug(QueryDetails._LOGGING_HEADER + "This TILDATUTORIAL.Test_XYZ_Realized object has already been read.");
          QueryDetails.setLastQuery(TILDA__TEST_XYZ_REALIZED_Factory.SCHEMA_TABLENAME_LABEL, "");
          return true;
        }
       StringBuilder S = new StringBuilder(1024);
          S.append("select ");
          S.append(" "); C.getFullColumnVar(S, "TILDATUTORIAL", "Test_XYZ_Realized", "formRefnum");
          S.append(", "); C.getFullColumnVar(S, "TILDATUTORIAL", "Test_XYZ_Realized", "formType");
          S.append(", "); C.getFullColumnVar(S, "TILDATUTORIAL", "Test_XYZ_Realized", "formFillDateTZ");
          S.append(", "); C.getFullColumnVar(S, "TILDATUTORIAL", "Test_XYZ_Realized", "formFillDate");
          S.append(", "); C.getFullColumnVar(S, "TILDATUTORIAL", "Test_XYZ_Realized", "formUserRefnum");
          S.append(", "); C.getFullColumnVar(S, "TILDATUTORIAL", "Test_XYZ_Realized", "formUserEmail");
          S.append(", "); C.getFullColumnVar(S, "TILDATUTORIAL", "Test_XYZ_Realized", "countCorrect");
          S.append(", "); C.getFullColumnVar(S, "TILDATUTORIAL", "Test_XYZ_Realized", "countIncorrect");
          S.append(", "); C.getFullColumnVar(S, "TILDATUTORIAL", "Test_XYZ_Realized", "timeMillisTotal");
          S.append(", "); C.getFullColumnVar(S, "TILDATUTORIAL", "Test_XYZ_Realized", "timeMillisAvg");
          S.append(", "); C.getFullColumnVar(S, "TILDATUTORIAL", "Test_XYZ_Realized", "timeMillisMin");
          S.append(", "); C.getFullColumnVar(S, "TILDATUTORIAL", "Test_XYZ_Realized", "QX_correct");
          S.append(", "); C.getFullColumnVar(S, "TILDATUTORIAL", "Test_XYZ_Realized", "QX_timeMillis");
          S.append(", "); C.getFullColumnVar(S, "TILDATUTORIAL", "Test_XYZ_Realized", "QY_correct");
          S.append(", "); C.getFullColumnVar(S, "TILDATUTORIAL", "Test_XYZ_Realized", "QY_timeMillis");
          S.append(", "); C.getFullColumnVar(S, "TILDATUTORIAL", "Test_XYZ_Realized", "QZ_correct");
          S.append(", "); C.getFullColumnVar(S, "TILDATUTORIAL", "Test_XYZ_Realized", "QZ_timeMillis");
          S.append(" from "); C.getFullTableVar(S, "TILDATUTORIAL", "Test_XYZ_Realized");
       switch (__LookupId)
        {
          case 0:
             S.append(" where ("); C.getFullColumnVar(S, "TILDATUTORIAL", "Test_XYZ_Realized", "formRefnum"); S.append("=?)");
             break;
          case -77: 
          case -666: if (__Init == InitMode.CREATE) break;
          default: throw new Exception("Invalid LookupId "+__LookupId+" found. Cannot create where clause.");
        }

       String Q = S.toString();
       S.setLength(0);
       S = null;
       QueryDetails.setLastQuery(TILDA__TEST_XYZ_REALIZED_Factory.SCHEMA_TABLENAME_LABEL, Q);
       QueryDetails.logQuery("TILDATUTORIAL.Test_XYZ_Realized", Q, toString());
       java.sql.PreparedStatement PS=null;
       java.sql.ResultSet RS=null;
       int count = 0;

       try
        {
          PS = C.prepareStatement(Q);
          int i = 0;
          switch (__LookupId)
           {
             case 0:
               PS.setLong      (++i, _formRefnum     );
               break;
             case -666: if (__Init == InitMode.CREATE) break;
             default: throw new Exception("Invalid LookupId "+__LookupId+" found. Cannot prepare statement.");
           }


          RS = PS.executeQuery();
          if (RS.next() == false)
            {
              LOG.debug(QueryDetails._LOGGING_HEADER + "   No record was read.");
              return false;
            }
          count = 1;
          return init(C, RS);
        }
       catch (java.sql.SQLException E)
        {
          return C.handleCatch(E, "selected");
        }
       finally
        {
          tilda.tutorial.data._Tilda.TILDA__1_0.handleFinally(PS, T0, TILDA__TEST_XYZ_REALIZED_Factory.SCHEMA_TABLENAME_LABEL, StatementType.SELECT, count, null);
          PS = null;
        }
    }

   boolean init(Connection C, java.sql.ResultSet RS) throws Exception
    {
      int i = 0;
     __Init = InitMode.LOOKUP;
      __Saved_formRefnum      = _formRefnum      =                              RS.getLong      (++i) ;  if (RS.wasNull() == true) __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMREFNUM._Mask     );
                                _formType        = TextUtil.trim               (RS.getString    (++i)) ;  if (RS.wasNull() == true) __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMTYPE._Mask       );
                                _formFillDateTZ  = TextUtil.trim               (RS.getString    (++i)) ;  if (RS.wasNull() == true) __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATETZ._Mask );
                                _formFillDate    = processZDT(_formFillDateTZ   , "tilda.tutorial.data.TILDATUTORIAL.Test_XYZ_Realized.formFillDate"   , RS, ++i, TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE   , TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATETZ   ); if (RS.wasNull() == true) __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE._Mask   );
                                _formUserRefnum  =                              RS.getLong      (++i) ;  if (RS.wasNull() == true) __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSERREFNUM._Mask );
                                _formUserEmail   = TextUtil.trim               (RS.getString    (++i)) ;  if (RS.wasNull() == true) __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSEREMAIL._Mask  );
                                _countCorrect    =                              RS.getLong      (++i) ;  if (RS.wasNull() == true) __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTCORRECT._Mask   );
                                _countIncorrect  =                              RS.getLong      (++i) ;  if (RS.wasNull() == true) __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTINCORRECT._Mask );
                                _timeMillisTotal =                              RS.getLong      (++i) ;  if (RS.wasNull() == true) __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISTOTAL._Mask);
                                _timeMillisAvg   =                              RS.getDouble    (++i) ;  if (RS.wasNull() == true) __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISAVG._Mask  );
                                _timeMillisMin   =                              RS.getInt       (++i) ;  if (RS.wasNull() == true) __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISMIN._Mask  );
                                _QX_correct      =                              RS.getBoolean   (++i) ;  if (RS.wasNull() == true) __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_CORRECT._Mask     );
                                _QX_timeMillis   =                              RS.getInt       (++i) ;  if (RS.wasNull() == true) __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_TIMEMILLIS._Mask  );
                                _QY_correct      =                              RS.getBoolean   (++i) ;  if (RS.wasNull() == true) __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_CORRECT._Mask     );
                                _QY_timeMillis   =                              RS.getInt       (++i) ;  if (RS.wasNull() == true) __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_TIMEMILLIS._Mask  );
                                _QZ_correct      =                              RS.getBoolean   (++i) ;  if (RS.wasNull() == true) __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_CORRECT._Mask     );
                                _QZ_timeMillis   =                              RS.getInt       (++i) ;  if (RS.wasNull() == true) __Nulls.or(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_TIMEMILLIS._Mask  );
     __LookupId = 0;
     __Init     = InitMode.READ;
     __Changes.clear();

     return afterRead(C);
   }

  private final ZonedDateTime processZDT(String TimezoneId, String DTFieldName, java.sql.ResultSet RS, int ColumnPos, tilda.types.ColumnDefinition DTField, tilda.types.ColumnDefinition TZField)
  throws Exception
   {
     tilda.data.ZoneInfo_Data ZI = tilda.data.ZoneInfo_Factory.getEnumerationById(TimezoneId);
     if (ZI == null && TextUtil.isNullOrEmpty(TimezoneId) == false)
      throw new Exception("Cannot set field '"+DTFieldName+"' because the timezone Id '" + TimezoneId + "' is unknown. Make sure it is mapped properly in the ZoneInfo table.");
     ZonedDateTime ZDT = DateTimeUtil.toZonedDateTime(RS.getTimestamp(ColumnPos, DateTimeUtil._UTC_CALENDAR), ZI == null ? "null" : ZI.getValue());
     boolean DTNull = false;
     if (RS.wasNull() == true)
      {
         __Nulls.or(DTField._Mask);
         DTNull = true;
      }
     boolean TZNull = __Nulls.intersects(TZField._Mask);
     if (DTNull == false && TZNull == true)
      throw new Exception("The field "+DTFieldName+" is not null while its associated timezone field '"+DTFieldName+"TZ' is null. A TZ is mandatory for not null timestamps.");
     return ZDT;
   }

   protected abstract boolean afterRead(Connection C) throws Exception;

   public String toString()
    {
      long T0 = System.nanoTime();
      String Str = 
                   "formRefnum: "                                                                                                         +                                   getFormRefnum     () 
               + "; formType"          + (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMTYPE._Mask) == true ? ": NULL" : ": " + TextUtil.printVariableStr        (getFormType       ()))
               + "; formFillDate"      + (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMFILLDATE._Mask) == true ? ": NULL" : ": " + DateTimeUtil.printDateTimeForJSON(getFormFillDate   ()))
               + "; formUserRefnum"    + (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSERREFNUM._Mask) == true ? ": NULL" : ": " +                                   getFormUserRefnum () )
               + "; formUserEmail"     + (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.FORMUSEREMAIL._Mask) == true ? ": NULL" : ": " + TextUtil.printVariableStr        (getFormUserEmail  ()))
               + "; countCorrect"      + (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTCORRECT._Mask) == true ? ": NULL" : ": " +                                   getCountCorrect   () )
               + "; countIncorrect"    + (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.COUNTINCORRECT._Mask) == true ? ": NULL" : ": " +                                   getCountIncorrect () )
               + "; timeMillisTotal"   + (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISTOTAL._Mask) == true ? ": NULL" : ": " +                                   getTimeMillisTotal() )
               + "; timeMillisAvg"     + (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISAVG._Mask) == true ? ": NULL" : ": " +                                   getTimeMillisAvg  () )
               + "; timeMillisMin"     + (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.TIMEMILLISMIN._Mask) == true ? ": NULL" : ": " +                                   getTimeMillisMin  () )
               + "; QX_correct"        + (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_CORRECT._Mask) == true ? ": NULL" : ": " +                                   getQX_correct     () )
               + "; QX_timeMillis"     + (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QX_TIMEMILLIS._Mask) == true ? ": NULL" : ": " +                                   getQX_timeMillis  () )
               + "; QY_correct"        + (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_CORRECT._Mask) == true ? ": NULL" : ": " +                                   getQY_correct     () )
               + "; QY_timeMillis"     + (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QY_TIMEMILLIS._Mask) == true ? ": NULL" : ": " +                                   getQY_timeMillis  () )
               + "; QZ_correct"        + (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_CORRECT._Mask) == true ? ": NULL" : ": " +                                   getQZ_correct     () )
               + "; QZ_timeMillis"     + (__Nulls.intersects(TILDA__TEST_XYZ_REALIZED_Factory.COLS.QZ_TIMEMILLIS._Mask) == true ? ": NULL" : ": " +                                   getQZ_timeMillis  () )
         + ";";
      PerfTracker.add(TransactionType.TILDA_TOSTRING, System.nanoTime() - T0);
      return Str;
    }

 }
