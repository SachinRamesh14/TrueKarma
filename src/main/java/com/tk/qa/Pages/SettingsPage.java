package com.tk.qa.Pages;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tk.qa.Base.BaseClass;

public class SettingsPage extends BaseClass {

    WebDriverWait wait;
    SignUpPage SignIn = new SignUpPage();
    BaseClass Robot = new BaseClass();
    HomePage Homepage = new HomePage();
    DonatePage DonatePage = new DonatePage();
    StringSelection stringSelection;
    JavascriptExecutor js;

    @FindBy(xpath = "//div[2]//div[@class='preview_user_profile rounded-full']")
    WebElement ClickProfile;

    @FindBy(xpath = "//div[2]/div[3]//div[2]//div[3]/a[1]/p[text()='Settings']")
    WebElement ClickSettings;

    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastname;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    WebElement PhoneNumber;

    @FindBy(xpath = "//input[@id='address1']")
    WebElement Address1;

    @FindBy(xpath = "//input[@id='address2']")
    WebElement Address2;

    @FindBy(xpath = "//input[@id='city']")
    WebElement City;

    @FindBy(xpath = "//option[@value='newyork']")
    WebElement State;

    @FindBy(xpath = "//option[@value='male']")
    WebElement Gender;

    @FindBy(xpath = "//option[@value='50_100']")
    WebElement AnnualIncome;

    @FindBy(xpath = "//img[contains(@class,'w-24 h-24 rounded-full object-center object-cover')]")
    WebElement ClickImgedit;

    //@FindBy(xpath = "")
   // WebElement ;

    @FindBy(xpath = "//button[text()='Submit']")
    WebElement SubmitBtn;

    @FindBy(xpath = "//li[text()='Change Password']")
    WebElement ChangePassword;

    @FindBy(xpath = "//input[@id='oldPassword']")
    WebElement OldPassword;

    @FindBy(xpath = "//input[@id='newPassword']")
    WebElement NewPassword;

    @FindBy(xpath = "//input[@id='confirmPassword']")
    WebElement ConfirmPassword;

    @FindBy(xpath = "//button[text()='Submit']")
    WebElement Save;

    public SettingsPage()
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    //Action

    public String  HomePageTitle()
    {
        return driver.getTitle();

    }

    public void UserProfile() throws InterruptedException, AWTException
    {
        Homepage.SignIn();
        Thread.sleep(5000);
        ClickProfile.click();
        ClickSettings.click();
        lastname.sendKeys("Test");
        PhoneNumber.clear();
        PhoneNumber.sendKeys("9876543210");
        Address1.sendKeys("23");
        Address2.sendKeys("GlassRoad Street");
        City.sendKeys("Brooklyn");
        State.click();
        Gender.click();
        AnnualIncome.click();
        SubmitBtn.click();
        Thread.sleep(5000);
        ChangePassword.click();
        OldPassword.sendKeys("Qwerty@10");
        NewPassword.sendKeys("Qwerty@12");
        ConfirmPassword.sendKeys("Qwerty@12");
        Save.click();
        Thread.sleep(3000);

    }
}

