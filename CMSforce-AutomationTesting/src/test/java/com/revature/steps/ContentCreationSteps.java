package com.revature.steps;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.pages.ContentCreationPage;

public class ContentCreationSteps {
	
	@Autowired
	WebDriver driver;
	
	@Autowired
	ContentCreationPage createContent;

}
