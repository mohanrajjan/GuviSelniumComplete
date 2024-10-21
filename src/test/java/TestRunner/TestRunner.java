package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="featurefile\\withBackground.feature",
		glue= {"StepDefinition"},
				plugin = {"pretty", "html:target/cucumber-reports/report.html", 
						"json:target/cucumber-reports/report2.json",
						"junit:target/cucumber-reports/report3.xml"},
		monochrome=true
		)
public class TestRunner {


}
