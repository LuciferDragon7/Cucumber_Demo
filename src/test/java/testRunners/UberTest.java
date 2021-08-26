package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures/Uber.feature"},
		glue = {"stepDefinitions"},
		//tags = "@Prod and @Smoke",
		//tags = "not @Prod",
		tags = "@All",
		plugin = {"pretty"}
		)

public class UberTest {

}
