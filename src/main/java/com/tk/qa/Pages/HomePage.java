package com.tk.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tk.qa.Base.BaseClass;

public class HomePage extends BaseClass{

	WebDriverWait wait;
	SignUpPage SignInn = new SignUpPage();
	BaseClass Robot=new BaseClass();
	JavascriptExecutor js;


	//Page Factory-Object Repo
	@FindBy(xpath="//div[@class='header_truekarma_icon_desktop__4C8iI']")
	WebElement TrueKarmaLogo;
	
	@FindBy(xpath="//div[@class='dashboard-header_logo_text__kDPw4']//img[@alt='TrueKarma Logo']")
	WebElement DashBoardTrueKarmaLogo;
	
	@FindBy(xpath="//button[text()='Go to home']")
	WebElement Gotohome;

	@FindBy(xpath="//span[text()='Donate']")
	WebElement DonateBtn;

	@FindBy(xpath="//div[text()='Donate']")
	WebElement DashboardDonateBtn;

	@FindBy(xpath="//div[@class=' mr-5 hidden md:block']//button[text()='Start Fundraiser/ Event']")
	WebElement StartFundraiserBtn;

	@FindBy(xpath="//span[text()='Events']")
	WebElement Events;

	@FindBy(xpath="//span[text()='Charity Finder']")
	WebElement CharityFinder;

	@FindBy(xpath="//span[text()='Blogs']")
	WebElement Blogs;

	@FindBy(xpath="//div[2]//button[contains(text(), 'Sign In')]")
	WebElement SignIn;

	@FindBy(xpath="//button[text()='Donate Now, Grant later']")
	WebElement Grandlater;
	
	@FindBy(xpath="//span[@class='ml-2 mt-0.5 cursor-pointer']")
	WebElement InfoIcon;

	@FindBy(xpath="//div[@class='cards_card_style__q1ocT card ']")
	WebElement CardClick;	

	@FindBy(xpath="//h5[text()='help aashvi to fight for premature arrival']")
	WebElement CardClickCharity;

	@FindBy(xpath="//html/body/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div[2]/div[1]/div[2]")
	WebElement Updates;

	@FindBy(xpath="//div[text()='Supporters']")
	WebElement Supporters;

	@FindBy(xpath="//button[text()=' Donate Now']")
	WebElement DonateNow;
	
	@FindBy(xpath="//button[text()='I Want to Attend']")
	WebElement BookNow;

	@FindBy(xpath="//button[text()='Copy']")
	WebElement Copy;

	@FindBy(xpath="//p[text()='View all Fundraisers']")
	WebElement ViewAllFundraisers;

	@FindBy(xpath="//button[text()='Start Fundraiser']")
	WebElement urgentStartFundraiser;

	@FindBy(xpath="/html/body/div[1]/div[2]/main/div/div/div[4]/div[3]/div/div/div/div[7]/div/div/div/a/div/div/p")
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

	@FindBy(xpath="//div[3]//button[text()='Submit']")
	WebElement Submit;

	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstNameBilling;
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstNameBillingEvent;

	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastNameBillingEvent;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastNameBilling;

	@FindBy(xpath="//input[@id='email']")
	WebElement emailBilling;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement emailBillingEvent;


	@FindBy(xpath="//input[@id='amount']")
	WebElement amountBilling;

	@FindBy(xpath="//input[@name='cardHolderName']")
	WebElement cardHolderNameBilling;

	@FindBy(xpath="//input[@name='cardNumber']")
	WebElement cardNumberBilling;

	@FindBy(xpath="//input[@name='expDate']")
	WebElement expDateBilling;
	
	@FindBy(xpath="//input[@name='expiryDate']")
	WebElement expDateBillingEvent;

	@FindBy(xpath="//input[@name='cvv']")
	WebElement cvvBilling;

	@FindBy(xpath="//input[@name='streetAddress']")
	WebElement streetAddressBilling;

