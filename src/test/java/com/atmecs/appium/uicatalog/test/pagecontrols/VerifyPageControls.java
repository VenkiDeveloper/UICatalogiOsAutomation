package com.atmecs.appium.uicatalog.test.pagecontrols;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.appium.uicatalog.test.BaseIOSTest;
import com.atmecs.appium.uicatalog.views.UICatalogView;
import com.atmecs.appium.uicatalog.views.pagecontrol.PageControlView;

/**
 * @author venkatesh
 */
public class VerifyPageControls extends BaseIOSTest{

	/**
	 * Before method to tap Page controls.
	 */
	@BeforeMethod
	public void beforeMethodTapPageControls(){
		UICatalogView catalogView = new UICatalogView(this.appiumIOSDriver);
		catalogView.tapPageControl();
	}
	
	@Test
	public void verifyPageControlUIElements(){
		PageControlView pageControlView = new PageControlView(appiumIOSDriver);
		Assert.assertTrue(pageControlView.isPageControlTitleVisible(),"Page Control title is not visible.");
		Assert.assertTrue(pageControlView.isUICatalogButtonVisible(),"UI Catalog button is not visible.");
		Assert.assertTrue(pageControlView.isPageIndicatorsVisible(),"Page indicators are not visible.");
		for(int i=0;i<10;i++){
			pageControlView.selectPage(i);
		}
	}
	
	/**
	 * After method to Navigate to UI Catalog Page.
	 */
	@AfterMethod
	public void afterMethodNavigateToUICatalogPage(){
		PageControlView pageControlView = new PageControlView(appiumIOSDriver);
		pageControlView.navigateToUICatalog();
	}
}
