package com.atmecs.appium.uicatalog.views;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class BaseIOSView {

	protected AppiumDriver<WebElement> appiumDriver;
	
	public BaseIOSView(AppiumDriver<WebElement> appiumDriver){
		this.appiumDriver = appiumDriver;
	}
	
	/**
	 * Method to verify UI element is visible or not.
	 * @param by
	 * @return boolean (true or false)
	 */
	public boolean isUIElementVisible(By by) {
		boolean isUIElementVisible = false;
		try {
			appiumDriver.findElement(by);
			isUIElementVisible = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isUIElementVisible;
	}
	
	/**
	 * Method to verify UI element is visible or not.
	 * @param element
	 * @return boolean (true or false)
	 */
	public boolean isUIElementVisible(WebElement element) {
		boolean isUIElementVisible = false;
		try {
			element.isDisplayed();
			isUIElementVisible = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isUIElementVisible;
	}
	
}
