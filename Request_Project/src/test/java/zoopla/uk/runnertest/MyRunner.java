package zoopla.uk.runnertest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		plugin= {"pretty","json:target/cucumber.json" },		 // Generate report    xml/json
        features = ".//Features/",  // feature = feature folder location 
        glue = {"zoopla.uk.stepdefinitiontest","zoopla.uk.hookstest"}, // glue = step-definitions location
        dryRun = false,  // 
        monochrome = true, // help of  monochrome = true, i can read the file more easy way 
        tags = "@Sanity ")   // help with the tag i can execute as per my require test cases 

	public class MyRunner extends AbstractTestNGCucumberTests {


	}