	@FindBy(xpath="//input[@name='unit']")
	WebElement unitBilling;
	
	@FindBy(xpath="//input[@name='appartmentNumber']")
	WebElement unitBillingEvent;

	@FindBy(xpath="//input[@name='city']")
	WebElement cityBilling;

	@FindBy(xpath="//select[@name='state']/option[6]")
	WebElement stateBilling;
	
	@FindBy(xpath="//select[@name='states']/option[6]")
	WebElement stateBillingEvent;

	@FindBy(xpath="//input[@name='zipCode']")
	WebElement zipCodeBilling;

	@FindBy(xpath="//div[@class=' bg-[#C5D0D8] md:w-12 md:h-6 w-12 h-6 flex items-center  rounded-full p-1 ']")
	WebElement AnonymouslyBilling;
	
	@FindBy(xpath="//div[@class=' bg-[#C5D0D8] md:w-12 md:h-6 w-12 h-6 flex items-center  rounded-full p-1 cursor-pointer']")
	WebElement AnonymouslyBillingCharity;

	@FindBy(xpath="//button[text()='Donate Now']")
	WebElement DonateNowBilling;
	
	@FindBy(xpath="//button[text()='Book Now']")
	WebElement BookNowBilling;
	
	@FindBy(xpath="//img[@alt='facebook']")
	WebElement facebook;

	@FindBy(xpath="//img[@alt='linkedin']")
	WebElement linkedin;

	@FindBy(xpath="//img[@alt='instagram']")
	WebElement instagram;

	@FindBy(xpath="//img[@alt='twitter']")
	WebElement twitter;

	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div/div/div[4]/div[2]")
	WebElement FundraiserAmount;

	@FindBy(xpath="//div[@class='w-4/12 pe-2 pt-2 flex justify-end']//*[name()='svg']")
	WebElement TicketIncrease;
	
	@FindBy(xpath="//input[@name='answer1']")
	WebElement CustomAnswer1;
	
	@FindBy(xpath="//input[@name='answer2']")
	WebElement CustomAnswer2;

	@FindBy(xpath = "//div[@class='cards_card_style__q1ocT card ']")
	WebElement EventClick;

	//Initial
	public HomePage()
	{
		PageFactory.initElements(driver, this);

	}

	//Action

	public String  HomePageTitle()
	{
		return driver.getTitle();

	}
	
	public void TrueKarmaLogo() throws InterruptedException
	{
		TrueKarmaLogo.click();
		
	}
	
	public void DashBoardTrueKarmaLogo() throws InterruptedException
	{
		DashBoardTrueKarmaLogo.click();

	}

