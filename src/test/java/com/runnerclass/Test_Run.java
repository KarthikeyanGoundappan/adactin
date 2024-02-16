 package com.runnerclass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src//test//java//com//adactfeature", glue="com.stepdefinition", 
plugin= {"pretty", "html:Report/Cucumber_Report", "json:Report/Cucumber.json"
		 })


public class Test_Run extends Baseclass {
	public static WebDriver driver ;
	
 @BeforeClass 
 public static void Setup() {
	
	 browserlaunch ("chrome");

 }
 
@AfterClass
 public static void setdown () {
	 quitbrowser();
//	 driver.close();
	 
 }


}
