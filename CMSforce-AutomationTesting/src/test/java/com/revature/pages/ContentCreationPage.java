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
	
	public final WebDriver driver;

	public ContentCreationPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="titleTextBox")
	public WebElement titleTextBox;
	
	@FindBy(id="urlTextBox")
	public WebElement urlTextBox;
	
	@FindBy(id="subjectDropDown")
	public WebElement subjectDropDown;
	
	@FindBy(name="description")
	public WebElement descriptionTextBox;
	
	@FindBy(id="CodeRadioButton")
	public WebElement codeRadioButton;
	
	@FindBy(id="DocumentRadioButton")
	public WebElement documentRadioButton;
	
	@FindBy(id="submitButton")
	public WebElement submitButton;

}
