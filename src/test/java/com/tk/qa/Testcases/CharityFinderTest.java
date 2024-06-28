package com.tk.qa.Testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tk.qa.Base.BaseClass;
import com.tk.qa.Pages.CharityFinderPage;
import com.tk.qa.Pages.DonatePage;
import com.tk.qa.Pages.EventPage;
import com.tk.qa.Pages.HomePage;
import com.tk.qa.Pages.SignUpPage;
import com.tk.qa.utilit.TestUtil;

public class CharityFinderTest extends BaseClass {
	HomePage HomePage;
	WebDriverWait wait;
	String Signin;
	SignUpPage signUpPage;
	DonatePage DonatePage;
	TestUtil TestUtil;
	EventPage EventPage;
	CharityFinderPage CharityFinderPage;

	public CharityFinderTest() 
	{
		super();
	}



	@BeforeMethod
	public void Setup() throws InterruptedException
	{
		OpenHomePage();
		HomePage =new HomePage();	
		signUpPage =new SignUpPage();
		DonatePage =new DonatePage();
		TestUtil =new TestUtil();
		EventPage =new EventPage();
		CharityFinderPage=new CharityFinderPage();
	}
	@Test(testName="Charity Finder Donation")
	public void DonationCharity() throws InterruptedException, AWTException, IOException 
	{
		CharityFinderPage.DonateNowCharity();
		
	}

	@Test(testName="Charity Finder Donation Withsign")
	public void DonationCharityWithsign() throws InterruptedException, AWTException, IOException 
	{
		CharityFinderPage.DonateNowCharityWithsignin();
		
	}

	@Test(testName="Charity Creation")
	public void CharityCreation() throws InterruptedException, AWTException, IOException
	{
		CharityFinderPage.CharityCreation();

	}

	@Test(testName="Blog Listing")
	public void BlogListing() throws InterruptedException, AWTException, IOException 
	{
		CharityFinderPage.ListingOfBlog();
		
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}


