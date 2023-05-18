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


public class VerifyPageRandR {

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
	         public void verifyPageRandRAwards() throws InterruptedException {
	    	 Thread.sleep(9000);
	         Assert.assertTrue(driver.findElement(By.xpath("//div[@class='container-fluid p-0 ']//div[@class='headerRoot headerRoot']//div[@class='nav-item dropdown']//span[text()='R&R']")).isDisplayed());
	    	 WebElement RandR = new WebDriverWait(driver, 10)
	    	 .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='container-fluid p-0 ']//div[@class='headerRoot headerRoot']//div[@class='nav-item dropdown']//span[text()='R&R']")));
	    	 RandR.click();
	    	 WebElement Awards=driver.findElement( By.xpath("//*[@href=\"/awards\" and @class='nav-item nav-link']"));
			 Thread.sleep(9000);
			 Actions actions= new Actions(driver);
			 actions.click(Awards).perform();
			 Thread.sleep(9000);
			 WebElement Awardsname = new WebDriverWait(driver, 40)
		    .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='row justify-content-center mx-md-2 mx-lg-2 m-0']//div[@class=' col-lg-8 col-md-8  col-xl-6 col-sm-12 mainContainer']//div[@class='infinite-scroll-component ']/div[1]//p[@class='cursorPointer referalText fs-15']")));
			 Actions actions1= new Actions(driver);
			 actions1.click(Awardsname).perform();
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
		     
		       @Test (priority = 3)
		       public void CommentWithReaction() throws InterruptedException {
		       Thread.sleep(9000);
			   Assert.assertTrue(driver.findElement(By.xpath("//div[@class='container-fluid p-0 ']//div[@class='headerRoot headerRoot']//div[@class='nav-item dropdown']//span[text()='R&R']")).isDisplayed());
			   WebElement RandR = new WebDriverWait(driver, 10)
			   .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='container-fluid p-0 ']//div[@class='headerRoot headerRoot']//div[@class='nav-item dropdown']//span[text()='R&R']")));
			   RandR.click();
			   WebElement Awards=driver.findElement( By.xpath("//*[@href=\"/awards\" and @class='nav-item nav-link']"));
		       Thread.sleep(9000);
		       Actions actions= new Actions(driver);
			   actions.click(Awards).perform();
			   Assert.assertTrue(driver.findElement(By.xpath("//span[@class='ps-2 fontWeight400 ps-2 fs-13 colorComment']")).isDisplayed());
			   WebElement Like = new WebDriverWait(driver, 10)
		       .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='ps-2 fontWeight400 ps-2 fs-13 colorComment']")));
			   Thread.sleep(4000);
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",Like);
			   Thread.sleep(4000);
			   Actions actions4= new Actions(driver);
			   actions4.click(Like).perform();
			   Thread.sleep(9000);
			   Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//ul[@class='d-flex justify-content-between list-unstyled m-0 p-2 mx-1']//span[text()='Like']")).isDisplayed());
			   WebElement thumb = new WebDriverWait(driver, 10)
			   .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//ul[@class='d-flex justify-content-between list-unstyled m-0 p-2 mx-1']//span[text()='Like']")));
			   Thread.sleep(4000);
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",thumb);
			   Actions actions1= new Actions(driver);
			   actions1.moveToElement(thumb).perform();
	           actions1.click(thumb).perform();
	           Thread.sleep(9000);
			   Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div//parent::li[@class='pr-3 cursorPointer']//li[2]/img[contains(@src,'/images/HeartEmoji.png')]")).isDisplayed());
			   WebElement Heart = new WebDriverWait(driver, 10)
			   .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div//parent::li[@class='pr-3 cursorPointer']//li[2]/img[contains(@src,'/images/HeartEmoji.png')]")));
			   Thread.sleep(4000);
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",Heart);
			   Actions actions12= new Actions(driver);
			   actions12.moveToElement(Heart).perform();
	           actions12.click(Heart).perform();
	           Thread.sleep(9000);
			   Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div//parent::li[@class='pr-3 cursorPointer']//li[3]/img[contains(@src,'/images/clappingEmoji.png')]")).isDisplayed());
			   WebElement clapping = new WebDriverWait(driver, 10)
			   .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div//parent::li[@class='pr-3 cursorPointer']//li[3]/img[contains(@src,'/images/clappingEmoji.png')]")));
			   Thread.sleep(4000);
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",clapping);
			   Actions actions3= new Actions(driver);
			   actions3.moveToElement(clapping).perform();
	           actions3.click(clapping).perform();
		    
		     }
		    
	           @Test (priority = 4)
		        public void verifyComment() throws InterruptedException {
		    	Thread.sleep(9000);
		    	WebElement commentBox=driver.findElement( By.xpath("//textarea[@placeholder='Write a comment..']"));
				Actions actions= new Actions(driver);
				actions.click(commentBox).perform();
				commentBox.sendKeys("test");
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
				//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",editcomment);
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
		     
             @Test (priority = 5)
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

		    @Test (priority = 6)
		    public void verifyReactionElementZeroGreaterThenOne() throws InterruptedException {
			Thread.sleep(9000);
			WebElement elementValue=driver.findElement( By.xpath("//ul[@class='d-flex justify-content-between list-unstyled m-0 p-2 mx-1 position-relative']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",elementValue);
			Thread.sleep(9000);
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
			   public void verifycommentCountElement() throws Exception {
				try
				{
				Thread.sleep(9000);
				WebElement commentCountElement1 = driver.findElement(By.xpath("//li[@class='fs-13 fontWeight400']"));
                String C = commentCountElement1.getText();
			    System.out.println(C);
				commentCountElement1.click();}
				catch(NoSuchElementException e)
				{
				 System.out.println("Very Nice");
				}
			    
			    	}
				
			    @Test (priority = 8)
	            public void verifyAccolades() throws InterruptedException {
				Thread.sleep(9000);
		        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='container-fluid p-0 ']//div[@class='headerRoot headerRoot']//div[@class='nav-item dropdown']//span[text()='R&R']")).isDisplayed());
		    	WebElement RandR = new WebDriverWait(driver, 10)
		    	.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='container-fluid p-0 ']//div[@class='headerRoot headerRoot']//div[@class='nav-item dropdown']//span[text()='R&R']")));
		        RandR.click();
		    	Thread.sleep(9000);
		        WebElement Accolades=driver.findElement( By.xpath("//*[@href=\"/accolades\" and @class='nav-item nav-link']"));
			    Actions actions= new Actions(driver);
			    actions.click(Accolades).perform();
			    Thread.sleep(9000);
			    WebElement readMoreButton = new WebDriverWait(driver, 40)
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Read More']")));
		        readMoreButton.click();
		        Thread.sleep(3000);
				WebElement Back = new WebDriverWait(driver, 80)
			   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='py-1']")));
				Back.click();
	            
			    }
			   
	          
	            @Test (priority = 9)
	            public void verifyPromotions() throws InterruptedException {
	            Thread.sleep(9000);
		        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='container-fluid p-0 ']//div[@class='headerRoot headerRoot']//div[@class='nav-item dropdown']//span[text()='R&R']")).isDisplayed());
		        WebElement RandR = new WebDriverWait(driver, 10)
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='container-fluid p-0 ']//div[@class='headerRoot headerRoot']//div[@class='nav-item dropdown']//span[text()='R&R']")));
		        RandR.click();
		        Thread.sleep(9000);
		        WebElement Promotions=driver.findElement( By.xpath("//*[@href=\"/promotions\" and @class='nav-item nav-link']"));
			    Actions actions= new Actions(driver);
			    actions.click(Promotions).perform();
			    WebElement congratulations=driver.findElement( By.xpath("//*[@href=\"/user-view/profile/57\"]"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",congratulations);
				Actions actions22= new Actions(driver);
				actions22.click(congratulations).perform();
			    Thread.sleep(3000);
				WebElement Back = new WebDriverWait(driver, 80)
			   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='py-1']")));
				Back.click();
				
	               }
	            
	       @AfterMethod
	       public void goToMainPage() {
	   
	  }

}

	