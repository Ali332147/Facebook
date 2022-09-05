package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
//This is mandatory for running test with different configuration
@CucumberOptions(
		
		features="src/test/java/features",
		glue = "step_definitions",//Since this is in same location you no need whole path, only package name
		tags="",//using all test but you can mention tag name to run specific test
		plugin = {"pretty", "html:target/cucumber-reports.html"}, //showing report nicely
		dryRun=false
		)     



public class TestRunner {

}
