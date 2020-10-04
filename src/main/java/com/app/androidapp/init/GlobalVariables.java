package com.app.androidapp.init;

import com.app.android.lib.GenericLibrary;

public class GlobalVariables {
	
//	Global Variables
	
	
	
//	DesiredCapabilities Variables
	public int port =Integer.parseInt(GenericLibrary.getProprtyValue(Constants.DCfile, "port"));
	public String deviceName=GenericLibrary.getProprtyValue(Constants.DCfile, "devicename");
	public String platformName=GenericLibrary.getProprtyValue(Constants.DCfile, "platformname");;
	public String platforVersion=GenericLibrary.getProprtyValue(Constants.DCfile, "platformversion");;
	public String automationName=GenericLibrary.getProprtyValue(Constants.DCfile, "automationname");;
	public String appPackage=GenericLibrary.getProprtyValue(Constants.DCfile, "apppackage");;
	public String appActivity=GenericLibrary.getProprtyValue(Constants.DCfile, "appactivity");;
	public String UDID=GenericLibrary.getProprtyValue(Constants.DCfile, "udid");
	
	
}
