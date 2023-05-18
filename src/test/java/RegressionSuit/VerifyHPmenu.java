package RegressionSuit;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.Browser.Pojo;
import com.automation.pageObjectModel.HomePage;

public class VerifyHPmenu {
	
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
			public void verifyHPmenu() throws InterruptedException {
	        Thread.sleep(9000);
	        Assert.assertTrue(driver.findElement(By.xpath("//nav[@class='bg-white hideHeaderScreen navbar navbar-expand-lg navbar-expand-xlg navbar-light nav-shadow p-0']")).isDisplayed());
			
	        }

	    @AfterMethod
	       public void goToMainPage() {
   }
}






