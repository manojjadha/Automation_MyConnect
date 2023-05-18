package RegressionSuit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Browser.Pojo;
import com.MyConnect.Automation.ResistrationPage;
import com.automation.pageObjectModel.LoginPage;



public class VerifyLoginPage {
	
	WebDriver driver;
	@BeforeClass
	
	public void launchBrowser() {
		driver = Pojo.openChromeBrowser();
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	
	public void goToLoginPage() {
		driver.get("https://myconnect.tinggit.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@Test (priority = 1)
	
	public void verifyLoginWithValidUserNameAndPassword() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.sendValidUserNameAndValidPassword();	
		loginPage.clickLoginButton();
		
		
	}
	
	    @Test  (priority = 2)
	    public void verifyLoginWithInvalidUsernameAndInvalidPassword() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.sendInValidUserNameInvalidPassword();
		loginPage.clickLoginButton();
	}
	
	    @Test  (priority = 3)
	    public void verifyLoginWithInvalidUsernameAndvalidPassword() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.sendInValidUserNameValidPassword();
		loginPage.clickLoginButton();
	}
	
	    @Test  (priority = 4)
	    public void verifyLoginWithValidUsernameAndInvalidPassword() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.sendValidUserNameinValidPassword();
		loginPage.clickLoginButton();
	}
	
	
	@AfterMethod
	public void goToMainPage() throws InterruptedException {
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		}
	
	

}
