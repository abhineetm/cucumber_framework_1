package com.demo.runner;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/Login.feature",
		glue="com/steps",
		//dryRun=true,
		monochrome=true,
		//tags={"@smoke,@regression"},   //OR condition
		tags={"@smoke","@regression"},	//And condition
		//plugin = {"pretty","html:output/Report"}
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
		)
public class MyTestRunner {
	@AfterClass
    public static void teardown() {
        Reporter.loadXMLConfig(new File("src/test/resources/conf/extent-config.xml"));
       
    }

}
