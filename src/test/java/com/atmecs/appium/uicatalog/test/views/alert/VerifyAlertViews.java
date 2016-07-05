package com.atmecs.appium.uicatalog.test.views.alert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.appium.uicatalog.test.BaseIOSTest;
import com.atmecs.appium.uicatalog.views.UICatalogView;
import com.atmecs.appium.uicatalog.views.actionsheets.ActionSheetsView;
import com.atmecs.appium.uicatalog.views.alert.AlertViews;
import com.atmecs.appium.uicatalog.views.alert.OkayOrCancelAlertView;
import com.atmecs.appium.uicatalog.views.alert.OtherAlertView;
import com.atmecs.appium.uicatalog.views.alert.SecureTextEntryAlertView;
import com.atmecs.appium.uicatalog.views.alert.SimpleAlertView;
import com.atmecs.appium.uicatalog.views.alert.TextEntryAlertView;

/**
 * 
 * @author venkatesh
 *
 */
public class VerifyAlertViews extends BaseIOSTest{
	
	/**
	 * Before method to tap Alert Views.
	 */
	@BeforeMethod
	public void beforeMethodTapAlertViews(){
		UICatalogView catalogView = new UICatalogView(this.appiumIOSDriver);
		catalogView.tapAlertViews();
	}
	
	@Test
	public void verifyAlertViewsUIElements(){
		AlertViews alertViews = new AlertViews(appiumIOSDriver);
		Assert.assertTrue(alertViews.isAlertViewsTitleVisible(),"Alert Views title is not visible.");
		Assert.assertTrue(alertViews.isUICatalogButtonVisible(),"UI Catalog button is not visible.");
		Assert.assertTrue(alertViews.isSimpleAlertButtonVisible(),"Simple Alert button is not visible on Alert Views.");
		Assert.assertTrue(alertViews.isOKayOrCancelAlertButtonVisible(),"Okay / Cancel Alert button is not visible on Alert Views.");
		Assert.assertTrue(alertViews.isOtherAlertButtonVisible(),"Other Alert button is not visible on Alert Views.");
		Assert.assertTrue(alertViews.isTextEntryAlertButtonVisible(),"Text Entry button is not visible on Alert Views.");
		Assert.assertTrue(alertViews.isSecureTextEntryAlertButtonVisible(),"Text Entry button is not visible on Alert Views.");
	}
	
	@Test
	public void verifySimpleAlertUIElements(){
		AlertViews alertViews = new AlertViews(appiumIOSDriver);
		alertViews.tapSimpleAlertButton();
		SimpleAlertView simpleAlertView = new SimpleAlertView(appiumIOSDriver);
		Assert.assertTrue(simpleAlertView.isSimpleAlertTitleVisible(),"Simple Alert title is not visible.");
		Assert.assertTrue(simpleAlertView.isSimpleAlertBodyTextVisible(),"Simple Alert body text is not visible.");
		Assert.assertTrue(simpleAlertView.isSimpleAlertOKButtonVisible(),"Simple Alert OK button  is not visible.");
		simpleAlertView.tapSimpleAlertOKButton();
		Assert.assertTrue(alertViews.isSimpleAlertButtonVisible(),"Simple Alert button is not visible on Alert Views.");
	}
	
	@Test
	public void verifyOkayOrCancelAlertUIElements(){
		AlertViews alertViews = new AlertViews(appiumIOSDriver);
		alertViews.tapOkayOrCancelAlertButton();
		OkayOrCancelAlertView okayOrCancelAlertView = new OkayOrCancelAlertView(appiumIOSDriver);
		Assert.assertTrue(okayOrCancelAlertView.isOkayOrCancelAlertTitleVisible(),"Okay/Cancel Alert title is not visible.");
		Assert.assertTrue(okayOrCancelAlertView.isOkayOrCancelAlertBodyTextVisible(),"Okay/Cancel Alert body text is not visible.");
		Assert.assertTrue(okayOrCancelAlertView.isOkayOrCancelAlertOKButtonVisible(),"Okay/Cancel Alert OK button  is not visible.");
		Assert.assertTrue(okayOrCancelAlertView.isOkayOrCancelAlertCancelButtonVisible(),"Okay/Cancel Alert Cancel button  is not visible.");
		Reporter.log("Tap on 'OK' button");
		okayOrCancelAlertView.tapOkayOrCancelAlertOKButton();
		Assert.assertTrue(alertViews.isOKayOrCancelAlertButtonVisible(),"Okay/Cancel Alert button is not visible on Alert Views.");
	}
	
