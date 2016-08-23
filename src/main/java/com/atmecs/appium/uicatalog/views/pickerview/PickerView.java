package com.atmecs.appium.uicatalog.views.pickerview;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * This class contains picker view features.
 * @author venkatesh
 *
 */
public class PickerView extends BaseIOSView{

	/**
	 * Constructor Initialization.
	 * @param appiumDriver
	 */
	public PickerView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}

	/**
	 * iOS element for Picker view title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Picker View\"]")
	IOSElement pickerViewTitle;
	
	/**
	 * iOS element for UICatalog button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().buttons()[\"UICatalog\"]")
	IOSElement uiCatalogButton;
	
	/**
	 * iOS element for Red color component picker wheel.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().pickers()[0].wheels()[\"Red color component value\"]")
	IOSElement redColorComponentPicker;
	
	/**
	 * iOS element for Green color component picker wheel.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().pickers()[0].wheels()[\"Green color component value\"]")
	IOSElement greenColorComponentPicker;
	
	/**
	 * iOS element for Blue color component picker wheel.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().pickers()[0].wheels()[\"Blue color component value\"]")
	IOSElement blueColorComponentPicker;
	
	/**
	 * @return boolean (true if Picker View title visible else false)
	 */
	public boolean isPickerViewTitleVisible(){
		return isUIElementVisible(this.pickerViewTitle);
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
	 * @return boolean (true if Red color component picker wheel visible else false)
	 */
	public boolean isRedColorComponentPickerVisible(){
		return isUIElementVisible(this.redColorComponentPicker);
	}
	
	/**
	 * @return boolean (true if Green color component picker wheel visible else false)
	 */
	public boolean isGreenColorComponentPickerVisible(){
		return isUIElementVisible(this.greenColorComponentPicker);
	}
	
	/**
	 * @return boolean (true if Blue color component picker wheel visible else false)
	 */
	public boolean isBlueColorComponentPickerVisible(){
		return isUIElementVisible(this.blueColorComponentPicker);
	}
	
	/**
	 * Method to set Red color component picker value.
	 * @param colorValue (0,5--..etc)
	 */
	public void setRedColorComponentPicker(int colorValue){
		this.redColorComponentPicker.sendKeys(String.valueOf(colorValue));
	}
	
	/**
	 * Method to set Green color component picker value.
	 * @param colorValue (0,5--..etc)
	 */
	public void setGreenColorComponentPicker(int colorValue){
		this.greenColorComponentPicker.sendKeys(String.valueOf(colorValue));
	}
	
	/**
	 * Method to set Blue color component picker value.
	 * @param colorValue (0,5--..etc)
	 */
	public void setBlueColorComponentPicker(int colorValue){
		this.blueColorComponentPicker.sendKeys(String.valueOf(colorValue));
	}
	
	/**
	 * Method to get Red color component picker value.
	 * @return String (picker value)
	 */
	public String getRedColorComponentPickerValue(){
		return this.redColorComponentPicker.getAttribute("value");
	}
	
	/**
	 * Method to Green color component picker value.
	 * @return String (picker value)
	 */
	public String getGreenColorComponentPickerValue(){
		return this.greenColorComponentPicker.getAttribute("value");
	}
	
	/**
	 * Method to Blue color component picker value.
	 * @return String (picker value)
	 */
	public String getBlueColorComponentPickerValue(){
		return this.blueColorComponentPicker.getAttribute("value");
	}
	
}
