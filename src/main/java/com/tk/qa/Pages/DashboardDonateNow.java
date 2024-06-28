package com.tk.qa.Pages;

import java.awt.AWTException;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tk.qa.Base.BaseClass;

public class DashboardDonateNow extends BaseClass{
	WebDriverWait wait;
	SignUpPage SignIn = new SignUpPage();
	BaseClass Robot=new BaseClass();
	HomePage Homepage=new HomePage(); 
	DonatePage DonatePage =new DonatePage();
	StringSelection stringSelection;
	JavascriptExecutor js;

	@FindBy(xpath = "//div[@class='col-span-1 w-full sidebar']//div[text()='Donate now/Grant later']")
	WebElement donateNowGrantLater;

	@FindBy(xpath = "//div[@class='ml-5 pb-1 block']//a[text()='By Credit / Debit']")
	WebElement byCredit;

	@FindBy(xpath = "//div[text()='Add Debit/Credit Contribution']")
	WebElement addDebitCreditContribution;

	@FindBy(xpath = "//INPUT[@ID='amount']")
	WebElement amount;

	@FindBy(xpath = "//INPUT[@ID='cardHolderName']")
	WebElement cardHolderName;

	@FindBy(xpath = "//INPUT[@ID='cardNumber']")
	WebElement cardNumber;

	@FindBy(xpath = "//INPUT[@ID='expDate']")
	WebElement expiryDate;

	@FindBy(xpath = "//INPUT[@ID='cvv']")
	WebElement cvv;

	@FindBy(xpath = "//INPUT[@ID='streetAddress']")
	WebElement streetAddress;

	@FindBy(xpath = "//INPUT[@ID='city']")
	WebElement city;

	@FindBy(xpath = "//select[@ID='state']/option[2]")
	WebElement state;

	@FindBy(xpath = "//INPUT[@ID='zipCode']")
	WebElement zipCode;

	@FindBy(xpath = "//button[text()='Donate']")
	WebElement donate;

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div[2]/p[2]/a")
	WebElement nonCash;

	@FindBy(xpath = "//div[text()='Add Non-Cash Contributions']")
	WebElement addNonCashContributions;

	@FindBy(xpath = "//select[@id='propertyCategory']/option[2]")
	WebElement propertyCategory;

	@FindBy(xpath = "//select[@id='howAcquiredByDonor']/option[2]")
	WebElement acquired;

	@FindBy(xpath = "//input[@id='propertyName']")
	WebElement nameOfProperty;

	@FindBy(xpath = "//input[@id='dateAcquired']")
	WebElement dateAcquired;

	@FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--010']")
	WebElement datePicker;

	@FindBy(xpath = "//input[@id='propertyValue']")
	WebElement myCostBasis;

	@FindBy(xpath = "//input[@id='marketValue']")
	WebElement fairMarketValue;

	@FindBy(xpath = "//input[@id='fairMarketValueMethod']")
	WebElement method;

	@FindBy(xpath = "//textarea[@id='description']")
	WebElement description;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submit;

	@FindBy(xpath = "//div[@class='col-span-1 w-full sidebar']//div[text()='Grant Now']")
	WebElement grantNow;

	@FindBy(xpath = "//div[@class='ml-5 pb-1 block']//a[text()='Make a Grant']")
	WebElement makeAGrant;

	@FindBy(xpath = "//div[text()='Add Grant']")
	WebElement addGrant;

	@FindBy(xpath = "//input[@id='SearchCharity']")
	WebElement nameOfCharity;

	@FindBy(xpath = "//h6[@class='text-black hover:bg-[#c5d0d8] cursor-pointer px-3 mt-2']")
	WebElement CharityClick;
	
	@FindBy(xpath = "//input[@id='amount']")
	WebElement grantAmount;

	@FindBy(xpath = "//select[@id='sharedDetails']/option[2]")
	WebElement shareWithThisOrganization;

	@FindBy(xpath = "//textarea[@id='description']")
	WebElement grantDescription;

	@FindBy(xpath = "//button[text()='Submit']")
	WebElement grantSubmit;
	
	@FindBy(xpath = "//div[@class='col-span-1 w-full sidebar']//div[text()='Record']")
     WebElement record;

