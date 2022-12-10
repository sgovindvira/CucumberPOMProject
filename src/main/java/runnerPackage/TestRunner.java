package runnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="C:\\QA2022\\Selenium_Workspace\\CucumberPOMProject\\src\\main\\java\\feaures\\feature.feature",
			glue= {"stepDefinitions"},
			monochrome = true,
			plugin = { "pretty", "html:target/cucumber-reports" , "junit:junit_xml/cucumber.xml"},
			strict =true,
			dryRun = false
			
			
			
			
			
			
			
			
			
			)
	public class TestRunner {
	
	
	
	
	

}
