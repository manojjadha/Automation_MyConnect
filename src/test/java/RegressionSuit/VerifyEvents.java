package RegressionSuit;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;


import com.Browser.Pojo;
import com.automation.pageObjectModel.HomePage;

public class VerifyEvents {
	
	WebDriver driver;
	HomePage homePage = new HomePage(driver);
	@BeforeClass
	public void launchBrowser(){
		driver = Pojo.openChromeBrowser();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
	}
	
	   @BeforeClass 
	
	   public void launchMyConnectTing() {
		driver.get("https://myconnect.tinggit.com/");
		HomePage homePage = new HomePage(driver);
		homePage.sendValidCredential();
		homePage.clickLoginButton();
	}
	
	
	@Test (priority = 1)
	public void verifyEvents() throws InterruptedException {
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//div[@class='container-fluid p-0 ']//div[@class='headerRoot headerRoot']//a[@class='nav-item nav-link active']//span[text()='Events']")).isDisplayed());
	WebElement Events = new WebDriverWait(driver, 40)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='container-fluid p-0 ']//div[@class='headerRoot headerRoot']//a[@class='nav-item nav-link active']//span[text()='Events']")));
	Events .click();
	Thread.sleep(9000);
    WebElement readMoreButton = new WebDriverWait(driver, 40)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Read More'][1]")));
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
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",editcomment);
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
	public void verifyAnnouncement() throws InterruptedException {
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
	 WebElement readMoreButton1 = new WebDriverWait(driver, 10)
     .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Read More']")));
	 readMoreButton1.click();
	 
	 }
	    @Test (priority = 4)
        public void CommentWithReaction() throws InterruptedException {
   	    Thread.sleep(9000);
	    Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//ul[@class='d-flex justify-content-between list-unstyled m-0 p-2 mx-1']//span[text()='Like']")).isDisplayed());
	    WebElement Like = new WebDriverWait(driver, 40)
       .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//ul[@class='d-flex justify-content-between list-unstyled m-0 p-2 mx-1']//span[text()='Like']")));
	    Thread.sleep(4000);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",Like);
		Actions actions= new Actions(driver);
		actions.moveToElement(Like).perform();
		Thread.sleep(4000);
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div//parent::li[@class='pr-3 cursorPointer']//li[1]/img[contains(@src,'/images/LikeEmoji.png')]")).isDisplayed());
	    WebElement thumb = new WebDriverWait(driver, 40)
	    .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div//parent::li[@class='pr-3 cursorPointer']//li[1]/img[contains(@src,'/images/LikeEmoji.png')]")));
	    Thread.sleep(4000);
	
	}
	
	@Test (priority = 5)
    public void verifypreSavepost() throws Exception {
    Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//a[@class='my-dropdown-toggle h5 text-decoration-none text-black' and @data-toggle='dropdown']")).isDisplayed());
	Thread.sleep(9000);
	WebElement preSavepost = new WebDriverWait(driver, 20)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//a[@class='my-dropdown-toggle h5 text-decoration-none text-black' and @data-toggle='dropdown'] ")));
	preSavepost.click();
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div[@class='dropdown show']//ul//li[text()='Save post']")).isDisplayed());
	Thread.sleep(9000);
	WebElement Savepost = new WebDriverWait(driver, 20)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='d-lg-block d-md-block d-none d-sm-none d-xl-block d-xxl-block']//div[@class='infinite-scroll-component__outerdiv']/div[1]/div[1]//div[@class='dropdown show']//ul//li[text()='Save post']")));
    Savepost.click();
		
	   }
	
    @Test (priority = 6)
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
   
	 @Test (priority = 7)
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