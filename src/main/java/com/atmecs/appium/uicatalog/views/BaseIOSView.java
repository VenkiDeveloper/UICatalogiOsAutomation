package com.atmecs.appium.uicatalog.views;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.ios.IOSElement;

public class BaseIOSView {

	protected AppiumDriver<IOSElement> appiumIOSDriver;
	
	public BaseIOSView(AppiumDriver<IOSElement> appiumDriver){
		this.appiumIOSDriver = appiumDriver;
	}
	
	/**
	 * Method to verify UI element is visible or not.
	 * @param by
	 * @return boolean (true or false)
	 */
	public boolean isUIElementVisible(By by) {
		boolean isUIElementVisible = false;
		try {
			appiumIOSDriver.findElement(by);
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
	
	/**
	 * Method to set text field value.
	 * @param element
	 * @param value
	 */
	public void clearAndTypeTextField(IOSElement element,String value){
		element.clear();
		element.sendKeys(value);
	}
	
	/**
	 * Method to set text field value.
	 * @param element
	 * @param value
	 */
	public void setValueWithKeyboard(IOSElement element,String value){
		element.clear();
		element.click();
		appiumIOSDriver.getKeyboard().sendKeys(value);
	}
	
	/**
	 * Method to swipe down the page.
	 */
	public void swipeDown(IOSElement element){
		element.swipe(SwipeElementDirection.DOWN, 5000);
	}
	
	/**
	 * Method to swipe up the page.
	 */
	public void swipeUp(IOSElement element){
		element.swipe(SwipeElementDirection.UP, 5000);
	}
}
