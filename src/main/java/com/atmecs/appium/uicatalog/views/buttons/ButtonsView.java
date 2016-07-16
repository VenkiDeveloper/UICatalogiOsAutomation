package com.atmecs.appium.uicatalog.views.buttons;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * @author venkatesh
 */
public class ButtonsView extends BaseIOSView {

	/**
	 * Constructor initialization for buttons view.
	 * @param appiumDriver
	 */
	public ButtonsView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	/**
	 * iOS Element for buttons view title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Buttons\"]")
	IOSElement buttonsViewTitle;
	
	/**
	 * iOS element for UICatalog button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().buttons()[\"UICatalog\"]")
	IOSElement uiCatalogButton;
	
	/**
	 * iOS element for System text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].groups()[\"SYSTEM (TEXT)\"]")
	IOSElement systemText;
	
	/**
	 * iOS element for System text button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Button\"]")
	IOSElement simpleButton;
	
	/**
	 * iOS element for Contact add text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].groups()[\"SYSTEM (CONTACT ADD)\"]")
	IOSElement contactAddText;
	
	/**
	 * iOS element for detail disclosure text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].groups()[\"SYSTEM (DETAIL DISCLOSURE)\"]")
	IOSElement detailDisclosureText;
	
	/**
	 * iOS element for image text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].groups()[\"IMAGE\"]")
	IOSElement imageText;
	
	/**
	 * iOS element for attributed text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].groups()[\"ATTRIBUTED TEXT\"]")
	IOSElement attributedText;
	
	/**
	 * iOS element for attributed text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0]")
	IOSElement swipe;

	/**
	 * @return boolean (true if buttons view title visible else false)
	 */
	public boolean isButtonsViewTitleVisible(){
		return isUIElementVisible(this.buttonsViewTitle);
	}
	
	/**
	 * @return boolean (true if UI catalog button visible else false)
	 */
	public boolean isUICatalogButtonVisible(){
		return isUIElementVisible(this.uiCatalogButton);
	}
	
	/**
	 * @return boolean (true if System text visible else false)
	 */
	public boolean isSystemTextVisible(){
		return isUIElementVisible(this.systemText);
	}
	
	/**
	 * @return boolean (true if Simple button visible else false)
	 */
	public boolean isSimpleButtonVisible(){
		return isUIElementVisible(this.simpleButton);
	}
	
	/**
	 * Method to tap on Simple button.
	 */
	public void tapSimpleButton(){
		this.simpleButton.click();
	}
	
	/**
	 * @return boolean (true if Contact add text visible else false)
	 */
	public boolean isContactAddTextVisible(){
		return isUIElementVisible(this.contactAddText);
	}
	
	/**
	 * @return boolean (true if Detail Disclosure text visible else false)
	 */
	public boolean isdetailDisclosureTextVisible(){
		return isUIElementVisible(this.detailDisclosureText);
	}
	
	/**
	 * @return boolean (true if image text visible else false)
	 */
	public boolean isImageTextVisible(){
		return isUIElementVisible(this.imageText);
	}
	
	/**
	 * @return boolean (true if Attributed text visible else false)
	 */
	public boolean isAttributedTextVisible(){
		return isUIElementVisible(this.attributedText);
	}
	
	public void swipeUpButtonsView(){
		swipe.scrollTo("ATTRIBUTED TEXT");
	}
	
	public void swipeDownButtonsView(){
		swipe.scrollTo("SYSTEM (TEXT)");
	}
	
}
