package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModuleCreationPage {
	
	public final WebDriver driver;
	
	public ModuleCreationPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="submitButton")
	public WebElement submitButton;
	
	@FindBy(id="inputText")
	public WebElement textBox;
	
}
