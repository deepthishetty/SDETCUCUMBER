package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features="./Feature",
	glue= {"stepdef","stepdefinitions"},
	dryRun=false,
	monochrome=true,
	plugin= {"pretty","html:test-output","json:target/Report.json","junit:target/myreport.xml"},
	tags= {"@sanity"}
		)

public class TestRunner1 {
	
	

}
