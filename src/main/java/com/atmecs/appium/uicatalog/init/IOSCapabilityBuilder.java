package com.atmecs.appium.uicatalog.init;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.atmecs.appium.uicatalog.util.JSONObjectUtil;
import com.atmecs.appium.uicatalog.util.PropertyUtil;

import io.appium.java_client.remote.MobileCapabilityType;

public class IOSCapabilityBuilder {
	PropertyUtil propertyUtil = new PropertyUtil();
	JSONObjectUtil jsonObjectUtil = new JSONObjectUtil();
	
	public DesiredCapabilities getDesiredCapabilities(){
		// Get the capabilities values from config file
		String appiumVersion = propertyUtil.getProperty("ios.appiumVersion");
		String isRealDevice = jsonObjectUtil.getObject("isRealDevice");
		String deviceName = jsonObjectUtil.getObject("deviceName");
		String platformVersion = jsonObjectUtil.getObject("platformVersion");
		String appPackagePath = propertyUtil.getProperty("ios.appPackagePath");
		String enableCloudRun = propertyUtil.getProperty("flag.enableRunningInCloud");
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, appiumVersion);
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
	    desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
	    desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
	    desiredCapabilities.setCapability(MobileCapabilityType.APP, appPackagePath);
	    
	    if(isRealDevice.equals("true")){
	    	String uuid = "";
	    	String appBundleID = "";
	    	desiredCapabilities.setCapability(MobileCapabilityType.UDID, uuid);
	    	desiredCapabilities.setCapability("bundleId", appBundleID);
	    }
	    
	    if(enableCloudRun.equals("true")){
	    	//String cloudAPI = "";
	    	//String appBundleID = "";
	    }
	    
	    return desiredCapabilities;
	}
}
