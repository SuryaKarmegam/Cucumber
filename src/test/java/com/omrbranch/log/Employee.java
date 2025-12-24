package com.omrbranch.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Employee {

	static Logger logger=LogManager.getLogger(Employee.class);
	
	public static void main(String[] args) {
		System.out.println("Java");
		System.out.println("Python");
		System.out.println("C");
		System.out.println("C++");
		System.out.println("Java");
		System.out.println("JavaScript");
		System.out.println("Ruby");
		System.out.println("C++");
		System.out.println("Appium");
		System.out.println("Selenium");
		System.out.println("SQL");
		System.out.println("Jenkins");
		System.out.println("Git");
		
		logger.info("Start");
		logger.info("Browser Launch");
		logger.warn("Enter url");
		logger.error("End");
		
	}
}
