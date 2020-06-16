package com.Project.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/",
glue="com/Project/steps",

		strict=true,
	//	dryRun=true,
		monochrome=true,
		tags="@story2",
		plugin= { "pretty",
				"html:target/cucumber-default-report",
				"json:target/cucumber.json"
		}
		)

public class TestRunner {

}
