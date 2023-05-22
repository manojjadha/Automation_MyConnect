package com.MyConnect.Automation.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MyConnect.Automation.LoadBrowser;

public class Runner {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		LoadBrowser browser = new LoadBrowser();
		driver = browser.loadBrowser("chrome");
		driver.get("");
	}
	
	@Test
	public void SC001() {
		
	}
	
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
