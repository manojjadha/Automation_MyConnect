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
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.pageObjectModel.HomePage;



public class VerifyThreeDotsMenu {

		WebDriver driver;
		
		@BeforeClass
		public void launchBrowser() throws InterruptedException{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get("https://myconnect.tinggit.com/");
			HomePage homePage = new HomePage(driver);
			homePage.sendValidUserNameAndValidPassword();
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
		    public void verifypreSavepost() throws Exception {
			Thread.sleep(9000);
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//a[@class='my-dropdown-toggle h5 text-decoration-none text-black' and @data-toggle='dropdown']")).isDisplayed());
			Thread.sleep(9000);
			WebElement preSavepost = new WebDriverWait(driver, 20)
		   .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//a[@class='my-dropdown-toggle h5 text-decoration-none text-black' and @data-toggle='dropdown'] ")));
		    preSavepost.click();
		    Thread.sleep(9000);
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div[@class='dropdown show']//ul//li[text()='Saved Post']")).isDisplayed());
			Thread.sleep(9000);
			WebElement Savepost = new WebDriverWait(driver, 20)
		   .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div[@class='dropdown show']//ul//li[text()='Saved Post']")));
		    Savepost.click();
			
		    }
		
	       @Test (priority = 2)
		   public void verifySavepost1() throws Exception {
           Assert.assertTrue(driver.findElement(By.xpath("//img[@class='userLogo']")).isDisplayed());
	       WebElement User = new WebDriverWait(driver, 10)
		  .until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='userLogo']")));
		   Thread.sleep(4000);
	       Actions actions= new Actions(driver);
	       actions.click(User).perform();
	    
	       Assert.assertTrue(driver.findElement(By.xpath("//div[@class='userInfoMenu position-relative']//ul//li[2]//div//a[text()='My Favorite']")).isDisplayed());
	       WebElement Favorite = new WebDriverWait(driver, 10)
		  .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='userInfoMenu position-relative']//ul//li[2]//div//a[text()='My Favorite']")));
		   Thread.sleep(4000);
	       Actions actions1= new Actions(driver);
	       actions1.click(Favorite).perform();
	       Thread.sleep(2000);
		   Assert.assertTrue(driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected css-1io09qe']")).isDisplayed());
		   Thread.sleep(9000);
		   WebElement Feed1 = new WebDriverWait(driver, 40)
	      .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary Mui-selected css-1io09qe']")));
		   Feed1 .click();
		   Assert.assertTrue(driver.findElement(By.xpath("//*[@class='dropdown-menu bg-default shadow show']//li[3]")).isDisplayed());
	       Thread.sleep(9000);
		   WebElement Unsavepost = new WebDriverWait(driver, 40)
	      .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='dropdown-menu bg-default shadow show']//li[3]")));
		   Unsavepost.click();
		
	     }
	      
	        @Test (priority = 3)
		    public void verifyHidepost() throws Exception {
	    	WebElement redirect=driver.findElement(By.xpath("//div[@class='navbar-nav']//span[text()='Home']"));
	    	redirect.click();
	    	Thread.sleep(9000);
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//a[@class='my-dropdown-toggle h5 text-decoration-none text-black' and @data-toggle='dropdown']")).isDisplayed());
			Thread.sleep(9000);
			WebElement PreHidepost = new WebDriverWait(driver, 20)
		   .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//a[@class='my-dropdown-toggle h5 text-decoration-none text-black' and @data-toggle='dropdown'] ")));
			 PreHidepost.click();
		    Thread.sleep(9000);
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div[@class='dropdown show']//ul//li[1]")).isDisplayed());
			Thread.sleep(9000);
			WebElement Hidepost = new WebDriverWait(driver, 20)
		   .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div[@class='dropdown show']//ul//li[1] ")));
			Hidepost.click();
			
	    }
	        @Test (priority = 4)
			public void verifyHidepost1() throws Exception {
	        Thread.sleep(4000);
	        Assert.assertTrue(driver.findElement(By.xpath("//img[@class='userLogo']")).isDisplayed());
	        Thread.sleep(4000);
	        WebElement User = new WebDriverWait(driver, 20)
			.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@class='userLogo']")));
			Thread.sleep(4000);
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",User);
			Thread.sleep(4000);
			Actions actions= new Actions(driver);
		    actions.click(User).perform();
		    Assert.assertTrue(driver.findElement(By.xpath("//*[@class='referalText fs-16 fontWeight500']")).isDisplayed());
		    WebElement ViewProfile = new WebDriverWait(driver, 20)
			.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='referalText fs-16 fontWeight500']")));
			Thread.sleep(4000);
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",ViewProfile);
			Thread.sleep(4000);
			Actions actions1= new Actions(driver);
		    actions1.click(ViewProfile).perform();
		    actions.click(User).perform();
		    
		    Thread.sleep(4000);
		    Assert.assertTrue(driver.findElement(By.xpath("//div[@class='justify-content-around mx-lg-5 mx-xl-5 pt-4 pt-lg-0 pt-md-0 pt-xl-0 px-2 px-lg-0 px-md-0 px-xl-0 row']/div[2]//div[@class='MuiTabs-flexContainer css-k008qs']//button[2]")).isDisplayed());
			Thread.sleep(9000);
			WebElement  Hiddenposts = new WebDriverWait(driver, 20)
		   .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='justify-content-around mx-lg-5 mx-xl-5 pt-4 pt-lg-0 pt-md-0 pt-xl-0 px-2 px-lg-0 px-md-0 px-xl-0 row']/div[2]//div[@class='MuiTabs-flexContainer css-k008qs']//button[2]")));
		    Hiddenposts.click();
	        
			 
		    Assert.assertTrue(driver.findElement(By.xpath("//div[@class='MuiBox-root css-0']/div[@id='simple-tabpanel-1']/div/p//div[@class='mt-3']/div[1]/div[1]//div[@class='d-flex justify-content-between']//div[2]//a")).isDisplayed());
			Thread.sleep(9000);
			WebElement  Hiddenposts1 = new WebDriverWait(driver, 20)
		   .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiBox-root css-0']/div[@id='simple-tabpanel-1']/div/p//div[@class='mt-3']/div[1]/div[1]//div[@class='d-flex justify-content-between']//div[2]//a")));
		    Hiddenposts1.click();
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@class='dropdown-menu postion-relative left-150 show']//li[1]")).isDisplayed());
			Thread.sleep(9000);
			WebElement Unhidepost = new WebDriverWait(driver, 20)
		   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='dropdown-menu postion-relative left-150 show']//li[1] ")));
			Unhidepost.click();
	        
	        
	        
	        }
	        
	            @Test (priority = 5)
		        public void verifyCopylink() throws Exception {
	            Thread.sleep(8000);
	        	WebElement Homepage = new WebDriverWait(driver, 60)
	           .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='navbar-nav']//span[text()='Home'] ")));
	            Homepage.click();
	        	Thread.sleep(9000);
	   			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//a[@class='my-dropdown-toggle h5 text-decoration-none text-black' and @data-toggle='dropdown']")).isDisplayed());
	   			Thread.sleep(9000);
	    	    WebElement preCopylink = new WebDriverWait(driver, 60)
			   .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//a[@class='my-dropdown-toggle h5 text-decoration-none text-black' and @data-toggle='dropdown'] ")));
				preCopylink.click();
			    Thread.sleep(9000);
				Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div[@class='dropdown show']//ul//li[4]")).isDisplayed());
				Thread.sleep(9000);
				WebElement Copylink = new WebDriverWait(driver, 60)
			   .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div[@class='dropdown show']//ul//li[4] ")));
				Copylink.click();
				
				
				  }
	           
	           @Test (priority = 6)
		        public void verifyReportPost() throws Exception {
	        	 Thread.sleep(8000);
		        WebElement Homepage = new WebDriverWait(driver, 60)
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='navbar-nav']//span[text()='Home'] ")));
		        Homepage.click();
	   	    	Thread.sleep(9000);
	   			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//a[@class='my-dropdown-toggle h5 text-decoration-none text-black' and @data-toggle='dropdown']")).isDisplayed());
	   			Thread.sleep(9000);
	    	   
				WebElement Reportpost = new WebDriverWait(driver, 80)
			   .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//a[@class='my-dropdown-toggle h5 text-decoration-none text-black' and @data-toggle='dropdown'] ")));
				Reportpost.click();
			   
				Thread.sleep(9000);
				Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div[@class='dropdown show']//ul//li[2]")).isDisplayed());
				Thread.sleep(9000);
				WebElement Reportpost1 = new WebDriverWait(driver, 80)
			   .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div[@class='dropdown show']//ul//li[2] ")));
				Reportpost1.click();
				
			    
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}	    	
		 @AfterMethod
		    public void goToMainPage() {
		}
		 
}