package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@SpringBootApplication
public class RestserviceApplication {
	private static Logger logger = LogManager.getLogger(RestserviceApplication.class.getName());
	public static void main(String[] args) {
		SpringApplication.run(RestserviceApplication.class, args);
		logger.debug("Debug log message");
		logger.info("Info log message");
		logger.error("Error log message");
	}


}
