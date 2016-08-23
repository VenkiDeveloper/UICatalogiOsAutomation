package com.atmecs.appium.uicatalog.views.slider;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * This class contains slider view features.
 * @author venkatesh
 *
 */
public class SliderView extends BaseIOSView{

	/**
	 * @param appiumDriver
	 */
	public SliderView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumIOSDriver), this);
	}
	
	/**
	 * iOS element for Slider View Title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Sliders\"]")
	IOSElement slidersTitle;
	
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
	 * iOS element for default Slider.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[0].sliders()[0]")
	IOSElement defaultSlider;
	
	/**
	 * iOS element for Tinted Slider.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[1].sliders()[0]")
	IOSElement tintedSlider;
	
	/**
	 * iOS element for Custom Slider.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[2].sliders()[0]")
	IOSElement customSlider;
	
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
	 * @return boolean (true if Default Slider visible else false)
	 */
	public boolean isDefaultSliderVisible(){
		return isUIElementVisible(this.defaultSlider);
	}
	
	/**
	 * @return boolean (true if Tinted Slider visible else false)
	 */
	public boolean isTintedSliderVisible(){
		return isUIElementVisible(this.tintedSlider);
	}
	
	/**
	 * @return boolean (true if Custom Slider visible else false)
	 */
	public boolean isCustomSliderVisible(){
		return isUIElementVisible(this.customSlider);
	}
	
	/**
	 * Method to set default slider value.
	 * @param sliderValue
	 */
	public void setDefaultSlider(String sliderValue){
		this.defaultSlider.sendKeys(sliderValue);
	}
	
	/**
	 * Method to set Tinted slider value.
	 * @param sliderValue
	 */
	public void setTintedSlider(String sliderValue){
		this.tintedSlider.sendKeys(sliderValue);
	}
	
	/**
	 * Method to set Custom slider value.
	 * @param sliderValue
	 */
	public void setCustomSlider(String sliderValue){
		this.customSlider.sendKeys(sliderValue);
	}
	

}
