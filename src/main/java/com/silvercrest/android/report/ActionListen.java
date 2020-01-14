package com.silvercrest.android.report;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.silvercrest.android.comonlib.BaseClass;

public class ActionListen extends BaseClass implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		extentTest.log(Status.FAIL, "is Failed");
		extentReports.flush();
	}

	public void onTestSkipped(ITestResult arg0) {
		extentTest.log(Status.SKIP, "is skiped");
		extentReports.flush();
	}

	public void onTestStart(ITestResult result) {
		testCaseName=result.getTestClass().getName().toString();
		new ExtentReportManage().createExtentReport(testCaseName);
	}

	public void onTestSuccess(ITestResult arg0) {
		extentTest.log(Status.PASS, "is passed");
		extentReports.flush();
	}

}
