package RegressionSuit;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;


import com.Browser.Pojo;
import com.automation.pageObjectModel.HomePage;

public class VerifyOurPeoplePage {
	
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
	public void verifyassociatespotlight() throws InterruptedException {
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//*[@class='nav-link dropdown-toggle']")).isDisplayed());
	WebElement associatespotlight = new WebDriverWait(driver, 10)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='nav-link dropdown-toggle']")));
	associatespotlight.click();
	
	
	}
	@Test (priority = 2)
	public void verifystories() throws InterruptedException {
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//*[@class='nav-item nav-link' and @href='stories']")).isDisplayed());
	WebElement stories = new WebDriverWait(driver, 10)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='nav-item nav-link' and @href='stories']")));
	stories.click();
	
	Thread.sleep(8000);
	WebElement readMoreButton = new WebDriverWait(driver, 10)
    .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Read More']")));
	readMoreButton.click();
	
	 Thread.sleep(8000);
	 WebElement readMoreButton1 = new WebDriverWait(driver, 10)
    .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Read More'][1]")));
     readMoreButton1.click();
    
     Thread.sleep(8000);
	 WebElement showLessButton = new WebDriverWait(driver, 10)
	 .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' Show Less']")));
      showLessButton.click();
      
	}
	@Test (priority = 3)
	public void verifyannouncements() throws InterruptedException {
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Announcement']")).isDisplayed());
	WebElement announcements = new WebDriverWait(driver, 10)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='active-link btnColor text-decoration-underline']")));
	announcements.click();
	}
	@Test (priority = 4)
	public void verifynewjoiner() throws InterruptedException {
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Announcement']")).isDisplayed());
	WebElement newjoiner = new WebDriverWait(driver, 10)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='active-link btnColor text-decoration-underline']")));
	newjoiner.click();
	}
	@Test (priority = 5)
	public void verifyjobreferral() throws InterruptedException {
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Announcement']")).isDisplayed());
	WebElement jobreferral = new WebDriverWait(driver, 10)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='active-link btnColor text-decoration-underline']")));
	jobreferral.click();
	}
	@Test (priority = 6)
	public void verifyfindassociate() throws InterruptedException {
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Announcement']")).isDisplayed());
	WebElement findassociate = new WebDriverWait(driver, 10)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='active-link btnColor text-decoration-underline']")));
	findassociate.click();
	
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//*[@CLASS='MuiFormLabel-root MuiFormLabel-colorWarning fs-14 text-capitalize mt-3 mb-3 css-gtbz8e']")).isDisplayed());
	WebElement Experiencelevel = new WebDriverWait(driver, 10)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='active-link btnColor text-decoration-underline']")));
	Experiencelevel.click();
	
	Thread.sleep(8000);
	Assert.assertTrue(driver.findElement(By.xpath("//*[@CLASS='MuiFormLabel-root MuiFormLabel-colorWarning fs-14 text-capitalize mt-3 mb-3 css-gtbz8e']")).isDisplayed());
	WebElement showmore = new WebDriverWait(driver, 10)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='active-link btnColor text-decoration-underline']")));
	showmore.click();
	}
	@Test (priority = 7)
	public void verifyorganizationtree() throws InterruptedException {
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Announcement']")).isDisplayed());
	WebElement organizationtree = new WebDriverWait(driver, 10)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='active-link btnColor text-decoration-underline']")));
	organizationtree.click();
	
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Announcement']")).isDisplayed());
	WebElement Employeetree = new WebDriverWait(driver, 10)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='active-link btnColor text-decoration-underline']")));
	Employeetree.click();
	
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Announcement']")).isDisplayed());
	WebElement Department = new WebDriverWait(driver, 10)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='active-link btnColor text-decoration-underline']")));
	Department.click();
	
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Announcement']")).isDisplayed());
	WebElement SEO = new WebDriverWait(driver, 10)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='active-link btnColor text-decoration-underline']")));
	 SEO.click();
	
	}
	@Test (priority = 8)
	public void verifycontactdirectory() throws InterruptedException {
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Announcement']")).isDisplayed());
	WebElement contactdirectory = new WebDriverWait(driver, 10)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='active-link btnColor text-decoration-underline']")));
	contactdirectory.click();
	
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Announcement']")).isDisplayed());
	WebElement Department = new WebDriverWait(driver, 10)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='active-link btnColor text-decoration-underline']")));
	Department.click();
	
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Announcement']")).isDisplayed());
	WebElement Technical = new WebDriverWait(driver, 10)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='active-link btnColor text-decoration-underline']")));
	Technical.click();
	
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Announcement']")).isDisplayed());
	WebElement Branch = new WebDriverWait(driver, 10)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='active-link btnColor text-decoration-underline']")));
	 Branch .click();
	
	  Thread.sleep(9000);
		Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Announcement']")).isDisplayed());
		WebElement Noida = new WebDriverWait(driver, 10)
	   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='active-link btnColor text-decoration-underline']")));
		Noida.click();
	}
	@Test (priority = 9)
	public void verifyinternaljobs() throws InterruptedException {
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Announcement']")).isDisplayed());
	WebElement internaljobs = new WebDriverWait(driver, 10)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='active-link btnColor text-decoration-underline']")));
	internaljobs.click();
	
	Thread.sleep(9000);
	Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Announcement']")).isDisplayed());
	WebElement Advancesearch = new WebDriverWait(driver, 10)
   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='active-link btnColor text-decoration-underline']")));
	Advancesearch.click();
	}}
	