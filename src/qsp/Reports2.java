package qsp;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class Reports2 
{   
//@Test
//public void console()
//{
//	BasicConfigurator.configure();
//	Logger log1 = Logger.getLogger(this.getClass().getName());
//	log1.warn("tc warning");
//	log1.error("error in tc");
//	log1.info("tc info");
//}

	@Test
	public void folder() throws IOException
	{
		Layout lay=new PatternLayout("%d %c %m %n");
		Appender append=new FileAppender(lay,"./Reports/r2.log");
		BasicConfigurator.configure(append);
		Logger log1=Logger.getLogger(this.getClass().getName());
		log1.warn("tc warning");
    	log1.error("error in tc");
 		log1.info("tc info");
	}






}