	@Test
	public void verifyOtherAlertUIElements(){
		AlertViews alertViews = new AlertViews(appiumIOSDriver);
		alertViews.tapOtherAlertButton();
		OtherAlertView otherAlertView = new OtherAlertView(appiumIOSDriver);
		Assert.assertTrue(otherAlertView.isOtherAlertTitleVisible(),"Other Alert title is not visible.");
		Assert.assertTrue(otherAlertView.isOtherAlertBodyTextVisible(),"Other Alert body text is not visible.");
		Assert.assertTrue(otherAlertView.isOtherAlertChoiceOneButtonVisible(),"Other Alert Choice One button is not visible.");
		Assert.assertTrue(otherAlertView.isOtherAlertChoiceTwoButtonVisible(),"Other Alert Choice Two button is not visible.");
		Assert.assertTrue(otherAlertView.isOtherAlertCancelButtonVisible(),"Other Alert Cancel button is not visible.");
		Reporter.log("Tap on 'Cancel' button");
		otherAlertView.tapOtherAlertCancelButton();
		Assert.assertTrue(alertViews.isOtherAlertButtonVisible(),"Other Alert button is not visible on Alert Views.");
	}
	
	@Test
	public void verifyTextEntryAlertUIElements(){
		AlertViews alertViews = new AlertViews(appiumIOSDriver);
		alertViews.tapTextEntryAlertButton();
		TextEntryAlertView textEntryAlertView = new TextEntryAlertView(appiumIOSDriver);
		Assert.assertTrue(textEntryAlertView.isTextEntryAlertTitleVisible(),"Text Entry Alert title is not visible.");
		Assert.assertTrue(textEntryAlertView.isTextEntryAlertBodyTextVisible(),"Text Entry Alert body text is not visible.");
		Assert.assertTrue(textEntryAlertView.isTextEntryAlertOKButtonVisible(),"Text Entry Alert OK button is not visible.");
		Assert.assertTrue(textEntryAlertView.isTextEntryAlertCancelButtonVisible(),"Text Entry Alert Cancel button is not visible.");
		Assert.assertTrue(textEntryAlertView.isTextEntryTextFieldVisible(),"TextField is not visible.");
		
		Reporter.log("Set textfield");
		textEntryAlertView.setTextEntryAlertTextField("Venkatesh iOS");
		
		Reporter.log("Tap on 'OK' button");
		textEntryAlertView.tapTextEntryAlertOKButton();
		
		Assert.assertTrue(alertViews.isTextEntryAlertButtonVisible(),"Text Entry Alert button is not visible on Alert Views.");
	}
	
	@Test
	public void verifySecureTextEntryAlertUIElements(){
		AlertViews alertViews = new AlertViews(appiumIOSDriver);
		alertViews.tapSecureTextEntryAlertButton();
		SecureTextEntryAlertView textEntryAlertView = new SecureTextEntryAlertView(appiumIOSDriver);
		Assert.assertTrue(textEntryAlertView.isSecureTextEntryAlertTitleVisible(),"Secure Text Entry Alert title is not visible.");
		Assert.assertTrue(textEntryAlertView.isSecureTextEntryAlertBodyTextVisible(),"Secure Text Entry Alert body text is not visible.");
		Assert.assertTrue(textEntryAlertView.isSecureTextEntryAlertOKButtonVisible(),"Secure Text Entry Alert OK button is not visible.");
		Assert.assertTrue(textEntryAlertView.isSecureTextEntryAlertCancelButtonVisible(),"Secure Text Entry Alert Cancel button is not visible.");
		Assert.assertTrue(textEntryAlertView.isSecureTextEntryTextFieldVisible(),"TextField is not visible.");
		Assert.assertFalse(textEntryAlertView.isSecureTextEntryOKButtonEnabled(),"OK Button is visible.");
		
		Reporter.log("Set textfield");
		textEntryAlertView.setSecureTextEntryAlertTextField("Venki");
		
		Reporter.log("Verify 'OK' button is enabled on Secure text entry Alert.");
		Assert.assertTrue(textEntryAlertView.isSecureTextEntryOKButtonEnabled(),"OK Button is visible.");
		
		Reporter.log("Tap on 'OK' button");
		textEntryAlertView.tapSecureTextEntryAlertOKButton();
		
		Assert.assertTrue(alertViews.isSecureTextEntryAlertButtonVisible(),"Secure Text Entry Alert button is not visible on Alert Views.");
	}
	
	/**
	 * After method to Navigate to UI Catalog Page.
	 */
	@AfterMethod
	public void afterMethodNavigateToUICatalogPage(){
		ActionSheetsView actionSheetsView = new ActionSheetsView(appiumIOSDriver);
		actionSheetsView.navigateToUICatalogPage();
	}
}
