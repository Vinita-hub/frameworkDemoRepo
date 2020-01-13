package com.silvercrest.android.comonlib;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.android.AndroidDriver;

/**
 * 
 * @author Admin
 *
 */
public class BaseClass implements IConstants {
	public Variables var = new Variables();

	/**
	 * 
	 */
	@BeforeSuite
	public void globalVariables() {
		try {
			initilizaton();
		} catch (Throwable e) {

		}
		var.UDID = var.propData.getProperty("UDID");
		var.appActivity = var.propData.getProperty("appActivity");
		var.appPackage = var.propData.getProperty("appPackage");
		var.deviceName = var.propData.getProperty("deviceName");
		var.platformName = var.propData.getProperty("platformName");
		var.platformVersion = var.propData.getProperty("platformVersion");
		var.port = var.propData.getProperty("port");
	}

	/**
	 * 
	 * @throws MalformedURLException
	 */

	@BeforeTest
	public void capabilitiesValue() throws MalformedURLException {
		var.cap = new DesiredCapabilities();
		// set the capabilities
		var.cap.setCapability("appPackage", var.appPackage);
		var.cap.setCapability("appActivity", var.appActivity);
		var.cap.setCapability("UDID", var.UDID);
		var.cap.setCapability("deviceName", var.deviceName);
		var.cap.setCapability("platformName", var.platformName);
		var.cap.setCapability("platformVersion", var.platformVersion);

		var.cap.setCapability("fullReset", false);
		var.cap.setCapability("noReset", false);
		var.cap.setCapability("appWaitDuration", 111);
		var.cap.setCapability("autoAcceptAllert", true);
		var.cap.setCapability("autoGrantPermission", true);

		// lauch the app
		var.driver = new AndroidDriver(new URL("http://0.0.0.0:" + var.port + "/wd/hub"), var.cap);
	}

	/**
	 * 
	 * @throws Throwable
	 */

	public void initilizaton() throws Throwable {
		try {
			var.propData = new Properties();
			var.propData.load(new FileInputStream(DATA_USER_DIR));
		} catch (Exception e) {
		}
	}
}
