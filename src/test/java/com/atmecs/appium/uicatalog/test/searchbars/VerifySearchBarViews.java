package com.atmecs.appium.uicatalog.test.searchbars;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.appium.uicatalog.test.BaseIOSTest;
import com.atmecs.appium.uicatalog.views.UICatalogView;
import com.atmecs.appium.uicatalog.views.searchbars.CustomSearchBarsView;
import com.atmecs.appium.uicatalog.views.searchbars.DefaultSearchBarView;
import com.atmecs.appium.uicatalog.views.searchbars.SearchBarView;

/**
 * @author venkatesh
 *
 */
public class VerifySearchBarViews extends BaseIOSTest{
	/**
	 * Before method to tap Segmented Control Views.
	 */
	@BeforeMethod
	public void beforeMethodTapSearchBarViews(){
		UICatalogView catalogView = new UICatalogView(this.appiumIOSDriver);
		catalogView.swipeDown();
		catalogView.tapSearchBarsView();
	}
	
	@Test
	public void verifySearchBarsUIElements(){
		SearchBarView searchBarView = new SearchBarView(appiumIOSDriver);
		Assert.assertTrue(searchBarView.isSearchBarViewTitleVisible(),"Search Bar title is not visible.");
		Assert.assertTrue(searchBarView.isUICatalogButtonVisible(),"UIcatalog button is not visible.");
		Assert.assertTrue(searchBarView.isDefaultCellVisible(),"Default cell is not visible.");
		Assert.assertTrue(searchBarView.isCustomCellVisible(),"Custom cell is not visible.");
		
		searchBarView.tapDefault();
		DefaultSearchBarView defaultSearchBarView = new DefaultSearchBarView(appiumIOSDriver);
		Assert.assertTrue(defaultSearchBarView.isDefaultSearchBarTitleVisible(),"Default Seach bar title is not visible.");
		Assert.assertTrue(defaultSearchBarView.isSearchBarButtonVisible()," Seach bar button is not visible.");
		Assert.assertTrue(defaultSearchBarView.isSearchBarVisible()," Seach bar is not visible.");
		Assert.assertFalse(defaultSearchBarView.isCancelButtonEnabled(),"Cancel button is enabled.");
		defaultSearchBarView.search("Default Search Bar");
		Assert.assertTrue(defaultSearchBarView.isCancelButtonEnabled(),"Cancel button is disabled.");
		Assert.assertTrue(defaultSearchBarView.isScopeOneButtonVisible(),"Scope one button is not visible");
		Assert.assertTrue(defaultSearchBarView.isSearchBarButtonVisible()," Seach bar button is not visible.");
		defaultSearchBarView.tapSearchBarsButton();
		Assert.assertTrue(searchBarView.isSearchBarViewTitleVisible(),"Search Bar title is not visible.");
		
		searchBarView.tapCustom();
		CustomSearchBarsView customSearchBarsView = new CustomSearchBarsView(appiumIOSDriver);
		Assert.assertTrue(customSearchBarsView.isCustomSearchBarTitleVisible(),"Custom Search Bar title is not visible.");
		Assert.assertTrue(customSearchBarsView.isSearchBarButtonVisible()," Seach bar button is not visible.");
		Assert.assertTrue(customSearchBarsView.isSearchBarVisible()," Seach bar is not visible.");
		Assert.assertTrue(customSearchBarsView.isBookmarksIconVisible()," Bookmarks button is not visible.");
		Assert.assertFalse(customSearchBarsView.isCancelButtonEnabled(),"Cancel button is enabled.");
		customSearchBarsView.search("Custom Search Bar");
		Assert.assertTrue(customSearchBarsView.isCancelButtonEnabled(),"Cancel button is disabled.");
		customSearchBarsView.tapSearchBarsButton();
		Assert.assertTrue(searchBarView.isSearchBarViewTitleVisible(),"Search Bar title is not visible.");
	}
	
	/**
	 * After method to Navigate to UI Catalog Page.
	 */
	@AfterMethod
	public void afterMethodNavigateToUICatalogPage(){
		SearchBarView searchBarView = new SearchBarView(appiumIOSDriver);
		searchBarView.tapUICatalogButton();
		searchBarView.swipeUp();
	}
}
