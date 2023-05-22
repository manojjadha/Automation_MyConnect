package RegressionSuit;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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


public class VerifyDeletePost1 {

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
	        public void verifyDeletecomment() throws InterruptedException {
	    	 Thread.sleep(9000);
		    WebElement postButton=driver.findElement( By.xpath("//textarea[@id='mytextarea']"));
			Actions actions1= new Actions(driver);
			actions1.click(postButton).perform();
		    Thread.sleep(9000);
	    	WebElement postInputboxBox=driver.findElement( By.xpath("//textarea[@placeholder='Write a Post ']/../textarea"));
			Actions actions= new Actions(driver);
			actions.click(postInputboxBox).perform();
			postInputboxBox.sendKeys("Test");
			Thread.sleep(9000);
			WebElement postButton1=driver.findElement( By.xpath("//div[@class='bgColor col col-3 cursorPointer d-grid h-100 text-white']"));
			Actions actions11= new Actions(driver);
			actions11.click(postButton1).perform();
			Thread.sleep(9000);
			WebElement editpost=driver.findElement( By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//a[@class='my-dropdown-toggle h5 text-decoration-none text-black' and @data-toggle='dropdown']"));
			Actions actions3= new Actions(driver);
			actions3.click(editpost).perform();
			Thread.sleep(9000);
			WebElement editbox=driver.findElement( By.xpath("//*[@class='form-control border-secondary roundedCls']"));
			Actions actions4= new Actions(driver);
			actions4.click(editbox).perform();
			editbox.sendKeys("Automation Testing");
			Thread.sleep(9000);
			WebElement posteditbutton=driver.findElement( By.xpath("//div[@class='bgColor col col-3 cursorPointer d-grid h-100 text-white']"));
		    Actions actions5= new Actions(driver);
			actions5.click(posteditbutton).perform();
			Thread.sleep(9000);
			WebElement deleteButton=driver.findElement( By.xpath("//div//ul//li//following::span[text()=' Delete']"));
			Actions actions7= new Actions(driver);
			actions7.click(deleteButton).perform();
			Thread.sleep(9000);
			WebElement yesdeleteButton=driver.findElement( By.xpath("//button[text()='Yes, Delete']"));
            Actions actions8= new Actions(driver);
			actions8.click(yesdeleteButton).perform();;
		   
	   }

	       
	    	   
	      @Test (priority = 2)
           public void testCommentcount1() throws InterruptedException {
       		
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
	      
         
	      
	       @Test (priority = 3)
	       public void CommentWithReaction() throws InterruptedException {
		   Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//ul[@class='d-flex justify-content-between list-unstyled m-0 p-2 mx-1']//span[text()='Like']")).isDisplayed());
		   WebElement Like = new WebDriverWait(driver, 10)
	       .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//ul[@class='d-flex justify-content-between list-unstyled m-0 p-2 mx-1']//span[text()='Like']")));
		   Thread.sleep(4000);
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",Like);
		   Thread.sleep(4000);
		   Actions actions= new Actions(driver);
		   actions.click(Like).perform();
		    
		   Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div//parent::li[@class='pr-3 cursorPointer']//li[1]/img[contains(@src,'/images/LikeEmoji.png')]")).isDisplayed());
		   WebElement thumb = new WebDriverWait(driver, 10)
		   .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div//parent::li[@class='pr-3 cursorPointer']//li[1]/img[contains(@src,'/images/LikeEmoji.png')]")));
		   Thread.sleep(4000);
		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",thumb);
		   Actions actions1= new Actions(driver);
		   actions1.moveToElement(thumb).perform();
           actions1.click(thumb).perform();
	       }
           
             @Test (priority = 4)
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
	       
	     
		     }
             
	   
	    @AfterMethod
	    public void goToMainPage() {
	   
	  }

}

	