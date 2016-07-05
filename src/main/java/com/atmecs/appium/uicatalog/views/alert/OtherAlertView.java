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
public class OtherAlertView extends BaseIOSView{

	/**
	 * Other Alert View Constructor Initialization.
	 * @param appiumDriver
	 */
	public OtherAlertView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	/**
	 * iOS element for Other alert title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().scrollViews()[0].staticTexts()[\"A Short Title Is Best\"]")
	IOSElement alertTitle;
	
	/**
	 * iOS element for other alert body text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().scrollViews()[0].staticTexts()[\"A message should be a short, complete sentence.\"]")
	IOSElement alertBodyText;
	
	/**
	 * iOS element for Okay/Cancel alert 'Choice One' button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().buttons()[\"Choice One\"]")
	IOSElement alertChoiceOneButton;
	
	/**
	 * iOS element for Okay/Cancel alert 'Choice Two' button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().buttons()[\"Choice Two\"]")
	IOSElement alertChoiceTwoButton;
	
	/**
	 * iOS element for Okay/Cancel alert 'Cancel' button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().alert().buttons()[\"Cancel\"]")
	IOSElement alertCancelButton;
	
	/**
	 * @return boolean (true if Other Alert title is visible else false)
	 */
	public boolean isOtherAlertTitleVisible(){
		return isUIElementVisible(this.alertTitle);
	}
	
	/**
	 * @return boolean (true if Other Alert body text visible else false)
	 */
	public boolean isOtherAlertBodyTextVisible(){
		return isUIElementVisible(this.alertBodyText);
	}
	
	/**
	 * @return boolean (true if Other Alert Choice one button visible else false)
	 */
	public boolean isOtherAlertChoiceOneButtonVisible(){
		return isUIElementVisible(this.alertChoiceOneButton);
	}
	
	/**
	 * @return boolean (true if Other Alert Choice two button visible else false)
	 */
	public boolean isOtherAlertChoiceTwoButtonVisible(){
		return isUIElementVisible(this.alertChoiceTwoButton);
	}
	
	/**
	 * @return boolean (true if Okay/Cancel Alert Cancel button visible else false)
	 */
	public boolean isOtherAlertCancelButtonVisible(){
		return isUIElementVisible(this.alertCancelButton);
	}
	
	/**
	 * Method tap on Choice one button.
	 */
	public void tapOtherAlertChoiceOneButton(){
		this.alertChoiceOneButton.click();
	}
	
	/**
	 * Method tap on Choice Two button.
	 */
	public void tapOtherAlertChoiceTwoButton(){
		this.alertChoiceTwoButton.click();
	}
	
	/**
	 * Method tap on Cancel button.
	 */
	public void tapOtherAlertCancelButton(){
		this.alertCancelButton.click();
	}
}
