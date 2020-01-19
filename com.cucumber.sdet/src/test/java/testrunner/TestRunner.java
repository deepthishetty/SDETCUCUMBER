package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="C://Users//Deepthi//eclipse-workspace//com.cucumber.sdet//Feature//OrangeHRM.feature",
		glue="stepdefinitions")



public class TestRunner {

}
