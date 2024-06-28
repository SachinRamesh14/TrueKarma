package com.tk.qa.Testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tk.qa.Base.BaseClass;
import com.tk.qa.Pages.CharityFinderPage;
import com.tk.qa.Pages.DashboardDonateNow;
import com.tk.qa.Pages.DonatePage;
import com.tk.qa.Pages.EventPage;
import com.tk.qa.Pages.HomePage;
import com.tk.qa.Pages.SignUpPage;
import com.tk.qa.utilit.TestUtil;

public class DashboradDonateTest extends BaseClass {

	HomePage HomePage;
	WebDriverWait wait;
	String Signin;
	SignUpPage signUpPage;
	DonatePage DonatePage;
	TestUtil TestUtil;
	EventPage EventPage;
	CharityFinderPage CharityFinderPage;
	DashboardDonateNow DashboardDonateNow;

	public DashboradDonateTest() 
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
		DashboardDonateNow =new DashboardDonateNow();
	}
	@Test
	public void DonationCharity() throws InterruptedException, AWTException, IOException 
	{
		DashboardDonateNow.DonateNowCharity();
		DashboardDonateNow.MakeAGrant();
		DashboardDonateNow.Record();
		DashboardDonateNow.Report();
	}
	@Test
	public void FundCalculation() throws InterruptedException, AWTException, IOException 
	{
		DashboardDonateNow.DashboardCalculation();
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
