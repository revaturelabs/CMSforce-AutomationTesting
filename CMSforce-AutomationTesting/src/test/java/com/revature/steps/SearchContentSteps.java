package com.revature.steps;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.revature.pages.SearchPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class SearchContentSteps {
	
	@Autowired
	WebDriverWait wait;
	
	@Autowired
	Actions actions;
	
	@Autowired
	WebDriver driver;
	
	@Autowired
	SearchPage search;

	@Given("^The user is on the CMSforce finder page$")
	public void the_user_is_on_the_CMSforce_finder_page() throws Throwable {
		driver.get("http://cmsforceangular.s3-website.us-east-2.amazonaws.com/finder");
	}
	
	@When("^The user clicks on the all radio button$")
	public void the_user_clicks_on_the_all_radio_button() throws Throwable {
	    search.all.click();
	}

	@When("^The user clicks on search button$")
	public void the_user_clicks_on_search_button() throws Throwable {
		search.submit.click();
	}


	@Then("^Contents from the database should be returned$")
	public void all_contents_from_the_database_should_be_returned() throws Throwable {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ResultsTable")));
		Assert.assertTrue(driver.findElement(By.id("ResultsTable")) != null);
	}
	
	@When("^The user types a title into the search bar$")
	public void the_user_types_a_title_into_the_search_bar() throws Throwable {
	    search.title.sendKeys("CMS");
	}
	
	@When("^The user types a \"([^\"]*)\" into the search bar$")
	public void the_user_types_a_into_the_search_bar(String arg1) throws Throwable {
	    search.title.sendKeys(arg1);
	}

	@When("^The user clicks on the code radio button$")
	public void the_user_clicks_on_the_code_radio_button() throws Throwable {
	    search.code.click();
	}

	@When("^The user selects a list of modules$")
	public void the_user_selects_a_list_of_modules() throws Throwable {
	    
		search.subjectDropDown.click();
		actions.sendKeys("Angular");
		actions.perform();
		actions.sendKeys(Keys.ENTER);
		actions.perform();
	}

	
	@AfterClass
	public void teardown() {
		driver.close();
	}
}
