package com.Project.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src/test/resources/features/", //specify which feature file to run
					//in our case we do say to run all features inside features package
		glue="com/Project/steps", //where we can find implementation code for gherkin steps?
		dryRun=true,
		monochrome=true
		,strict=true
		,tags="@inProgress"
		,plugin= {
				"pretty",
				"html:target/cucumber-default-report",//create basic html report in specified location
				"json:target/cucumber.json"
		}
		
		
		)
public class AddEmployeeWorkExperienceRunner {

}
