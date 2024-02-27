package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={".//Feature files"},

	glue= {"StepDefinition"},plugin= {"pretty","html:cucumber_reports/index.html",

											"rerun:target/rerun.txt",

											"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},


 
    dryRun = false,
    monochrome = false,
    publish = true

 )
public class TestRunner {

}
