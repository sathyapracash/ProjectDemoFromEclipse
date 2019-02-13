package testrunner1;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\s.prakash.seetha\\eclipse-workspace\\CucumberDemos\\src\\test"
	,glue= {"stepdefinitions1"
	})				
public class TestRunnerDemoLogin {

}
