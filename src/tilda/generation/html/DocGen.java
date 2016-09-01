package tilda.generation.html;

import java.io.File;
import java.io.PrintWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import tilda.generation.GeneratorSession;
import tilda.generation.graphviz.GraphvizUtil;
import tilda.parsing.parts.Object;
import tilda.parsing.parts.Schema;
import tilda.utils.FileUtil;

public class DocGen {
    protected static final Logger     LOG          = LogManager.getLogger("Hello");
    DocumentBuilderFactory            factory      = DocumentBuilderFactory.newInstance();
    DocumentBuilder                   builder;
    Schema                            schema;

    GeneratorSession                  G;
    public DocGen(Schema schema, GeneratorSession G)
      {
        this.schema = schema;
        try
          {
            this.builder = factory.newDocumentBuilder();
          }
        catch (ParserConfigurationException e)
          {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        this.G = G;
      }
    public static String getBaseResFileName(Schema S, String Extension)
    {
      return S._ProjectRoot + File.separator + S._Package.replace(".", File.separator) + File.separator + "_Tilda" + File.separator + "TILDA___Docs."+S._Name + Extension;
    }
    
    public static String getSchemaChromeAppGenHTML(Schema S, String Extension)
    {
        return S._ProjectRoot + File.separator + S._Package.replace(".", File.separator) + File.separator + "_tilda."+S._Name + Extension;
    }
    
    public static String getSVGCSSPath(Schema S){
    	return S._ProjectRoot + File.separator + ".." + File.separator + "";
    }
    
    private void writeHTML()    throws Exception
      {
        String base64FileName =  getSchemaChromeAppGenHTML(schema, ".html");
        PrintWriter writer = new PrintWriter(getBaseResFileName(schema, ".html"));
        File f = new File(base64FileName);
        writer.println("<HTML>");
        writer.println("<BODY>");
        if(f.exists()){
            FileUtil.copyFileContentsIntoAnotherFile(base64FileName, writer);
        }

        for (Object b : schema._Objects)
        {
          try
            {
              writer.println("<BR><BR><BR><BR><HR>");
              Docs.DataClassDocs(writer, G, b);
            }
          catch (Exception e)
            {
              // TODO Auto-generated catch block
              LOG.warn("FYI: this can be ignored for now:\n", e);
            }
        }
        writer.println("<a href='#' style='cursor: pointer;z-index: 10000; position:fixed; right:0px; bottom:0; margin:0px; padding:0px;'>Goto top</a>");
        writer.println("</BODY>");
        writer.println("</HTML>");
        writer.close();
      }
    public void writeSchema()
    {
        File file = new File(getSchemaChromeAppGenHTML(schema, ".html"));
        if(!file.exists()){
        	new GraphvizUtil(this.schema, G).writeSchema();
        }
        else {
            try
	            {
	              writeHTML();
	            }
			catch (Exception e)
			   {
			     e.printStackTrace();
			   }
        	
        }
    }

}
