package com.atmecs.appium.uicatalog.views.datepicker;

import org.joda.time.DateTime;
import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.util.DateAndTimeUtil;
import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * This class contains Date picker view features.
 * @author venkatesh
 *
 */
public class DatePickerView extends BaseIOSView{

	/**
	 * Constructor initialization.
	 * @param appiumDriver
	 */
	public DatePickerView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	/**
	 * iOS element for date picker title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Date Picker\"]")
	IOSElement datePickerTitle;

	/**
	 * iOS element for UICatalog button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().buttons()[\"UICatalog\"]")
	IOSElement uiCatalogButton;
	
	/**
	 * iOS element for date and time picker wheel.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().pickers()[0].wheels()[0]")
	IOSElement dateAndTimePickerWheel;
	
	/**
	 * iOS element for hour picker wheel.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().pickers()[0].wheels()[1]")
	IOSElement hourPickerWheel;
	
	/**
	 * iOS element for minutes picker wheel.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().pickers()[0].wheels()[2]")
	IOSElement minutesPickerWheel;
	
	/**
	 * iOS element for AM or PM picker wheel.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().pickers()[0].wheels()[3]")
	IOSElement amOrPmPickerWheel;
	
	/**
	 * @return boolean (true if Date Picker view title visible else false)
	 */
	public boolean isDatePickerViewTitleVisible(){
		return isUIElementVisible(this.datePickerTitle);
	}
	
	/**
	 * @return boolean (true if UI catalog button visible else false)
	 */
	public boolean isUICatalogButtonVisible(){
		return isUIElementVisible(this.uiCatalogButton);
	}
	
	/**
	 * Method to navigate to UI catalog.
	 */
	public void navigateToUICatalog(){
		this.uiCatalogButton.click();
	}
	
	/**
	 * @return boolean (true if Date and Time picker wheel visible else false)
	 */
	public boolean isDateAndTimePickerVisible(){
		return isUIElementVisible(this.dateAndTimePickerWheel);
	}
	
	/**
	 * @return boolean (true if Hour picker wheel visible else false)
	 */
	public boolean isHourPickerVisible(){
		return isUIElementVisible(this.hourPickerWheel);
	}
	
	/**
	 * @return boolean (true if Minute picker wheel visible else false)
	 */
	public boolean isMinutePickerVisible(){
		return isUIElementVisible(this.minutesPickerWheel);
	}
	
	/**
	 * @return boolean (true if AM or PM picker wheel visible else false)
	 */
	public boolean isAmOrPmPickerVisible(){
		return isUIElementVisible(this.amOrPmPickerWheel);
	}
	
	/**
	 * Method to select value for Date and Time picker value.
	 * @param dateTime (ddd mmm d)
	 */
	public void selectDateAndTimePickerValue(DateTime dateTime){
		this.dateAndTimePickerWheel.sendKeys(DateAndTimeUtil.convertDateObjectToString(dateTime, "EEE MMM d"));
	}
	
	/**
	 * Method to select value for Hour picker value.
	 * @param dateTime (h)
	 */
	public void selectHourPickerValue(DateTime dateTime){
		this.hourPickerWheel.sendKeys(DateAndTimeUtil.convertDateObjectToString(dateTime, "h"));
	}
	
	/**
	 * Method to select value for Minute picker value.
	 * @param dateTime (mm)
	 */
	public void selectMinutePickerValue(DateTime dateTime){
		this.minutesPickerWheel.sendKeys(DateAndTimeUtil.convertDateObjectToString(dateTime, "mm"));
	}
	
	/**
	 * Method to select value for Am or Pm picker value.
	 * @param dateTime (a)
	 */
	public void selectAmOrPmPickerValue(DateTime dateTime){
		this.amOrPmPickerWheel.sendKeys(DateAndTimeUtil.convertDateObjectToString(dateTime, "a"));
	}
	
	/**
	 * Method to verify Selected date visible or not.
	 * @param selectedDate
	 * @return
	 */
	public boolean isSelectedDateVisible(String selectedDate){
		String xpath = "target.frontMostApp().mainWindow().staticTexts()[\""+selectedDate+"\"]";
		IOSElement iosElement = appiumIOSDriver.findElement(MobileBy.IosUIAutomation(xpath));
		return isUIElementVisible(iosElement);
	}
	
	/**
	 * Method to get the Date and Time picker value.
	 * @return String (date and time picker value)
	 */
	public String getDateAndTimePickerValue(){
		return this.dateAndTimePickerWheel.getAttribute("value");
	}
	
	/**
	 * Method to get the Hour picker value.
	 * @return String (hour picker value)
	 */
	public String getHourPickerValue(){
		return this.hourPickerWheel.getAttribute("value");
	}
	
	/**
	 * Method to get the Minute picker value.
	 * @return String (minute picker value)
	 */
	public String getMinutePickerValue(){
		return this.minutesPickerWheel.getAttribute("value");
	}
	
	/**
	 * Method to get the Am or Pm picker value.
	 * @return String (minute picker value)
	 */
	public String getAmOrPmPickerValue(){
		return this.amOrPmPickerWheel.getAttribute("value");
	}
	
}
