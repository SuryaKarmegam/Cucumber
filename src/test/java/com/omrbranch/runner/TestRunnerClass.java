package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.omrbranch.report.Reporting;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags=("@Reg"),stepNotifications=false,snippets = SnippetType.CAMELCASE
,dryRun=false,publish=true,monochrome=true
,plugin= {"pretty","json:target\\output.json"}
,glue="com.omrbranch.stepdefinition"
,features="src\\test\\resources\\features")
public class TestRunnerClass {
	@AfterClass
	public static void afterClass() {
Reporting.generateJVMReport("C:\\Users\\Swetha\\eclipse-workspace\\CucumberClass\\target\\output.json");

}
}

//"json:target\\output.json"
//"html:target\\output.html"