package com.tk.qa.Pages;

import static org.testng.Assert.assertEquals;
import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.tk.qa.Base.BaseClass;

public class DonationCalculation extends BaseClass {
	WebDriverWait wait;
	SignUpPage SignInn = new SignUpPage();
	HomePage HomePage =new HomePage();
	BaseClass Robot=new BaseClass();
	DonatePage Donatepage =new DonatePage();
	JavascriptExecutor js;
	
	@FindBy(xpath="//div[@class='col-span-1 w-full sidebar']//div[@class='ml-5 pb-1 block']//a[text()='My Fundraisers']")
	WebElement MyFundraiser;
	
	@FindBy(xpath="//span[@class='pl-1']")
	WebElement title;
	
	@FindBy(xpath="//a[text()='Transaction Details']")
	WebElement TransactionDetails;
	
	@FindBy(xpath="//div[2]/div/span[@class='text-[#2285F9] font-medium text-lg']")
	WebElement Amount;
	

	
	//Page Factory-Object Repo
	@FindBy(xpath="//div[@class='header_truekarma_icon_desktop__4C8iI']//img[@alt='TrueKarma Logo']")
	WebElement TrueKarmaLogo;
	
	@FindBy(xpath="//div[@class='dashboard-header_logo_text__kDPw4']//img[@alt='TrueKarma Logo']")
	WebElement DashBoardTrueKarmaLogo;

	@FindBy(xpath="//div[text()='Donate']")
	WebElement DonateBtn;

	@FindBy(xpath="//div[@class=' mr-5 hidden md:block']//button[text()='Start Fundraiser/ Event']")
	WebElement StartFundraiserBtn;

	@FindBy(xpath="//div[text()='Events']")
	WebElement Events;

	@FindBy(xpath="//div[text()='Charity Finder']")
	WebElement CharityFinder;

	@FindBy(xpath="//div[text()='Blogs']")
	WebElement Blogs;

	@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div/div[2]/a[2]/div/div/button")
	WebElement SignIn;

	@FindBy(xpath="//button[text()='Donate Now, Grand later']")
	WebElement Grandlater;

	@FindBy(xpath="//span[@class='ml-2 mt-0.5 cursor-pointer']")
	WebElement InfoIcon;

	@FindBy(xpath="//div[@class='cards_card_style__q1ocT card ']")
	WebElement CardClick;	

	@FindBy(xpath="//h5[text()='chicago career fair']")
	WebElement CardClickCharity;

	@FindBy(xpath="//div[text()='Updates']")
	WebElement Updates;

	@FindBy(xpath="//div[text()='Supporters']")
	WebElement Supporters;

	@FindBy(xpath="//button[text()=' Donate Now']")
	WebElement DonateNow;

	@FindBy(xpath="//button[text()='Copy']")
	WebElement Copy;

	@FindBy(xpath="//p[text()='View all Fundraisers']")
	WebElement ViewAllFundraisers;

	@FindBy(xpath="//button[text()='Start Fundraiser']")
	WebElement urgentStartFundraiser;

	@FindBy(xpath="//div[@class='home_categories_card__mM5kU home_categories_card1__u3XCc p-4']//p[text()='Arts & Humanities']")
	WebElement categories;

	@FindBy(xpath="//div[@class='flex justify-center mt-10']//button[text()='Start Fundraiser']")
	WebElement BootomFundraiserButton;

	@FindBy(xpath="//div[text()='Nandita B']")
	WebElement SuccessStories;

	@FindBy(xpath="//div[@class='text-start']//div[@class='flex items-center']	")
	WebElement PaginationNext;

	@FindBy(xpath="//div[@class='text-end']//div[@class='flex items-center']")
	WebElement PaginationPrev;

	@FindBy(xpath="//button[text()='Report']")
	WebElement Report;

	@FindBy(xpath="//input[@name='reporterName']")
	WebElement reporterName;

	@FindBy(xpath="//input[@name='mailId']")
	WebElement Reportemail;

	@FindBy(xpath="//input[@name='report']")
	WebElement reportIssue;

	@FindBy(xpath="//textarea[@name='description']")
	WebElement Description;

	@FindBy(xpath="//button[text()='Submit']")
	WebElement Submit;

	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstNameBilling;

	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastNameBilling;

	@FindBy(xpath="//input[@id='email']")
	WebElement emailBilling;

	@FindBy(xpath="//input[@id='amount']")
	WebElement amountBilling;

	@FindBy(xpath="//input[@name='cardHolderName']")
	WebElement cardHolderNameBilling;

	@FindBy(xpath="//input[@name='cardNumber']")
	WebElement cardNumberBilling;

	@FindBy(xpath="//input[@name='expDate']")
	WebElement expDateBilling;

	@FindBy(xpath="//input[@name='cvv']")
	WebElement cvvBilling;

	@FindBy(xpath="//input[@name='streetAddress']")
	WebElement streetAddressBilling;

	@FindBy(xpath="//input[@name='unit']")
	WebElement unitBilling;

	@FindBy(xpath="//input[@name='city']")
	WebElement cityBilling;

