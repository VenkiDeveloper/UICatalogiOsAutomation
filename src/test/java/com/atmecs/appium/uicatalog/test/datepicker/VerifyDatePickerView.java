package com.atmecs.appium.uicatalog.test.datepicker;

import org.joda.time.DateTime;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.appium.uicatalog.test.BaseIOSTest;
import com.atmecs.appium.uicatalog.util.DateAndTimeUtil;
import com.atmecs.appium.uicatalog.views.UICatalogView;
import com.atmecs.appium.uicatalog.views.datepicker.DatePickerView;

/**
 * This test class contains date picker test cases.
 * @author venkatesh
 */
public class VerifyDatePickerView extends BaseIOSTest{
	@BeforeMethod
	public void beforeMethodTapDatePciker(){
		UICatalogView catalogView = new UICatalogView(this.appiumIOSDriver);
		catalogView.tapDatePicker();
	}
	
	@Test
	public void verifyDatePickerUIElements(){
		DatePickerView datePickerView = new DatePickerView(appiumIOSDriver);
		Assert.assertTrue(datePickerView.isDatePickerViewTitleVisible(),"Date Picker titile is not visible.");
		Assert.assertTrue(datePickerView.isUICatalogButtonVisible(),"UI Catalog Button is not visible.");
		Assert.assertTrue(datePickerView.isDateAndTimePickerVisible(),"Date and Time picker is not visible.");
		Assert.assertTrue(datePickerView.isMinutePickerVisible(),"Minute picker is not visible.");
		Assert.assertTrue(datePickerView.isHourPickerVisible(),"Hour picker is not visible.");
		Assert.assertTrue(datePickerView.isAmOrPmPickerVisible(),"Am or Pm picker is not visible.");
	}
	
	@Test
	public void verifyUserCanBeAbleToSetDatePickerValues(){
		DateAndTimeUtil dateAndTimeUtil = new DateAndTimeUtil();
		DatePickerView datePickerView = new DatePickerView(appiumIOSDriver);
		DateTime dateTime = dateAndTimeUtil.getNowDate().plusDays(2).plusHours(1).plusMinutes(15);
		datePickerView.selectDateAndTimePickerValue(dateTime);
		datePickerView.selectHourPickerValue(dateTime);
		datePickerView.selectMinutePickerValue(dateTime);
		datePickerView.selectAmOrPmPickerValue(dateTime);
		
		String dateAndTime = datePickerView.getDateAndTimePickerValue();
		String hour = datePickerView.getHourPickerValue();
		String minute = datePickerView.getMinutePickerValue();
		String amOrPM = datePickerView.getAmOrPmPickerValue();
		System.out.println("Selected Date value is: "+dateAndTime+", "+hour+", "+minute+", "+amOrPM);
		
		String value = DateAndTimeUtil.convertDateObjectToString(dateTime, "MMM d, yyyy, h:mm a");
		Assert.assertTrue(datePickerView.isSelectedDateVisible(value));
	}
	
	@AfterMethod
	public void afterMethodNavigateToActionSheets(){
		DatePickerView datePickerView = new DatePickerView(appiumIOSDriver);
		datePickerView.navigateToUICatalog();
	}
	
}
