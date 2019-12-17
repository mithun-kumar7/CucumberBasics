package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/features"},
	glue={"steps"},	
	monochrome=true,
	tags={"@sanity, @prod"},
	plugin = {"pretty","html:target/cucumber"})
public class RunCuke{

	
	
    	    }
	
	

