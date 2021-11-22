package runnerPack;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features= ".//features//",
		glue= "stepDefinitions",
		dryRun=false
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}