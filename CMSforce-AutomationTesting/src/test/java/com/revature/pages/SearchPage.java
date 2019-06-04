package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SearchPage {
	@Autowired
	@Qualifier("CMSforceDriver")
	WebDriver driver;

	public SearchPage() {
		super();
	}
//	public SearchPage(WebDriver driver){
//		this.webdriver = driver;
//		PageFactory.initElements(driver, this);
//	}
	@FindBy(id="submitbutton")
	public WebElement submit;
	
	@FindBy(name="title")
	public WebElement title;
	
	@FindBy(id="code")
	public WebElement code;
	
	@FindBy(id="document")
	public WebElement doc;
	
	@FindBy(id="all")
	public WebElement all;
	
	@FindBy(className = "table-responsive")
	public WebElement tableResults;
//	@FindBy(id="js-link-box-en")
//	public WebElement english;
//
//	@FindBy(partialLinkText = "Deutsch")
//	public WebElement german;
//	
//	@FindBy(css = "div[lang='es']")
//	public WebElement spanish;
//	
//	@FindBy(xpath = "//*[@id=\"js-link-box-fr\"]/strong")
//	public WebElement french;
//	
//	@FindBy(className = "pure-button-primary-progressive")
//	public WebElement searchbtn;
//	
//	@FindBy(name="search")
//	public WebElement searchbar;
}
