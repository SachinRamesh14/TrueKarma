package com.qa.tk.screenshot;

import org.testng.ITestContext;
import org.testng.ITestResult;

import com.tk.qa.Base.BaseClass;

public class ITestListener extends BaseClass implements org.testng.ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName());
		captureScreenshot(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName()+".png");
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
}