    @FindBy(xpath = "//div[@class='ml-5 pb-1 block']//a[text()='Cash Donations']")
     WebElement cashDonation;

    @FindBy(xpath = "//div[text()='Add Cash Donations']")
     WebElement addCashDonation;

    @FindBy(xpath = "//input[@id='variousText']")
     WebElement variousDate;

    @FindBy(xpath = "//input[@id='actualDate']")
     WebElement date;

    @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--030']")
     WebElement datePickerRec;

    @FindBy(xpath = "//input[@id='charityName']")
     WebElement charityNameRec;

    @FindBy(xpath = "//select[@id='method']/option[2]")
     WebElement methodRec;

    @FindBy(xpath = "//input[@id='amount']")
     WebElement amountRec;

    @FindBy(xpath = "//textarea[@id='description']")
     WebElement descriptionRec;

    @FindBy(xpath = "//button[text()='Submit']")
     WebElement submitRec;

    @FindBy(xpath = "//div[@class='ml-5 pb-1 block']//a[text()='Non Cash Donations']")
     WebElement addNonCashDonation;

    @FindBy(xpath = "//div[text()='Add Non-cash Donations']")
     WebElement addNonCashDonationButton;

    @FindBy(xpath = "//div[@class='sm:py-0 py-2']//input[@name='propertyType']")
     WebElement property;

    @FindBy(xpath = "//input[@id='propertyCategory']")
     WebElement selectProperty;

    @FindBy(xpath = "//input[@name='propertyName']")
     WebElement nameProperty;

    @FindBy(xpath = "//div[@class='flex items-center mb-1']//input[@type='checkbox']")
     WebElement vehicleID;

    @FindBy(xpath = "//input[@id='vehicleId']")
     WebElement vehicleIDField;

    @FindBy(xpath = "//input[@id='charityName']")
     WebElement charityName;

    @FindBy(xpath = "//input[@id='variousText']")
     WebElement variousDateV;

    @FindBy(xpath = "//input[@id='actualDate']")
     WebElement dateV;

    @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--030']")
     WebElement datePickerV;

    @FindBy(xpath = "//textarea[@id='propertySummary']")
     WebElement propertySummary;

    @FindBy(xpath = "//select[@id='howAcquired']/option[2]")
     WebElement howAcquired;

    @FindBy(xpath = "//input[@id='donorCost']")
     WebElement donorCost;

    @FindBy(xpath = "//input[@id='amountBargain']")
     WebElement amountBargain;

    @FindBy(xpath = "//input[@id='amountClaimed']")
     WebElement amountClaimed;

    @FindBy(xpath = "//input[@id='marketValue']")
     WebElement marketValue;

    @FindBy(xpath = "//input[@id='fairMarketValueMethod']")
     WebElement fairMarketValueMethod;

    @FindBy(xpath = "//textarea[@id='description']")
     WebElement descriptionV;

    @FindBy(xpath = "//button[text()='Submit']")
     WebElement submitV;

    @FindBy(xpath = "//div[@class='ml-5 pb-1 block']//a[text()='Volunteer Expense']")
     WebElement volunteerExpense;

    @FindBy(xpath = "//div[text()='Add Volunteer Expense']")
     WebElement addVolunteerExpense;

    @FindBy(xpath = "//input[@id='actualDate']")
     WebElement dateVE;

    @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--030']")
     WebElement datePickerVE;

    @FindBy(xpath = "//input[@id='charityName']")
     WebElement charityNameVE;

    @FindBy(xpath = "//select[@id='expensesType']/option[2]")
     WebElement typeVE;

    @FindBy(xpath = "//input[@id='pocketExpenses']")
     WebElement expensesVE;

    @FindBy(xpath = "//textarea[@id='description']")
     WebElement descriptionVE;

    @FindBy(xpath = "//button[text()='Submit']")
     WebElement submitVE;

    @FindBy(xpath = "//div[@class='ml-5 pb-1 block']//a[text()='Volunteer Time']")
     WebElement volunteerTime;

    @FindBy(xpath = "//div[text()='Add Volunteer Time']")
     WebElement addVolunteerTime;

    @FindBy(xpath = "//input[@id='actualDate']")
     WebElement dateVT;

    @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--030']")
     WebElement datePickerVT;

    @FindBy(xpath = "//input[@id='charityName']")
     WebElement charityNameVT;

