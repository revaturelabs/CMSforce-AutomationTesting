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
	
	@FindBy(id="submitbutton")
	public WebElement submit;
	
	@FindBy(name="title")
	public WebElement title;
	
	@FindBy(className="btn-radio")
	public WebElement radio;
	
	@FindBy(xpath="/html/body/app-root/app-content-finder-page/div[1]/div/form/div[1]/div[3]/div/div[1]")
	public WebElement code;
	
	@FindBy(xpath="/html/body/app-root/app-content-finder-page/div[1]/div/form/div[1]/div[3]/div/div[2]")
	public WebElement doc;
	
	@FindBy(xpath="/html/body/app-root/app-content-finder-page/div[1]/div/form/div[1]/div[3]/div/div[3]")
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
