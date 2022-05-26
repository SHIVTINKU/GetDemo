package cucumber.Options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		 features="C:\\Users\\shiva\\OneDrive\\Desktop\\RestAssuredApiAutomation\\src\\test\\java\\features\\PlaceValidation.feature",
		 
		 glue="stepDefinations",
		 
		 dryRun=true,
		 
		 plugin="json:target/jsonReports/cucumber-report.json"
		 
	
		 
		
		
		)
public class TestRunner {

}
