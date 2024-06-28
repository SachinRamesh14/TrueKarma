package com.tk.qa.Testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tk.qa.Base.BaseClass;
import com.tk.qa.Pages.HomePage;
import com.tk.qa.utilit.TestUtil;
import com.tk.qa.Pages.BannerValidate;

public class BannerValidateTest extends BaseClass{

    HomePage HomePage;
    WebDriverWait wait;
    String Signin;
    TestUtil TestUtil;
    BannerValidate bannerPage;


    public BannerValidateTest()
    {
        super();
    }

    @BeforeMethod
    public void Setup() throws InterruptedException
    {
        OpenHomePage();
        HomePage =new HomePage();
        TestUtil =new TestUtil();
        bannerPage =new BannerValidate();

    }

    @Test
    public void BannerValidate() throws InterruptedException, AWTException, IOException
    {
        bannerPage.bannervalidation();

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
