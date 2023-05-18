package RegressionSuit;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.pageObjectModel.HomePage;


public class VerifyDisplayHpage {

		WebDriver driver;
		
		@BeforeClass
		public void launchBrowser(){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get("https://myconnect.tinggit.com/");
			HomePage homePage = new HomePage(driver);
			homePage.sendValidCredential();
			homePage.clickLoginButton();
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
			
		}
		
		@BeforeMethod 
		public void launchMyConnectTing() {
			
			
			System.out.println("hello");
		}
		
		@Test (priority = 1)
		public void verifyUpcomingEvents() throws InterruptedException {
		Thread.sleep(9000);
		WebElement redirect=driver.findElement(By.xpath("//div[@class='navbar-nav']//span[text()='Home']"));
		redirect.click();
		Thread.sleep(9000);
	    WebElement Knowmore = new WebDriverWait(driver, 40)
	   .until(ExpectedConditions.elementToBeClickable(By.xpath("//ul//li[1]//a[text()='Know more']")));
		Knowmore.click();
		Thread.sleep(9000);
		WebElement Back = new WebDriverWait(driver, 40)
	   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='py-1']")));
		Back.click();
		
					
		}
		
		
		@Test (priority = 2)
		public void verifyJobReferral() throws InterruptedException {
	    WebElement Refer=driver.findElement( By.xpath("//ul//li[1]//a[text()='Refer']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",Refer);
	    Thread.sleep(9000);
	    Actions actions= new Actions(driver);
	    actions.click(Refer).perform();
	    Thread.sleep(9000);
	    WebElement Back = new WebDriverWait(driver, 80)
	   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='py-1']")));
	    Back.click();
						
		     }
		
		@Test (priority = 3)
		public void verifyNewJoinerssection() throws InterruptedException {
		WebElement viewprofile=driver.findElement( By.xpath("//div[@class=\"row ms-md-2 my-md-4 d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block\"][1]//ul//li[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",viewprofile);
		Thread.sleep(9000);
	    Actions actions= new Actions(driver);
	    actions.click(viewprofile).perform();
	    Thread.sleep(9000);
	    WebElement Back = new WebDriverWait(driver, 80)
	    .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='py-1']")));
	    Back.click();
					
		
		}
		
		
		@Test (priority = 4)
		public void verifyBirthdayssection() throws InterruptedException {
		WebElement Wishnow=driver.findElement( By.xpath("//ul//li[1]//a[text()='Wish now']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",Wishnow);
		Thread.sleep(2000);
	    Actions actions= new Actions(driver);
	    actions.click(Wishnow).perform();
	    Thread.sleep(3000);
	    WebElement Back = new WebDriverWait(driver, 80)
	   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='py-1']")));
	    Back.click();
					
		
	    }
		
		@AfterMethod
		public void goToMainPage() {
		
		}
		   }
		
		
		