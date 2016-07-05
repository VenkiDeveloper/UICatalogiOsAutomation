package com.atmecs.appium.uicatalog.views.alert;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * @author venkatesh
 */
public class SecureTextEntryAlertView extends BaseIOSView{

	/**
	 * Secure Text Entry Alert View Constructor Initialization.
	 * @param appiumDriver
	 */
	public SecureTextEntryAlertView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	/**
	 * iOS element for Secure Text Entry alert title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().scrollViews()[0].staticTexts()[\"A Short Title Is Best\"]")
	IOSElement alertTitle;
	
	/**
	 * iOS element for Secure Text Entry alert body text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().scrollViews()[0].staticTexts()[\"A message should be a short, complete sentence.\"]")
	IOSElement alertBodyText;
	
	/**
	 * iOS element for Secure Text Entry alert 'OK' button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().buttons()[\"OK\"]")
	IOSElement alertOKButton;
	
	/**
	 * iOS element for Secure Text Entry alert 'Cancel' button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().buttons()[\"Cancel\"]")
	IOSElement alertCancelButton;
	
	/**
	 * iOS element for Secure Text Entry alert 'TextField' .
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().scrollViews()[0].collectionViews()[0].cells()[0].secureTextFields()[0]")
	IOSElement alertTextField;
	
	/**
	 * @return boolean (true if Secure Text Entry Alert title is visible else false)
	 */
	public boolean isSecureTextEntryAlertTitleVisible(){
		return isUIElementVisible(this.alertTitle);
	}
	
	/**
	 * @return boolean (true if Secure Text Entry Alert body text visible else false)
	 */
	public boolean isSecureTextEntryAlertBodyTextVisible(){
		return isUIElementVisible(this.alertBodyText);
	}
	
	/**
	 * @return boolean (true if Secure Text Entry Alert OK button visible else false)
	 */
	public boolean isSecureTextEntryAlertOKButtonVisible(){
		return isUIElementVisible(this.alertOKButton);
	}
	
	/**
	 * @return boolean (true if Secure Text Entry Alert Cancel button visible else false)
	 */
	public boolean isSecureTextEntryAlertCancelButtonVisible(){
		return isUIElementVisible(this.alertCancelButton);
	}
	
	/**
	 * Method tap on OK button.
	 */
	public void tapSecureTextEntryAlertOKButton(){
		this.alertOKButton.click();
	}
	
	/**
	 * Method to verify OK button is enabled or not.
	 * @return
	 */
	public boolean isSecureTextEntryOKButtonEnabled(){
		return this.alertOKButton.isEnabled();
	}
	
	/**
	 * Method tap on Cancel button.
	 */
	public void tapSecureTextEntryAlertCancelButton(){
		this.alertCancelButton.click();
	}
	
	/**
	 * Method to set Secure Text Entry Alert Text field value.
	 * @param value
	 */
	public void setSecureTextEntryAlertTextField(String value){
		clearAndTypeTextField(this.alertTextField, value);
	}
	
	/**
	 * @return boolean (true if Secure Text Entry Alert Text Field visible else false)
	 */
	public boolean isSecureTextEntryTextFieldVisible(){
		return isUIElementVisible(this.alertTextField);
	}
}
