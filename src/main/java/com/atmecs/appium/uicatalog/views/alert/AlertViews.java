package com.atmecs.appium.uicatalog.views.alert;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AlertViews extends BaseIOSView{

	public AlertViews(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	/**
	 * iOS element for Alert Views title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Alert Views\"]")
	IOSElement alertViewsTitle;
	
	/**
	 * iOS element for UICatalog button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().buttons()[\"UICatalog\"]")
	IOSElement uiCatalogButton;
	
	/**
	 * iOS element for Simple Alert.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Simple\"]")
	IOSElement simpleAlert;
	
	/**
	 * iOS element for Okay / Cancel Alert.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Okay / Cancel\"]")
	IOSElement okayOrCancelAlert;
	
	/**
	 * iOS element for Other Alert.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Other\"]")
	IOSElement otherAlert;
	
	/**
	 * iOS element for Text Entry Alert.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Text Entry\"]")
	IOSElement textEntryAlert;
	
	/**
	 * iOS element for Secure Text Entry Alert.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Secure Text Entry\"]")
	IOSElement secureTextEntryAlert;
	
	public boolean isAlertViewsTitleVisible(){
		return isUIElementVisible(this.alertViewsTitle);
	}
	
	public boolean isUICatalogButtonVisible(){
		return isUIElementVisible(this.uiCatalogButton);
	}
	
	public void navigateToUICatalogPage(){
		this.uiCatalogButton.click();
	}
	
	public boolean isSimpleAlertButtonVisible(){
		return isUIElementVisible(this.simpleAlert);
	}
	
	public void tapSimpleAlertButton(){
		this.simpleAlert.click();
	}
	
	public boolean isOKayOrCancelAlertButtonVisible(){
		return isUIElementVisible(this.okayOrCancelAlert);
	}
	
	public void tapOkayOrCancelAlertButton(){
		this.okayOrCancelAlert.click();
	}
	
	public boolean isOtherAlertButtonVisible(){
		return isUIElementVisible(this.otherAlert);
	}
	
	public void tapOtherAlertButton(){
		this.otherAlert.click();
	}
	
	public boolean isTextEntryAlertButtonVisible(){
		return isUIElementVisible(this.textEntryAlert);
	}
	
	public void tapTextEntryAlertButton(){
		this.textEntryAlert.click();
	}
	
	public boolean isSecureTextEntryAlertButtonVisible(){
		return isUIElementVisible(this.secureTextEntryAlert);
	}
	
	public void tapSecureTextEntryAlertButton(){
		this.secureTextEntryAlert.click();
	}
	
}
