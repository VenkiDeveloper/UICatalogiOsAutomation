package com.atmecs.appium.uicatalog.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ActivityIndicatorView extends BaseIOSView {

	/**
	 * Constructor Initialization.
	 * @param appiumDriver
	 */
	public ActivityIndicatorView(AppiumDriver<WebElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Activity Indicator\"]")
	IOSElement activityIndicatorTitile;
	
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().buttons()[\"UICatalog\"]")
	IOSElement uiCatalogButton;

	public boolean isActivityIndicatorTitleVisible(){
		return isUIElementVisible(this.activityIndicatorTitile);
	}

	public boolean isUICatalogButtonVisible(){
		return isUIElementVisible(this.uiCatalogButton);
	}
	
	public void navigateToUICatalogPage(){
		this.uiCatalogButton.click();
	}
}
