package com.revature.steps;

import org.junit.AfterClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.pages.ModuleCreationPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ModuleCreationSteps {

	@Autowired
	WebDriverWait wait;
	
	@Autowired
	WebDriver driver;
	
	@Autowired
	ModuleCreationPage createModule;
	
	@Given("^The user is on the CMSforce module-creator page$")
	public void the_user_is_on_the_CMSforce_module_creator_page() throws Throwable {
		driver.get("http://cmsforceangular.s3-website.us-east-2.amazonaws.com/module-creator");
	}

	@When("^The user enters a string for the module$")
	public void the_user_enters_a_string_for_the_module() throws Throwable {
	    createModule.textBox.sendKeys(randomAlphaNumeric());
	}

	@When("^The user clicks on submit module$")
	public void the_user_clicks_on_submit_module() throws Throwable {
	    createModule.submitButton.click();
	}

	@Then("^The success alert should display$")
	public void the_success_alert_should_display() throws Throwable {
	    wait.until(ExpectedConditions.alertIsPresent());
	    Alert alert = driver.switchTo().alert();
	    Assert.assertEquals("Successfully sent module.", alert.getText());
	    alert.accept();
	}

	@Then("^The error alert should display$")
	public void the_error_alert_should_display() throws Throwable {
		wait.until(ExpectedConditions.alertIsPresent());
	    Alert alert = driver.switchTo().alert();
	    Assert.assertEquals("Please fill in the input field!", alert.getText());	
	    alert.accept();
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	@When("^The user creates a monster hunter module$")
	public void the_user_creates_a_monster_hunter_module() throws Throwable {
	    createModule.textBox.sendKeys("Monster Hunter");
	}
	
	@When("^The user closes the alert$")
	public void the_user_closes_the_alert() throws Throwable {
		Thread.sleep(500);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Then("^The duplicate subject error allert should display$")
	public void the_duplicate_subject_error_allert_should_display() throws Throwable {
		Thread.sleep(500);
	    Alert alert = driver.switchTo().alert();
	    Assert.assertEquals("Failed to create subject. Subject may already exist.", alert.getText());
	    alert.accept();
	}
	
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private static String randomAlphaNumeric() {
	StringBuilder builder = new StringBuilder();
	int count = 20;
	while (count-- != 0) {
	int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
	builder.append(ALPHA_NUMERIC_STRING.charAt(character));
	}
	return builder.toString();
	}
	
	@AfterClass
	public void teardownmod() {
		driver.close();
	}
}
