package com.atmecs.appium.uicatalog.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class UICatalogView extends BaseIOSView{

	public UICatalogView(AppiumDriver<WebElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(this.appiumDriver), this);
	}
	
	/**
	 * iOS element for action sheets.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Action Sheets\"]")
	IOSElement actionSheets;
	
	/**
	 * iOS element for activity indicators.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Activity Indicators\"]")
	IOSElement activityIndicator;
	
	/**
	 * Method to click on action sheets
	 */
	public void tapActionSheets(){
		this.actionSheets.click();
	}
	
	/**
	 * @return boolean (true if action sheets visible else false)
	 */
	public boolean isActionSheetsVisible(){
		return isUIElementVisible(this.actionSheets);
	}
	
	/**
	 * Method to tap on Activity Indicator.
	 */
	public void tapActivityIndicator(){
		this.activityIndicator.click();
	}
	
	/**
	 * @return boolean (true if activity indicator visible else false)
	 */
	public boolean isActivityIndicatorVisible(){
		return isUIElementVisible(this.activityIndicator);
	}
}
