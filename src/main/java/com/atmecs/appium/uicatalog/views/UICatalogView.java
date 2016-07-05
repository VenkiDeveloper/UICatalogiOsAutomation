package com.atmecs.appium.uicatalog.views;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class UICatalogView extends BaseIOSView{

	public UICatalogView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(this.appiumIOSDriver), this);
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
	 * iOS element for Alert Views.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Alert Views\"]")
	IOSElement alertViews;
	
	
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
	
	/**
	 * @return boolean (true if Alert Views visible else false)
	 */
	public boolean isAlertViewsVisible(){
		return isUIElementVisible(this.activityIndicator);
	}
	
	/**
	 * Method to tap Alert Views.
	 */
	public void tapAlertViews(){
		this.alertViews.click();
	}
}
