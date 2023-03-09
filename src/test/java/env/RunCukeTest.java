package env;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
			 "pretty", "html:target/cucumberHtmlReport",
		     "html:target/cucumberHtmlReport",     //  for html result
			 "pretty:target/cucumber-json-report.json"   // for json result
		     },
		features = "classpath:features",
		glue = {"info/seleniumcucumber/userStepDefintions"}
)

public class RunCukeTest { 	
}
