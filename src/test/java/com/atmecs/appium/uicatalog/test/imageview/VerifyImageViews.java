package com.atmecs.appium.uicatalog.test.imageview;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.appium.uicatalog.test.BaseIOSTest;
import com.atmecs.appium.uicatalog.views.UICatalogView;
import com.atmecs.appium.uicatalog.views.imageview.ImageView;

/**
 * @author venkatesh
 *
 */
public class VerifyImageViews extends BaseIOSTest{

	@BeforeMethod
	public void beforeMethodTapImageView(){
		UICatalogView catalogView = new UICatalogView(this.appiumIOSDriver);
		catalogView.tapImageView();
	}
	
	@Test
	public void verifyImageViewUIElements(){
		ImageView imageView = new ImageView(appiumIOSDriver);
		Assert.assertTrue(imageView.isImageViewTitleVisible(),"Image View titile is not visible.");
		Assert.assertTrue(imageView.isUICatalogButtonVisible(),"UI Catalog Button is not visible.");
		Assert.assertTrue(imageView.isAnimationImageVisible(),"Animation image is not visible.");
	}
	
	@AfterMethod
	public void afterMethodNavigateToActionSheets(){
		ImageView imageView = new ImageView(appiumIOSDriver);
		imageView.navigateToUICatalog();
	}
}
