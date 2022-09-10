package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
      (features = "src/test/java/features", 
      glue = "step_definitions",
      tags = "@signup",
      monochrome = true,
      plugin = {
		"pretty", "junit:target/JUnitReports/report.xml", "json:target/JSONReports/report.json",
		"html:target/cucumber-reports.html" },
      dryRun = false)

public class TestRunner {

}
