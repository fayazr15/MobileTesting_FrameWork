package com.app.android.lib;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import com.app.androidapp.init.GlobalVariables;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseLib

{
	public static  GlobalVariables gv = new GlobalVariables();
	public DesiredCapabilities capabilities =new DesiredCapabilities();
	public static AndroidDriver<MobileElement> driver=null;
	
//	Programmatically how to Start Appium Server
	
	/*AppiumDriverLocalService service;
	AppiumDriver<MobileElement> dr;
	
	@BeforeSuite
	public void StartServer()
	{
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
	}*/
	@BeforeClass
	public void _LaunchApp() throws MalformedURLException
	{
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", gv.deviceName);
		capabilities.setCapability("platformName", gv.platformName);
		capabilities.setCapability("platformVersion", gv.platforVersion);
		capabilities.setCapability("automationName", gv.automationName);
		capabilities.setCapability("appPackage", gv.appPackage);
		capabilities.setCapability("appActivity", gv.appActivity);
		capabilities.setCapability("UDID", gv.UDID);
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("appWaitDuration", 180000);
		capabilities.setCapability("autoGrantPermissions", true);
		capabilities.setCapability("autoAcceptAlerts", true);
		System.out.println("http://127.0.0.1:"+gv.port+"/wd/hub");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:"+gv.port+"/wd/hub"),capabilities);
		
/*//		Get Default URL
		
		driver = new AndroidDriver<>(service.getUrl(),capabilities);*/
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
/*	@AfterSuite
	public void shutDownServer()
	{
//		Programmatically how to stop Appium Server
		service.stop();
	}*/
	
	

}
