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

public class EventPage extends BaseClass{
	WebDriverWait wait;
	SignUpPage SignIn = new SignUpPage();
	BaseClass Robot=new BaseClass();
	HomePage Homepage=new HomePage(); 
	DonatePage DonatePage =new DonatePage();
	StringSelection stringSelection;
	JavascriptExecutor js;
	
	@FindBy(xpath="//span[text()='Events']")
	WebElement Events;
	
	@FindBy(xpath="//button[@class='button_btn_style__dR_RH header_fundraiser_btn__fJwzh mr-2 header_fundraiser_btn_media__XHccw']")
	WebElement EventsBtn;
	
	@FindBy(xpath="//input[@placeholder='Search Event Title']")
	WebElement SearchBar;
	
	@FindBy(xpath="//select[@class='form_select_input__LfRT_ undefined ']/option[8]")
	WebElement Category;
	
	@FindBy(xpath="//div[@class='hidden   dashboard-header_block___18QM']//button[text()='Create Event']")
	WebElement EventsBtnDashboard;

	@FindBy(xpath = "//select[@name='eventPrice']/option[@value='paid']")
	WebElement Paidmode;

	@FindBy(xpath = "//select[@name='eventPrice']/option[@value='free']")
	WebElement Freemode;

	@FindBy(xpath="//input[@placeholder='Enter your Phone Number']")
	WebElement organiserPhone;
	
	@FindBy(xpath="//input[@id='age']")
	WebElement age;

	@FindBy(xpath="//button[contains(text(), 'Next')]")
	WebElement next1page;

	@FindBy(xpath="//select[@id='organisingEvent']/option[3]")
	WebElement organiserEvent;

	@FindBy(xpath="//input[@id='BeneficiaryName']")
	WebElement BeneficiaryName;

	@FindBy(xpath="//select[@id='eventCategory']/option[8]")
	WebElement eventCategory;


	@FindBy(xpath="//input[@name='eventDate']")
	WebElement eventDate;

	@FindBy(xpath="//button[@aria-label='Next Month']")
	WebElement NextMonth;

	@FindBy(xpath="//div[contains(text(),'16')]")
	WebElement DatePicker;

	@FindBy(xpath="//input[@id='eventTime']")
	WebElement eventTime;


	@FindBy(xpath="//select[@name='eventTimeZone']/option[3]")
	WebElement eventTimeZone;

	@FindBy(xpath="//input[@id='userName']")
	WebElement userName;

	@FindBy(xpath="//input[@id='streetAddress']")
	WebElement streetAddress;

	@FindBy(xpath="//input[@id='city']")
	WebElement city;

	@FindBy(xpath="//select[@name='states']/option[3]")
	WebElement states;

	@FindBy(xpath="//input[@id='states']")
	WebElement Freestates;

	@FindBy(xpath="//input[@id='zipCode']")
	WebElement zipCode;

	@FindBy(xpath="//button[contains(text(), 'Next')]")
	WebElement next2page;

	/*@FindBy(xpath="//select[@name='eventPrice']/option[2]")
	WebElement eventPrice;*/

	@FindBy(xpath="//input[@name='totalNumberOfTicket']")
	WebElement totalNumberOfTicket;

	@FindBy(xpath="//input[@name='eventTicket[0].ticketType']")
	WebElement eventTicket1;

	@FindBy(xpath="//input[@name='eventTicket[0].price']")
	WebElement eventTicketprice1;

	@FindBy(xpath="//input[@name='eventTicket[0].quantity']")
	WebElement eventTicketquantity1;
	
	@FindBy(xpath="//section[3]//div[2]")
	WebElement CustomDropDown;
	
	@FindBy(xpath="//input[@name='customQuestion1']")
	WebElement customQuestion1;

	@FindBy(xpath="//input[@name='customQuestion2']")
	WebElement customQuestion2;
	
	@FindBy(xpath="//section[4]//div[@style='position: relative; display: flex; justify-content: end; top: -22px; right: 13px;']")
	WebElement GeneratepromocodesDropDown;

