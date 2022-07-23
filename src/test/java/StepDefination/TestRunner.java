package StepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@SuppressWarnings("unused")
@CucumberOptions(
		features = "src/test/java/Features",
		glue = "StepDefination")


public class TestRunner extends AbstractTestNGCucumberTests {

	
}
