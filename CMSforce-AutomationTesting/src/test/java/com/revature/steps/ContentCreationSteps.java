package com.revature.steps;

import org.junit.AfterClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.pages.ContentCreationPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ContentCreationSteps {
	
	@Autowired
	WebDriverWait wait;
	
	@Autowired
	Actions actions;
	
	@Autowired
	WebDriver driver;
	
	@Autowired
	ContentCreationPage createContent;

	@Given("^The user is on the CMSforce home/create page$")
	public void the_user_is_on_the_CMSforce_home_create_page() throws Throwable {
		driver.get("http://cmsforceangular.s3-website.us-east-2.amazonaws.com/content-creator");
	}

	@When("^The user enters a title$")
	public void the_user_enters_a_title() throws Throwable {
		createContent.titleTextBox.sendKeys("Dougie Dance");
	}

	@When("^The user enters a URL$")
	public void the_user_enters_a_URL() throws Throwable {
	  createContent.urlTextBox.sendKeys("https://www.youtube.com/watch?v=ngFWbCJJVcI");
	}

	@When("^The user enters subjects$")
	public void the_user_enters_subjects() throws Throwable {
	   createContent.subjectDropDown.click();
	   actions.sendKeys("Angular");
	   actions.perform();
	   actions.sendKeys(Keys.ENTER);
	   actions.perform();
	}
	

	@When("^The user enters a description$")
	public void the_user_enters_a_description() throws Throwable {
	    createContent.descriptionTextBox.sendKeys("Teach Me How To Dougie");
	}

	@When("^The user selects a format$")
	public void the_user_selects_a_format() throws Throwable {
	   createContent.codeRadioButton.click();
	}

	@When("^The user clicks on submit content$")
	public void the_user_clicks_on_submit_content() throws Throwable {
		createContent.submitButton.click();
	}

	@Then("^The successful creation alert should display$")
	public void the_successful_creation_alert_should_display() throws Throwable {
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals("Successfully sent content.", alert.getText());
		alert.accept();
	}

	@Then("^The error creating alert should display$")
	public void the_error_creating_alert_should_display() throws Throwable {
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals("Please fill in all input fields!", alert.getText());
		alert.accept();
	}

	@AfterClass
	public void teardown() {
		driver.close();
	}
}
