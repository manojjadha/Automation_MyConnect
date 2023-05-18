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


public class VerifyReactionComment1 {

		WebDriver driver;
		
		@BeforeClass
		public void launchBrowser() throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://myconnect.tinggit.com/");
			HomePage homePage = new HomePage(driver);
			homePage.sendValidCredential();
			homePage.clickLoginButton();
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			Thread.sleep(9000);
			
		}
		
		  @BeforeMethod 
		  public void launchMyConnectTing() throws InterruptedException {
		  System.out.println("hello");
		}
		    
			@Test (priority = 1)
			 public void verifyReactionElementZeroGreaterThenOne() throws InterruptedException {
			 Thread.sleep(9000);
			 WebElement elementValue=driver.findElement( By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component ']/div[2]//div[@class='bg-default border roundedCls mt-3']/ul//li//span[@class='cursorPointer']"));
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",elementValue);
			 Thread.sleep(9000);
			 Actions actions= new Actions(driver);
			 actions.click(elementValue).perform();
			 Thread.sleep(9000);
			 WebElement AllReactionButton = new WebDriverWait(driver, 40)
			 .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiTabs-root tabTextColor indicator tabColor css-orq8zk']//div//div//button[1]")));
			 AllReactionButton.click();
			 Thread.sleep(9000);
			 WebElement Close = new WebDriverWait(driver, 40)
			 .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary MuiIconButton-sizeMedium border bg-white css-39nlm1']")));
			 Close.click();
			 if (elementValue.equals("expected-value")) {
				    System.out.println("is greater than 0 " + elementValue);
			 } else {
			     System.out.println("is not greater than 0 " + elementValue);
			 }
			 
		       
		        }
			
	   
	 	@Test (priority = 2)
			public void verifyTestReactionElementYou() throws InterruptedException {
			Thread.sleep(9000);
			WebElement elementYou=driver.findElement( By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component ']/div[3]//div[@class='bg-default border roundedCls mt-3']/ul//li//span[@class='cursorPointer']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",elementYou);
			Thread.sleep(9000);
			Actions actions= new Actions(driver);
			actions.click(elementYou).perform();
			Thread.sleep(9000);
		    WebElement AllReactionButton = new WebDriverWait(driver, 40)
			.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiTabs-root tabTextColor indicator tabColor css-orq8zk']//div//div//button[1]")));
			AllReactionButton.click();
			 Thread.sleep(9000);
			 WebElement Close = new WebDriverWait(driver, 40)
			 .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-colorPrimary MuiIconButton-sizeMedium border bg-white css-39nlm1']")));
			 Close.click();
			 if (elementYou.equals("expected-value")) {
				    System.out.println("is greater than 0 " + elementYou);
			 } else {
			     System.out.println("is not greater than 0 " + elementYou);
			 }
			 
		       
		        }
				
					
	  
		  
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     


	        @AfterMethod
		    public void goToMainPage() {
	    	  }
	    	}
	    	