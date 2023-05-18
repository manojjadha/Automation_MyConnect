package RegressionSuit;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.pageObjectModel.HomePage;


public class VerifyMyAccount {

		WebDriver driver;
		
		@BeforeClass
		public void launchBrowser(){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get("https://myconnect.tinggit.com/");
			HomePage homePage = new HomePage(driver);
			homePage.sendValidCredential();
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
		public void verifyMyAccount() throws InterruptedException {
		Thread.sleep(9000);
		WebElement redirect=driver.findElement(By.xpath("//div[@class='navbar-nav']//span[text()='Home']"));
		redirect.click();
		Thread.sleep(9000);
	    WebElement User = new WebDriverWait(driver, 40)
	   .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='userLogo']")));
	    User.click();
		Thread.sleep(9000);
		WebElement Account = new WebDriverWait(driver, 40)
	   .until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='MuiListItem-root MuiListItem-gutters profileDivider py-1 profileDivider1 css-1tpp0wj']")));
		 Account.click();
		Thread.sleep(9000);
		WebElement Burgermenu = new WebDriverWait(driver, 80)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root makeStyles-menuButton-8 MuiIconButton-colorInherit MuiIconButton-edgeStart']")));
		Burgermenu.click();
	    Thread.sleep(9000);
		WebElement Profile = new WebDriverWait(driver, 80)
	    .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiListItemButton-root MuiListItemButton-gutters MuiButtonBase-root text-black-50 css-16ac5r2-MuiButtonBase-root-MuiListItemButton-root']")));
		Profile.click();
	    Thread.sleep(9000);
		WebElement personalDetails = new WebDriverWait(driver, 80)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiListItemButton-root MuiListItemButton-gutters MuiButtonBase-root  css-13eg511-MuiButtonBase-root-MuiListItemButton-root']")));
		personalDetails.click();
		Thread.sleep(9000);
		WebElement contactdetails= new WebDriverWait(driver, 80)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiListItemButton-root MuiListItemButton-gutters MuiButtonBase-root  css-13eg511-MuiButtonBase-root-MuiListItemButton-root']")));
		contactdetails.click();
		Thread.sleep(9000);
		WebElement officialdetails= new WebDriverWait(driver, 80)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiListItemButton-root MuiListItemButton-gutters MuiButtonBase-root  css-13eg511-MuiButtonBase-root-MuiListItemButton-root']")));
		 officialdetails.click();
		 Thread.sleep(9000);
		WebElement familydetails= new WebDriverWait(driver, 80)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiListItemButton-root MuiListItemButton-gutters MuiButtonBase-root  css-13eg511-MuiButtonBase-root-MuiListItemButton-root']")));
		familydetails.click();
		 Thread.sleep(9000);
		WebElement educationdetails= new WebDriverWait(driver, 80)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiListItemButton-root MuiListItemButton-gutters MuiButtonBase-root  css-13eg511-MuiButtonBase-root-MuiListItemButton-root']")));
		 educationdetails.click();
		 Thread.sleep(9000);
		WebElement employmentdetails= new WebDriverWait(driver, 80)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiListItemButton-root MuiListItemButton-gutters MuiButtonBase-root  css-13eg511-MuiButtonBase-root-MuiListItemButton-root']")));
		employmentdetails.click();
		 Thread.sleep(9000);
		WebElement banktdetails= new WebDriverWait(driver, 80)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiListItemButton-root MuiListItemButton-gutters MuiButtonBase-root  css-13eg511-MuiButtonBase-root-MuiListItemButton-root']")));
		banktdetails.click();
		 Thread.sleep(9000);
		WebElement documents= new WebDriverWait(driver, 80)
		.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='MuiListItemButton-root MuiListItemButton-gutters MuiButtonBase-root  css-13eg511-MuiButtonBase-root-MuiListItemButton-root']")));
		 documents.click();
									
								
							
						
		
		
		
		
		
		
		
		
		}	    	
           @AfterMethod
           public void goToMainPage() {
}



}
		
		
		
		
		
		
		
		
		
		
		
		
		
		