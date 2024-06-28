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

public class DonatePage extends BaseClass{
	WebDriverWait wait;
	SignUpPage SignIn = new SignUpPage();
	BaseClass Robot=new BaseClass();
	HomePage Homepage=new HomePage();

	
	JavascriptExecutor js;
	
	@FindBy(xpath="//div[text()='Donate']")
	WebElement DonateBtn;

	@FindBy(xpath="//span[text()='Donate']")
	WebElement DonateHPBtn;

	@FindBy(xpath="//div[@class=' mr-5 hidden md:block']//button[text()='Start Fundraiser/ Event']")
	WebElement StartFundraiserBtn;
	
	@FindBy(xpath="//div[@class='mt-5']//button[text()='Start Fundraiser']")
	WebElement StartFundraiser;
	
	@FindBy(xpath="//input[@id='phoneNumber']")
	WebElement phoneNumber;
	
	@FindBy(xpath="//input[@id='age']")
	WebElement age;
	
	@FindBy(xpath="//button[text()='Next']")
	WebElement NextButton;
	
	@FindBy(xpath="//select[@id='raisingFund']/option[3]")
	WebElement RaisingFundFor;
	
	@FindBy(xpath="//input[@id='beneficiaryName']")
	WebElement BeneficiaryName;
	
	@FindBy(xpath="//select[@id='selectCategory']/option[3]")
	WebElement FundraiserCategory;
	
	@FindBy(xpath="//input[@id='targetAmount']")
	WebElement TargetAmount;
	
	@FindBy(xpath="//input[@placeholder='MM/DD/YYYY']")
	WebElement Date;

	@FindBy(xpath="//button[@aria-label='Next Month']")
	WebElement NextMonthFund;

	@FindBy(xpath="//div[contains(text(),'27')]")
	WebElement DatePickerFund;

	@FindBy(xpath ="//input[@class='custom_checkbox mt-2']")
	WebElement bccCheckbox;

	@FindBy(xpath="//input[@id='title']")
	WebElement Title;
	
	@FindBy(xpath="//span[text()='Browse your files']")
	WebElement Browseyourfiles;
	
	@FindBy(xpath="//div[@class='h-[150px] w-[200px] flex items-center justify-center border-2 border-dashed']")
	WebElement Imagepicker;
	
	@FindBy(xpath="//div[@class='flex justify-end mt-3']//button[text()='Save']")
	WebElement ImageSave;
	
	@FindBy(xpath="//div[@class='ql-editor ql-blank']")
	WebElement FundDes;

	@FindBy(xpath = "//input[@name='employerBenevity']")
	WebElement enableempbenefit;

	@FindBy(xpath="//div[1]/div/input[@class='custom_checkbox mx-2']")
	WebElement Checkbox1;

	@FindBy(xpath="//div[2]/div/input[@class='custom_checkbox mx-2']")
	WebElement Checkbox2;

	@FindBy(xpath = "//div[3]/div/input[@class='custom_checkbox mx-2']")
	WebElement Checkbox3;
	
	@FindBy(xpath="//button[text()='Create']")
	WebElement Create;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//input[@placeholder='Search Fundraiser Title']")
	WebElement SearchBar;
	
	@FindBy(xpath="//select[@class='form_select_input__LfRT_ donate_select_input_border__14c3w ']/option[3]")
	WebElement Category;
	
	@FindBy(xpath="//div[@class='cards_card_style__q1ocT card ']")
	WebElement CardClick;

	@FindBy(xpath ="//div[4][@class='cursor-pointer w-10/12 m-auto']")
	WebElement FBRating;

	@FindBy(xpath = "//*[@id='description']")
	WebElement FBComment;

	@FindBy(xpath = "//*[contains(text(),'Submit')]")
	WebElement FBSubmit;

	@FindBy(xpath = "//*[contains(text(),'Skip')]")
	WebElement FBSkip;
	
