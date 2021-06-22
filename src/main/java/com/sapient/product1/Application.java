package com.sapient.product1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
	static final Logger logger = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		//System.out.println("Hello Maven");
		logger.trace("trace message");
		logger.debug("This is a debug message");
		logger.info("This is a info message");
		logger.warn("This is a warning message");
		logger.error("This is a error message");
	}
}
