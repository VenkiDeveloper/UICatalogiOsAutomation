package com.atmecs.appium.uicatalog.test.progressviews;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.appium.uicatalog.test.BaseIOSTest;
import com.atmecs.appium.uicatalog.views.UICatalogView;
import com.atmecs.appium.uicatalog.views.progressviews.ProgressViews;

/**
 * @author venkatesh
 */
public class VerifyProgressViews extends BaseIOSTest{
	/**
	 * Before method to tap Picker Views.
	 */
	@BeforeMethod
	public void beforeMethodTapProgressViews(){
		UICatalogView catalogView = new UICatalogView(this.appiumIOSDriver);
		catalogView.tapProgressViews();
	}
	
	@Test
	public void verifyPickerViewUIElements(){
		ProgressViews progressViews = new ProgressViews(appiumIOSDriver);
		Assert.assertTrue(progressViews.isProgressViewsTitleVisible(), "Progress views title is not visible.");
		Assert.assertTrue(progressViews.isUICatalogButtonVisible(), "UI catalog button is not visible.");
		Assert.assertTrue(progressViews.isDefaultTextVisible(), "Default text is not visible.");
		Assert.assertTrue(progressViews.isDefaultPageIndicatorsVisible(), "Dßefault Progress indicator is not visible.");
		Assert.assertTrue(progressViews.isBarTextVisible(), "Bar text is not visible.");
		Assert.assertTrue(progressViews.isBarPageIndicatorsVisible(), "bar progress indicator is not visible.");
		Assert.assertTrue(progressViews.isTintedTextVisible(), "Tinted text is not visible.");
		Assert.assertTrue(progressViews.isBarPageIndicatorsVisible(), "Tinted progress indicator is not visible.");
	}
	
	/**
	 * After method to Navigate to UI Catalog Page.
	 */
	@AfterMethod
	public void afterMethodNavigateToUICatalogPage(){
		ProgressViews progressViews = new ProgressViews(appiumIOSDriver);
		progressViews.navigateToUICatalogPage();
	}
	
}
