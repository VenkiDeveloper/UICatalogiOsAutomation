package com.atmecs.appium.uicatalog.test.views.actionsheet;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.appium.uicatalog.test.BaseIOSTest;
import com.atmecs.appium.uicatalog.views.UICatalogView;
import com.atmecs.appium.uicatalog.views.actionsheets.ActionSheetsView;

public class VerifyActionSheets extends BaseIOSTest{

	@BeforeMethod
	public void beforeMethodTapActionSheets(){
		UICatalogView catalogView = new UICatalogView(this.appiumIOSDriver);
		catalogView.tapActionSheets();
	}
	
	@Test
	public void verifyActionSheetsUIElements(){
		ActionSheetsView actionSheetsView = new ActionSheetsView(appiumIOSDriver);
		Assert.assertTrue(actionSheetsView.isActionSheetsTitleVisible(),"Action Sheet title is not visible.");
		Assert.assertTrue(actionSheetsView.isUICatalogButtonVisible(),"UI Catalog button is not visible.");
		Assert.assertTrue(actionSheetsView.isOkayOrCancelButtonVisible(), "Okay/Cancel button is not visible.");
		Assert.assertTrue(actionSheetsView.isOtherButtonVisible(), "Other button is  not visible.");
	}
	
	
	@Test
	public void verifyOkayOrCancelUIElements(){
		ActionSheetsView actionSheetsView = new ActionSheetsView(appiumIOSDriver);
		actionSheetsView.tapOkayOrCancelButton();
		Assert.assertTrue(actionSheetsView.isOKButtonVisible(), "Okay button is  not visible.");
		Assert.assertTrue(actionSheetsView.isCancelButtonVisible(), "Cancel button is  not visible.");
		actionSheetsView.tapOKButton();
		Assert.assertTrue(actionSheetsView.isOkayOrCancelButtonVisible(), "Okay/Cancel button is not visible.");
	}
	
	@Test
	public void verifyOtherUIElements(){
		ActionSheetsView actionSheetsView = new ActionSheetsView(appiumIOSDriver);
		actionSheetsView.tapOtherButton();
		Assert.assertTrue(actionSheetsView.isDestructiveChoiceButtonVisible(), "Destructive Choice button is  not visible.");
		Assert.assertTrue(actionSheetsView.isSafeChoiceButtonVisible(), "Safe Choice button is  not visible.");
		actionSheetsView.tapSafeChoiceButton();
		Assert.assertTrue(actionSheetsView.isOtherButtonVisible(), "Other button is  not visible.");
	}
	
	
	@AfterMethod
	public void afterMethodNavigateToActionSheets(){
		ActionSheetsView actionSheetsView = new ActionSheetsView(appiumIOSDriver);
		actionSheetsView.navigateToUICatalogPage();
	}
	
}