	//Initial
		public DonatePage()
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);

		}
	


	public void DonateStartButton() throws InterruptedException {
		Homepage.StartFundraiserBtn();
		SignIn.SignInPage();
		DonateBtn.click();
		StartFundraiser.click();
		
	}
	public  void SignInPage() throws InterruptedException
	{
		email.sendKeys(prop.getProperty("Email"));
		password.sendKeys(prop.getProperty("Password"));
		submit.click();
		
		
	}
	
	public void CreateFundraiserTestCase2() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		Homepage.StartFundraiserBtn();
		Thread.sleep(5000);
		DonateBtn.click();
		StartFundraiser.click();
		phoneNumber.sendKeys(prop.getProperty("phoneNumber"));
		age.sendKeys(prop.getProperty("age"));
		Thread.sleep(2000);
		NextButton.click();
		RaisingFundFor.click();
		BeneficiaryName.sendKeys(prop.getProperty("BeneficiaryName"));
		FundraiserCategory.click();
		TargetAmount.sendKeys(prop.getProperty("TargetAmount"));
		Date.click();
		NextMonthFund.click();
		NextMonthFund.click();
		DatePickerFund.click();
		bccCheckbox.click();
		NextButton.click();
		Title.sendKeys(prop.getProperty("TitleFund"));
		Browseyourfiles.click();
		Imagepicker.click();
		Thread.sleep(5000);
		StringSelection stringSelection = new StringSelection(prop.getProperty("Image"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		ImageCopyPaste();
		ImageSave.click();
		FundDes.sendKeys(prop.getProperty("FundDes"));
		Checkbox1.click();
		Checkbox2.click();
		Checkbox3.click();
		Create.click();
		Thread.sleep(5000);
		DonateBtn.click();
		SearchBar.sendKeys(prop.getProperty("searchfund"));
		Category.click();
		Homepage.WithsigninDonation();
		FeedbackSubmit();
		Thread.sleep(50000);
		DonateBtn.click();
				
		
	}
public void WithsigninDonation() throws InterruptedException, AWTException {
		
		Homepage.StartFundraiserBtn();
		Thread.sleep(5000);
		DonateBtn.click();
		SearchBar.sendKeys(prop.getProperty("searchfund"));
		Category.click();
		Homepage.WithsigninDonation();
}
public void CreateFundraiser() throws InterruptedException, AWTException {
	
	Homepage.StartFundraiserBtn();
	Thread.sleep(5000);
	DonateBtn.click();
	StartFundraiser.click();
	phoneNumber.sendKeys(prop.getProperty("phoneNumber"));
	age.sendKeys(prop.getProperty("age"));
	Thread.sleep(2000);
	NextButton.click();
	RaisingFundFor.click();
	BeneficiaryName.sendKeys(prop.getProperty("BeneficiaryName"));
	FundraiserCategory.click();
	TargetAmount.sendKeys(prop.getProperty("TargetAmount"));
	Date.click();
	NextMonthFund.click();
	NextMonthFund.click();
	DatePickerFund.click();
	bccCheckbox.click();
	NextButton.click();
	Title.sendKeys(prop.getProperty("TitleFund"));
	Browseyourfiles.click();
	Imagepicker.click();
	Thread.sleep(5000);
	StringSelection stringSelection = new StringSelection(prop.getProperty("Image"));
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	ImageCopyPaste();
	ImageSave.click();
	FundDes.sendKeys(prop.getProperty("FundDes"));
	Checkbox1.click();
	Checkbox2.click();
	Checkbox3.click();
	Create.click();
	Thread.sleep(5000);
	DonateBtn.click();
	Thread.sleep(4000);
	SearchBar.sendKeys(prop.getProperty("searchfund"));
	Category.click();
			
}
public void DonationCalculationFund() throws InterruptedException, AWTException {
	
	phoneNumber.sendKeys(prop.getProperty("phoneNumber"));
	age.sendKeys(prop.getProperty("age"));
	Thread.sleep(2000);
	NextButton.click();
	RaisingFundFor.click();
	BeneficiaryName.sendKeys(prop.getProperty("BeneficiaryName"));
	FundraiserCategory.click();
	TargetAmount.sendKeys(prop.getProperty("TargetAmount"));
	Date.click();
	NextMonthFund.click();
	NextMonthFund.click();
	DatePickerFund.click();
	bccCheckbox.click();
	NextButton.click();
	Title.sendKeys(prop.getProperty("TitleFund"));
	Browseyourfiles.click();
	Imagepicker.click();
	Thread.sleep(5000);
	StringSelection stringSelection = new StringSelection(prop.getProperty("Image"));
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	ImageCopyPaste();
	ImageSave.click();
	FundDes.sendKeys(prop.getProperty("FundDes"));
	Checkbox1.click();
	Checkbox2.click();
	Checkbox3.click();
	Create.click();
	Thread.sleep(5000);
			
}

public void FeedbackSubmit() throws InterruptedException, AWTException {

	FBRating.click();
	FBComment.sendKeys("Good Experince");
	FBSubmit.click();

}

public void FeedbackSkip() throws InterruptedException, AWTException {

	FBSkip.click();
}

}
