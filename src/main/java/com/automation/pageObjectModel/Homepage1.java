package com.automation.pageObjectModel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage1 {
	
		@FindBy(xpath="//*[@class=\"ps-2 fs-14 fontWeight500\" and text()=\"Home\"]")
		private WebElement homepagekButton;
		
		@FindBy(xpath="//label[text()='Announcement']")
		private WebElement AnnouncementSection;
		
		@FindBy(xpath="//label[text()='Upcoming Events']")
		private WebElement upcomingEventsSection;
		
		@FindBy(xpath="//label[text()='Job Referral']")
		private WebElement Jobreferralsection;
		
		@FindBy(xpath="//label[text()='Leader Speak']")
		private WebElement leaderSpeakButton;
		
		@FindBy(xpath="//label[text()='New Joiners']")
		private WebElement Newjoinerssection;
		
		@FindBy(xpath="//label[text()='Birthdays']")
		private WebElement Birthdayssection;
		
		@FindBy(xpath="////a[text()='Show More']")
		private WebElement Showmoresection;
		
		
		

			
		
private WebDriver driver;
private WebElement Announcementsection;
private WebElement upcomingEventssection;
private WebElement Jobreferralsection1;
private WebElement LeaderSpeaksection;
private WebElement NewJoinerssection;








		
/*		public void HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver = driver;
		}*/
		public Homepage1(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		public String verifyAnnouncement() {
			String Announcement = AnnouncementSection.getText();
			return Announcement;
		}
		
		public String verifyUpcomingEvents() {
			String upcomingEvents = upcomingEventsSection.getText();
			return upcomingEvents;
		}
		public String verifyJobReferral() {
			String JobReferral = Jobreferralsection.getText();
			return JobReferral;
		}
		public String verifyLeaderSpeak() {
			String LeaderSpeak = LeaderSpeaksection.getText();
			return LeaderSpeak;
		}
		public String verifyNewJoiners() {
			String NewJoiners = NewJoinerssection.getText();
			return NewJoiners;
		}
		public String verifyBirthdays() {
			String Birthdays = Birthdayssection.getText();
			return Birthdays;
		}


		public WebElement getAnnouncementsection() {
			return Announcementsection;
		}


		public void setAnnouncementsection(WebElement announcementsection) {
			Announcementsection = announcementsection;
		}


		public WebElement getUpcomingEventssection() {
			return upcomingEventssection;
		}


		public void setUpcomingEventssection(WebElement upcomingEventssection) {
			this.upcomingEventssection = upcomingEventssection;
		}


		public WebElement getJobreferralsection1() {
			return Jobreferralsection1;
		}


		public void setJobreferralsection1(WebElement jobreferralsection1) {
			Jobreferralsection1 = jobreferralsection1;
		}
		
		
		
		
		
		

	}



