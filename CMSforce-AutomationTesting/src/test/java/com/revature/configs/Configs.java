package com.revature.configs;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revature.pages.ContentCreationPage;
import com.revature.pages.ModuleCreationPage;
import com.revature.pages.SearchPage;

@Configuration
public class Configs {

	@Bean
	public WebDriver CMSforceDriver() {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}
	
	@Bean
	public SearchPage searchPage() {
		return new SearchPage(CMSforceDriver());
	}
	
	@Bean
	public ModuleCreationPage modulePage() {
		return new ModuleCreationPage(CMSforceDriver());
	}
	
	@Bean
	public ContentCreationPage contentPage() {
		return new ContentCreationPage(CMSforceDriver());
	}
	
	@Bean
	public Actions actions(){
		return new Actions(CMSforceDriver());
	}
	
	@Bean
	public WebDriverWait webDriverWait() {
		return new WebDriverWait(CMSforceDriver(), 10);
	}
}
