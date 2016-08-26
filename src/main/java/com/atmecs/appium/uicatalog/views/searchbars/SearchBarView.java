package com.atmecs.appium.uicatalog.views.searchbars;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * This class contains Search Bar features.
 * @author venkatesh
 *
 */
public class SearchBarView extends BaseIOSView{

	public SearchBarView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumIOSDriver), this);
	}
	
	/**
	 * iOS element for Search Bars View Title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Search Bars\"]")
	IOSElement searchBarViewTitle;
	
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
	 * iOS element for Custom cell.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Custom\"]")
	IOSElement customCell;

	/**
	 * @return boolean (true if Search Bar View title visible else false)
	 */
	public boolean isSearchBarViewTitleVisible(){
		return this.isUIElementVisible(this.searchBarViewTitle);
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
	
}
