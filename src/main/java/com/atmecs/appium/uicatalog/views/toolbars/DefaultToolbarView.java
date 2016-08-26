package com.atmecs.appium.uicatalog.views.toolbars;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * This class contains Default Toolbar features.
 * @author Venkatesh
 *
 */
public class DefaultToolbarView extends BaseIOSView{

	/**
	 * @param appiumDriver
	 */
	public DefaultToolbarView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumIOSDriver), this);
	}
	
	/**
	 * iOS element for Default Toolbars View Title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Default Toolbar\"]")
	IOSElement defaultToolBarsViewTitle;
	
	/**
	 * iOS element for Toolbars button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().buttons()[\"Toolbars\"]")
	IOSElement toolbarsButton;
	
	/**
	 * iOS element for Remove button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().toolbar().buttons()[\"Delete\"]")
	IOSElement removeButton;
	
	/**
	 * iOS element for Action button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().toolbar().buttons()[\"Action\"]")
	IOSElement actionButton;
	
	/**
	 * @return boolean (true if Default Toolbar View title visible else false)
	 */
	public boolean isDefaultToolbarsViewTitleVisible(){
		return this.isUIElementVisible(this.defaultToolBarsViewTitle);
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
	 * @return boolean (true if Remove button visible else false)
	 */
	public boolean isRemoveButtonVisible(){
		return this.isUIElementVisible(removeButton);
	}
	
	/**
	 * @return boolean (true if Action button visible else false)
	 */
	public boolean isActionButtonVisible(){
		return this.isUIElementVisible(actionButton);
	}

}