    @FindBy(xpath = "//select[@id='duration']/option[2]")
     WebElement typeVT;

    @FindBy(xpath = "//input[@id='activity']")
     WebElement activity;

    @FindBy(xpath = "//textarea[@id='description']")
     WebElement descriptionVT;

    @FindBy(xpath = "//button[text()='Submit']")
     WebElement submitVT;

    @FindBy(xpath = "//div[@class='col-span-1 w-full sidebar']//div[text()='Reports']")
    WebElement reports;

   @FindBy(xpath = "//div[@class='ml-5 pb-1 block']//a[text()='Donation Reports']")
    WebElement donationReports;

   @FindBy(xpath = "//select[@id='reportType']/option[3]")
    WebElement FundraiserDonation;

   @FindBy(xpath = "//div[@class='from_date']//input[@id='actualDate']")
    WebElement dates;

   @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--030']")
    WebElement datePickerfund;

   @FindBy(xpath = "//div[@class='to_date']//input[@id='actualDate']")
    WebElement toDate;

   @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--030']")
    WebElement toDatepicker;

   @FindBy(xpath = "//div[@class='ml-5 pb-1 block']//a[text()='Event Reports']")
    WebElement eventReports;

   @FindBy(xpath = "//div[@class='ml-5 pb-1 block']//a[text()='Transaction History']")
    WebElement transactionHistory;

   @FindBy(xpath = "//div[@class='ml-5 pb-1 block']//a[text()='Tax Forms']")
    WebElement taxForms;

   @FindBy(xpath = "//input[@class='cursor-pointer']")
    WebElement cursorPointer;

   @FindBy(xpath = "//select[@id='method']/option[9]")
    WebElement year;
   
   @FindBy(xpath = "//div[@class='col-span-1 w-full sidebar']//div[text()='Do Good Karma']")
    WebElement DoGoodKarma;

   @FindBy(xpath = "//div[@class='ml-5 pb-1 block']//a[text()='Refer a Friend']")
    WebElement ReferAFriend;

   @FindBy(xpath = "//button[text()='Copy']")
    WebElement copy;

   @FindBy(xpath = "//h1[text()='Your Fundraiser(s)']")
   WebElement Dashboardfund;
   
   @FindBy(xpath = "//a[1]/div/h1[2][@class='text-2xl font-medium mt-2 text-[#0F161C]']")
   WebElement DashboardGetText;
   
   @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div[1]/h1[2]")
   WebElement TotalAmountCollected;
   
   @FindBy(xpath = "//div[text()='Create Fundraiser']")
   WebElement CreateFundraiser;
   
