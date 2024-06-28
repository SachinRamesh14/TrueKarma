package com.tk.qa.Pages;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tk.qa.Base.BaseClass;

public class DashboardAdminModule extends BaseClass{
	WebDriverWait wait;
	SignUpPage SignIn = new SignUpPage();
	BaseClass Robot=new BaseClass();
	HomePage Homepage=new HomePage(); 
	DonatePage DonatePage =new DonatePage();
	StringSelection stringSelection;
	JavascriptExecutor js;

	@FindBy(xpath = "//div[@class='col-span-1 w-full sidebar']//div[@class='ml-5 pb-1 block']//a[text()='My Fundraisers']")
	WebElement myFundraisers;

	@FindBy(xpath = "//span[@class='pl-1']")
	WebElement title;

	@FindBy(xpath = "//a[text()='Post Update']")
	WebElement postUpdate;

	@FindBy(xpath = "//button[text()='Post Updates']")
	WebElement postButton;

	@FindBy(xpath = "//span[text()='Choose image']")
	WebElement postImage;

	@FindBy(xpath = "//div[@class='col-span-2 w-11/12 mx-auto']//button[text()='Submit']")
	WebElement SubmitButtonPost;


	@FindBy(xpath = "//textarea[@name='description']")
	WebElement description;

	@FindBy(xpath = "//a[text()='Transaction Details']")
	WebElement transactionDetails;

	@FindBy(xpath = "//button[text()='Withdraw']")
	WebElement withdraw;

	@FindBy(xpath = "//input[@name='organiserName']")
	WebElement organiserName;

	@FindBy(xpath = "//input[@id='phoneNumber']")
	WebElement phoneNumber;

	@FindBy(xpath = "//input[@name='email']")
	WebElement email;

	@FindBy(xpath = "//input[@name='streetaddress1']")
	WebElement streetAddress1;

	@FindBy(xpath = "//input[@name='streetaddress2']")
	WebElement streetAddress2;

	@FindBy(xpath = "//input[@name='city']")
	WebElement city;

	@FindBy(xpath = "//select[@name='states']/option[5]")
	WebElement state;

	@FindBy(xpath = "//input[@name='zipcode']")
	WebElement zipcode;

	@FindBy(xpath = "//input[@name='amount']")
	WebElement amount;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div/div/div[2]/div/form/div[8]/div/div[1]/input")
	WebElement checkBox;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div/div/div[2]/div/form/div[9]/div/div[1]/input")
	WebElement checkBox1;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitButton;

	@FindBy(xpath = "//div[@class='col-span-1 w-full sidebar']//div[@class='ml-5 pb-1 block']//a[text()='My Events']")
	WebElement myEvents;

	@FindBy(xpath = "//span[@class='text-capitalize text-sm font-medium']")
	WebElement events;

	@FindBy(xpath = "//button[text()='Edit']")
	WebElement edit;

	@FindBy(xpath = "//input[@placeholder = \"Book reading\"]")
	WebElement eventTitle;

	@FindBy(xpath = "//div[@class='ql-container ql-snow']//div[@class='ql-editor']")
	WebElement descriptionEvent;

	@FindBy(xpath = "//select[@id='organisingEvent']/option[3]")
	WebElement organisingEvent;

	@FindBy(xpath = "//select[@name='eventCategory']/option[3]")
	WebElement eventCategory;

	@FindBy(xpath = "//input[@name='eventTime']")
	WebElement eventTime;

	@FindBy(xpath = "//select[@name='eventTimeZone']/option[3]")
	WebElement eventTimeZone;

	@FindBy(xpath = "//input[@id='totalNumberOfTicket']")
	WebElement totalTickets;

	@FindBy(xpath = "//span[@class='add_field_array']")
	WebElement addAnother;

	@FindBy(xpath = "//input[@name='eventTicket[1].ticketType']")
	WebElement ticketType;

	@FindBy(xpath = "//input[@name='eventTicket[1].price']")
	WebElement eventTicketPrice;

	@FindBy(xpath = "//input[@name='eventTicket[1].quantity']")
	WebElement quantity;

