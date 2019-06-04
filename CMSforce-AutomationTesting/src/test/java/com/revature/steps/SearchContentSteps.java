package com.revature.steps;

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
	@Qualifier("CMSforceDriver")
	WebDriver driver;
	
	@Autowired
	SearchPage search;
	
	@Given("^The user is on the search content page$")
	public void the_user_is_on_the_search_content_page() throws Throwable {
		Assert.assertEquals("https://en.wikipedia.org/wiki/Main_Page", driver.getCurrentUrl());
	}

	@When("^The user clicks on the search button$")
	public void the_user_clicks_on_the_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^All contents from the database should be returned$")
	public void all_contents_from_the_database_should_be_returned() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
