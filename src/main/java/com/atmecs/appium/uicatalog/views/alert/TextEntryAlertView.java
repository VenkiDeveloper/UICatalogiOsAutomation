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
public class TextEntryAlertView extends BaseIOSView{

	/**
	 * Text Entry Alert View Constructor Initialization.
	 * @param appiumDriver
	 */
	public TextEntryAlertView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	/**
	 * iOS element for Text Entry alert title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().scrollViews()[0].staticTexts()[\"A Short Title Is Best\"]")
	IOSElement alertTitle;
	
	/**
	 * iOS element for Text Entry alert body text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().scrollViews()[0].staticTexts()[\"A message should be a short, complete sentence.\"]")
	IOSElement alertBodyText;
	
	/**
	 * iOS element for Text Entry alert 'OK' button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().buttons()[\"OK\"]")
	IOSElement alertOKButton;
	
	/**
	 * iOS element for Text Entry alert 'Cancel' button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().buttons()[\"Cancel\"]")
	IOSElement alertCancelButton;
	
	/**
	 * iOS element for Text Entry alert 'TextField' .
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().scrollViews()[0].collectionViews()[0].cells()[0].textFields()[0]")
	IOSElement alertTextField;
	
	/**
	 * @return boolean (true if Text Entry Alert title is visible else false)
	 */
	public boolean isTextEntryAlertTitleVisible(){
		return isUIElementVisible(this.alertTitle);
	}
	
	/**
	 * @return boolean (true if Text Entry Alert body text visible else false)
	 */
	public boolean isTextEntryAlertBodyTextVisible(){
		return isUIElementVisible(this.alertBodyText);
	}
	
	/**
	 * @return boolean (true if Text Entry Alert OK button visible else false)
	 */
	public boolean isTextEntryAlertOKButtonVisible(){
		return isUIElementVisible(this.alertOKButton);
	}
	
	/**
	 * @return boolean (true if Text Entry Alert Cancel button visible else false)
	 */
	public boolean isTextEntryAlertCancelButtonVisible(){
		return isUIElementVisible(this.alertCancelButton);
	}
	
	/**
	 * Method tap on OK button.
	 */
	public void tapTextEntryAlertOKButton(){
		this.alertOKButton.click();
	}
	
	/**
	 * Method tap on Cancel button.
	 */
	public void tapTextEntryAlertCancelButton(){
		this.alertCancelButton.click();
	}
	
	/**
	 * Method to set Text Entry Alert Text field value.
	 * @param value
	 */
	public void setTextEntryAlertTextField(String value){
		setValueWithKeyboard(this.alertTextField, value);
	}
	
	/**
	 * @return boolean (true if Text Entry Alert Text Field visible else false)
	 */
	public boolean isTextEntryTextFieldVisible(){
		return isUIElementVisible(this.alertTextField);
	}
}
