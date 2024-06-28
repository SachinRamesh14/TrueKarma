package com.tk.qa.Pages;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tk.qa.Base.BaseClass;

public class MyContactPage extends BaseClass{

	WebDriverWait wait;
	SignUpPage SignIn = new SignUpPage();
	BaseClass Robot=new BaseClass();
	HomePage Homepage=new HomePage(); 
	DonatePage DonatePage =new DonatePage();
	StringSelection stringSelection;
	JavascriptExecutor js;
	
	
	@FindBy(xpath="(//button[text()='Sign In'])[2]")
	WebElement SignInBtn;
	
	@FindBy(xpath="(//a[text()='My Contacts'])[2]")
	WebElement ContactsTab;
	
	//Add Contact Popup
	@FindBy(xpath="//span[text()=' Add Contact ']")
	WebElement addcontactbtn;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement namefield;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement emailfield;
	
	@FindBy(xpath="//input[@id='country']")
	WebElement countryfield;
	
	@FindBy(xpath="//input[@id='state']")
	WebElement statefield;
	
	@FindBy(xpath="//input[@id='zipCode']")
	WebElement zipcodefield;
	
	@FindBy(xpath="(//button[text()='Submit'])[1]")
	WebElement submitbtn;

	@FindBy(xpath = "//span/div/button[@class='button_btn_style__dR_RH undefined']")
	WebElement ClickMessage;

	@FindBy(xpath = "//input[@id='subject']")
	WebElement Subject;

	@FindBy(xpath = "//div[@class='ql-editor ql-blank']")
	WebElement Message;

	@FindBy(xpath = "//button[text()='Send']")
	WebElement SendBtn;

	@FindBy(xpath = "//tbody/tr[1]/td[8]/div[1]//*[name()='svg'][1]")
	WebElement Editicon;

	@FindBy(xpath = "//div[@class='modal-footer contact_buttonModal__HkcAG mt-0 mt-2 flex justify-end']//div//button[@type='button'][normalize-space()='Save']")
	WebElement EditSaveBtn;

	//Delete Contact
	@FindBy(xpath="//table/tbody/tr[1]/td[8]/div/descendant::*[name()='svg'][2]")
	WebElement deleteicon;
	
	@FindBy(xpath="//button[text()='Delete']")
	WebElement deletebtnpopup;
	
	//Import Contact
	@FindBy(xpath="//span[text()=' Import Contacts ']")
	WebElement importcontact;
	
	@FindBy(xpath="//label[@for='contactUpload']")
	WebElement browsefilesbtn;	
	
	@FindBy(xpath="//button[text()='Validate']")
	WebElement validatebtn;	
	
	@FindBy(xpath="//button[text()='Import']")
	WebElement importbtn;
	
	//Multiple Delete Contact
	@FindBy(xpath="//select[@class='pagination_border_style__mB650']")
	WebElement paginationfilterbtn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement PrimaryCheckbox;
		
	@FindBy(xpath="//span[@class='pl-2 font-medium text-[#e74a3b]']")
	WebElement Deletebtn;
	
	@FindBy(xpath="//button[contains(text(),'Delete')]")
	WebElement Deletebtnpopup2;

	//groups

	@FindBy(xpath = "//*[text()='Groups']")
	WebElement ClickGrp;

	@FindBy(xpath = "//button[@class='button_btn_style__dR_RH undefined ']")
	WebElement CreateGrp;

	@FindBy(xpath = "//input[@placeholder='Enter the Group Name']")
	WebElement GrpName;

	@FindBy(xpath = "//div[@class=' css-1xc3v61-indicatorContainer']")
	WebElement AddMember;

	@FindBy(xpath = "//*[contains(text(),'Kanisha')]")
	WebElement Selectmember;

	@FindBy(xpath = "//*[contains(text(),'Submit')]")
	WebElement SubmitBtn;

