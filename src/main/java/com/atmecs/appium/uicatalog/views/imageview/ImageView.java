package com.atmecs.appium.uicatalog.views.imageview;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * This class contains Image view features.
 * @author venkatesh
 *
 */
public class ImageView extends BaseIOSView{

	/**
	 * Constructor Initialization
	 * @param appiumDriver
	 */
	public ImageView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	/**
	 * iOS element for image view title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Image View\"]")
	IOSElement imageViewTitle;
	
	/**
	 * iOS element for UICatalog button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().buttons()[\"UICatalog\"]")
	IOSElement uiCatalogButton;
	
	/**
	 * iOS element for animation image.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().images()[\"Animated\"]")
	IOSElement animationImage;
	
	/**
	 * @return boolean (true if Image view title visible else false)
	 */
	public boolean isImageViewTitleVisible(){
		return isUIElementVisible(this.imageViewTitle);
	}
	
	/**
	 * @return boolean (true if UI catalog button visible else false)
	 */
	public boolean isUICatalogButtonVisible(){
		return isUIElementVisible(this.uiCatalogButton);
	}
	
	/**
	 * Method to navigate to UI catalog.
	 */
	public void navigateToUICatalog(){
		this.uiCatalogButton.click();
	}
	
	/**
	 * @return boolean (true if Animation visible else false)
	 */
	public boolean isAnimationImageVisible(){
		return isUIElementVisible(this.animationImage);
	}

}