	public void StartFundraiserBtn() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 10); 

		StartFundraiserBtn.click();

		SignInn.SignInPage();
		
		Thread.sleep(2000);

	}
	public void DonateButton() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 10); 

		DonateBtn.click();


	}
	public void Events() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 10); 

		Events.click();	

	}

	public void CharityFinder() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 10); 

		CharityFinder.click();	

	}
	public void Blogs() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 10); 

		Blogs.click();	

	}
	public void SignIn() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 10); 

		SignIn.click();	

		SignInn.SignInPage();

	}
	public void Grandlater() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 10); 

		Grandlater.click();	

		SignInn.SignInPage();


	}
	public void InfoIcon() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 10); 
		
		js.executeScript("arguments[0].scrollIntoView(true)", Grandlater);
		Thread.sleep(2000);
		
		InfoIcon.click();	

	}
	public void CardClick() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 10); 

		CardClick .click();	
		Updates.click();
		Supporters.click();
		Copy.click();
		DonateNow.click();

	}
	public void ViewAllFundraisers() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 20); 
		Thread.sleep(5000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(5000);
		ViewAllFundraisers.click();
		urgentStartFundraiser.click();	
		SignInn.SignInPage();
		driver.getTitle();					
	}

	public void ViewAllFundraisersCards() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 10); 
		Thread.sleep(2000);
		CardClick.isDisplayed();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(5000);		
		ViewAllFundraisers.click();
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000);");
		PaginationNext.click();
		Thread.sleep(5000);
		PaginationPrev.click();
		Thread.sleep(10000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500);");
		Thread.sleep(10000);
		CardClick.click();
		Updates.click();
		Supporters.click();
		Copy.click();
			

	}
	public void categories() throws InterruptedException
	{
		Thread.sleep(5000);
		TrueKarmaLogo.click();
		Thread.sleep(5000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(5000);	
		categories.click();
		Thread.sleep(5000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(5000);
		CardClickCharity .click();	
		Updates.click();
		Supporters.click();
		Copy.click();
		DonateNow.click();
		DonationTC2();
		Thread.sleep(2000);

	}
	public void SuccessStoriesBottomButton() throws InterruptedException
	{
		
		Thread.sleep(5000);
		TrueKarmaLogo.click();
		Thread.sleep(5000);
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(5000);
		SuccessStories.click();	
		Thread.sleep(5000);	
		driver.navigate().back();
		BootomFundraiserButton.click();
		SignInn.SignInPage();

	}
	public void Report() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 10); 
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100);");
		CardClick.click();	
		Thread.sleep(2000);
		Updates.click();
		Thread.sleep(2000);
		Supporters.click();
		Thread.sleep(2000);
		Copy.click();
		Thread.sleep(2000);
		Report.click();
		reporterName.sendKeys(prop.getProperty("reporterName"));
		Reportemail.sendKeys(prop.getProperty("Email"));
		reportIssue.sendKeys(prop.getProperty("report"));
		Description.sendKeys(prop.getProperty("Description"));
		Submit.click();
		Thread.sleep(2000);	
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-200);");
		DonateNow.click();


	}
	public void Donation()
	{
		wait = new WebDriverWait(driver, 10); 

		CardClick.click();	
		Updates.click();
		Supporters.click();
		Copy.click();
		DonateNow.click();

		firstNameBilling.sendKeys(prop.getProperty("firstNameBilling"));

		lastNameBilling.sendKeys(prop.getProperty("lastNameBilling"));

		emailBilling.sendKeys(prop.getProperty("emailBilling"));

		amountBilling.sendKeys(prop.getProperty("amountBilling"));

		cardHolderNameBilling.sendKeys(prop.getProperty("cardHolderNameBilling"));

		cardNumberBilling.sendKeys(prop.getProperty("cardNumberBilling"));

		expDateBilling.sendKeys(prop.getProperty("expDateBilling"));

		cvvBilling.sendKeys(prop.getProperty("cvvBilling"));

		streetAddressBilling.sendKeys(prop.getProperty("streetAddressBilling"));

		unitBillingEvent.sendKeys(prop.getProperty("unitBilling"));

		cityBilling.sendKeys(prop.getProperty("cityBilling"));

		stateBilling.click();

		zipCodeBilling.sendKeys(prop.getProperty("zipCodeBilling"));

		AnonymouslyBilling.click();

		DonateNowBilling.click();

	}
	public void WithsigninDonation() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 10); 		
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//*[contains(text(),'testing for fund')]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);			
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
			
		DonateNowBilling.click();

	}
	public void WithsigninEvent() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 10); 
		EventClick.click();
		BookNow.click();	
		TicketIncrease.click();
		TicketIncrease.click();
		TicketIncrease.click();
		Thread.sleep(5000);
		CustomAnswer1.sendKeys(prop.getProperty("CustomAnswer1"));
		CustomAnswer2.sendKeys(prop.getProperty("CustomAnswer2"));
		
		cardHolderNameBilling.sendKeys(prop.getProperty("cardHolderNameBilling"));

		cardNumberBilling.sendKeys(prop.getProperty("cardNumberBilling"));

		expDateBillingEvent.sendKeys(prop.getProperty("expDateBilling"));

		cvvBilling.sendKeys(prop.getProperty("cvvBilling"));

		streetAddressBilling.sendKeys(prop.getProperty("streetAddressBilling"));

		unitBillingEvent.sendKeys(prop.getProperty("unitBilling"));

		cityBilling.sendKeys(prop.getProperty("cityBilling"));

		stateBillingEvent.click();

		zipCodeBilling.sendKeys(prop.getProperty("zipCodeBilling"));
	
		BookNowBilling.click();
	}
	
	public void WithoutsigninEvent() throws InterruptedException
	{
		wait = new WebDriverWait(driver, 10); 

		CardClick .click();	
		BookNow.click();
		
		firstNameBillingEvent.sendKeys(prop.getProperty("firstNameBilling"));

		lastNameBillingEvent.sendKeys(prop.getProperty("lastNameBilling"));

		emailBillingEvent.sendKeys(prop.getProperty("emailBilling"));
		TicketIncrease.click();
		TicketIncrease.click();
		TicketIncrease.click();
		Thread.sleep(5000);
		CustomAnswer1.sendKeys(prop.getProperty("CustomAnswer1"));
		CustomAnswer2.sendKeys(prop.getProperty("CustomAnswer2"));
		
		cardHolderNameBilling.sendKeys(prop.getProperty("cardHolderNameBilling"));

		cardNumberBilling.sendKeys(prop.getProperty("cardNumberBillingEvent"));

		expDateBillingEvent.sendKeys(prop.getProperty("expDateBilling"));

		cvvBilling.sendKeys(prop.getProperty("cvvBillingEvent"));

		streetAddressBilling.sendKeys(prop.getProperty("streetAddressBilling"));

		unitBillingEvent.sendKeys(prop.getProperty("unitBilling"));

		cityBilling.sendKeys(prop.getProperty("cityBilling"));

		stateBillingEvent.click();

		zipCodeBilling.sendKeys(prop.getProperty("zipCodeBilling"));
	
		BookNowBilling.click();
	}

	
	public void ShareDonation() throws InterruptedException, AWTException {

		wait = new WebDriverWait(driver, 10); 
		Thread.sleep(5000);

		CardClick .click();	
		Updates.click();
		Supporters.click();		
		Thread.sleep(5000);
		Copy.click();
		Thread.sleep(5000);
		RobotClassCopyPaste();	
		RobotClassBackward();
		driver.getTitle();
		twitter.click();
		RobotClassBackward();	
		facebook.click();
		RobotClassBackward();	
		linkedin.click();
		RobotClassBackward();	
		instagram.click();
		RobotClassBackward();			
		
	
	}
	public void ReportTC1() throws InterruptedException
	{
		Thread.sleep(2000);
		Report.click();
		reporterName.sendKeys(prop.getProperty("reporterName"));
		Reportemail.sendKeys(prop.getProperty("Email"));
		reportIssue.sendKeys(prop.getProperty("report"));
		Description.sendKeys(prop.getProperty("Description"));
		Submit.click();
		Thread.sleep(2000);	
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1700);");
		Thread.sleep(10000);
		DonateNow.click();
	}
	public void DonationCharity()
	{
		wait = new WebDriverWait(driver, 10); 

		firstNameBilling.sendKeys(prop.getProperty("firstNameBilling"));

		lastNameBilling.sendKeys(prop.getProperty("lastNameBilling"));

		emailBilling.sendKeys(prop.getProperty("emailBilling"));

		amountBilling.sendKeys(prop.getProperty("amountBilling"));

		cardHolderNameBilling.sendKeys(prop.getProperty("cardHolderNameBilling"));

		cardNumberBilling.sendKeys(prop.getProperty("cardNumberBillingCharity"));

		expDateBilling.sendKeys(prop.getProperty("expDateBilling"));

		cvvBilling.sendKeys(prop.getProperty("cvvBillingCharity"));

		streetAddressBilling.sendKeys(prop.getProperty("streetAddressBilling"));

		unitBilling.sendKeys(prop.getProperty("unitBilling"));

		cityBilling.sendKeys(prop.getProperty("cityBilling"));

		stateBilling.click();

		zipCodeBilling.sendKeys(prop.getProperty("zipCodeBilling"));

		AnonymouslyBillingCharity.click();

		DonateNowBilling.click();

	}
	
	public void WithsignDonationCharity()
	{
		wait = new WebDriverWait(driver, 10); 

		amountBilling.sendKeys(prop.getProperty("amountBilling"));

		cardHolderNameBilling.sendKeys(prop.getProperty("cardHolderNameBilling"));

		cardNumberBilling.sendKeys(prop.getProperty("cardNumberBillingDoantion"));

		expDateBilling.sendKeys(prop.getProperty("expDateBilling"));

		cvvBilling.sendKeys(prop.getProperty("cvvBillingDoantion"));

		streetAddressBilling.sendKeys(prop.getProperty("streetAddressBilling"));

		unitBilling.sendKeys(prop.getProperty("unitBilling"));

		cityBilling.sendKeys(prop.getProperty("cityBilling"));

		stateBilling.click();

		zipCodeBilling.sendKeys(prop.getProperty("zipCodeBilling"));

		AnonymouslyBillingCharity.click();

		DonateNowBilling.click();

	}
	
	
	public void DonationTC2()
	{
		wait = new WebDriverWait(driver, 10); 

		firstNameBilling.sendKeys(prop.getProperty("firstNameBilling"));

		lastNameBilling.sendKeys(prop.getProperty("lastNameBilling"));

		emailBilling.sendKeys(prop.getProperty("emailBilling"));

		amountBilling.sendKeys(prop.getProperty("amountBilling"));

		cardHolderNameBilling.sendKeys(prop.getProperty("cardHolderNameBilling"));

		cardNumberBilling.sendKeys(prop.getProperty("cardNumberBillingMaster"));

		expDateBilling.sendKeys(prop.getProperty("expDateBilling"));

		cvvBilling.sendKeys(prop.getProperty("cvvBilling"));

		streetAddressBilling.sendKeys(prop.getProperty("streetAddressBilling"));

		unitBilling.sendKeys(prop.getProperty("unitBilling"));

		cityBilling.sendKeys(prop.getProperty("cityBilling"));

		stateBilling.click();

		zipCodeBilling.sendKeys(prop.getProperty("zipCodeBilling"));

		AnonymouslyBilling.click();

		DonateNowBilling.click();

	}
	public void ReferralSocialMedia() throws InterruptedException, AWTException
	{
		Thread.sleep(5000);
	
		facebook.click();
		RobotClassBackward();	
		linkedin.click();
		RobotClassBackward();	
		instagram.click();
		RobotClassBackward();			
		Copy.click();
		Thread.sleep(5000);
	}
	public void WithoutsigninDonationTC2()
	{
		wait = new WebDriverWait(driver, 10); 

		amountBilling.sendKeys(prop.getProperty("amountBilling"));

		cardHolderNameBilling.sendKeys(prop.getProperty("cardHolderNameBilling"));

		cardNumberBilling.sendKeys(prop.getProperty("cardNumberBillingMaster"));

		expDateBilling.sendKeys(prop.getProperty("expDateBilling"));

		cvvBilling.sendKeys(prop.getProperty("cvvBilling"));

		streetAddressBilling.sendKeys(prop.getProperty("streetAddressBilling"));

		unitBilling.sendKeys(prop.getProperty("unitBilling"));

		cityBilling.sendKeys(prop.getProperty("cityBilling"));

		stateBilling.click();

		zipCodeBilling.sendKeys(prop.getProperty("zipCodeBilling"));

		AnonymouslyBilling.click();

		DonateNowBilling.click();

	}
}
