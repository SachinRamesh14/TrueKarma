package com.tk.qa.Testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tk.qa.Base.BaseClass;
import com.tk.qa.Pages.CharityFinderPage;
import com.tk.qa.Pages.DashboardAdminModule;
import com.tk.qa.Pages.DashboardDonateNow;
import com.tk.qa.Pages.DonatePage;
import com.tk.qa.Pages.EventPage;
import com.tk.qa.Pages.HomePage;
import com.tk.qa.Pages.SignUpPage;
import com.tk.qa.utilit.TestUtil;

public class DashboardAdminTest extends BaseClass {
	HomePage HomePage;
	WebDriverWait wait;
	String Signin;
	SignUpPage signUpPage;
	DonatePage DonatePage;
	TestUtil TestUtil;
	EventPage EventPage;
	CharityFinderPage CharityFinderPage;
	DashboardDonateNow DashboardDonateNow;
	DashboardAdminModule DashboardAdminModule;

	public DashboardAdminTest() 
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
		DashboardAdminModule =new DashboardAdminModule();
	}
	@Test
	public void AdminFundraiser() throws InterruptedException, AWTException, IOException 
	{

		try {
			DashboardAdminModule.AdminFundraiser();
			DashboardAdminModule.AdminEvent();
			DashboardAdminModule.AdminEventTransaction();
			DashboardAdminModule.EventAttendance();
		} 
		catch (Exception e1) {
			System.out.println("Error in AdminFundraiser: " + e1.getMessage());

			try {
				DashboardAdminModule.AdminEvent();
				DashboardAdminModule.AdminEventTransaction();
				DashboardAdminModule.EventAttendance();
			} 
			catch (Exception e2) {

				System.out.println("Error in AdminEvent: " + e2.getMessage());

				try {

					DashboardAdminModule.AdminEventTransaction();
					DashboardAdminModule.EventAttendance();
				} 
				catch (Exception e3) {

					System.out.println("Error in AdminEventTransaction: " + e3.getMessage());
				}
				try {
					DashboardAdminModule.EventAttendance();
				} 
				catch (Exception e4) {

					System.out.println("Error in EventAttendance: " + e4.getMessage());
				}
			}
		}		
	}


	@Test
	public void EditFundraiser() throws InterruptedException, AWTException
	{
		DashboardAdminModule.FundraiserEdit();
	}


	@Test
	public void AdminMyCharities() throws InterruptedException, AWTException, IOException
	{
		DashboardAdminModule.AdminCharity();

	}

	@Test
	public void TrueKarmaPoints() throws InterruptedException, IOException, AWTException
	{
		DashboardAdminModule.TrueKarmaPoints();
	}

	@AfterMethod
	public void tearDown(){		
		driver.quit();
	}
}
