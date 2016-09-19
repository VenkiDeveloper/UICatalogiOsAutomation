package com.atmecs.appium.uicatalog.test.slider;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.appium.uicatalog.test.BaseIOSTest;
import com.atmecs.appium.uicatalog.views.UICatalogView;
import com.atmecs.appium.uicatalog.views.slider.SliderView;

/**
 * @author venkatesh
 */
public class VerifySliderViews extends BaseIOSTest{

	/**
	 * Before method to tap Segmented Control Views.
	 */
	@BeforeMethod
	public void beforeMethodTapProgressViews(){
		UICatalogView catalogView = new UICatalogView(this.appiumIOSDriver);
		catalogView.swipeDown();
		catalogView.tapSlidersViews();
	}
	
	@Test
	public void verifySliderViewsUIElements(){
		SliderView sliderView  = new SliderView(appiumIOSDriver);
		Assert.assertTrue(sliderView.isSliderTitleVisible(),"Slider title not visible.");
		Assert.assertTrue(sliderView.isUICatalogButtonVisible(),"UI catalog button not visible.");
		Assert.assertTrue(sliderView.isDefaultTextVisible(),"Default text is not visible.");
		Assert.assertTrue(sliderView.isDefaultSliderVisible(),"Default Slider is not visible.");
		Assert.assertTrue(sliderView.isTintedTextVisible(),"Tinted text is not visible.");
		Assert.assertTrue(sliderView.isTintedSliderVisible(),"Tinted text is not visible.");
		Assert.assertTrue(sliderView.isCustomTextVisible(),"Tinted text is not visible.");
		Assert.assertTrue(sliderView.isCustomSliderVisible(),"Custom slider is not visible.");
	}
	
	@Test
	public void verifyUserCanAbleToSetSliderValues(){
		SliderView sliderView = new SliderView(appiumIOSDriver);
		sliderView.setDefaultSlider("0.75");
		sliderView.setTintedSlider("0.25");
		sliderView.setCustomSlider("0.60");
		System.out.println("Default Slider value: "+sliderView.getDefaultSliderValue());
		System.out.println("Tinted Slider value: "+sliderView.getTintedSliderValue());
		System.out.println("Custom Slider value: "+sliderView.getCustomSliderValue());
		
	}
	
	/**
	 * After method to Navigate to UI Catalog Page.
	 */
	@AfterMethod
	public void afterMethodNavigateToUICatalogPage(){
		SliderView sliderView = new SliderView(appiumIOSDriver);
		sliderView.tapUICatalogButton();
		
	}
}
