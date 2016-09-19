package com.atmecs.appium.uicatalog.test.steppers;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.appium.uicatalog.enums.StepperEnum;
import com.atmecs.appium.uicatalog.test.BaseIOSTest;
import com.atmecs.appium.uicatalog.views.UICatalogView;
import com.atmecs.appium.uicatalog.views.steppers.SteppersView;

/**
 * @author venkatesh
 */
public class VerifyStepperViews extends BaseIOSTest{

	/**
	 * Before method to tap Steppers Views.
	 */
	@BeforeMethod
	public void beforeMethodTapSteppers(){
		UICatalogView catalogView = new UICatalogView(this.appiumIOSDriver);
		catalogView.swipeDown();
		catalogView.tapStepperViews();
	}
	
	@Test
	public void verifyStepperViewsUIElements(){
		SteppersView steppersView  = new SteppersView(appiumIOSDriver);
		Assert.assertTrue(steppersView.isStepperTitleVisible(),"Steppers title not visible.");
		Assert.assertTrue(steppersView.isUICatalogButtonVisible(),"UI catalog button not visible.");
		Assert.assertTrue(steppersView.isDefaultTextVisible(),"Default text is not visible.");
		Assert.assertTrue(steppersView.isTintedTextVisible(),"Tinted text is not visible.");
		Assert.assertTrue(steppersView.isCustomTextVisible(),"Custom text is not visible.");
		Assert.assertTrue(steppersView.isDefaultDecrementStepperVisible(),"default decrement stepper is not visible.");
		Assert.assertTrue(steppersView.isDefaultIncrementStepperVisible(),"default increment stepper is not visible.");
		Assert.assertTrue(steppersView.isTintedDecrementStepperVisible(),"Tinted decrement stepper is not visible.");
		Assert.assertTrue(steppersView.isTintedIncrementStepperVisible(),"Tinted increment stepper is not visible.");
		Assert.assertTrue(steppersView.isCustomDecrementStepperVisible(),"Custom decrement stepper is not visible.");
		Assert.assertTrue(steppersView.isCustomIncrementStepperVisible(),"Custom increment stepper is not visible.");
		Assert.assertTrue(steppersView.isStepperValueVisible(StepperEnum.DEFAULT_DEC, 0),"Default stepper value is not matched with expected.");
		Assert.assertTrue(steppersView.isStepperValueVisible(StepperEnum.TINTED_DEC, 0),"Tinted stepper value is not matched with expected.");
		Assert.assertTrue(steppersView.isStepperValueVisible(StepperEnum.CUSTOM_DEC, 0),"Custom stepper value is not matched with expected.");
		Assert.assertFalse(steppersView.isDescrementStepperEnabled(StepperEnum.DEFAULT_DEC),"Default Decrement stepper is enabled by defaultly.");
		Assert.assertFalse(steppersView.isDescrementStepperEnabled(StepperEnum.TINTED_DEC),"Tinted Decrement stepper is enabled by defaultly.");
		Assert.assertFalse(steppersView.isDescrementStepperEnabled(StepperEnum.CUSTOM_DEC),"Custom Decrement stepper is enabled by defaultly.");
	}
	
	@Test
	public void verifyUserCanBeAbleToIncreseODecreseStepperValues(){
		SteppersView steppersView  = new SteppersView(appiumIOSDriver);
		for(int i=0;i<5;i++)
			steppersView.tapStepper(StepperEnum.DEFAULT_INC);
		Assert.assertTrue(steppersView.isDescrementStepperEnabled(StepperEnum.DEFAULT_DEC),"Default Decrement stepper is enabled by defaultly.");
		Assert.assertTrue(steppersView.isStepperValueVisible(StepperEnum.DEFAULT_DEC, 5),"Default stepper value is not matched with expected.");
		for(int i=0;i<3;i++)
			steppersView.tapStepper(StepperEnum.TINTED_INC);
		Assert.assertTrue(steppersView.isDescrementStepperEnabled(StepperEnum.TINTED_DEC),"Tinted Decrement stepper is enabled by defaultly.");
		Assert.assertTrue(steppersView.isStepperValueVisible(StepperEnum.TINTED_DEC, 3),"Tinted stepper value is not matched with expected.");
		for(int i=0;i<4;i++)
			steppersView.tapStepper(StepperEnum.CUSTOM_INC);
		steppersView.tapStepper(StepperEnum.CUSTOM_DEC);
		Assert.assertTrue(steppersView.isDescrementStepperEnabled(StepperEnum.CUSTOM_DEC),"Custom Decrement stepper is enabled by defaultly.");
		Assert.assertTrue(steppersView.isStepperValueVisible(StepperEnum.CUSTOM_DEC, 3),"Custom stepper value is not matched with expected.");
		for(int i=0;i<3;i++)
			steppersView.tapStepper(StepperEnum.CUSTOM_DEC);
		Assert.assertTrue(steppersView.isStepperValueVisible(StepperEnum.CUSTOM_DEC, 0),"Custom stepper value is not matched with expected.");
		Assert.assertFalse(steppersView.isDescrementStepperEnabled(StepperEnum.CUSTOM_DEC),"Custom Decrement stepper is enabled by defaultly.");
	}
	
	/**
	 * After method to Navigate to UI Catalog Page.
	 */
	@AfterMethod
	public void afterMethodNavigateToUICatalogPage(){
		SteppersView steppersView = new SteppersView(appiumIOSDriver);
		steppersView.tapUICatalogButton();
		steppersView.swipeUp();
		
	}
}
