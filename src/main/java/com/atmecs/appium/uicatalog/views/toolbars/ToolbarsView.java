package com.atmecs.appium.uicatalog.views.toolbars;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * This class contains Toolbars view features.
 * @author venkatesh
 *
 */
public class ToolbarsView extends BaseIOSView{

	/**
	 * @param appiumDriver
	 */
	public ToolbarsView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumIOSDriver), this);
	}
	
	/**
	 * iOS element for Toolbars View Title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Toolbars\"]")
	IOSElement toolBarsViewTitle;
	
	/**
	 * iOS element for UI Catalog button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().buttons()[\"UICatalog\"]")
	IOSElement uiCatalog;
	
	/**
	 * iOS element for Default cell.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Default\"]")
	IOSElement defaultCell;
	
	/**
	 * iOS element for Tinted cell.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Tinted\"]")
	IOSElement tintedCell;
	
	/**
	 * iOS element for Custom cell.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Custom\"]")
	IOSElement customCell;
	
	/**
	 * @return boolean (true if Toolbar View title visible else false)
	 */
	public boolean isToolbarsViewTitleVisible(){
		return this.isUIElementVisible(this.toolBarsViewTitle);
	}
	
	/**
	 * @return boolean (true if UICatalog button visible else false)
	 */
	public boolean isUICatalogButtonVisible(){
		return this.isUIElementVisible(uiCatalog);
	}
	
	/**
	 * Method to tap on UICatalog Button.
	 */
	public void tapUICatalogButton(){
		this.uiCatalog.click();
	}
	
	/**
	 * @return boolean (true if Default cell visible else false)
	 */
	public boolean isDefaultCellVisible(){
		return this.isUIElementVisible(this.defaultCell);
	}
	
	/**
	 * @return boolean (true if Custom cell visible else false)
	 */
	public boolean isCustomCellVisible(){
		return this.isUIElementVisible(this.customCell);
	}
	
	/**
	 * @return boolean (true if Tinted cell visible else false)
	 */
	public boolean isTintedCellVisible(){
		return this.isUIElementVisible(this.tintedCell);
	}
	
	/**
	 * Method to tap on Default cell.
	 */
	public void tapDefault(){
		this.defaultCell.click();
	}
	
	/**
	 * Method to tap on Custom cell.
	 */
	public void tapCustom(){
		this.customCell.click();
	}
	
	/**
	 * Method to tap on Tinted cell.
	 */
	public void tapTinted(){
		this.tintedCell.click();
	}

}
