package com.tk.qa.Pages;

import java.awt.AWTException;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tk.qa.Base.BaseClass;

public class FullFlowWeb extends BaseClass{
	
	WebDriverWait wait;
	SignUpPage SignIn = new SignUpPage();
	BaseClass Robot=new BaseClass();
	HomePage Homepage=new HomePage(); 
	DonatePage DonatePage =new DonatePage();
	StringSelection stringSelection;
	JavascriptExecutor js;
	
	//Initial
			public FullFlowWeb()
			{
				PageFactory.initElements(driver, this);

			}

			//Action

			
			
			public void FullFlow() throws InterruptedException, AWTException
			{
				
			}

}
