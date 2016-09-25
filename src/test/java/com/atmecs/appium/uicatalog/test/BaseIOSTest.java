package com.atmecs.appium.uicatalog.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.atmecs.appium.uicatalog.init.IOSCapabilityBuilder;
import com.atmecs.appium.uicatalog.util.TestLogger;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class BaseIOSTest {
	
	protected TestLogger LOG = TestLogger.getLogger(BaseIOSTest.class);
	
	IOSCapabilityBuilder iOSCapabilityBuilder = new IOSCapabilityBuilder();
	protected IOSDriver<IOSElement> appiumIOSDriver;
	
	@BeforeClass
	public void launchIOSApp(){
		DesiredCapabilities desiredCapabilities = iOSCapabilityBuilder.getDesiredCapabilities();
		try {
			appiumIOSDriver = new IOSDriver<IOSElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		//iosDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void closeApp(){
		appiumIOSDriver.quit();
	}
}
