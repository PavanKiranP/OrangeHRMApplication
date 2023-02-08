package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="OrangeHRMApplication",//folder name of the feature file
					glue="stepDefinitions",//connects the featureFile with methods class
					monochrome=true,	//Remove the junk values in the Console
					//dryRun = true	   //without executing the steps of the FeatureFile-it creates methods for the newly added Scenarios-
									  //without executing the scenarios of the FeatureFile
					//tags="@Smoke"
					//tags= "@Sanity"
					//tags="@LogInFunctionalitywithSingleTestData"
					//tags="@LogInFunctionalitywithMultipleTestData"
					//tags={"@Smoke,@Sanity,@LogInFunctionalitywithSingleTestData,@LogInFunctionalitywithMultipleTestData"}
					
					plugin= {"pretty","html:target/OrangeHRMApplicationReports",
							"json:target/OrangeHRMApplicationJsonReport.json",
					 		"com.cucumber.listener.ExtentCucumberFormatter:target/"+"OrangeHRMApplicationExtentReports.htm"
					}
		)

public class TestRunner {

}