	@FindBy(xpath="//input[@id='promoCode[0].code']")
	WebElement promoCode;

	@FindBy(xpath="//input[@id='discountPercentage']")
	WebElement discountPercentage;

	@FindBy(xpath="//input[@name='promoCode[0].codeExpiryDate']")
	WebElement codeExpiryDate;

	@FindBy(xpath="//div[contains(text(),'10')]")
	WebElement DatePickerCode;
	 
	@FindBy(xpath="//input[@id='codeUserLimit']")
	WebElement codeUserLimit;

	@FindBy(xpath="//button[contains(text(), 'Next')]")
	WebElement next3page;

	@FindBy(xpath="//input[@id='eventTitle']")
	WebElement eventTitle;
	
	@FindBy(xpath="//span[text()='Browse your files']")
	WebElement Browseyourfiles;
	
	@FindBy(xpath="//div[@class='h-[150px] w-[200px] flex items-center justify-center border-2 border-dashed']")
	WebElement Imagepicker;
	
	@FindBy(xpath="//div[@class='flex justify-end mt-3']//button[text()='Save']")
	WebElement ImageSave;
	
	@FindBy(xpath="//div[@class='ql-editor ql-blank']")
	WebElement EventDes;
	
	@FindBy(xpath="//input[@id='eventTypePublic']")
	WebElement EventType;

	@FindBy(xpath = "//*[@name='employerBenevity']")
	WebElement EmpBenefit;

	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	WebElement checkbox1;

	@FindBy(xpath="(//input[@type='checkbox'])[3]")
	WebElement checkbox2;

	@FindBy(xpath="//div[@style='position: relative; display: flex; justify-content: end; top: -22px; right: 13px;']")
	WebElement Sponsordropdown;

	@FindBy(xpath="//span[@class='flex cursor-pointer font-medium']")
	WebElement SponsorBTN;

	@FindBy(xpath="//span[@class='Before_image text-[#066ADF] relative top-[60px] left-2 font-medium text-sm']")
	WebElement SponsorIMG;

	@FindBy(xpath="//input[@id='sponsers[0].sponsersName']")
	WebElement SponsorName;

	@FindBy(xpath="//Button[text()='Create']")
	WebElement Create;

	@FindBy(xpath="//button[text()='View Event']")
	WebElement ViewEvent;

	

	//Initial
	public EventPage()
	{
		PageFactory.initElements(driver, this);

	}

	//Action

	public String  HomePageTitle()
	{
		return driver.getTitle();

	}
	
