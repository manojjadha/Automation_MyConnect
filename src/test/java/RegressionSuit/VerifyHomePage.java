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



public class VerifyHomePage {

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
        public void verifypost() throws InterruptedException {
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
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",editpost);
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
		 public void verifyAnnouncementsection() throws InterruptedException {
		 WebElement redirect=driver.findElement(By.xpath("//div[@class='navbar-nav']//span[text()='Home']"));
		 redirect.click();
		 Thread.sleep(9000);
		 Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Announcement']")).isDisplayed());
		 WebElement showmore = new WebDriverWait(driver, 40)
	    .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href=\"/announcements\" and @class='active-link btnColor text-decoration-underline']")));
		 showmore.click();
	     Thread.sleep(9000);
		 WebElement readMoreButton = new WebDriverWait(driver, 40)
        .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Read More']")));
		 readMoreButton.click();
		 Thread.sleep(9000);
		 WebElement readMoreButton1 = new WebDriverWait(driver, 40)
	    .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Read More'][1]")));
	     readMoreButton1.click();
	     Thread.sleep(9000);
		 WebElement showLessButton = new WebDriverWait(driver, 40)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' Show Less']")));
         showLessButton.click();
         Thread.sleep(9000);
 		 WebElement cursorPointerButton = new WebDriverWait(driver, 40)
 		.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='cursorPointer']")));
 		 cursorPointerButton.click();
 	     Thread.sleep(9000);
 		 WebElement ReactionCountElement = driver.findElement(By.xpath("//div[@class='MuiTabs-scroller MuiTabs-fixed css-1anid1y']"));
 		 String ReactionCount = ReactionCountElement.getText();
         System.out.println("All Reaction Count: " + ReactionCount);
         WebElement Back = new WebDriverWait(driver, 40)
        .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='py-1']")));
         Back.click();
		
		}

		 @Test (priority = 3)
		 public void verifyUpcomingEvents() throws InterruptedException {
		 WebElement redirect=driver.findElement(By.xpath("//div[@class='navbar-nav']//span[text()='Home']"));
		 redirect.click();
	     Thread.sleep(9000);	
		 Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Upcoming Events']")).isDisplayed());
		 WebElement showmore1 = new WebDriverWait(driver, 10)
	     .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href=\"/announcements\" and @class='active-link btnColor text-decoration-underline' ]")));
		 showmore1.click();
		 Thread.sleep(8000);
		 WebElement readMoreButton = new WebDriverWait(driver, 10)
         .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Read More']")));
		 readMoreButton.click();
		 Thread.sleep(9000);
	     WebElement commentBox=driver.findElement( By.xpath("//textarea[@placeholder='Write a comment..']"));
		 Actions actions11= new Actions(driver);
		 actions11.click(commentBox).perform();
		 commentBox.sendKeys("VeryGood");
		 Thread.sleep(9000);
		 WebElement postButton=driver.findElement( By.xpath("//button[text()='Post']"));
		 Actions actions1= new Actions(driver);
		 actions1.click(postButton).perform();
		 Thread.sleep(7000);
		 WebElement comment=driver.findElement( By.xpath("//div[@class=' m-md-0 m-sm-0']/div[1]//div[2]//p//span[2]"));
		 Actions actions2= new Actions(driver);
		 actions2.click(comment).perform();
		 Thread.sleep(9000);
		 WebElement editcomment=driver.findElement( By.xpath("//div//ul//li[@class=' h6 p-1 text-black']//span[contains(text(),'Edit')]"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",editcomment);
		 Actions actions3= new Actions(driver);
		 actions3.click(editcomment).perform();
		 Thread.sleep(9000);
		 WebElement editbox=driver.findElement( By.xpath("//*[@class='comment-list comment-list-edit  w-90 text-secondary roundedCls ps-3' and @id='outlined-search']"));
		 Actions actions4= new Actions(driver);
		 actions4.click(editbox).perform();
		 editbox.sendKeys("Good");
		 Thread.sleep(1000);
		 WebElement posteditcommentbutton=driver.findElement( By.xpath("//button[@class='btn commentBtn rounded rounded-3 text-white position-absolute' and text()=\"Post\"]"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",posteditcommentbutton);
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
       
		 
		 @Test (priority = 4)
		 public void verifyJobReferral() throws InterruptedException {
		 WebElement redirect=driver.findElement(By.xpath("//div[@class='navbar-nav']//span[text()='Home']"));
	     redirect.click();
	     Thread.sleep(9000);
		 Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Job Referral']")).isDisplayed());
		 WebElement showmore = new WebDriverWait(driver, 10)
	     .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href=\"/job-referral\" and @class='active-link textColor text-decoration-underline'][1]")));
		 showmore.click();
		
	    }
		
		@Test (priority = 5)
		public void verifyLeaderspeakpage() throws InterruptedException {
		WebElement redirect=driver.findElement(By.xpath("//div[@class='navbar-nav']//span[text()='Home']"));
		redirect.click();
		Thread.sleep(9000);
		Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Leader Speak']")).isDisplayed());
		WebElement showmore = new WebDriverWait(driver, 10)
	   .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Show More']")));
		showmore.click();
		Thread.sleep(8000);
		WebElement readMoreButton = new WebDriverWait(driver, 10)
        .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Read More']")));
		readMoreButton.click();
		Thread.sleep(9000);
	    Assert.assertTrue(driver.findElement(By.xpath("//span[@class='ps-2 fontWeight400 ps-2 fs-13 colorComment']")).isDisplayed());
	    WebElement  likeButton = new WebDriverWait(driver, 40)
	    .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='ps-2 fontWeight400 ps-2 fs-13 colorComment']")));
	    likeButton.click();
	    Thread.sleep(12000);
	    Assert.assertTrue(driver.findElement(By.xpath("//img[@src=\"/images/LikeEmoji.png\"]")).isDisplayed());
	    WebElement  dislikeButton = new WebDriverWait(driver, 40)
	    .until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src=\"/images/LikeEmoji.png\"]")));
	    dislikeButton.click();
		 if (likeButton.isDisplayed()) {
             likeButton.click();

            System.out.println("Display like button");
        
         } 
            
           else if (dislikeButton.isDisplayed()) {
             dislikeButton.click();
             
             System.out.println("Display dislikeButton button");

            }
	       
	             }
		
		
		 @Test (priority = 6)
		 public void verifyNewJoinerssection() throws InterruptedException {
		 WebElement redirect=driver.findElement(By.xpath("//div[@class='navbar-nav']//span[text()='Home']"));
		 redirect.click();
		 Thread.sleep(9000);
		 Assert.assertTrue(driver.findElement(By.xpath("//label[text()='New Joiners']")).isDisplayed());
		 WebElement showmore = new WebDriverWait(driver, 10)
	    .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Show More']")));
		 showmore.click();
		 Thread.sleep(9000);
		 WebElement elementValue=driver.findElement( By.xpath("//ul[@class='d-flex justify-content-between list-unstyled m-0 p-2 mx-1 position-relative']"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",elementValue);
		 Actions actions2= new Actions(driver);
		 actions2.click(elementValue).perform();
		 Thread.sleep(9000);
		 WebElement AllReactionButton = new WebDriverWait(driver, 40)
		 .until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='list-unstyled text-black-50 small']")));
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
		
		
		@Test (priority = 7)
		 public void verifyBirthdayssection() throws InterruptedException {
	     WebElement redirect=driver.findElement(By.xpath("//div[@class='navbar-nav']//span[text()='Home']"));
		 redirect.click();
		 Thread.sleep(9000);
		 Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Birthdays']")).isDisplayed());
		 WebElement showmore5 = new WebDriverWait(driver, 10)
	    .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href=\"/birthdays\" and @class='active-link textColor text-decoration-underline']")));
		 showmore5.click();
		
		
		}
		
		
        @AfterMethod
		public void goToMainPage() {
		
		}

		
			
		}
		   
		
		
		