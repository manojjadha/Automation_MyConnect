package com.MyConnect.Automation;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResistrationPage {
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//a[text()='Forgot Password?']")
	private WebElement forgetLink;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//button[text()='Login with SSO']")
	private WebElement loginwithSSO;
	
	@FindBy(xpath="//input[@id='defaultLoginFormRemember']")
	private WebElement keepmeSignInCheckBox;
	
	
	
	public ResistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendValidUserNameAndValidPassword() {
		username.sendKeys("manoj.jadhav@thehigherpitch.com");
		password.sendKeys("Sara@9090");
	}
	
	public void sendInValidUserNameInvalidPassword() {
		username.sendKeys("manoj.jadhav@thehigherpih.com");
		password.sendKeys("Sara@909");
	}
	
	
	public void sendInValidUserNameValidPassword() {
		username.sendKeys("manoj.jadhav@thehigherpih.com");
		password.sendKeys("Sara@9090");
	}
	
	public void sendValidUserNameinValidPassword() {
		username.sendKeys("manoj.jadhav@thehigherpitch.com");
		password.sendKeys("Sara@900");
	}
	
	
	
	public void clickLoginButton() {
		loginButton.click();
	}

}
