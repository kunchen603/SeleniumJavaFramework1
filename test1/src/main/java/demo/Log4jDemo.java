package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		
		System.out.println("\n Hello world.....!\n");
		logger.trace("This is a trace message");
		logger.info("this is info message");
		logger.error("this is an errir message");
		logger.warn("this is a warning message");
		logger.fatal("this is a fatal message");
		System.out.println("\n Completed");
		
	}

}
