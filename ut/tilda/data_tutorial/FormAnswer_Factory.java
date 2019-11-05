/*
 Tilda V1.0 template application class.
*/

package tilda.data_tutorial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import tilda.db.*;

/**
This is the application class <B>Data_FormAnswer</B> mapped to the table <B>TILDATUTORIAL.FormAnswer</B>.
@see tilda.data_tutorial._Tilda.TILDA__FORMANSWER
*/
public class FormAnswer_Factory extends tilda.data_tutorial._Tilda.TILDA__FORMANSWER_Factory
 {
   protected static final Logger LOG = LogManager.getLogger(FormAnswer_Factory.class.getName());

   protected FormAnswer_Factory() { }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//   Implement your customizations, if any, below.
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


   public static void init(Connection C) throws Exception
    {
      // Add logic to initialize your object, for example, caching some values, or validating some things.
    }

 }
