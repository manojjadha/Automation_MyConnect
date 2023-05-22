package com.automation.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RAndRAwardPage {
	@FindBy(xpath="(//span[text()='R&R'][1]")
	private WebElement RAndRButton;
	
	@FindBy(xpath="(//span[text()='Awards(Quarterly and Spot)'][1]")
	private WebElement awardButton;
	
	@FindBy(xpath="//label[text()='Announcement']")
	private WebElement announcementSection;
	
	@FindBy(xpath="//label[text()='Upcoming Events']")
	private WebElement upcomingEventsSection;
	
	@FindBy(xpath="//span[text()='Comment']")
	private WebElement commentButton;
	
	@FindBy(xpath="//textarea[@name='commentField']")
	private WebElement commentBox;
	
	@FindBy(xpath="//button[text()='Post']")
	private WebElement postButton;
	
	
	
	
	
	public RAndRAwardPage(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}
	
	
	public void clickRAndRButton() throws InterruptedException {
		RAndRButton.click();
		Thread.sleep(2000);
		awardButton.click();
	}
	
	public String verifyAnnouncement() {
		String announcementText = announcementSection.getText();
		return announcementText;
	}
	
	public String verifyUpcomingEvents() {
		String upcomingEvents = upcomingEventsSection.getText();
		return upcomingEvents;
	}
	
	public void sendComment() throws InterruptedException {
		commentButton.click();
		Thread.sleep(2000);
		commentBox.sendKeys("Nice!");
		
	}
	
	public void clickSendPost() {
		postButton.click();
	}
	
}
