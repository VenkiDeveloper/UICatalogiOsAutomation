package com.atmecs.appium.uicatalog.views.alert;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SimpleAlertView extends BaseIOSView{

	/**
	 * Simple Alert View Constructor Initialization.
	 * @param appiumDriver
	 */
	public SimpleAlertView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	/**
	 * iOS element for Simple alert title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().scrollViews()[0].staticTexts()[\"A Short Title Is Best\"]")
	IOSElement simpleAlertTitle;
	
	/**
	 * iOS element for Simple alert body text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().scrollViews()[0].staticTexts()[\"A message should be a short, complete sentence.\"]")
	IOSElement simpleAlertBodyText;
	
	/**
	 * iOS element for Simple alert OK button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().buttons()[\"OK\"]")
	IOSElement simpleAlertOKButton;
	
	/**
	 * @return boolean (true if Simple Alert title is visible else false)
	 */
	public boolean isSimpleAlertTitleVisible(){
		return isUIElementVisible(this.simpleAlertTitle);
	}
	
	/**
	 * @return boolean (true if Simple Alert body text visible else false)
	 */
	public boolean isSimpleAlertBodyTextVisible(){
		return isUIElementVisible(this.simpleAlertBodyText);
	}
	
	/**
	 * @return boolean (true if Simple Alert OK button visible else false)
	 */
	public boolean isSimpleAlertOKButtonVisible(){
		return isUIElementVisible(this.simpleAlertOKButton);
	}
	
	/**
	 * Method tap on OK button.
	 */
	public void tapSimpleAlertOKButton(){
		this.simpleAlertOKButton.click();
	}
}
