package RegressionSuit;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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


public class VerifyCompanyWithHearts {

		WebDriver driver;
		
		@BeforeClass
		public void launchBrowser(){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get("https://myconnect.tinggit.com/");
			HomePage homePage = new HomePage(driver);
			homePage.sendValidUserNameAndValidPassword();
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
	        public void verifyCompanyWithHearts() throws InterruptedException {
	        Thread.sleep(12000);
	        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='container-fluid p-0 ']//div[@class='headerRoot headerRoot']//a[@class='nav-item nav-link']//span[text()='Company With A Heart']")).isDisplayed());
	        WebElement CompanyWithHearts = new WebDriverWait(driver, 40)
	        .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='container-fluid p-0 ']//div[@class='headerRoot headerRoot']//a[@class='nav-item nav-link']//span[text()='Company With A Heart']")));
	        CompanyWithHearts.click();
	    	Thread.sleep(9000);
			WebElement readMoreButton = new WebDriverWait(driver, 40)
		    .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href=\"/company-with-a-heart\" and @class='text-decoration-underline fw-bold ps-2']")));
		    readMoreButton.click();
		    Thread.sleep(9000);
	    	WebElement commentBox=driver.findElement( By.xpath("//textarea[@placeholder='Write a comment..']"));
			Actions actions1= new Actions(driver);
			actions1.click(commentBox).perform();
			commentBox.sendKeys("test");
			Thread.sleep(9000);
			WebElement postButton=driver.findElement( By.xpath("//button[text()='Post']"));
			Actions actions11= new Actions(driver);
			actions11.click(postButton).perform();
			Thread.sleep(7000);
			WebElement comment=driver.findElement( By.xpath("//div[@class=' m-md-0 m-sm-0']/div[1]//div[2]//p//span[2]"));
			Actions actions2= new Actions(driver);
			actions2.click(comment).perform();
			Thread.sleep(9000);
			WebElement editcomment=driver.findElement( By.xpath("//div//ul//li[@class=' h6 p-1 text-black']//span[contains(text(),'Edit')]"));
			Actions actions3= new Actions(driver);
			actions3.click(editcomment).perform();
			Thread.sleep(9000);
			WebElement editbox=driver.findElement( By.xpath("//*[@class='comment-list comment-list-edit  w-90 text-secondary roundedCls ps-3' and @id='outlined-search']"));
			Actions actions4= new Actions(driver);
			actions4.click(editbox).perform();
			editbox.sendKeys("Good");
			Thread.sleep(9000);
			WebElement posteditcommentbutton=driver.findElement( By.xpath("//button[@class='btn commentBtn rounded rounded-3 text-white position-absolute']"));
		    Actions actions5= new Actions(driver);
			actions5.click(posteditcommentbutton).perform();
			Thread.sleep(9000);
			actions2.click(comment).perform();
			Thread.sleep(9000);
			WebElement deleteButton=driver.findElement( By.xpath("//div//ul//li//following::span[text()=' Delete']"));
			Actions actions7= new Actions(driver);
			actions7.click(deleteButton).perform();
			Thread.sleep(9000);
			WebElement yesdeleteButton=driver.findElement( By.xpath("//button[text()='Yes, Delete']"));
            Actions actions8= new Actions(driver);
			actions8.click(yesdeleteButton).perform();
		   
			
	   }

	   	   @Test (priority = 2)
	       public void testCommentcount() throws InterruptedException {
	   		
	   	  try {
	   		  WebElement commentCountElement = driver.findElement(By.xpath("//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div[@class='d-flex']//child::li[@class='fs-13 fontWeight400']"));
	   	  
	   	   
	           String commentCount = commentCountElement.getText();

	           System.out.println("Comment count: " + commentCount);
	           commentCountElement.click();
	   	  }
	   	  catch(NoSuchElementException e)
	   	  {
	   		System.out.println("no comments a");
	         
	   	}
	    	}
	       
	       @AfterMethod
	       public void goToMainPage() {
	   
	  }

}

	