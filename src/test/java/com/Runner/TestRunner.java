package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Base_Class.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features= "src\\test\\java\\com\\featurefile\\file.feature" , 
			 	  glue= "com.StepDefinition" ,
			 	 // dryRun = true,
			 	  plugin = {"html:Reports/file.html" , "pretty", "json:target/cucumber.json"} )
public class TestRunner {

	@BeforeClass
	public static void open() {
		BaseClass.browser_Launch("chrome");
	}
	
	@AfterClass
	public static void close() {
		BaseClass.terminateBrowser();
	}
	
}