   @FindBy(xpath = "//div[@class='col-span-1 w-full sidebar']//div[text()='Dashboard']")
   WebElement DashboardSidebar;
   
   
	//Initial
	public DashboardDonateNow()
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
		Homepage.SignIn();
		donateNowGrantLater.click();
		byCredit.click();
		addDebitCreditContribution.click();
		amount.sendKeys(prop.getProperty("amount"));
		cardHolderName.sendKeys(prop.getProperty("cardHolderName"));
		cardNumber.sendKeys(prop.getProperty("cardNumber"));
		expiryDate.sendKeys(prop.getProperty("expiryDate"));
		cvv.sendKeys(prop.getProperty("ccvA"));
		streetAddress.sendKeys(prop.getProperty("streetAddress"));
		city.sendKeys(prop.getProperty("city"));
		state.click();
		zipCode.sendKeys(prop.getProperty("zipCode"));
		donate.click();
		Thread.sleep(10000);
		nonCash.click();
		addNonCashContributions.click();
		propertyCategory.click();
		acquired.click();
		nameOfProperty.sendKeys(prop.getProperty("nameOfProperty"));
		dateAcquired.click();
		datePicker.click();
		myCostBasis.sendKeys(prop.getProperty("myCostBasis"));
		fairMarketValue.sendKeys(prop.getProperty("myCostBasis"));
		method.sendKeys(prop.getProperty("method"));
		description.sendKeys(prop.getProperty("description"));
		submit.click();
	}

	public void MakeAGrant() throws InterruptedException, AWTException
	{
		Thread.sleep(5000);		
		grantNow.click();
		Thread.sleep(5000);
		makeAGrant.click();
		driver.navigate().refresh();
		Thread.sleep(5000);
		addGrant.click();
		nameOfCharity.sendKeys(prop.getProperty("nameOfCharity"));
		CharityClick.click();
		grantAmount.sendKeys(prop.getProperty("grantAmount"));
		shareWithThisOrganization.click();
		grantDescription.click();
		grantSubmit.click();
	}

	public void Record() throws InterruptedException, AWTException
	{
		Thread.sleep(5000);
		record.click();
        cashDonation.click();
        addCashDonation.click();
        variousDate.click();
        date.click();
        datePickerRec.click();
        charityNameRec.sendKeys(prop.getProperty("nameOfCharity"));
        CharityClick.click();
        methodRec.click();
        amountRec.sendKeys(prop.getProperty("grantAmount"));
        descriptionRec.sendKeys(prop.getProperty("description"));
        submitRec.click();
        Thread.sleep(5000);
        addNonCashDonation.click();
        addNonCashDonationButton.click();
        property.click();
        selectProperty.click();
        nameProperty.sendKeys(prop.getProperty("nameOfProperty"));
        vehicleID.click();
        vehicleIDField.sendKeys(prop.getProperty("vehicleIDField"));
        charityNameRec.sendKeys(prop.getProperty("nameOfCharity"));
        CharityClick.click();
        variousDateV.click();
        dateV.click();
        datePickerV.click();
        propertySummary.sendKeys(prop.getProperty("description"));
        howAcquired.click();
        donorCost.sendKeys(prop.getProperty("donorCost"));
        amountBargain.sendKeys(prop.getProperty("myCostBasis"));
        amountClaimed.sendKeys(prop.getProperty("myCostBasis"));
        marketValue.sendKeys(prop.getProperty("marketValue"));
        fairMarketValueMethod.sendKeys(prop.getProperty("myCostBasis"));
        descriptionV.sendKeys(prop.getProperty("description"));
        submitV.click();
        Thread.sleep(5000);
        volunteerExpense.click();
        addVolunteerExpense.click();
        dateVE.click();
        datePickerVE.click();
        charityNameVE.sendKeys(prop.getProperty("nameOfCharity"));
        CharityClick.click();
        typeVE.click();
        expensesVE.sendKeys(prop.getProperty("myCostBasis"));
        descriptionVE.sendKeys(prop.getProperty("myCostBasis"));
        submitVE.click();
        Thread.sleep(5000);
        volunteerTime.click();
        addVolunteerTime.click();
        dateVT.click();
        datePickerVT.click();
        charityNameVT.sendKeys(prop.getProperty("nameOfCharity"));
        CharityClick.click();
        typeVT.click();
        activity.sendKeys(prop.getProperty("myCostBasis"));
        descriptionVT.sendKeys(prop.getProperty("myCostBasis"));
        submitVT.click();       

	}
	public void Report() throws InterruptedException, AWTException
	{
		Thread.sleep(5000);
		reports.click();
        donationReports.click();
        FundraiserDonation.click();
        eventReports.click();
        transactionHistory.click();
        taxForms.click();
        cursorPointer.click();
        year.click();
        DoGoodKarma.click();
        ReferAFriend.click();
        copy.click();       
        RobotClassCopyPaste();
        Thread.sleep(5000);
        RobotClassBackward();
                      
	}
	public void DashboardCalculation() throws InterruptedException, AWTException
	{
		Homepage.SignIn();
		Thread.sleep(3000);
		String num =DashboardGetText.getText();
		System.out.println(num);
		String num1 =TotalAmountCollected.getText().replace("$", "");
		System.out.println(num1);
		DashboardSidebar.click();
		Dashboardfund.click();
		CreateFundraiser.click();
		DonatePage.DonationCalculationFund();
		DashboardSidebar.click();
		String num3 =DashboardGetText.getText();
		System.out.println(num3);
		String num4 =TotalAmountCollected.getText().replace("$", "");
		System.out.println(num4);
		
		if (num1 == num4 && num == num3) {
		    System.out.println("Both values are equal!");
		} else if (num1 == num4) {
		    System.out.println("Only the first values are equal!");
		} else if (num == num3) {
		    System.out.println("Only the second values are equal!");
		} else {
		    System.out.println("Values are not equal");
		}

	}

}
