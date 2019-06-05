package com.revature.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
	WebDriver driver;
	
	@Autowired
	SearchPage search;

	@Given("^The user is on the CMSforce finder page$")
	public void the_user_is_on_the_CMSforce_finder_page() throws Throwable {
		driver.get("http://localhost:4200/finder");
	}
	
	@When("^The user clicks on the all radio button$")
	public void the_user_clicks_on_the_all_radio_button() throws Throwable {
	    search.all.click();
	}

	@When("^The user clicks on search button$")
	public void the_user_clicks_on_search_button() throws Throwable {
		search.submit.click();
	}


	@Then("^All contents from the database should be returned$")
	public void all_contents_from_the_database_should_be_returned() throws Throwable {
		Assert.assertTrue(driver.findElement(By.id("headerRow")) != null);
	}
}
