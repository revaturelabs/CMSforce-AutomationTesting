package com.revature.configs;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revature.pages.SearchPage;

@Configuration
public class Configs {

	@Bean
	public WebDriver CMSforceDriver() {
		File file = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		ChromeDriver driver = new ChromeDriver();		
		return driver;
	}
	
	@Bean
	public SearchPage searchPage() {
		return new SearchPage(CMSforceDriver());
	}
}
