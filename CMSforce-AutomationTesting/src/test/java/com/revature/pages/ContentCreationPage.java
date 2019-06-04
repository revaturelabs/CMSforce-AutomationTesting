package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ContentCreationPage {
	
	@Autowired
	@Qualifier("CMSforceDriver")
	WebDriver driver;
	
	public ContentCreationPage() {
		super();
	}

//	public ContentCreationPage(WebDriver driver){
//		this.webdriver = driver;
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(id="js-link-box-en")
	public WebElement english;

	@FindBy(partialLinkText = "Deutsch")
	public WebElement german;
	
	@FindBy(css = "div[lang='es']")
	public WebElement spanish;
	
	@FindBy(xpath = "//*[@id=\"js-link-box-fr\"]/strong")
	public WebElement french;
	
	@FindBy(className = "pure-button-primary-progressive")
	public WebElement searchbtn;
	
	@FindBy(name="search")
	public WebElement searchbar;
}
