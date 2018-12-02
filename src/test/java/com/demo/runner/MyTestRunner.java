package com.demo.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/Login.feature",
		glue="com/steps",
		//dryRun=true,
		monochrome=true,
		//tags={"@smoke,@regression"},   //OR condition
		tags={"@smoke"}	//And condition
		)
public class MyTestRunner {

}
