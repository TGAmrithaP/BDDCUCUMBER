package MyRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features="../BDDCU/src/test/java/Feature/LoginFeature.feature",
dryRun= false,   //Only if we want to get Only Snippet without running whole program than put as true 
glue = {"StepDefinitions"}, // its represent the package name in step definitions
monochrome = true,  //Display the console output in proper readable format
plugin = { "pretty",  "html:Reports/cucumber-pretty" }

//tags = {"@SmokeTest"}
// tags = {"@SmokeTest" , "@End2End"} => AND
// tags = {"@SmokeTest, @End2End"} => OR




		)


public class Runner extends AbstractTestNGCucumberTests
{

}
