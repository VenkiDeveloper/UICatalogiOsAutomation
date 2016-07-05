package com.atmecs.appium.uicatalog.views.alert;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class OkayOrCancelAlertView extends BaseIOSView{

	/**
	 * Okay / Cancel Alert View Constructor Initialization.
	 * @param appiumDriver
	 */
	public OkayOrCancelAlertView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	/**
	 * iOS element for Okay/Cancel alert title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().scrollViews()[0].staticTexts()[\"A Short Title Is Best\"]")
	IOSElement alertTitle;
	
	/**
	 * iOS element for Okay/Cancel alert body text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().scrollViews()[0].staticTexts()[\"A message should be a short, complete sentence.\"]")
	IOSElement alertBodyText;
	
	/**
	 * iOS element for Okay/Cancel alert 'OK' button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().buttons()[\"OK\"]")
	IOSElement alertOKButton;
	
	/**
	 * iOS element for Okay/Cancel alert 'Cancel' button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().buttons()[\"Cancel\"]")
	IOSElement alertCancelButton;
	
	/**
	 * @return boolean (true if Okay/Cancel Alert title is visible else false)
	 */
	public boolean isOkayOrCancelAlertTitleVisible(){
		return isUIElementVisible(this.alertTitle);
	}
	
	/**
	 * @return boolean (true if Okay/Cancel Alert body text visible else false)
	 */
	public boolean isOkayOrCancelAlertBodyTextVisible(){
		return isUIElementVisible(this.alertBodyText);
	}
	
	/**
	 * @return boolean (true if Okay/Cancel Alert OK button visible else false)
	 */
	public boolean isOkayOrCancelAlertOKButtonVisible(){
		return isUIElementVisible(this.alertOKButton);
	}
	
	/**
	 * @return boolean (true if Okay/Cancel Alert Cancel button visible else false)
	 */
	public boolean isOkayOrCancelAlertCancelButtonVisible(){
		return isUIElementVisible(this.alertCancelButton);
	}
	
	/**
	 * Method tap on OK button.
	 */
	public void tapOkayOrCancelAlertOKButton(){
		this.alertOKButton.click();
	}
	
	/**
	 * Method tap on Cancel button.
	 */
	public void tapOkayOrCancelAlertCancelButton(){
		this.alertCancelButton.click();
	}
}
