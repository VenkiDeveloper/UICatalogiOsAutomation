package com.atmecs.appium.uicatalog.test.toolbars;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.appium.uicatalog.test.BaseIOSTest;
import com.atmecs.appium.uicatalog.views.UICatalogView;
import com.atmecs.appium.uicatalog.views.toolbars.CustomToolbarView;
import com.atmecs.appium.uicatalog.views.toolbars.DefaultToolbarView;
import com.atmecs.appium.uicatalog.views.toolbars.TintedToolbarView;
import com.atmecs.appium.uicatalog.views.toolbars.ToolbarsView;

/**
 * @author venkatesh
 */
public class VerifyToolbarsView extends BaseIOSTest{
	/**
	 * Before method to tap Search Bar Views.
	 */
	@BeforeMethod
	public void beforeMethodTapToolbarViews(){
		UICatalogView catalogView = new UICatalogView(this.appiumIOSDriver);
		catalogView.swipeDown();
		catalogView.tapToolbarsView();
	}
	
	@Test
	public void verifyToolbarUIElements(){
		ToolbarsView toolbarsView = new ToolbarsView(appiumIOSDriver);
		Assert.assertTrue(toolbarsView.isToolbarsViewTitleVisible(),"Toolbars title is not visible");
		Assert.assertTrue(toolbarsView.isUICatalogButtonVisible(),"UICatalog button is not visible");
		Assert.assertTrue(toolbarsView.isDefaultCellVisible(),"Default cell is not visible");
		Assert.assertTrue(toolbarsView.isTintedCellVisible(),"Tinted cell is not visible");
		Assert.assertTrue(toolbarsView.isCustomCellVisible(),"Custom cell is not visible");
		
		toolbarsView.tapDefault();
		DefaultToolbarView defaultToolbarView = new DefaultToolbarView(appiumIOSDriver);
		Assert.assertTrue(defaultToolbarView.isDefaultToolbarsViewTitleVisible(),"Default Toolbars title is not visible");
		Assert.assertTrue(defaultToolbarView.isToolbarsButtonVisible(),"Toolbars button is not visible");
		Assert.assertTrue(defaultToolbarView.isRemoveButtonVisible(),"Remove button is not visible");
		Assert.assertTrue(defaultToolbarView.isActionButtonVisible(),"Action button is not visible");
		defaultToolbarView.tapToolbarsButton();
		Assert.assertTrue(toolbarsView.isToolbarsViewTitleVisible(),"Toolbars title is not visible");
		
		toolbarsView.tapTinted();
		TintedToolbarView tintedToolbarView = new TintedToolbarView(appiumIOSDriver);
		Assert.assertTrue(tintedToolbarView.isTintedToolbarsViewTitleVisible(),"Tinted Toolbars title is not visible");
		Assert.assertTrue(tintedToolbarView.isToolbarsButtonVisible(),"Toolbars button is not visible");
		Assert.assertTrue(tintedToolbarView.isRefreshButtonVisible(),"Refresh button is not visible");
		Assert.assertTrue(tintedToolbarView.isShareButtonVisible(),"Share button is not visible");
		tintedToolbarView.tapToolbarsButton();
		Assert.assertTrue(toolbarsView.isToolbarsViewTitleVisible(),"Toolbars title is not visible");
		
		toolbarsView.tapCustom();
		CustomToolbarView customToolbarView = new CustomToolbarView(appiumIOSDriver);
		Assert.assertTrue(customToolbarView.isCustomToolbarsViewTitleVisible(),"Custom Toolbars title is not visible");
		Assert.assertTrue(customToolbarView.isToolbarsButtonVisible(),"Toolbars button is not visible");
		Assert.assertTrue(customToolbarView.isToolsIconVisible(),"Tools icon button is not visible");
		Assert.assertTrue(customToolbarView.isButtonVisible(),"Button is not visible");
		customToolbarView.tapToolbarsButton();
		Assert.assertTrue(toolbarsView.isToolbarsViewTitleVisible(),"Toolbars title is not visible");
	}
	
	/**
	 * After method to Navigate to UI Catalog Page.
	 */
	@AfterMethod
	public void afterMethodNavigateToUICatalogPage(){
		ToolbarsView toolbarsView = new ToolbarsView(appiumIOSDriver);
		toolbarsView.tapUICatalogButton();
		toolbarsView.swipeUp();
	}
}
