package com.tk.qa.Pages;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.awt.datatransfer.StringSelection;

import com.tk.qa.Base.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.OutputType;


import com.tk.qa.Base.BaseClass;

public class BannerValidate extends BaseClass{

    WebDriverWait wait;
    SignUpPage SignIn = new SignUpPage();
    BaseClass Robot = new BaseClass();
    HomePage Homepage = new HomePage();
    DonatePage DonatePage = new DonatePage();
    StringSelection stringSelection;
    JavascriptExecutor js;

    @FindBy(xpath = "//span[text()='Donate']")
    WebElement Donatepage;

    @FindBy(xpath = "//img[@alt='donate_frame']")
    WebElement donetebanner;

    @FindBy(xpath = "//span[text()='Events']")
    WebElement Eventpage;

    @FindBy(xpath = "//img[@alt='events_frame']")
    WebElement Eventbanner;

    @FindBy(xpath = "//span[text()='Charity Finder']")
    WebElement Charityfinder;

    @FindBy(xpath = "//img[@alt='events_frame']")
    WebElement Charitrybanner;

    @FindBy(xpath = "//span[text()='Blogs']")
    WebElement Blogspage;

    @FindBy(xpath = "//img[@alt='about_frame']")
    WebElement Blogbanner;

    @FindBy(xpath = "//li[text()='About Us']")
    WebElement Aboutus;

    @FindBy(xpath = "//img[@alt='about_frame']")
    WebElement Aboutusbanner;

    @FindBy(xpath = "//li[text()='Success Stories']")
    WebElement successstories;

    @FindBy(xpath = "//body//div//h1[1]")
    WebElement Sucsstorybanner;

    @FindBy(xpath = "//li[text()='TrueKarma Help Center']")
    WebElement Helpcenter;

    @FindBy(xpath = "//img[@alt='help_frame']")
    WebElement Helpcenterbanner;

    @FindBy(xpath = "//li[text()='Contact Us']")
    WebElement Contactus;

    @FindBy(xpath = "//img[@alt='contact_frame']")
    WebElement Contausbanner;


    //Initial
    public BannerValidate()
    {
        PageFactory.initElements(driver, this);
    }

    public String BannerpageTitle()
    {
        return driver.getTitle();
    }


    public void BannerValidation() throws InterruptedException, AWTException, IOException
    {
        Donatepage.click();
        Thread.sleep(5000);
        if (Donatepage.isDisplayed()) {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File src = screenshot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("D:\\Projects\\Automation Code Backups\\Demo\\TK\\screenshots\\donateBanner.png");
            FileUtils.copyFile(src,destFile);
            System.out.println("Screenshot captured and saved successfully.");
        } else {
            System.out.println("Element is not displayed.");
        }

    }

    public void bannervalidation() throws InterruptedException,AWTException, IOException
    {
        Donatepage.click();
        Thread.sleep(3000);
        Boolean donvalidation =  donetebanner.isDisplayed();
        System.out.println("Donate Page Banner successfully displayed"+ donvalidation);

        Eventpage.click();
        Thread.sleep(3000);
        Boolean evevalidation =  Eventbanner.isDisplayed();
        System.out.println("Event Page Banner successfully displayed"+ evevalidation);

        Charityfinder.click();
        Thread.sleep(3000);
        Boolean Charvalidation =  Charitrybanner.isDisplayed();
        System.out.println("Charity Finder Page Banner successfully displayed"+ Charvalidation);

        Blogspage.click();
        Thread.sleep(3000);
        Boolean blogvalidation =  Blogbanner.isDisplayed();
        System.out.println("Blogs Page Banner successfully displayed"+ blogvalidation);

        Aboutus.click();
        Thread.sleep(3000);
        Boolean Aboutusvalidation =  Aboutusbanner.isDisplayed();
        System.out.println("About Us Page Banner successfully displayed"+ Aboutusvalidation);

        successstories.click();
        Thread.sleep(3000);
        Boolean sussvalidation =  Sucsstorybanner.isDisplayed();
        System.out.println("Success Stories Page Banner successfully displayed"+ sussvalidation);

        Helpcenter.click();
        Thread.sleep(3000);
        Boolean helpvalidation =  Helpcenterbanner.isDisplayed();
        System.out.println("Help Center Page Banner successfully displayed"+ helpvalidation);

        Contactus.click();
        Thread.sleep(3000);
        Boolean convalidation =  Contausbanner.isDisplayed();
        System.out.println("Contact Us Page Banner successfully displayed"+ convalidation);

    }


}