	public void CreateEvent() throws InterruptedException, AWTException
	{
		Events.click();		
		EventsBtn.click();	
		SignIn.SignInPage();
		Thread.sleep(10000);
		EventsBtnDashboard.click();
		Paidmode.click();
		organiserPhone.sendKeys(prop.getProperty("organiserPhone"));	
		age.sendKeys(prop.getProperty("age"));	
		next1page.click();	
		organiserEvent.click();	
		BeneficiaryName.sendKeys(prop.getProperty("BeneficiaryName"));	
		eventCategory.click();	
		eventDate.click();	
		NextMonth.click();
		DatePicker.click();
		eventTime.sendKeys(prop.getProperty("eventTime"));	
		eventTimeZone.click();	
		userName.sendKeys(prop.getProperty("eventTime"));	
		streetAddress.sendKeys(prop.getProperty("eventTime"));	
		city.sendKeys(prop.getProperty("city"));	
		states.click();	
		zipCode.sendKeys(prop.getProperty("zipCode"));	
		next2page.click();	
		//eventPrice.click();
		totalNumberOfTicket.sendKeys(prop.getProperty("totalNumberOfTicket"));	
		eventTicket1.sendKeys(prop.getProperty("eventTicket1"));	
		eventTicketprice1.sendKeys(prop.getProperty("eventTicketprice1"));	
		eventTicketquantity1.sendKeys(prop.getProperty("eventTicketquantity1"));
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		CustomDropDown.click();
		customQuestion1.sendKeys(prop.getProperty("customQuestion1"));		
		customQuestion2.sendKeys(prop.getProperty("customQuestion2"));		
		GeneratepromocodesDropDown.click();	
		promoCode.sendKeys(prop.getProperty("promoCode"));		
		discountPercentage.sendKeys(prop.getProperty("discountPercentage"));		
		codeExpiryDate.sendKeys(prop.getProperty("codeExpiryDate"));
		NextMonth.click();
		DatePickerCode.click();		
		codeUserLimit.sendKeys(prop.getProperty("codeUserLimit"));		
		next3page.click();		
		eventTitle.sendKeys(prop.getProperty("eventTitle"));
		Browseyourfiles.click();
		Imagepicker.click();
		Thread.sleep(5000);
		stringSelection = new StringSelection(prop.getProperty("Image"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		ImageCopyPaste();
		ImageSave.click();
		EventDes.sendKeys(prop.getProperty("FundDes"));
		EventType.click();
		EmpBenefit.click();
		checkbox1.click();
		checkbox2.click();
		Sponsordropdown.click();
		SponsorBTN.click();
		SponsorIMG.click();
		Thread.sleep(5000);
		stringSelection = new StringSelection(prop.getProperty("Image"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		ImageCopyPaste();
		SponsorName.sendKeys(prop.getProperty("SponsorName"));
		Create.click();
		ViewEvent.click();	
		Events.click();
		SearchBar.sendKeys(prop.getProperty("search"));
		Category.click();
		Homepage.WithsigninEvent();
	}

	public void FreeEventCreation() throws InterruptedException, AWTException {

		Events.click();
		EventsBtn.click();
		SignIn.SignInPage();
		Thread.sleep(10000);
		EventsBtnDashboard.click();
		Freemode.click();
		organiserPhone.sendKeys(prop.getProperty("organiserPhone"));
		age.sendKeys(prop.getProperty("age"));
		next1page.click();
		organiserEvent.click();
		BeneficiaryName.sendKeys(prop.getProperty("BeneficiaryName"));
		eventCategory.click();
		eventDate.click();
		NextMonth.click();
		DatePicker.click();
		eventTime.sendKeys(prop.getProperty("eventTime"));
		userName.sendKeys(prop.getProperty("eventTime"));
		streetAddress.sendKeys(prop.getProperty("eventTime"));
		city.sendKeys(prop.getProperty("city"));
		Freestates.sendKeys("New York");
		zipCode.sendKeys(prop.getProperty("zipCode"));
		next2page.click();
		totalNumberOfTicket.sendKeys(prop.getProperty("totalNumberOfTicket"));
		eventTicket1.sendKeys(prop.getProperty("eventTicket1"));
		eventTicketquantity1.sendKeys(prop.getProperty("eventTicketquantity1"));
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		CustomDropDown.click();
		customQuestion1.sendKeys(prop.getProperty("customQuestion1"));
		customQuestion2.sendKeys(prop.getProperty("customQuestion2"));
		next3page.click();
		eventTitle.sendKeys(prop.getProperty("eventTitle"));
		Browseyourfiles.click();
		Imagepicker.click();
		Thread.sleep(5000);
		stringSelection = new StringSelection(prop.getProperty("Image"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		ImageCopyPaste();
		ImageSave.click();
		EventDes.sendKeys(prop.getProperty("FundDes"));
		EventType.click();
		EmpBenefit.click();
		checkbox1.click();
		checkbox2.click();
		Sponsordropdown.click();
		SponsorBTN.click();
		SponsorIMG.click();
		Thread.sleep(5000);
		stringSelection = new StringSelection(prop.getProperty("Image"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		ImageCopyPaste();
		SponsorName.sendKeys(prop.getProperty("SponsorName"));
		Create.click();
		ViewEvent.click();
		Events.click();
		SearchBar.sendKeys(prop.getProperty("search"));
		Category.click();

	}

	public void BookingTheEvent() throws InterruptedException, AWTException
	{
		Events.click();	
		SearchBar.sendKeys(prop.getProperty("search"));
		Category.click();
		Thread.sleep(5000);
		Homepage.WithoutsigninEvent();
		Events.click();
		
	}
	
	

}
