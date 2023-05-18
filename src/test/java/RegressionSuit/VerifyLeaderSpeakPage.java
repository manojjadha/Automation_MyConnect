package RegressionSuit;
import static org.testng.Assert.assertEquals;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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


public class VerifyLeaderSpeakPage {

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
		        public void verifyLeaderspeakpage() throws InterruptedException {
	        	Thread.sleep(9000);
	        	WebElement leaderspeak=driver.findElement( By.xpath("//div[@class='container-fluid p-0 ']//div[@class='headerRoot headerRoot']//div[@class='navbar-nav']//span[text()='Leader Speak']"));
				Thread.sleep(9000);
				Actions action= new Actions(driver);
				action.click(leaderspeak).perform();
				Thread.sleep(9000);
	    	    WebElement readMoreButton = new WebDriverWait(driver, 40)
	           .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Read More'][1]")));
			    readMoreButton.click();
			    Thread.sleep(9000);
			    WebElement commentBox=driver.findElement( By.xpath("//textarea[@placeholder='Write a comment..']"));
				Actions actions= new Actions(driver);
				actions.click(commentBox).perform();
				commentBox.sendKeys("test");
				Thread.sleep(9000);
				WebElement postButton=driver.findElement( By.xpath("//button[text()='Post']"));
				Actions actions1= new Actions(driver);
				actions1.click(postButton).perform();
				Thread.sleep(9000);
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
				WebElement deleteButton=driver.findElement( By.xpath("//div//ul//li//following::span[text()=' Delete']"));
				Actions actions7= new Actions(driver);
				actions7.click(deleteButton).perform();
			    WebElement yesdeleteButton=driver.findElement( By.xpath("//button[text()='Yes, Delete']"));
                Actions actions8= new Actions(driver);
				actions8.click(yesdeleteButton).perform();
	       
            }
			
		 @AfterMethod
		public void goToMainPage() {
			driver.navigate().back();
		}
		

	}

	

