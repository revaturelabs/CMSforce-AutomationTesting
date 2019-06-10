package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SearchPage {

	public final WebDriver driver;
	

	public SearchPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="submitButton")
	public WebElement submit;
	
	@FindBy(name="title")
	public WebElement title;
	
	@FindBy(className="btn-radio")
	public WebElement radio;
	
	@FindBy(id="CodeLabel")
	public WebElement code;
	
	@FindBy(id="DocumentLabel")
	public WebElement doc;
	
	@FindBy(id="AllLabel")
	public WebElement all;
	
	@FindBy(id = "ResultsTable")
	public WebElement tableResults;

	@FindBy(id="subjectDropDown")
	public WebElement subjectDropDown;
	
}