	@FindBy(xpath="//select[@name='state']/option[6]")
	WebElement stateBilling;

	@FindBy(xpath="//input[@name='zipCode']")
	WebElement zipCodeBilling;

	@FindBy(xpath="//div[@class=' bg-[#C5D0D8] md:w-12 md:h-6 w-12 h-6 flex items-center  rounded-full p-1 ']")
	WebElement AnonymouslyBilling;

	@FindBy(xpath="//button[text()='Donate Now']")
	WebElement DonateNowBilling;

	@FindBy(xpath="//img[@alt='facebook']")
	WebElement facebook;

	@FindBy(xpath="//img[@alt='linkedin']")
	WebElement linkedin;

	@FindBy(xpath="//img[@alt='instagram']")
	WebElement instagram;

	@FindBy(xpath="//img[@alt='twitter']")
	WebElement twitter;

	@FindBy(xpath="//div[6]/div[2][@class='font-medium']")
	WebElement FundraiserAmount;


	
	
	//Initial
		public DonationCalculation()
		{
			PageFactory.initElements(driver, this);

		}

		//Action

		public String  HomePageTitle()
		{
			return driver.getTitle();

		}
	
		public void Calculation() throws InterruptedException, AWTException
		{
			HomePage.StartFundraiserBtn();
			Thread.sleep(2000);
			MyFundraiser.click();
			title.click();
			TransactionDetails.click();
			String A1=Amount.getText();
			System.out.println(A1);
			String stringWithoutDollar = A1.replace("$", "");
			float intValue = Float.parseFloat(stringWithoutDollar);
			System.out.println(intValue);
            Thread.sleep(10000);
			HomePage.DonateButton();
			Thread.sleep(5000);
			wait = new WebDriverWait(driver, 10); 

			CardClick .click();	
			Updates.click();
			Supporters.click();
			Copy.click();
			DonateNow.click();

			amountBilling.sendKeys(prop.getProperty("amountBilling"));

			cardHolderNameBilling.sendKeys(prop.getProperty("cardHolderNameBilling"));

			cardNumberBilling.sendKeys(prop.getProperty("cardNumberBilling"));

			expDateBilling.sendKeys(prop.getProperty("expDateBilling"));

			cvvBilling.sendKeys(prop.getProperty("cvvBilling"));

			streetAddressBilling.sendKeys(prop.getProperty("streetAddressBilling"));

			unitBilling.sendKeys(prop.getProperty("unitBilling"));

			cityBilling.sendKeys(prop.getProperty("cityBilling"));

			stateBilling.click();

			zipCodeBilling.sendKeys(prop.getProperty("zipCodeBilling"));

			AnonymouslyBilling.click();
			
		    Thread.sleep(5000);
			
			String A2=FundraiserAmount.getText();
			System.out.println(A2);
			String stringWithoutDollar1 = A2.replace("$", "");
			float intValue2 = Float.parseFloat(stringWithoutDollar1);
			System.out.println(intValue2);		
			DonateNowBilling.click();
			Donatepage.FeedbackSkip();
			//return intValue2;
			
			float FinalValue=intValue+intValue2;
			System.out.println(FinalValue);
			
			MyFundraiser.click();
			title.click();
			TransactionDetails.click();
			String A3=Amount.getText();
			System.out.println(A3);
			String stringWithoutDollar2 = A3.replace("$", "");
			float intValue3 = Float.parseFloat(stringWithoutDollar2);
			System.out.println(intValue3);
			
			if (intValue3 == FinalValue) {
	            System.out.println("Both values are equal!");
	        } else {
	            System.out.println("Values are not equal");
	        }
			
	
			
			
			
		}
	
		public float WithsigninDonation() throws InterruptedException
		{
			wait = new WebDriverWait(driver, 10); 

			CardClick .click();	
			Updates.click();
			Supporters.click();
			Copy.click();
			DonateNow.click();

			amountBilling.sendKeys(prop.getProperty("amountBilling"));

			cardHolderNameBilling.sendKeys(prop.getProperty("cardHolderNameBilling"));

			cardNumberBilling.sendKeys(prop.getProperty("cardNumberBilling"));

			expDateBilling.sendKeys(prop.getProperty("expDateBilling"));

			cvvBilling.sendKeys(prop.getProperty("cvvBilling"));

			streetAddressBilling.sendKeys(prop.getProperty("streetAddressBilling"));

			unitBilling.sendKeys(prop.getProperty("unitBilling"));

			cityBilling.sendKeys(prop.getProperty("cityBilling"));

			stateBilling.click();

			zipCodeBilling.sendKeys(prop.getProperty("zipCodeBilling"));

			AnonymouslyBilling.click();
			
		    Thread.sleep(5000);
			
			String A2=FundraiserAmount.getText();
			System.out.println(A2);
			String stringWithoutDollar1 = A2.replace("$", "");
			float intValue2 = Float.parseFloat(stringWithoutDollar1);
			System.out.println(intValue2);		
			DonateNowBilling.click();
			return intValue2;

		}
		

}