	@FindBy(xpath = "//*[contains(text(),'demo group')]")
	WebElement validategroup;

	@FindBy(xpath = "//th[@class='text-center px-3']/input")
	WebElement GrpCheckbox;

	@FindBy(xpath = "//span[text()='Delete']")
	WebElement DeleteGrp;

	@FindBy(xpath = "//button[contains(text(),'Delete')]")
	WebElement DeletePopup;



	//Initial
		public MyContactPage()
		{
			PageFactory.initElements(driver, this);

		}
		
		//Action

		public String  HomePageTitle()
		{
			return driver.getTitle();

		}
		
		public void addContact() throws Exception {
			
			SignInBtn.click();
			Thread.sleep(1000);
			SignIn.SignInPage();
			Thread.sleep(10000);
			ContactsTab.click();
			Thread.sleep(1000);
			addcontactbtn.click();
			Thread.sleep(1000);
			namefield.sendKeys(prop.getProperty("ContactName"));
			emailfield.sendKeys(prop.getProperty("EmailContact"));
			countryfield.sendKeys(prop.getProperty("CountryContact"));
			statefield.sendKeys(prop.getProperty("StateContact"));
			zipcodefield.sendKeys(prop.getProperty("ZipCodeContact"));
			submitbtn.click();
			Thread.sleep(5000);
			ClickMessage.click();
			Subject.sendKeys("For Thanking");
			Message.sendKeys("Thank you for your help");
			SendBtn.click();
			Thread.sleep(5000);

		}
		public void editContact() {
			
			Editicon.click();
			namefield.clear();
			namefield.sendKeys("Test User");
			countryfield.clear();
			countryfield.sendKeys("spain");
			statefield.clear();
			statefield.sendKeys("france");
			zipcodefield.clear();
			zipcodefield.sendKeys("64276");
			EditSaveBtn.click();

		}
		public void deleteContact() throws Exception {

			Thread.sleep(3000);
			deleteicon.click();
			Thread.sleep(2000);
			deletebtnpopup.click();
			Thread.sleep(5000);
			
		}
		public void importContact() throws Exception {
			
			SignInBtn.click();
			Thread.sleep(1000);
			SignIn.SignInPage();
			Thread.sleep(10000);
			ContactsTab.click();
			Thread.sleep(4000);
			importcontact.click();
			Thread.sleep(1000);
			browsefilesbtn.click();
			Thread.sleep(5000);
			stringSelection = new StringSelection(prop.getProperty("ImportFile"));
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			ImageCopyPaste();
			Thread.sleep(5000);
			validatebtn.click();
			Thread.sleep(10000);
			importbtn.click();
			Thread.sleep(3000);

		}
		public void deleteContacts() throws Exception {
			
			Thread.sleep(5000);
			paginationfilterbtn.click();
			Select slct=new Select(paginationfilterbtn);
			slct.selectByVisibleText("200");
			Thread.sleep(4000);
			PrimaryCheckbox.click();
			Deletebtn.click();
			Deletebtnpopup2.click();

	
			
		}

	public void CreateGroup() throws Exception {

			SignInBtn.click();
			Thread.sleep(1000);
			SignIn.SignInPage();
			Thread.sleep(10000);
			ContactsTab.click();
			Thread.sleep(1000);
			ClickGrp.click();
			CreateGrp.click();
			GrpName.sendKeys("demo group");
			AddMember.click();
			//AddMember.sendKeys("kanisha");
			Selectmember.click();
			SubmitBtn.click();
			Thread.sleep(3000);
			String Validate = validategroup.getText();
			System.out.println(Validate);
			ClickMessage.click();
			Subject.sendKeys("Mail for Donating");
			Message.sendKeys("Please donate for our campaign and charity");
			SendBtn.click();
			Thread.sleep(5000);


	}

	public void DeleteGroup() throws Exception {

			GrpCheckbox.click();
			DeleteGrp.click();
			DeletePopup.click();


	}

}
