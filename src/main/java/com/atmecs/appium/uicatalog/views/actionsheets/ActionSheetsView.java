package com.atmecs.appium.uicatalog.views.actionsheets;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ActionSheetsView extends BaseIOSView{

	public ActionSheetsView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(this.appiumIOSDriver), this);
	}
	
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Action Sheets\"]")
	IOSElement actionSheetsTitile;
	
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().buttons()[\"UICatalog\"]")
	IOSElement uiCatalogButton;
	
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Okay / Cancel\"]")
	IOSElement okayOrCancelButton;
	
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Other\"]")
	IOSElement otherButton;
	
	@iOSFindBy(uiAutomator="target.frontMostApp().actionSheet().collectionViews()[0].cells()[\"OK\"]")
	IOSElement okButton;
	
	@iOSFindBy(uiAutomator="target.frontMostApp().actionSheet().buttons()[\"Cancel\"]")
	IOSElement cancelButton;
	
	@iOSFindBy(uiAutomator="target.frontMostApp().actionSheet().collectionViews()[0].cells()[\"Destructive Choice\"]")
	IOSElement destructiveChoiceButton;
	
	@iOSFindBy(uiAutomator="target.frontMostApp().actionSheet().collectionViews()[0].cells()[\"Safe Choice\"]")
	IOSElement safeChoiceButton;
	
	
	public boolean isActionSheetsTitleVisible(){
		return isUIElementVisible(this.actionSheetsTitile);
	}

	public boolean isUICatalogButtonVisible(){
		return isUIElementVisible(this.uiCatalogButton);
	}
	
	public void navigateToUICatalogPage(){
		this.uiCatalogButton.click();
	}
	
	public boolean isOkayOrCancelButtonVisible(){
		return isUIElementVisible(this.okayOrCancelButton);
	}
	
	public boolean isOtherButtonVisible(){
		return isUIElementVisible(this.otherButton);
	}
	
	public void tapOkayOrCancelButton(){
		this.okayOrCancelButton.click();
	}
	
	public void tapOtherButton(){
		this.otherButton.click();
	}
	
	public boolean isOKButtonVisible(){
		return isUIElementVisible(this.okButton);
	}
	
	public boolean isCancelButtonVisible(){
		return isUIElementVisible(this.cancelButton);
	}
	
	public void tapOKButton(){
		this.okButton.click();
	}
	
	public void tapCancelButton(){
		this.cancelButton.click();
	}
	
	public boolean isDestructiveChoiceButtonVisible(){
		return isUIElementVisible(this.destructiveChoiceButton);
	}
	
	public boolean isSafeChoiceButtonVisible(){
		return isUIElementVisible(this.safeChoiceButton);
	}
	
	public void tapDestructiveChoiceButton(){
		this.destructiveChoiceButton.click();
	}
	
	public void tapSafeChoiceButton(){
		this.safeChoiceButton.click();
	}
}
