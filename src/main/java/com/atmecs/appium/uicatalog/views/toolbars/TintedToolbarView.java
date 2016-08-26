package com.atmecs.appium.uicatalog.views.toolbars;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * This class contains Tinted Tool bar view test cases.
 * @author venkatesh
 *
 */
public class TintedToolbarView extends BaseIOSView {

	/**
	 * @param appiumDriver
	 */
	public TintedToolbarView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumIOSDriver), this);
	}
	
	/**
	 * iOS element for Tinted Toolbars View Title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Tinted Toolbar\"]")
	IOSElement tintedToolBarsViewTitle;
	
	/**
	 * iOS element for Toolbars button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().buttons()[\"Toolbars\"]")
	IOSElement toolbarsButton;
	
	/**
	 * iOS element for Refresh button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().toolbar().buttons()[\"Refresh\"]")
	IOSElement refreshButton;
	
	/**
	 * iOS element for share button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().toolbar().buttons()[\"Share\"]")
	IOSElement shareButton;
	
	/**
	 * @return boolean (true if Tinted Toolbar View title visible else false)
	 */
	public boolean isTintedToolbarsViewTitleVisible(){
		return this.isUIElementVisible(this.tintedToolBarsViewTitle);
	}
	
	/**
	 * @return boolean (true if UICatalog button visible else false)
	 */
	public boolean isToolbarsButtonVisible(){
		return this.isUIElementVisible(toolbarsButton);
	}
	
	/**
	 * Method to tap on Toolbars Button.
	 */
	public void tapToolbarsButton(){
		this.toolbarsButton.click();
	}
	
	/**
	 * @return boolean (true if Refresh button visible else false)
	 */
	public boolean isRefreshButtonVisible(){
		return this.isUIElementVisible(refreshButton);
	}
	
	/**
	 * @return boolean (true if Share button visible else false)
	 */
	public boolean isShareButtonVisible(){
		return this.isUIElementVisible(shareButton);
	}

}
