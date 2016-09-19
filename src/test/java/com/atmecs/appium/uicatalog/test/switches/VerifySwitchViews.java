package com.atmecs.appium.uicatalog.test.switches;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.appium.uicatalog.test.BaseIOSTest;
import com.atmecs.appium.uicatalog.view.switches.SwitchesView;
import com.atmecs.appium.uicatalog.views.UICatalogView;

/**
 * @author venkatesh
 */
public class VerifySwitchViews extends BaseIOSTest{

	/**
	 * Before method to tap Switches Views.
	 */
	@BeforeMethod
	public void beforeMethodTapSwitches(){
		UICatalogView catalogView = new UICatalogView(this.appiumIOSDriver);
		catalogView.swipeDown();
		catalogView.tapSwitchViews();
	}
	
	@Test
	public void verifyStepperViewsUIElements(){
		SwitchesView switchesView  = new SwitchesView(appiumIOSDriver);
		Assert.assertTrue(switchesView.isSwitchesTitleVisible(),"Switches title not visible.");
		Assert.assertTrue(switchesView.isUICatalogButtonVisible(),"UI catalog button not visible.");
		Assert.assertTrue(switchesView.isDefaultTextVisible(),"Default text is not visible.");
		Assert.assertTrue(switchesView.isTintedTextVisible(),"Tinted text is not visible.");
		Assert.assertTrue(switchesView.isDefaultSwitchVisible(),"Default switch is not visible.");
		Assert.assertTrue(switchesView.isTintedSwitchVisible(),"Tinted switch is not visible.");
		Assert.assertTrue(switchesView.isDefaultSwitchOn(),"Default switch is off.");
		Assert.assertTrue(switchesView.isTintedSwitchOn(),"Tinted switch is off.");
		switchesView.setDefaultSwitch(false);
		Assert.assertFalse(switchesView.isDefaultSwitchOn(),"Default switch is ON.");
		switchesView.setTintedSwitch(false);
		Assert.assertFalse(switchesView.isTintedSwitchOn(),"Tinted switch is ON.");
	}
	
	/**
	 * After method to Navigate to UI Catalog Page.
	 */
	@AfterMethod
	public void afterMethodNavigateToUICatalogPage(){
		SwitchesView switchesView  = new SwitchesView(appiumIOSDriver);
		switchesView.tapUICatalogButton();
		switchesView.swipeUp();
		
	}
}
