package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures/registration.feature"},
		glue = {"stepDefinitions"},
		//tags = "@Smoke or @Regression",
		plugin = {"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml"},
		monochrome = false,
		dryRun=false
		//strict=false
				//publish = true
		)

public class UserRegTest {

}
