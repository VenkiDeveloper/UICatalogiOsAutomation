package com.atmecs.appium.uicatalog.test.pickerviews;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.appium.uicatalog.test.BaseIOSTest;
import com.atmecs.appium.uicatalog.views.UICatalogView;
import com.atmecs.appium.uicatalog.views.pickerview.PickerView;

public class VerifyPickerViews extends BaseIOSTest{

	/**
	 * Before method to tap Picker Views.
	 */
	@BeforeMethod
	public void beforeMethodTapPickerViews(){
		UICatalogView catalogView = new UICatalogView(this.appiumIOSDriver);
		catalogView.tapPickerView();
	}
	
	@Test
	public void verifyPickerViewUIElements(){
		PickerView pickerView = new PickerView(appiumIOSDriver);
		Assert.assertTrue(pickerView.isPickerViewTitleVisible(), "Picker view title is not visible.");
		Assert.assertTrue(pickerView.isUICatalogButtonVisible(), "UI catalog button is not visible.");
		Assert.assertTrue(pickerView.isRedColorComponentPickerVisible(), "Red Color component picker is not visible.");
		Assert.assertTrue(pickerView.isGreenColorComponentPickerVisible(), "Green Color component picker is not visible.");
		Assert.assertTrue(pickerView.isBlueColorComponentPickerVisible(), "Blue Color component picker is not visible.");
	}
	
	@Test
	public void verifySelectedPickerValues(){
		PickerView pickerView = new PickerView(appiumIOSDriver);
		pickerView.setRedColorComponentPicker(5);
		pickerView.setGreenColorComponentPicker(10);
		pickerView.setBlueColorComponentPicker(15);
		
		Assert.assertTrue(pickerView.getRedColorComponentPickerValue().equals("5"), "Red color component Picker value does not matched with expected");
		Assert.assertTrue(pickerView.getGreenColorComponentPickerValue().equals("10"), "Green color component Picker value does not matched with expected");
		Assert.assertTrue(pickerView.getBlueColorComponentPickerValue().equals("15"), "Blue color component Picker value does not matched with expected");
	}
	
	/**
	 * After method to Navigate to UI Catalog Page.
	 */
	@AfterMethod
	public void afterMethodNavigateToUICatalogPage(){
		PickerView pickerView = new PickerView(appiumIOSDriver);
		pickerView.navigateToUICatalog();
	}
}
