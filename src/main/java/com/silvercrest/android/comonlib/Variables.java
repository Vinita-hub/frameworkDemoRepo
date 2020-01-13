package com.silvercrest.android.comonlib;

import java.util.Properties;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

/**
 * 
 * @author Vinita
 *
 */
public class Variables {
	
	public AndroidDriver driver;
	public DesiredCapabilities cap;
	public String UDID;
	public String appPackage;
	public String appActivity;
	public String platformName;
	public String platformVersion;
	public String deviceName;
	public String port;

	public static Properties propData;

}
