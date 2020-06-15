package com.Project.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src/test/resources/features/", //specify which feature file to run
					//in our case we do say to run all features inside features package
		glue="com/Project/steps", //where we can find implementation code for gherkin steps?
		
		monochrome = true
		
		,plugin= {
				"pretty",//prints gherkin steps in console
				"html:target/cucumber-default-report",//create basic html report in specified location
				
				
		}
		)

public class FailedRunner {

}
