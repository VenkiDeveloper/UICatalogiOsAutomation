package com.atmecs.appium.uicatalog.views.pagecontrol;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * This class contains Page control features.
 * @author venkatesh
 *
 */
public class PageControlView extends BaseIOSView{

	/**
	 * Constructor initialization.
	 * @param appiumDriver
	 */
	public PageControlView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumIOSDriver), this);
	}
	
	/**
	 * iOS element for Page control title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Page Control\"]")
	IOSElement pageControlTitle;
	
	/**
	 * iOS element for UICatalog button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().buttons()[\"UICatalog\"]")
	IOSElement uiCatalogButton;
	
	/**
	 * iOS element for Page indicators.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().pageIndicators()[0]")
	IOSElement pageIndicators;
	
	/**
	 * @return boolean (true if Page control title visible else false)
	 */
	public boolean isPageControlTitleVisible(){
		return isUIElementVisible(this.pageControlTitle);
	}
	
	/**
	 * @return boolean (true if UI catalog button visible else false)
	 */
	public boolean isUICatalogButtonVisible(){
		return isUIElementVisible(this.uiCatalogButton);
	}
	
	/**
	 * Method to navigate to UI catalog.
	 */
	public void navigateToUICatalog(){
		this.uiCatalogButton.click();
	}
	
	/**
	 * @return boolean (true if page indicators visible else false)
	 */
	public boolean isPageIndicatorsVisible(){
		return isUIElementVisible(this.pageIndicators);
	}
	
	/**
	 * Method to select pages of page indicator.
	 * @param selectPage
	 */
	public void selectPage(int selectPage){
		JavascriptExecutor js = (JavascriptExecutor)appiumIOSDriver;
		String script = "target.frontMostApp().mainWindow().pageIndicators()[0].selectPage("+selectPage+")";
		js.executeScript(script);
	}

	
}
