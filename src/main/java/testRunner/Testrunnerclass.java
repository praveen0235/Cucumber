package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\WorkSpace\\cucumber\\src\\main\\java\\feature\\config.feature",
glue= {"stepDefinition"},
dryRun = false,format = {"pretty","html:target/cucumber"},monochrome = true)

public class Testrunnerclass {

}
