package RegressionSuit;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.pageObjectModel.HomePage;


public class Verifytestcomment {

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
		public void launchMyConnectTing() throws InterruptedException {
			
			
			System.out.println("hello");
			Thread.sleep(9000);
		}

		@Test (priority = 1)
		
		public void verifytestcomment() throws Exception {
			try
			{
			Thread.sleep(9000);
			WebElement commentCountElement1 = driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div[@class='d-flex']//child::li[@class='fs-13 fontWeight400']"));

		String C = commentCountElement1.getText();
		System.out.println(C);
			commentCountElement1.click();}
			catch(NoSuchElementException e)
			{
			System.out.println("no comments");
			}
		    
		    	}
			
		}