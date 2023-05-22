//package com.MyConnect.Automation;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class VerifyResistration {
//	
//	
//
//	public static void main(String[] args) {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://myaccount.tinggit.com/login?callback=https://myconnectv1.tinggit.com/");
//		
//		driver.manage().window().maximize();
//		
///*		 verifying Resistration page with 
//		1. valid username & valid password = pass
//		2. valid username & inValid password = pass
//		3.invalid username & valid password = pass
//		4.invalid username & invalid password = pass
//*/	
//		ResistrationPage resistrationPage = new ResistrationPage (driver);
//		
//		resistrationPage.sendUserName();
//		resistrationPage.sendPassword();
//		resistrationPage.clickLoginButton();
//		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver1 = new ChromeDriver();
//		driver1.get("https://myconnectv1.tinggit.com/");
//		
//
//		WebElement postInput = driver1.findElement(By.id("post-input"));
//		postInput.sendKeys("https://myconnectv1.tinggit.com/");
//		
//		
//
//		WebElement submitButton = driver1.findElement(By.id("submit-button"));
//		submitButton.click();
//
//		WebDriverWait wait = new WebDriverWait(driver1, 10);
//		wait.until(ExpectedConditions.urlToBe("https://myconnectv1.tinggit.com/"));
//
//		driver1.quit();
//		
//		WebDriver driver11 = new ChromeDriver();
//		driver11.get("https://www.example.com");
//		WebElement post = driver.findElement(By.xpath("//*[(text(),'pt-3 descriptionColor fs-15')]"));
//		post.click();
//		WebElement date = driver.findElement(By.xpath("//*['span[@class='searchIcon-smart-search postIcon left125']']"));
//		
//		String postDate = date.getText();
//		assertEquals("February 24, 2023", postDate);
//		assertTrue(post.isDisplayed());
//		
//		
//
//  
//		
//		
//	
//		
//	}
//
//	private static void assertTrue(boolean displayed) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void assertEquals(String string, String postDate) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
