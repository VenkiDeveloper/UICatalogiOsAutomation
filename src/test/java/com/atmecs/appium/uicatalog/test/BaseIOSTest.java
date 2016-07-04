package com.atmecs.appium.uicatalog.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.atmecs.appium.uicatalog.init.IOSCapabilityBuilder;

import io.appium.java_client.ios.IOSDriver;

public class BaseIOSTest {
	
	IOSCapabilityBuilder iOSCapabilityBuilder = new IOSCapabilityBuilder();
	protected IOSDriver<WebElement> iosDriver;
	
	@BeforeClass
	public void launchIOSApp(){
		DesiredCapabilities desiredCapabilities = iOSCapabilityBuilder.getDesiredCapabilities();
		try {
			iosDriver = new IOSDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		//iosDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void closeApp(){
		iosDriver.quit();
	}
}
