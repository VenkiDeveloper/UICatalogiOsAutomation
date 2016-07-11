package com.atmecs.appium.uicatalog.views;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class BaseIOSView {

	protected AppiumDriver<IOSElement> appiumIOSDriver;
	
	public BaseIOSView(AppiumDriver<IOSElement> appiumDriver){
		this.appiumIOSDriver = appiumDriver;
	}
	
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow()")
	IOSElement srcoll;
	
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
	 * Method to scroll down the page.
	 */
	public void scrollDown(){
		this.srcoll.swipe(SwipeElementDirection.DOWN, 5000);
	}
	
	/**
	 * Method to scroll up the page.
	 */
	public void scrollUp(){
		this.srcoll.swipe(SwipeElementDirection.UP, 5000);
	}
}
