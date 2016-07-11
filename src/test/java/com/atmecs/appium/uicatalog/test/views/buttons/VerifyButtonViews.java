package com.atmecs.appium.uicatalog.test.views.buttons;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.appium.uicatalog.test.BaseIOSTest;
import com.atmecs.appium.uicatalog.views.UICatalogView;
import com.atmecs.appium.uicatalog.views.actionsheets.ActionSheetsView;
import com.atmecs.appium.uicatalog.views.buttons.ButtonsView;

/**
 * 
 * @author venkatesh
 *
 */
public class VerifyButtonViews extends BaseIOSTest{
	
	@BeforeMethod
	public void beforeMethodTapActionSheets(){
		UICatalogView catalogView = new UICatalogView(this.appiumIOSDriver);
		catalogView.tapButtons();
	}
	
	@Test
	public void verifyButtonUIElements(){
		ButtonsView buttonsView = new ButtonsView(appiumIOSDriver);
		Assert.assertTrue(buttonsView.isButtonsViewTitleVisible(),"Bu title is not visible.");
		Assert.assertTrue(buttonsView.isUICatalogButtonVisible(),"UI Catalog button is not visible.");
		Assert.assertTrue(buttonsView.isSystemTextVisible(),"System text is not visible.");
		Assert.assertTrue(buttonsView.isSimpleButtonVisible(),"SimpleButton is not visible.");
		buttonsView.tapSimpleButton();
		Assert.assertTrue(buttonsView.isContactAddTextVisible(),"Contact add text is not visible.");
		Assert.assertTrue(buttonsView.isdetailDisclosureTextVisible(),"Details Disclosure add text is not visible.");
		Assert.assertTrue(buttonsView.isImageTextVisible(), "Image text is not visible");
		buttonsView.scrollUp();
		Assert.assertTrue(buttonsView.isAttributedTextVisible(), "Attributed text is not visible");
		buttonsView.scrollDown();
	}
	
	@AfterMethod
	public void afterMethodNavigateToActionSheets(){
		ActionSheetsView actionSheetsView = new ActionSheetsView(appiumIOSDriver);
		actionSheetsView.navigateToUICatalogPage();
	}
}