	@FindBy(xpath = "//input[@name='userName']")
	WebElement personName;

	@FindBy(xpath = "//input[@name='streetAddress']")
	WebElement streetAddress;

	@FindBy(xpath = "//input[@id='city']")
	WebElement cityEvent;

	@FindBy(xpath = "//div[@class='col-lg-4 col-md-6 col-sm-12 padding0']//select[@name='states']/option[3]")
	WebElement states;

	@FindBy(xpath = "//input[@name='zipCode']")
	WebElement zipCode;

	@FindBy(xpath = "//input[@name='customQuestion1']")
	WebElement customQuestion1;

	@FindBy(xpath = "//input[@name='customQuestion2']")
	WebElement customQuestion2;

	@FindBy(xpath = "//div[@class='grid sm:grid-cols-3 grid-cols-1 ']//input[@name='organiserName']")
	WebElement organiserNameEvent;

	@FindBy(xpath = "//div[@class='grid sm:grid-cols-3 grid-cols-1 ']//input[@name='organiserEmail']")
	WebElement organiserEmail;

	@FindBy(xpath = "//div[@class='grid sm:grid-cols-3 grid-cols-1 ']//input[@id='organiserPhone']")
	WebElement organiserPhone;

	@FindBy(xpath = "//div[@class='grid sm:grid-cols-3 grid-cols-1 ']//input[@id='organiserAge']")
	WebElement organiserAge;

	@FindBy(xpath = "//div[@class='w-6/12 flex justify-end me-2']//button[text()='Add new']")
	WebElement addNewSponsorButton;

	@FindBy(xpath = "//input[@name='sponsersName']")
	WebElement sponsorsNameInput;

	@FindBy(xpath = "//div[@class='flex items-center justify-center ']//div[@class='preview_Sponsor']")
	WebElement sponsorImage;

	@FindBy(xpath = "//div[@class='flex justify-end mt-7']//button[@class='button_btn_style__dR_RH undefined']")
	WebElement submitButtonImg;

	@FindBy(xpath = "//div[@class='flex items-center']//button[@type='submit']")
	WebElement saveSponsorButton;

	@FindBy(xpath = "//div[@class='mt-3 rounded-lg bg-white px-3 pb-5']//button[text()='Add new']")
	WebElement addPromocode;

	@FindBy(xpath = "//input[@id='PercentageDiscount']")
	WebElement percentageDiscount;

	@FindBy(xpath = "//input[@id='codeExpiryDate']")
	WebElement codeExpiryDate;

	@FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--030']")
	WebElement codeExpiryDate1;

	@FindBy(xpath = "//input[@id='code']")
	WebElement code;

	@FindBy(xpath = "//input[@id='codeLimit']")
	WebElement codeLimit;

	@FindBy(xpath = "//button[text()='Add']")
	WebElement AddcodeLimit;

	@FindBy(xpath = "//div[@class='flex items-center']//button[@type='submit']")
	WebElement saveButton;

	@FindBy(xpath = "//div[@class='flex items-center']//button[text()='Save']")
	WebElement saveEdit;

	@FindBy(xpath = "//span[text()='Transactions']")
	WebElement Transactions;

	@FindBy(xpath = "//span[text()='Event Attendance']")
	WebElement eventAttendance;

	@FindBy(xpath = "//select[@class='quantity-filter border font-medium p-1 rounded-md']")
	WebElement ticketDropdown;

	@FindBy(xpath = "//input[@class='search_input border w-full rounded-md h-12 pl-10']")
	WebElement search;

	@FindBy(xpath = "//div[@class='bg-white border rounded-l-md font-medium py-2 px-3 text-center']")
	WebElement notArrived;

	@FindBy(xpath = "//button[text()='Mark as Arrived']")
	WebElement markAsArrived;

	//My Charities

	@FindBy(xpath = "//div[@class='col-span-1 w-full sidebar']//div[@class='ml-5 pb-1 block']//a[text()='My Charities']")
	WebElement MyCharities;

	@FindBy(xpath = "//h3")
	WebElement Validatecharitypage;

