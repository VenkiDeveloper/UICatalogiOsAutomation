package com.atmecs.appium.uicatalog.views.searchbars;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * This class contains Default Search bar features.
 * @author venkatesh
 *
 */
public class DefaultSearchBarView extends BaseIOSView{

	/**
	 * @param appiumDriver
	 */
	public DefaultSearchBarView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumIOSDriver), this);
	}
	
	/**
	 * iOS element for Search Bars View Title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Default Search Bar\"]")
	IOSElement defaultSearchBarViewTitle;
	
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
	 * iOS element for Scope One button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().segmentedControls()[\"scopeBar\"].buttons()[\"Scope One\"]")
	IOSElement scopeOneButton;
	
	/**
	 * iOS element for Scope Two button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().segmentedControls()[\"scopeBar\"].buttons()[\"Scope Two\"]")
	IOSElement scopeTwoButton;
	
	
	/**
	 * @return boolean (true if Default Search bar title visible else false)
	 */
	public boolean isDefaultSearchBarTitleVisible(){
		return isUIElementVisible(this.defaultSearchBarViewTitle);
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
	 * @return boolean (true if Scope One button visible else false)
	 */
	public boolean isScopeOneButtonVisible(){
		return isUIElementVisible(this.scopeOneButton);
	}
	
	/**
	 * @return boolean (true if Scope Two button visible else false)
	 */
	public boolean isScopeTwoButtonVisible(){
		return isUIElementVisible(this.scopeTwoButton);
	}
	
	/**
	 * Method to tap on Search One Button.
	 */
	public void tapScopeOneButton(){
		this.scopeOneButton.click();
	}
	
	/**
	 * Method to tap on Search Two Button.
	 */
	public void tapScopeTwoButton(){
		this.scopeTwoButton.click();
	}
	
	
}
