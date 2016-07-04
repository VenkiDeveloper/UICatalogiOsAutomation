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
	
	/**
	 * iOS element for Activity Indicator title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Activity Indicators\"]")
	IOSElement activityIndicatorTitile;
	
	/**
	 * iOS element for UICatalog button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().buttons()[\"UICatalog\"]")
	IOSElement uiCatalogButton;
	
	/**
	 * iOS element for Gray text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].groups()[\"GRAY\"]")
	IOSElement grayText;
	
	/**
	 * iOS element for TINTED text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].groups()[\"TINTED\"]")
	IOSElement tintedText;
	
	/**
	 * iOS element for activity indicator (gray).
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[0].activityIndicators()[\"In progress\"]")
	IOSElement grayActivityIndicator;
	
	/**
	 * iOS element for activity indicator (tinted).
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[1].activityIndicators()[\"In progress\"]")
	IOSElement tintedActivityIndicator;

	public boolean isActivityIndicatorTitleVisible(){
		return isUIElementVisible(this.activityIndicatorTitile);
	}

	public boolean isUICatalogButtonVisible(){
		return isUIElementVisible(this.uiCatalogButton);
	}
	
	public void navigateToUICatalogPage(){
		this.uiCatalogButton.click();
	}
	
	public boolean isGrayTextVisible(){
		return isUIElementVisible(this.grayText);
	}
	
	public boolean isTintedText(){
		return isUIElementVisible(this.tintedText);
	}
	
	public boolean isGrayActivityIndicatorVisible(){
		return isUIElementVisible(this.grayActivityIndicator);
	}
	
	public boolean isTintedActivityIndicatorVisible(){
		return isUIElementVisible(this.tintedActivityIndicator);
	}
}
