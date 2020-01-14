package com.silvercrest.android.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.silvercrest.android.comonlib.BaseClass;

public class ExtentReportManage extends BaseClass {
public void createExtentReport(String testCaseName)
{
	extentHtmlReporter = new ExtentHtmlReporter(USER_DIR+"\\reports\\extent.html");
	extentReports = new ExtentReports();
	extentReports.attachReporter(extentHtmlReporter);
	extentTest=extentReports.createTest(testCaseName);
	
}
}
