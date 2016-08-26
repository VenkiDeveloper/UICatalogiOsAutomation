package com.atmecs.appium.uicatalog.views.toolbars;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * This class contains Custom Tool bar view test cases.
 * @author venkatesh
 *
 */
public class CustomToolbarView extends BaseIOSView {

	/**
	 * @param appiumDriver
	 */
	public CustomToolbarView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumIOSDriver), this);
	}
	
	/**
	 * iOS element for Custom Toolbars View Title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Custom Toolbar\"]")
	IOSElement customToolBarsViewTitle;
	
	/**
	 * iOS element for Toolbars button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().buttons()[\"Toolbars\"]")
	IOSElement toolbarsButton;
	
	/**
	 * iOS element for Tools icon.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().toolbar().buttons()[\"tools icon\"]")
	IOSElement toolsIcon;
	
	/**
	 * iOS element for button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().toolbar().buttons()[\"Button\"]")
	IOSElement button;
	
	/**
	 * @return boolean (true if Custom Toolbar View title visible else false)
	 */
	public boolean isCustomToolbarsViewTitleVisible(){
		return this.isUIElementVisible(this.customToolBarsViewTitle);
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
	 * @return boolean (true if Tools icon visible else false)
	 */
	public boolean isToolsIconVisible(){
		return this.isUIElementVisible(toolsIcon);
	}
	
	/**
	 * @return boolean (true if Button visible else false)
	 */
	public boolean isButtonVisible(){
		return this.isUIElementVisible(button);
	}

}
