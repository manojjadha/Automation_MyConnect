package com.automation.pageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage2 {
	
		

		@FindBy(xpath="//span[text()='Leader Speak']")
		private WebElement leaderSpeakButton;
		
		@FindBy(xpath="//label[text()='Announcement']")
		private WebElement announcementSection;
		
		@FindBy(xpath="//label[text()='Upcoming Events']")
		private WebElement upcomingEventsSection;
		
		@FindBy(xpath="//*[@href=\"/announcements\" and text()='Show More']")
		private WebElement showmoreButton;
		
		@FindBy(xpath="(//a[text()='Read More']")
		private WebElement readMoreButton;
		
		@FindBy(xpath="(//a[@class='text-decoration-underline fw-bold ps-2']")
		private WebElement showlessButton;
		
		@FindBy(xpath="(//a[@class='text-decoration-underline fw-bold ps-2']")
		private WebElement actualdate;

		
		
		
		
		
		
		
		
		
		
		
		
		
		public homepage2(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void clickLeaderSpeakButton() {
			leaderSpeakButton.click();
		}
		
		public String verifyAnnouncement() {
			String announcementText = announcementSection.getText();
			showmoreButton.click();
			return announcementText;
		}
		
		public String verifyUpcomingEvents() {
			String upcomingEvents = upcomingEventsSection.getText();
			return upcomingEvents;
		}
		
		public void clickshowmoreButton() {
			showmoreButton.click();
           
	}
		public void clickReadMoreButton() {
			readMoreButton.click();
		

	}
		public void clickshowlessButton() {
			showlessButton.click();
		
		}

		
		}
			