	@FindBy(xpath = "//p[text()='Approved Requests']")
	WebElement ClickApprReq;

	@FindBy(xpath = "//span[text()='66-2255880']")
	WebElement ClickEdit;

	@FindBy(xpath = "//*[@id='charityName']")
	WebElement ChangeName;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement SubmitBtn;

	@FindBy(xpath = "//p[text()='Favorite Charities']")
	WebElement ClickFavCharity;

	@FindBy(xpath = "//button[text()='Donate']")
	WebElement DonateCharity;

	@FindBy(xpath = "//button[text()='Donate Now']")
	WebElement DonateNowBtn;

	@FindBy(xpath = "//button[@class='button_btn_style__dR_RH cursor-pointer hover:border-[#394E60]/70 text-sm font-semibold rounded-full border-[#C5D0D8] border-[1px]']")
	WebElement RemoveCharity;

	// TrueKarma Points

	@FindBy(xpath = "//div[@class='col-span-1 w-full sidebar']//div[@class='ml-5 pb-1 block']//a[text()='TrueKarma Points']")
	WebElement ClickTrueKarmaPoints;

	@FindBy(xpath = "//table[@class='w-full']")
	WebElement GetTableData;

	@FindBy(xpath = "//button[text()='Edit']")
	WebElement EditBtn;

	@FindBy(xpath = "//input[@id='title']")
	WebElement CampaignName;

	@FindBy(xpath = "//input[@id='targetAmount']")
	WebElement AmountGoal;

	@FindBy(xpath = "//input[@id='organizerName']")
	WebElement OrganizerName;

	@FindBy(xpath = "//input[@label='Phone Number*']")
	WebElement PhoneNumber;

	@FindBy(xpath = "//div[2]/div/div[2]/button[@type='submit']")
	WebElement Save;

	@FindBy(xpath = "//*[contains(text(),'testing for fundraising')]")
	WebElement validateChange;



	//Initial
	public DashboardAdminModule()		
	{
		PageFactory.initElements(driver, this);

	}

	//Action

	public String  HomePageTitle()
	{
		return driver.getTitle();

	}

