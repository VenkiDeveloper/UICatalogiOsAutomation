package com.atmecs.appium.uicatalog.views.textfields;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * @author venkatesh
 */
public class TextFieldsView extends BaseIOSView{

	/**
	 * @param appiumDriver
	 */
	public TextFieldsView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumIOSDriver), this);
	}
	
	/**
	 * iOS element for TextFields View Title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Text Fields\"]")
	IOSElement textFieldsViewTitle;
	
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
	 * iOS element for Secure text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].groups()[\"SECURE\"]")
	IOSElement secureText;

	/**
	 * iOS element for Specific Keyboard text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].groups()[\"SPECIFIC KEYBOARD\"]")
	IOSElement specificKeyboardText;
	
	/**
	 * iOS element for Custom text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].groups()[\"CUSTOM\"]")
	IOSElement customText;
	
	/**
	 * iOS element for Default Text Field.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[0].textFields()[0]")
	IOSElement defaultTextField;
	
	/**
	 * iOS element for Tinted Text Field.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[1].textFields()[0]")
	IOSElement tintedTextField;
	
	/**
	 * iOS element for Secure Text Field.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[2].secureTextFields()[0]")
	IOSElement secureTextField;
	
	/**
	 * iOS element for Specific Keyboard Text Field.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[3].textFields()[0]")
	IOSElement specificKeyboardTextField;
	
	/**
	 * iOS element for Custom Text Field.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[4].textFields()[0]")
	IOSElement customTextField;
	
	/**
	 * @return boolean (true if Text Fields View title visible else false)
	 */
	public boolean isTextFieldsTitleVisible(){
		return this.isUIElementVisible(this.textFieldsViewTitle);
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
	 * @return boolean (true if Secure text visible else false)
	 */
	public boolean isSecureTextVisible(){
		return isUIElementVisible(this.secureText);
	}
	
	/**
	 * @return boolean (true if Specific Keyboard text visible else false)
	 */
	public boolean isSpecificKeyboardTextVisible(){
		return isUIElementVisible(this.specificKeyboardText);
	}
	
	/**
	 * @return boolean (true if Custom text visible else false)
	 */
	public boolean isCustomTextVisible(){
		return isUIElementVisible(this.customText);
	}
	
	/**
	 * @return boolean (true if default text field visible else false)
	 */
	public boolean isDefaultTextFieldVisible(){
		return isUIElementVisible(this.defaultTextField);
	}
	
	/**
	 * @return boolean (true if Tinted text field visible else false)
	 */
	public boolean isTintedTextFieldVisible(){
		return isUIElementVisible(this.tintedTextField);
	}
	
	/**
	 * @return boolean (true if Secure text field visible else false)
	 */
	public boolean isSecureTextFieldVisible(){
		return isUIElementVisible(this.secureTextField);
	}
	
	/**
	 * @return boolean (true if Specific Keyboard text field visible else false)
	 */
	public boolean isSpecificKeybaordTextFieldVisible(){
		return isUIElementVisible(this.specificKeyboardTextField);
	}
	
	/**
	 * @return boolean (true if Custom text field visible else false)
	 */
	public boolean isCustomTextFieldVisible(){
		return isUIElementVisible(this.specificKeyboardTextField);
	}
	
	/**
	 * Method to set Default Text Field.
	 * @param value
	 */
	public void setDefaultTextField(String value){
		clearAndTypeTextField(this.defaultTextField, value);
	}
	
	/**
	 * Method to set Tinted Text Field.
	 * @param value
	 */
	public void setTintedTextField(String value){
		clearAndTypeTextField(this.tintedTextField, value);
	}
	
	/**
	 * Method to set Secure Text Field.
	 * @param value
	 */
	public void setSecureTextField(String value){
		clearAndTypeTextField(this.secureTextField, value);
	}

	
	/**
	 * Method to set Specified Keybaord Text Field.
	 * @param value
	 */
	public void setSpecifiedKeyboArdTextField(String value){
		clearAndTypeTextField(this.specificKeyboardTextField, value);
	}

	/**
	 * Method to set Custom Text Field.
	 * @param value
	 */
	public void setCustomTextField(String value){
		clearAndTypeTextField(this.customTextField, value);
	}

	/**
	 * Method to get default TextField value.
	 * @return String
	 */
	public String getDefaultTextFieldValue(){
		return this.defaultTextField.getAttribute("value");
	}
	
	/**
	 * Method to get Tinted TextField value.
	 * @return String
	 */
	public String getTintedTextFieldValue(){
		return this.tintedTextField.getAttribute("value");
	}
	
	/**
	 * Method to get Secure TextField value.
	 * @return String
	 */
	public String getSecureTextFieldValue(){
		return this.secureTextField.getAttribute("value");
	}
	
	/**
	 * Method to get Specific Keyboard TextField value.
	 * @return String
	 */
	public String getSpecificKeyboardTextFieldValue(){
		return this.specificKeyboardTextField.getAttribute("value");
	}
	
	/**
	 * Method to get Custom TextField value.
	 * @return String
	 */
	public String getCustomTextFieldValue(){
		return this.customTextField.getAttribute("value");
	}

}
