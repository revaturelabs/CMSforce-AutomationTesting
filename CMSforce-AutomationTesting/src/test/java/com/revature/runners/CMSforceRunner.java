package com.revature.runners;


import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "com.revature.steps")
@SpringBootTest
@ContextConfiguration(classes = com.revature.CMSforceAutomationTesting.CMSforceTestingApplication.class)
public class CMSforceRunner {
	
	
}