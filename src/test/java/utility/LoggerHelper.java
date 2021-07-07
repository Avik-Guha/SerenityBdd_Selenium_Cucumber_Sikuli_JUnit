package utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerHelper {
	
	public static Logger getLogger(Class<?> cls){
		
		PropertyConfigurator.configure("log4j.properties"); //this captures path of the log4j properties file
		return Logger.getLogger(cls);
	}

}
