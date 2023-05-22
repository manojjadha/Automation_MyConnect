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


public class VerifyDeletePost {

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
	
	public void verifyDeletePost() throws InterruptedException {
		Thread.sleep(3000);
		HomePage homePage = new HomePage(driver);
		Thread.sleep(9000);
		//homePage.clickComment();
		//homePage.sendComment();
	//	Thread.sleep(3000);
		//homePage.deleteComment();
		//homePage.finaldel();
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
	         @Test (priority = 3)
	         public void CommentWitheReaction() throws InterruptedException {
	    	 Thread.sleep(9000);
		     Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//ul[@class='d-flex justify-content-between list-unstyled m-0 p-2 mx-1']//span[text()='Like']")).isDisplayed());
		     WebElement Like = new WebDriverWait(driver, 10)
	        .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//ul[@class='d-flex justify-content-between list-unstyled m-0 p-2 mx-1']//span[text()='Like']")));
		     Thread.sleep(4000);
			 Actions actions= new Actions(driver);
			 actions.moveToElement(Like).perform();
			 Thread.sleep(4000);
             Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div//parent::li[@class='pr-3 cursorPointer']")).isDisplayed());
		     WebElement thumb = new WebDriverWait(driver, 10)
		     .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div//parent::li[@class='pr-3 cursorPointer']")));
		     Thread.sleep(4000);
			 Actions actions1= new Actions(driver);
			 actions1.moveToElement(thumb).perform();
             actions1.click(thumb).perform();
           
            
             /*Thread.sleep(9000);
			 WebElement actualconditionLike = driver.findElement( By.xpath("//span[@class='d-inline-block pr-2 colorComment']"));
			 Actions actions1= new Actions(driver);
			 actions1.click(actualconditionLike).perform();
			 
			  Thread.sleep(3000);
			  WebElement Like1 = new WebDriverWait(driver, 80)
			 .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='d-inline-block pr-2 colorComment']")));
			  Like1.click();
			  
			  Thread.sleep(9000);
			  WebElement actualconditionthumb = driver.findElement( By.xpath("//ps-2 fontWeight400 ps-2 fs-13 colorComment"));
			  Actions actions2= new Actions(driver);
			  actions2.click(actualconditionthumb).perform();
				 
			  Thread.sleep(3000);
			  WebElement Like2 = new WebDriverWait(driver, 80)
			  .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='pr-1 ']")));
			  Like2.click();}*/
	    	/*WebDriverWait wait = new WebDriverWait(driver, 10);
	         wait.until(ExpectedConditions.titleIs("Unselect like button"));
	         WebElement likeButton = driver.findElement(By.xpath("//span[@class='d-inline-block pr-2 colorComment']"));
	         likeButton.click();
	         WebDriverWait wait1 = new WebDriverWait(driver, 10);
	         wait1.until(ExpectedConditions.titleIs("unselect like button"));
	         WebElement unselectlikeButton = driver.findElement(By.xpath("//span[@class='d-inline-block pr-2 colorComment']"));
	         unselectlikeButton.click();
	         
	        
	         WebDriverWait wait2 = new WebDriverWait(driver, 10);
	         wait2.until(ExpectedConditions.titleIs("nselect like button"));
	         WebElement selectlikeButton = driver.findElement(By.xpath("//span[@class='ps-2 fontWeight400 ps-2 fs-13 colorComment']"));
	         selectlikeButton.click();
	         WebDriverWait wait3 = new WebDriverWait(driver, 10);
	         wait3.until(ExpectedConditions.titleIs("nselect like button"));
	         WebElement selectlikeButton1 = driver.findElement(By.xpath("//*[@class='pr-1 ']"));
	         selectlikeButton1.click();*/
	         
	     }
	         /*WebElement likeCount = driver.findElement(By.xpath("//span[@class='like-count']"));
	         wait.until(ExpectedConditions.textToBePresentInElementValue(likeCount, "1"));
	         String actualLikeCount = likeCount.getText();
	         String expectedLikeCount = "1";
	         assert(actualLikeCount.equals(expectedLikeCount));
	         WebElement thumbButton = driver.findElement(By.xpath("//button[@class='thumb-button']"));
	         thumbButton.click();
	         WebElement thumbCount = driver.findElement(By.xpath("//span[@class='thumb-count']"));
	         wait.until(ExpectedConditions.textToBePresentInElementValue(thumbCount, "1"));
	         String actualThumbCount = thumbCount.getText();
	         String expectedThumbCount = "1";
	         assert(actualThumbCount.equals(expectedThumbCount));*/
	        
	     
	
			  
			  
	    
		        
	       
	       /* Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div//parent::li[@class='pr-3 cursorPointer']//li[2]/img[contains(@src,'/images/HeartEmoji.png')]")).isDisplayed());
           WebElement heart = new WebDriverWait(driver, 10)
		    .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div//parent::li[@class='pr-3 cursorPointer']//li[2]/img[contains(@src,'/images/HeartEmoji.png')]")));
		    heart.click();
		    */
		/*     }
	   
		   
	    @Test (priority = 4)
		    public void addCommentWithEmoji1() throws InterruptedException {
	    	WebElement like= driver.findElement(By.xpath("//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div[@class='h-auto']//div[2]//form[@class='ps-2 ']//span[text()='Like']"));
	    	WebDriverWait wait1 = new WebDriverWait(driver, 120);
	        wait1.until(ExpectedConditions.elementToBeClickable(like));
            Thread.sleep(4000);

	    	 String CV=like.getCssValue("cursor");
	    	if(CV.equals("not-allowed"))
	    {
	     Assert.assertTrue(driver.findElement(By.xpath("//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div[@class='h-auto']//div[2]//form[@class='ps-2 ']//span[text()='Like']")).isSelected());
	    	}
	    else
	    	{
	    	 System.out.println("set to allowed");
	    	 }
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//form[@class='ps-2 ']//span[contains(text(),'Thumb')] ")).isDisplayed());
			WebElement reply = new WebDriverWait(driver, 10)
		   .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//form[@class='ps-2 ']//span[contains(text(),'Thumb')] ")));
			reply.click();
			
		 }*/
	   
	    @AfterMethod
	    public void goToMainPage() {
	   
	  }

}
