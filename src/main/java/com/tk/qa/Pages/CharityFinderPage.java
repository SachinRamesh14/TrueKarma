package com.tk.qa.Pages;

import java.awt.AWTException;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tk.qa.Base.BaseClass;

public class CharityFinderPage extends BaseClass {
	
	WebDriverWait wait;
	SignUpPage SignIn = new SignUpPage();
	BaseClass Robot=new BaseClass();
	HomePage Homepage=new HomePage(); 
	DonatePage DonatePage =new DonatePage();
	StringSelection stringSelection;
	JavascriptExecutor js;
	
	
	@FindBy(xpath="//span[text()='Charity Finder']")
	WebElement CharityFinder;

	@FindBy(xpath = "//div[text()='Charity Finder']")
	WebElement DashboardCharityFinder;
	
	@FindBy(xpath="//input[@placeholder='Search Charity Title']")
	WebElement SearchHere;

	@FindBy(xpath="//input[@placeholder='Search Blog Title']")
	WebElement SearchHereBlog;

	@FindBy(xpath="//option[contains(text(),'Others')]")
	WebElement SelectCategory;
	
	@FindBy(xpath="//option[contains(text(),'Others')]")
	WebElement SelectCategoryBlog;
	
	@FindBy(xpath="//div[@class='undefined p-1']")
	WebElement CharityCard;
	
	@FindBy(xpath="//p[text()='Score & Rating']")
	WebElement ScoreAndRating;
	
	@FindBy(xpath="//p[text()='Mission']")
	WebElement Mission;
	
	@FindBy(xpath="//p[text()='IRS Details']")
	WebElement IRSDetails;
	
	@FindBy(xpath="//button[text()='Donate Now']")
	WebElement DonateBtnCharity;
	
	@FindBy(xpath="//button[text()='I Want to Volunteer']")
	WebElement Volunteer;
	
	@FindBy(xpath="//input[@id='volunteerName']")
	WebElement volunteerName;
	
	@FindBy(xpath="//input[@label='Volunteer Email*']")
	WebElement volunteerEmail;
	
	@FindBy(xpath="//div[@class='my-5']//button[text()='Submit']")
	WebElement SubmitVolunteer;
	
	@FindBy(xpath="//button[@class='button_btn_style__dR_RH charity_charity_details_copy__k3LL_']")
	WebElement CopyButtonCharity;
	
	@FindBy(xpath="//img[@alt='linkedin']")
	WebElement linkedinCharity;
	
	@FindBy(xpath="//img[@alt='instagram']")
	WebElement instagramCharity;
	
	@FindBy(xpath="//img[@alt='facebook']")
	WebElement facebookCharity;
	
	@FindBy(xpath="//img[@alt='twitter']")
	WebElement twitter;
	
	@FindBy(xpath="//button[text()='Donate Now']")
	WebElement DonateNowCharity;
	
	@FindBy(xpath="//span[text()='Blogs']")
	WebElement Blogs;
	
	@FindBy(xpath="//li[text()='Blogs']")
	WebElement BottomPageBlogs;
	
	@FindBy(xpath="//div[@class='cards_card_style__q1ocT card ']")
	WebElement CardClick;

	//charity creation

	@FindBy(xpath = "//span[text()='Create New Charity']")
	WebElement ClickCreation;

	@FindBy(xpath = "//input[@id='charityName']")
	WebElement CharityName;

	@FindBy(xpath = "//input[@name='ein']")
	WebElement EINnumber;

	@FindBy(xpath = "//input[@id='email']")
	WebElement Email;

	@FindBy(xpath = "//input[@id='city']")
	WebElement City;

	@FindBy(xpath = "//input[@id='state']")
	WebElement State;

	@FindBy(xpath = "//input[@id='country']")
	WebElement Country;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement Submit;

	@FindBy(xpath = "//button[text()='Close']")
	WebElement CloseBtn;


	//Initial
		public CharityFinderPage()
		{
			PageFactory.initElements(driver, this);

		}

		//Action

		public String  HomePageTitle()
		{
			return driver.getTitle();

		}
		
		public void DonateNowCharity() throws InterruptedException, AWTException
		{
			Thread.sleep(5000);
			CharityFinder.click();
			SearchHere.sendKeys(prop.getProperty("SearchHere"));
			SelectCategory.click();
			Thread.sleep(2000);
			CharityCard.click();
			Thread.sleep(3000);
			ScoreAndRating.click();
			Mission.click();
			IRSDetails.click();
			DonateBtnCharity.click();
			Volunteer.click();
			volunteerName.sendKeys(prop.getProperty("volunteerName"));
			volunteerEmail.sendKeys(prop.getProperty("volunteerEmail"));
			SubmitVolunteer.click();			
			RobotClassBackward();	
			facebookCharity.click();
			RobotClassBackward();	
			linkedinCharity.click();
			RobotClassBackward();	
			instagramCharity.click();
			RobotClassBackward();			
			twitter.click();
			RobotClassBackward();
			Thread.sleep(5000);
			DonateBtnCharity.click();
			Homepage.DonationCharity();
			driver.getTitle();			
		}
		public void DonateNowCharityWithsignin() throws InterruptedException, AWTException
		{
			CharityFinder.click();
			Homepage.SignIn();
			Thread.sleep(5000);
			CharityFinder.click();
			SearchHere.sendKeys(prop.getProperty("SearchHere"));
			SelectCategory.click();
			CharityCard.click();
			Thread.sleep(5000);
			ScoreAndRating.click();
			Thread.sleep(5000);
			Mission.click();
			Thread.sleep(5000);
			IRSDetails.click();
			Thread.sleep(5000);
			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-5000)");
			DonateBtnCharity.click();
			Thread.sleep(5000);
			CopyButtonCharity.click();
			RobotClassCopyPaste();
			Thread.sleep(5000);
			RobotClassBackward();
			DonateBtnCharity.click();
			Homepage.WithsignDonationCharity();
			driver.getTitle();
						
		}

		public void CharityCreation() throws InterruptedException, AWTException
		{
			CharityFinder.click();
			Homepage.SignIn();
			Thread.sleep(5000);
			DashboardCharityFinder.click();
			SearchHere.sendKeys("vguvuvu");
			ClickCreation.click();
			CharityName.clear();
			CharityName.sendKeys(prop.getProperty("CharityName"));
			EINnumber.sendKeys(prop.getProperty("EINNumber"));
			Email.sendKeys(prop.getProperty("CharityEmail"));
			City.sendKeys(prop.getProperty("City"));
			State.sendKeys(prop.getProperty("State"));
			Country.sendKeys(prop.getProperty("Country"));
			Submit.click();
			Thread.sleep(5000);
			CloseBtn.click();

		}


		public void ListingOfBlog() throws InterruptedException, AWTException
		{
			Thread.sleep(5000);
			Blogs.click();
			SearchHereBlog.sendKeys(prop.getProperty("SearchHereBlog"));
			SelectCategoryBlog.click();
			CardClick.click();
			Thread.sleep(5000);
			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,5000);");
			Thread.sleep(5000);
			BottomPageBlogs.click();
			Thread.sleep(5000);
			SearchHereBlog.sendKeys(prop.getProperty("SearchHereBlog1"));
			SelectCategory.click();
			
						
		}
		
}