	public void AdminFundraiser() throws InterruptedException, AWTException
	{
		Homepage.SignIn();
		myFundraisers.click();	
		title.click();
		postUpdate.click();
		postButton.click();
		postImage.click();
		Thread.sleep(5000);
		StringSelection stringSelection = new StringSelection(prop.getProperty("Image"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);   
		ImageCopyPaste();
		description.sendKeys(prop.getProperty("description"));
		SubmitButtonPost.click();
		Thread.sleep(5000);
		transactionDetails.click();
		Thread.sleep(2000);
		withdraw.click();
		Thread.sleep(3000);
		streetAddress1.sendKeys(prop.getProperty("streetAddress"));
		streetAddress2.sendKeys(prop.getProperty("streetAddress"));
		city.sendKeys(prop.getProperty("streetAddress"));
		state.click();
		zipcode.sendKeys(prop.getProperty("zipCode"));
		amount.sendKeys(prop.getProperty("amount"));
		checkBox.click();
		checkBox1.click();
		submitButton.click();
	}
	public void AdminEvent() throws InterruptedException, AWTException
	{
		
		myEvents.click();
		events.click();
		edit.click();
		eventTitle.click();
		descriptionEvent.sendKeys(prop.getProperty("description"));
		organisingEvent.click();
		eventCategory.click();
		eventTime.sendKeys("03:50");
		eventTimeZone.click();
		totalTickets.click();
		CTRLDEL();
		Thread.sleep(5000);
		totalTickets.sendKeys("600");
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,500);");
		Thread.sleep(3000);
		addAnother.click();
		Thread.sleep(2000);
		ticketType.sendKeys("First class");
		eventTicketPrice.sendKeys("250");
		quantity.sendKeys("100");
		personName.click();
		CTRLDEL();
		Thread.sleep(2000);
		personName.sendKeys("madeshwaran");
		streetAddress.click();
		CTRLDEL();
		Thread.sleep(2000);
		streetAddress.sendKeys("Covai");
		cityEvent.click();
		CTRLDEL();
		Thread.sleep(2000);
		cityEvent.sendKeys("Covai");
		states.click();
		zipCode.click();
		CTRLDEL();
		Thread.sleep(2000);
		zipCode.sendKeys("20201");
		customQuestion1.click();
		CTRLDEL();        
		Thread.sleep(2000);
		customQuestion1.sendKeys("How does it work");
		customQuestion2.click();
		CTRLDEL();        
		Thread.sleep(2000);
		customQuestion2.sendKeys("How does it work");
		ScrollDown();
		organiserNameEvent.click();
		CTRLDEL();	       	        
		Thread.sleep(2000);
		organiserNameEvent.sendKeys("kani");
		organiserEmail.click();
		CTRLDEL();        
		Thread.sleep(2000);
		organiserEmail.sendKeys("mad@yopmail.com");
		organiserPhone.click();
		CTRLDEL();        
		Thread.sleep(2000);
		organiserPhone.sendKeys("1234567890");
		organiserAge.click();
		CTRLDEL();        
		Thread.sleep(2000);
		organiserAge.sendKeys("50");
		addNewSponsorButton.click();
		sponsorsNameInput.sendKeys("kani");
		sponsorImage.click();
		Thread.sleep(5000);
		StringSelection stringSelection = new StringSelection(prop.getProperty("Image"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);   
		ImageCopyPaste();
		submitButtonImg.click();
		addPromocode.click();
		percentageDiscount.sendKeys("20");
		codeExpiryDate.click();
		codeExpiryDate1.click();
		code.sendKeys("Free04");
		codeLimit.sendKeys("2");
		AddcodeLimit.click();
		ScrollUp();
		Thread.sleep(2000);
		saveEdit.click();
		Thread.sleep(5000);
	}      
	public void AdminEventTransaction() throws InterruptedException, AWTException
	{ 

		myEvents.click();
		Transactions.click();
		Thread.sleep(2000);
		withdraw.click();
		Thread.sleep(3000);
		streetAddress1.sendKeys(prop.getProperty("streetAddress"));
		streetAddress2.sendKeys(prop.getProperty("streetAddress"));
		city.sendKeys(prop.getProperty("streetAddress"));
		state.click();
		zipcode.sendKeys(prop.getProperty("zipCode"));
		amount.sendKeys(prop.getProperty("amount"));
		checkBox.click();
		checkBox1.click();
		submitButton.click();
	}
	public void EventAttendance() throws InterruptedException, AWTException
	{
		myEvents.click();
		events.click();
		eventAttendance.click();
		ticketDropdown.click();
		search.click();
		notArrived.click();
		markAsArrived.click();
	}

	public void FundraiserEdit() throws InterruptedException, AWTException
	{
		Homepage.SignIn();
		myFundraisers.click();
		title.click();
		EditBtn.click();
		CampaignName.sendKeys("Raising");
		AmountGoal.sendKeys("0");
		OrganizerName.clear();
		OrganizerName.sendKeys("Test User");
		PhoneNumber.clear();
		PhoneNumber.sendKeys("9876543210");
		ScrollUp();
		Save.click();
		String validate = validateChange.getText();
		System.out.println(validate);


	}

	public void AdminCharity() throws InterruptedException, AWTException {
		Homepage.SignIn();
		MyCharities.click();
		Boolean validate = Validatecharitypage.isDisplayed();
		System.out.println(validate);
		Thread.sleep(3000);
		ClickApprReq.click();
		ClickEdit.click();
		ChangeName.sendKeys("statue of liberty");
		SubmitBtn.click();
		Thread.sleep(5000);
		ClickFavCharity.click();
		DonateCharity.click();
		Thread.sleep(3000);
		DonateNowBtn.click();
		Homepage.WithsignDonationCharity();
		Thread.sleep(3000);


	}

	public void TrueKarmaPoints() throws InterruptedException, AWTException
	{
		Homepage.SignIn();
		ClickTrueKarmaPoints.click();
		Thread.sleep(3000);
		String GetTruekarmapoints = GetTableData.getText();
		System.out.println(GetTruekarmapoints);

	}

}
