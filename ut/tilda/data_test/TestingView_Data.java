/*
 Tilda V1.0 template application class.
*/

package tilda.data_test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import tilda.db.Connection;

/**
This is the application class <B>Data_TestingView</B> mapped to the table <B>TILDATEST.TestingView</B>.
@see tilda.data_test._Tilda.TILDA__TESTINGVIEW
*/
public class TestingView_Data extends tilda.data_test._Tilda.TILDA__TESTINGVIEW
 {
   protected static final Logger LOG = LogManager.getLogger(TestingView_Data.class.getName());

   public TestingView_Data() { }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Implement your customizations, if any, below.
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


   @Override
   protected boolean afterRead(Connection C) throws Exception
     {
       // Do things after an object has just been read form the data store, for example, take care of AUTO fields.
       return true;
     }

 }
