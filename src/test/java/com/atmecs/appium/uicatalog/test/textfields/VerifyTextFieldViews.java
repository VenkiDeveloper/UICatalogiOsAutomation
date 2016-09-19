package com.atmecs.appium.uicatalog.test.textfields;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atmecs.appium.uicatalog.test.BaseIOSTest;
import com.atmecs.appium.uicatalog.views.UICatalogView;
import com.atmecs.appium.uicatalog.views.textfields.TextFieldsView;

/**
 * @author venkatesh
 */
public class VerifyTextFieldViews extends BaseIOSTest {

	/**
	 * Before method to tap Text Fields View.
	 */
	@BeforeMethod
	public void beforeMethodTapTextFields(){
		UICatalogView catalogView = new UICatalogView(this.appiumIOSDriver);
		catalogView.swipeDown();
		catalogView.tapTextFieldsView();
	}
	
	@Test
	public void verifyTextFieldsViewUIElements(){
		TextFieldsView textFieldsView  = new TextFieldsView(appiumIOSDriver);
		Assert.assertTrue(textFieldsView.isTextFieldsTitleVisible(),"Text Fields title not visible.");
		Assert.assertTrue(textFieldsView.isUICatalogButtonVisible(),"UI catalog button not visible.");
		
		Assert.assertTrue(textFieldsView.isDefaultTextVisible(),"Default text is not visible.");
		Assert.assertTrue(textFieldsView.isDefaultTextFieldVisible(),"Default textfield is not visible.");
		Assert.assertTrue(textFieldsView.getDefaultTextFieldValue().equals("Placeholder text"),"Default text field place holder "
				+ "text not matched with expected.");
		
		Assert.assertTrue(textFieldsView.isTintedTextVisible(),"Tinted text is not visible.");
		Assert.assertTrue(textFieldsView.isTintedTextFieldVisible(),"Tinted textfield is not visible.");
		Assert.assertTrue(textFieldsView.getTintedTextFieldValue().equals("Placeholder text"),"Tinted TextField default placeholder "
				+ "text not amtched with expected.");
		
		Assert.assertTrue(textFieldsView.isSecureTextVisible(),"Secure text is not visible.");
		Assert.assertTrue(textFieldsView.isSecureTextFieldVisible(),"Secure textfield is not visible.");
		Assert.assertTrue(textFieldsView.getSecureTextFieldValue().equals("Placeholder text"),"Secure TextField default placeholder "
				+ "text not amtched with expected.");
		
		Assert.assertTrue(textFieldsView.isSpecificKeyboardTextVisible(),"Specific Keyboard text is not visible.");
		Assert.assertTrue(textFieldsView.isSpecificKeybaordTextFieldVisible(),"Specific Keyboard textfield is not visible.");
		Assert.assertTrue(textFieldsView.getSpecificKeyboardTextFieldValue().equals("Placeholder text"),"Specific Keyboard TextField default placeholder "
				+ "text not amtched with expected.");
		
		textFieldsView.swipeDown();
		Assert.assertTrue(textFieldsView.isCustomTextVisible(),"Custom text is not visible.");
		Assert.assertTrue(textFieldsView.isCustomTextFieldVisible(),"Custom textfield is not visible.");
		Assert.assertTrue(textFieldsView.getCustomTextFieldValue().equals("Placeholder text"),"Specific Keyboard TextField default placeholder "
				+ "text not amtched with expected.");
		textFieldsView.swipeUp();
	}
	
	@Test
	public void verifyUserCanBeAbleToEnterValues(){
		TextFieldsView textFieldsView  = new TextFieldsView(appiumIOSDriver);
		textFieldsView.setDefaultTextField("uicatalog1");
		Assert.assertTrue(textFieldsView.getDefaultTextFieldValue().equals("uicatalog1"),"Default text field value "
				+ "not matched with expected.");
		textFieldsView.setTintedTextField("uicatalog2");
		Assert.assertTrue(textFieldsView.getTintedTextFieldValue().equals("uicatalog2"),"Tinted text field value "
				+ "not matched with expected.");
		textFieldsView.setSecureTextField("uicatalog3");
		//Assert.assertTrue(textFieldsView.getSecureTextFieldValue().equals("uicatalog3"),"Secure text field value "
		//		+ "not matched with expected.");
		textFieldsView.setSpecifiedKeyboArdTextField("uicatalog$#");
		Assert.assertTrue(textFieldsView.getSpecificKeyboardTextFieldValue().equals("uicatalog$#"),"Custom text field value "
				+ "not matched with expected.");
		textFieldsView.swipeDown();
		textFieldsView.setCustomTextField("UICatalog5");
		Assert.assertTrue(textFieldsView.getCustomTextFieldValue().equals("UICatalog5"),"Custom text field value "
				+ "not matched with expected.");
	}
	
	/**
	 * After method to Navigate to UI Catalog Page.
	 */
	@AfterMethod
	public void afterMethodNavigateToUICatalogPage(){
		TextFieldsView textFieldsView  = new TextFieldsView(appiumIOSDriver);
		textFieldsView.tapUICatalogButton();
		textFieldsView.swipeUp();
		
	}
}
