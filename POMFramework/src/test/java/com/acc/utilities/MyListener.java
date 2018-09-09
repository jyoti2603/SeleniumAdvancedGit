package com.acc.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListener implements ITestListener {
	ExtentReports e;
	ExtentTest t;

	public void onTestStart(ITestResult result) {
		t=e.startTest(result.getMethod().getMethodName(), "has started");
	}

	public void onTestSuccess(ITestResult result) {
		
		t.log(LogStatus.PASS, result.getMethod().getMethodName()+" has passed");
	}

	public void onTestFailure(ITestResult result) {
		t.log(LogStatus.FAIL, result.getMethod().getMethodName()+" has failed");
	}

	public void onTestSkipped(ITestResult result) {
			
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
				
	}

	public void onStart(ITestContext context) {
		e= new ExtentReports("C:\\GitRepository\\POMFramework\\test-output\\myreport.html");
		
	}

	public void onFinish(ITestContext context) {		
		e.endTest(t);
		e.flush();
	}

}
