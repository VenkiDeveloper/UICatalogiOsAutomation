package com.atmecs.appium.uicatalog.test.activityindicator;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.appium.uicatalog.test.BaseIOSTest;
import com.atmecs.appium.uicatalog.views.UICatalogView;
import com.atmecs.appium.uicatalog.views.actionsheets.ActionSheetsView;
import com.atmecs.appium.uicatalog.views.activityindicator.ActivityIndicatorView;

public class VerifyActivityIndicators extends BaseIOSTest{

	@BeforeMethod
	public void beforeMethodTapActionSheets(){
		UICatalogView catalogView = new UICatalogView(this.appiumIOSDriver);
		catalogView.tapActivityIndicator();
	}
	
	@Test
	public void verifyActivityIndicatorUIElements(){
		ActivityIndicatorView activityIndicatorView = new ActivityIndicatorView(appiumIOSDriver);
		Assert.assertTrue(activityIndicatorView.isActivityIndicatorTitleVisible(),"Activity Indicator title is not visible.");
		Assert.assertTrue(activityIndicatorView.isUICatalogButtonVisible(),"UI Catalog button is not visible.");
		Assert.assertTrue(activityIndicatorView.isGrayTextVisible(),"Gray text is not visible.");
		Assert.assertTrue(activityIndicatorView.isTintedText(),"Tented text is not visible.");
		Assert.assertTrue(activityIndicatorView.isGrayActivityIndicatorVisible(),"Gray activity Indicator is not visible.");
		Assert.assertTrue(activityIndicatorView.isTintedActivityIndicatorVisible(),"Tinted activity Indicator is not visible.");
	}
	
	@AfterMethod
	public void afterMethodNavigateToActionSheets(){
		ActionSheetsView actionSheetsView = new ActionSheetsView(appiumIOSDriver);
		actionSheetsView.navigateToUICatalogPage();
	}
}
