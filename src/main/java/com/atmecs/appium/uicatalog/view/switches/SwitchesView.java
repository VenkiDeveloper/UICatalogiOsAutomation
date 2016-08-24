package com.atmecs.appium.uicatalog.view.switches;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SwitchesView extends BaseIOSView{

	/**
	 * @param appiumDriver
	 */
	public SwitchesView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumIOSDriver), this);
	}
	
	/**
	 * iOS element for Switches View Title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Switches\"]")
	IOSElement switchesViewTitle;
	
	/**
	 * iOS element for UI Catalog button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().buttons()[\"UICatalog\"]")
	IOSElement uiCatalog;
	
	/**
	 * iOS element for default text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].groups()[\"DEFAULT\"]")
	IOSElement defaultText;
	
	/**
	 * iOS element for Tinted text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].groups()[\"TINTED\"]")
	IOSElement tintedText;
	
	/**
	 * iOS element for default switch.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[0].switches()[0]")
	IOSElement defaultSwitch;
	
	/**
	 * iOS element for Tinted switch.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[1].switches()[0]")
	IOSElement tintedSwitch;
	
	/**
	 * @return boolean (true if Switches View title visible else false)
	 */
	public boolean isSwitchesTitleVisible(){
		return this.isUIElementVisible(switchesViewTitle);
	}
	
	/**
	 * @return boolean (true if UICatalog button visible else false)
	 */
	public boolean isUICatalogButtonVisible(){
		return this.isUIElementVisible(uiCatalog);
	}
	
	/**
	 * Method to tap on UICatalog Button.
	 */
	public void tapUICatalogButton(){
		this.uiCatalog.click();
	}
	
	/**
	 * @return boolean (true if Default text visible else false)
	 */
	public boolean isDefaultTextVisible(){
		return isUIElementVisible(this.defaultText);
	}
	
	/**
	 * @return boolean (true if Tinted text visible else false)
	 */
	public boolean isTintedTextVisible(){
		return isUIElementVisible(this.tintedText);
	}
	
	/**
	 * @return boolean (true if Default Switch visible else false)
	 */
	public boolean isDefaultSwitchVisible(){
		return isUIElementVisible(this.defaultSwitch);
	}
	
	/**
	 * @return boolean (true if Tinted Switch visible else false)
	 */
	public boolean isTintedSwitchVisible(){
		return isUIElementVisible(this.tintedSwitch);
	}
	
	/**
	 * Method to set Default switch on/off.
	 */
	public void setDefaultSwitch(boolean isEnable){
		if(isEnable){
			if(!isDefaultSwitchOn())
				this.defaultSwitch.click();
		} else {
			if(isDefaultSwitchOn()){
				this.defaultSwitch.click();
			}
		}
	}
	
	/**
	 * Method to set tinted switch on/off.
	 */
	public void setTintedSwitch(boolean isEnable){
		if(isEnable){
			if(!isTintedSwitchOn())
				this.tintedSwitch.click();
		} else {
			if(isTintedSwitchOn()){
				this.tintedSwitch.click();
			}
		}
	}
	
	/**
	 * @return boolean (true if default switch on else false)
	 */
	public boolean isDefaultSwitchOn(){
		return this.defaultSwitch.isSelected();
	}
	
	/**
	 * @return boolean (true if tinted switch on else false)
	 */
	public boolean isTintedSwitchOn(){
		return this.tintedSwitch.isSelected();
	}
	
}
