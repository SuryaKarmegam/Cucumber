package com.omrbranch.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void generateJVMReport(String jsonFile) {
		String projectName="OMR Login Page";
		File file=new File("C:\\Users\\Swetha\\eclipse-workspace\\CucumberClass\\target");
		Configuration configuration=new Configuration(file,projectName);
		configuration.addClassifications("os","WINDOW11");
		configuration.addClassifications("BrowserName","Chrome");
		configuration.addClassifications("Version","144");
		configuration.addClassifications("sprint","35");
		
		List<String> jsonFiles=new ArrayList<>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder=new ReportBuilder(jsonFiles,configuration);
		builder.generateReports();
		
	}
}
