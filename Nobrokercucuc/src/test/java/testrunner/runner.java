package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\shiva\\OneDrive\\Desktop\\Nobrokercucuc\\Features",
glue="stepdefenitions",monochrome=true,dryRun=false,plugin= {"pretty","html:report/report.html"})


public class runner {
	
	
	
	
	

}
