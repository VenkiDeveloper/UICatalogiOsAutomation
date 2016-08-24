package com.atmecs.appium.uicatalog.views.steppers;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.enums.StepperEnum;
import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * This class contains Stepper view features.
 * @author venkatesh
 *
 */
public class SteppersView extends BaseIOSView{

	/**
	 * @param appiumDriver
	 */
	public SteppersView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumIOSDriver), this);
	}
	
	/**
	 * iOS element for Steppers View Title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Steppers\"]")
	IOSElement steppersTitle;
	
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
	 * iOS element for Custom text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].groups()[\"CUSTOM\"]")
	IOSElement customText;
	
	/**
	 * iOS element for default Decrement Stepper.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[0].buttons()[\"Decrement\"]")
	IOSElement defaultDecrementStepper;
	
	/**
	 * iOS element for default Increment Stepper.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[0].buttons()[\"Increment\"]")
	IOSElement defaultIncrementStepper;
	
	/**
	 * iOS element for Tinted Decrement Stepper.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[1].buttons()[\"Decrement\"]")
	IOSElement tintedDecrementStepper;
	
	/**
	 * iOS element for Tinted Increment Stepper.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[1].buttons()[\"Increment\"]")
	IOSElement tintedIncrementStepper;
	
	/**
	 * iOS element for Custom Decrement Stepper.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[2].buttons()[\"Decrement\"]")
	IOSElement customDecrementStepper;
	
	/**
	 * iOS element for Custom Increment Stepper.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[2].buttons()[\"Increment\"]")
	IOSElement customIncrementStepper;
	
	/**
	 * @return boolean (true if Stepper title visible else false)
	 */
	public boolean isStepperTitleVisible(){
		return this.isUIElementVisible(steppersTitle);
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
	 * @return boolean (true if Custom text visible else false)
	 */
	public boolean isCustomTextVisible(){
		return isUIElementVisible(this.customText);
	}
	
	/**
	 * @return boolean (true if Default Decrement Stepper visible else false)
	 */
	public boolean isDefaultDecrementStepperVisible(){
		return isUIElementVisible(this.defaultDecrementStepper);
	}
	
	/**
	 * @return boolean (true if Default Increment Stepper visible else false)
	 */
	public boolean isDefaultIncrementStepperVisible(){
		return isUIElementVisible(this.defaultIncrementStepper);
	}
	
	/**
	 * @return boolean (true if Tinted Decrement Stepper visible else false)
	 */
	public boolean isTintedDecrementStepperVisible(){
		return isUIElementVisible(this.tintedDecrementStepper);
	}
	
	/**
	 * @return boolean (true if Tinted Increment Stepper visible else false)
	 */
	public boolean isTintedIncrementStepperVisible(){
		return isUIElementVisible(this.tintedIncrementStepper);
	}
	
	/**
	 * @return boolean (true if Custom Decrement Stepper visible else false)
	 */
	public boolean isCustomDecrementStepperVisible(){
		return isUIElementVisible(this.customDecrementStepper);
	}
	
	/**
	 * @return boolean (true if Custom Increment Stepper visible else false)
	 */
	public boolean isCustomIncrementStepperVisible(){
		return isUIElementVisible(this.customIncrementStepper);
	}
	
	/**
	 * Method to tap on Stepper(Default, Tinted and Custom)
	 * @param stepperEnum
	 */
	public void tapStepper(StepperEnum stepperEnum){
		String uiAutomation = "target.frontMostApp().mainWindow().tableViews()[0].cells()[_replace_].buttons()[\"_replace_\"]";
		uiAutomation = uiAutomation.replaceFirst("_replace_", String.valueOf(stepperEnum.getIndex()));
		uiAutomation = uiAutomation.replaceAll("_replace_", stepperEnum.getStepperValue());
		IOSElement element = appiumIOSDriver.findElement(MobileBy.IosUIAutomation(uiAutomation));
		element.click();
	}
	
	/**
	 * Method to verify stepper values.
	 * @param stepperEnum
	 * @param value
	 * @return boolean (true if stepper value visible else false)
	 */
	public boolean isStepperValueVisible(StepperEnum stepperEnum,int value){
		String uiAutomation = "target.frontMostApp().mainWindow().tableViews()[0].cells()[_INDEX_].staticTexts().firstWithPredicate(\"name LIKE '_INDEX_'\")";
		uiAutomation = uiAutomation.replaceFirst("_INDEX_",  String.valueOf(stepperEnum.getIndex()));
		uiAutomation = uiAutomation.replaceAll("_INDEX_",  String.valueOf(value));
		IOSElement element = appiumIOSDriver.findElement(MobileBy.IosUIAutomation(uiAutomation));
		return isUIElementVisible(element);
	}
	
	/**
	 * Method to check decrement stepper are enabled/disabled.
	 * @param stepperEnum
	 * @return boolean (true if decrement disabled else false)
	 */
	public boolean isDescrementStepperEnabled(StepperEnum stepperEnum){
		String uiAutomation = "target.frontMostApp().mainWindow().tableViews()[0].cells()[_replace_].buttons()[\"_replace_\"]";
		uiAutomation = uiAutomation.replaceFirst("_replace_", String.valueOf(stepperEnum.getIndex()));
		uiAutomation = uiAutomation.replaceAll("_replace_", stepperEnum.getStepperValue());
		IOSElement element = appiumIOSDriver.findElement(MobileBy.IosUIAutomation(uiAutomation));
		return element.isEnabled();
	}
	
}
