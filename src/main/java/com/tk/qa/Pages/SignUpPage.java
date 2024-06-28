package com.tk.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tk.qa.Base.BaseClass;

public class SignUpPage extends BaseClass {
	
	WebDriverWait wait;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;

	@FindBy(xpath = "//button[@class='button_btn_style__dR_RH undefined'][text()='Sign In']")
	WebElement SigInBtn;

	@FindBy(xpath = "//span[text()='Sign Up']")
	WebElement SignupBtn;

	 @FindBy(xpath = "//input[@id='firstName']")
	     WebElement firstName;

	    @FindBy(xpath = "//input[@id='lastName']")
	     WebElement lastName;

	    @FindBy(xpath = "//input[@id='phoneNumber']")
	     WebElement phoneNumber;

	    @FindBy(xpath = "//input[@id='email']")
	     WebElement emailAddress;

	    @FindBy(xpath = "//input[@id='password']")
	     WebElement passwordNew;

	    @FindBy(xpath = "//input[@id='confirmPassword']")
	     WebElement confirmPassword;

	    @FindBy(xpath = "//input[@id='confirm']")
	     WebElement checkBox;

	    @FindBy(xpath = "//button[text()='Sign Up']")
	     WebElement signUpButton;

		@FindBy(xpath = "//button[text()='Back to login']")
		WebElement BacktoLogin;

		@FindBy(xpath = "//button[text()='Resend']")
		WebElement ReSend;

		@FindBy(xpath = "//*[contains(text(), 'Cancel')]")
		WebElement cancelButton;
	
	
	
	//Initial
		public SignUpPage()
		{
			PageFactory.initElements(driver, this);

		}
	
		
		public  void SignInPage() throws InterruptedException
		{
			email.sendKeys(prop.getProperty("Email"));
			password.sendKeys(prop.getProperty("Password"));
			submit.click();						
		}

		public void SignUpPageNewUser() throws InterruptedException
		{
			SigInBtn.click();
			SignupBtn.click();
		 	firstName.sendKeys("Madeshwaran");
			lastName.sendKeys("s");
			phoneNumber.sendKeys("15015014141");
			emailAddress.sendKeys("viratkholi@yopmail.com");
			passwordNew.sendKeys("Applogiq@123");
			confirmPassword.sendKeys("Applogiq@123");
			checkBox.click();
			signUpButton.click();
			BacktoLogin.click();
		}
		
}
