package com.atmecs.appium.uicatalog.test.views;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.atmecs.appium.uicatalog.test.BaseIOSTest;
import com.atmecs.appium.uicatalog.views.UICatalogView;

public class VerifyUICatalog extends BaseIOSTest{

	@Test
	public void verifyActionSheetsOnUICatalogPage(){
		UICatalogView catalogView = new UICatalogView(this.iosDriver);
		Assert.assertTrue(catalogView.isActionSheetsVisible(), "Action Sheets not visible on UICatalog Page.");
	}
}
