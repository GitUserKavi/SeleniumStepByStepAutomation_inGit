package log4jExamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class BasicConfigurator_Example {

	static Logger logger = Logger.getLogger(BasicConfigurator_Example.class);//Factory design pattern
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicConfigurator.configure(); // Basic Configurator should not be used in PRODUCTION environment
		logger.debug("This is a debug message");
		logger.info("This is a info");
		logger.warn("This is a warning");
		logger.error("This is a Error");
		logger.fatal("This is a fatel");
		
		
	}

}
