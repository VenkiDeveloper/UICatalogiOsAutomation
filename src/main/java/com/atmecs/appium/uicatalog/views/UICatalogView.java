package com.atmecs.appium.uicatalog.views;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class UICatalogView extends BaseIOSView{

	public UICatalogView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(this.appiumIOSDriver), this);
	}
	
	/**
	 * iOS element for action sheets.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Action Sheets\"]")
	IOSElement actionSheets;
	
	/**
	 * iOS element for activity indicators.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Activity Indicators\"]")
	IOSElement activityIndicator;
	
	/**
	 * iOS element for Alert Views.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Alert Views\"]")
	IOSElement alertViews;
	
	/**
	 * iOS element for Buttons.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Buttons\"]")
	IOSElement buttons;
	
	/**
	 * iOS element for Date Picker.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Date Picker\"]")
	IOSElement datePicker;
			
	/**
	 * iOS element for Image view.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Image View\"]")
	IOSElement imageView;
	
			
	/**
	 * Method to click on action sheets
	 */
	public void tapActionSheets(){
		this.actionSheets.click();
	}
	
	/**
	 * @return boolean (true if action sheets visible else false)
	 */
	public boolean isActionSheetsVisible(){
		return isUIElementVisible(this.actionSheets);
	}
	
	/**
	 * Method to tap on Activity Indicator.
	 */
	public void tapActivityIndicator(){
		this.activityIndicator.click();
	}
	
	/**
	 * @return boolean (true if activity indicator visible else false)
	 */
	public boolean isActivityIndicatorVisible(){
		return isUIElementVisible(this.activityIndicator);
	}
	
	/**
	 * @return boolean (true if Alert Views visible else false)
	 */
	public boolean isAlertViewsVisible(){
		return isUIElementVisible(this.activityIndicator);
	}
	
	/**
	 * Method to tap Alert Views.
	 */
	public void tapAlertViews(){
		this.alertViews.click();
	}
	
	/**
	 * @return boolean (true if buttons visible else false)
	 */
	public boolean isButtonsVisible(){
		return isUIElementVisible(this.buttons);
	}
	
	/**
	 * Method to tap Buttons.
	 */
	public void tapButtons(){
		this.buttons.click();
	}
	
	/**
	 * @return boolean (true if Date Picker visible else false)
	 */
	public boolean isDatePickerVisible(){
		return isUIElementVisible(this.datePicker);
	}
	
	/**
	 * Method to tap Date Picker.
	 */
	public void tapDatePicker(){
		this.datePicker.click();
	}
	
	/**
	 * @return boolean (true if Image View visible else false)
	 */
	public boolean isImageViewVisible(){
		return isUIElementVisible(this.imageView);
	}
	
	/**
	 * Method to tap Image View.
	 */
	public void tapImageView(){
		this.imageView.click();
	}
}
