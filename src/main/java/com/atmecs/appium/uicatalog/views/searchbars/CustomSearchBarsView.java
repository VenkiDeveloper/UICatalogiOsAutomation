package com.atmecs.appium.uicatalog.views.searchbars;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * This class contains Custom Search bars view features.
 * @author venkatesh
 *
 */
public class CustomSearchBarsView extends BaseIOSView{

	/**
	 * @param appiumDriver
	 */
	public CustomSearchBarsView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumIOSDriver), this);
	}
	
	/**
	 * iOS element for Search Bars View Title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Custom Search Bar\"]")
	IOSElement customSearchBarViewTitle;
	
	/**
	 * iOS element for Search Bars button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().buttons()[\"Search Bars\"]")
	IOSElement searchBarsButton;
	
	/**
	 * iOS element for Search textbox.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().searchBars()[0]")
	IOSElement searchBar;
	
	/**
	 * iOS element for Cancel button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().buttons()[\"Cancel\"]")
	IOSElement cancelButton;
	
	/**
	 * iOS element for Bookmarks button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().searchBars()[0].buttons()[\"Bookmarks\"]")
	IOSElement bookmarksButton;
	
	/**
	 * @return boolean (true if Custom Search bar title visible else false)
	 */
	public boolean isCustomSearchBarTitleVisible(){
		return isUIElementVisible(this.customSearchBarViewTitle);
	}
	
	/**
	 * @return boolean (true if Search bar button visible else false)
	 */
	public boolean isSearchBarButtonVisible(){
		return isUIElementVisible(this.searchBarsButton);
	}
	
	/**
	 * Method to tap on Search Bar button.
	 */
	public void tapSearchBarsButton(){
		this.searchBarsButton.click();
	}
	
	/**
	 * @return boolean (true if Search bar visible else false)
	 */
	public boolean isSearchBarVisible(){
		return isUIElementVisible(this.searchBar);
	}
	
	/**
	 * Method to search in search bar.
	 * @param searchValue
	 */
	public void search(String searchValue){
		clearAndTypeTextField(this.searchBar, searchValue);
	}

	/**
	 * @return boolean (true if Cancel button visible else false)
	 */
	public boolean isCancelButtonVisible(){
		return isUIElementVisible(this.cancelButton);
	}
	
	/**
	 * @return boolean (true if Cancel button enabled else false)
	 */
	public boolean isCancelButtonEnabled(){
		return this.cancelButton.isEnabled();
	}
	
	/**
	 * Method to tap on Cancel button.
	 */
	public void tapCancelButton(){
		this.cancelButton.click();
	}
	
	/**
	 * @return boolean (true if Bookmarks button visible else false)
	 */
	public boolean isBookmarksIconVisible(){
		return isUIElementVisible(this.bookmarksButton);
	}

}
