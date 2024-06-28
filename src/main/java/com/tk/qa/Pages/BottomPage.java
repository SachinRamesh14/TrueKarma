package com.tk.qa.Pages;

import java.awt.AWTException;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tk.qa.Base.BaseClass;

public class BottomPage extends BaseClass{

	WebDriverWait wait;
	SignUpPage SignIn = new SignUpPage();
	BaseClass Robot=new BaseClass();
	HomePage Homepage=new HomePage(); 
	DonatePage DonatePage =new DonatePage();
	StringSelection stringSelection;
	JavascriptExecutor js;
	
	@FindBy(xpath="//li[text()='How does TrueKarma work?']")
	WebElement HowDoesTrueKarmaWork;
	
	@FindBy(xpath="//span[text()='Features']")
	WebElement Text1;
	
	@FindBy(xpath="//h2/span[text()='Donate']")
	WebElement Text2;
	
	@FindBy(xpath="//span[text()='fundraiser']")
	WebElement Text3;

	@FindBy(xpath="//span[text()=' Activity']")
	WebElement Text4;

	@FindBy(xpath="//p[text()='Looking Back']")
	WebElement Text5;

	@FindBy(xpath="//li[text()='Why TrueKarma?']")
	WebElement WhyTrueKarma;
	
	@FindBy(xpath="//li[text()='Success Stories']")
	WebElement SuccessStories;
	
	@FindBy(xpath="//li[text()='Search Charities']")
	WebElement SearchCharities;
	
	@FindBy(xpath="//li[text()='About Us']")
	WebElement AboutUs;
	
	@FindBy(xpath="//li[text()='What is Crowd Funding?']")
	WebElement CrowdFunding;
	
	@FindBy(xpath="//li[text()='Charity News']")
	WebElement CharityNews;
	
	@FindBy(xpath="//li[text()='TrueKarma Help Center']")
	WebElement TrueKarmaHelpCenter;
	
	@FindBy(xpath="//li[text()='Contact Us']")
	WebElement ContactUs;
	
	@FindBy(xpath="//li[text()='Blogs']")
	WebElement Blogs;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement nameContact;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement EmailContact;
	
	@FindBy(xpath="//input[@id='phone']")
	WebElement phoneContact;
	
	@FindBy(xpath="//textarea[@id='message']")
	WebElement messageContact;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement SubmitContact;
	
	
	//Initial
			public BottomPage()
			{
				this.driver = driver;
				PageFactory.initElements(driver, this);

			}

			//Action

			public String  HomePageTitle()
			{
				return driver.getTitle();

			}
			
			public void BottomLiksClick() throws InterruptedException, AWTException
			{
				HowDoesTrueKarmaWork.click();
				ScrollDown();
				Thread.sleep(5000);
				String textfeut=Text1.getText();
				System.out.println(textfeut);
				ScrollDown();
				Thread.sleep(5000);
				String textdnt=Text2.getText();
				System.out.println(textdnt);
				ScrollDown();
				Thread.sleep(5000);
				String textfund=Text3.getText();
				System.out.println(textfund);
				ScrollDown();
				Thread.sleep(5000);
				String textact=Text4.getText();
				System.out.println(textact);
				ScrollDown();
				Thread.sleep(5000);
				String textLB=Text5.getText();
				System.out.println(textLB);
				ScrollDown();
				Thread.sleep(5000);
				WhyTrueKarma.click();
				String textTKWhy=Text5.getText();
				System.out.println(textTKWhy);
				ScrollDown();
				Thread.sleep(5000);
				SuccessStories.click();
				ScrollDown();
				Thread.sleep(5000);
				SearchCharities.click();
				ScrollDown();
				Thread.sleep(5000);
				Blogs.click();
				ScrollDown();
				Thread.sleep(5000);
				AboutUs.click();
				ScrollDown();
				Thread.sleep(5000);
				CrowdFunding.click();
				ScrollDown();
				Thread.sleep(5000);
				CharityNews.click();
				ScrollDown();
				Thread.sleep(5000);
				TrueKarmaHelpCenter.click();
				ScrollDown();
				Thread.sleep(5000);
				ContactUs.click();	
				nameContact.sendKeys(prop.getProperty("nameContact"));
				EmailContact.sendKeys(prop.getProperty("EmailContact"));
				phoneContact.sendKeys(prop.getProperty("phoneContact"));
				messageContact.sendKeys(prop.getProperty("messageContact"));
				SubmitContact.click();				
								
			}

}
