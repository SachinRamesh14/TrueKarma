package com.tk.qa.Testcases;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.tk.qa.Base.BaseClass;
import com.tk.qa.Pages.DonatePage;
import com.tk.qa.Pages.HomePage;
import com.tk.qa.Pages.SignUpPage;
import com.tk.qa.utilit.TestUtil;

public class DonatePageTest extends BaseClass {
	HomePage HomePage;
	WebDriverWait wait;
	String Signin;
	SignUpPage signUpPage;
	DonatePage DonatePage;
	TestUtil TestUtil;

	public DonatePageTest() 
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
	}
	@Test(description="CreateFundraiser",priority = 0)
	public void CreateFundraiser() throws InterruptedException, AWTException, IOException 
	{
		DonatePage.CreateFundraiser();
		
	}
	@Test(description="CreateFundraiser2",priority = 1)
	public void CreateFundraiser2() throws InterruptedException, AWTException, IOException 
	{
		DonatePage.CreateFundraiserTestCase2();
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
