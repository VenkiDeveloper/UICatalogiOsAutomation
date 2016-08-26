package com.atmecs.appium.uicatalog.test.segmentedcontrols;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.appium.uicatalog.test.BaseIOSTest;
import com.atmecs.appium.uicatalog.views.UICatalogView;
import com.atmecs.appium.uicatalog.views.segmentcontrols.SegmentControlsViews;

/**
 * @author venkatesh
 */
public class VerifySegmentedControls extends BaseIOSTest {

	/**
	 * Before method to tap Segmented Control Views.
	 */
	@BeforeMethod
	public void beforeMethodTapSegmentedControlViews(){
		UICatalogView catalogView = new UICatalogView(this.appiumIOSDriver);
		catalogView.swipeDown();
		catalogView.tapSegmentedControlsViews();
	}
	
	@Test
	public void verifySegmentedControlViewElements(){
		SegmentControlsViews segmentControlsViews = new SegmentControlsViews(appiumIOSDriver);
		Assert.assertTrue(segmentControlsViews.isSegmentedControlsTitleVisible(), "Segmented Control Title is not visible.");
		Assert.assertTrue(segmentControlsViews.isUICatalogButtonVisible(), "UI catalog back button is not visible.");
		Assert.assertTrue(segmentControlsViews.isDefaultTextVisible(), "'Default' text is not visible on Segmented Control.");
		Assert.assertTrue(segmentControlsViews.isDefaultCheckControlVisible(), "Default 'Check' control button is not visible.");
		Assert.assertTrue(segmentControlsViews.isDefaultSearchControlVisible(), "Default 'Search' control button is not visible.");
		Assert.assertTrue(segmentControlsViews.isDefaultToolsControlVisible(), "Default 'Tools' control button is not visible.");
		Assert.assertTrue(segmentControlsViews.isTintedCheckControlVisible(), "Tinted 'Check' control button is not visible.");
		Assert.assertTrue(segmentControlsViews.isTintedSearchControlVisible(), "Tinted 'Search' control button is not visible.");
		Assert.assertTrue(segmentControlsViews.isTintedToolsControlVisible(), "Tinted 'Tools' control button is not visible.");
		Assert.assertTrue(segmentControlsViews.isCustomSegmentedDoneControlVisible(), "Custom Segmented 'Done' control button is not visible.");
		Assert.assertTrue(segmentControlsViews.isCustomSegmentedSearchControlVisible(), "Custom Segmented 'Search' control button is not visible.");
		Assert.assertTrue(segmentControlsViews.isCustomSegmentedSettingsControlVisible(), "Custom Segmented 'Settings' control button is not visible.");
		segmentControlsViews.swipeDownSegmentedControls();
		Assert.assertTrue(segmentControlsViews.isCustomBGCheckControlVisible(), "CustomBG 'Check' control button is not visible.");
		Assert.assertTrue(segmentControlsViews.isCustomBGSearchControlVisible(), "CustomBG 'Search' control button is not visible.");
		Assert.assertTrue(segmentControlsViews.isCustomBGToolsControlVisible(), "CustomBG 'Tools' control button is not visible.");
		segmentControlsViews.swipeUpSegmentedControls();
	}
	
	/**
	 * After method to Navigate to UI Catalog Page.
	 */
	@AfterMethod
	public void afterMethodNavigateToUICatalogPage(){
		SegmentControlsViews segmentControlsVIews = new SegmentControlsViews(appiumIOSDriver);
		segmentControlsVIews.tapUICatalogButton();
	}
}
