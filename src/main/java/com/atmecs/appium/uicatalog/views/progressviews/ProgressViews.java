package com.atmecs.appium.uicatalog.views.progressviews;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * THis class contains different Progress views.
 * @author venkatesh
 *
 */
public class ProgressViews extends BaseIOSView{

	/**
	 * Constructor Initialization.
	 * @param appiumDriver
	 */
	public ProgressViews(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumIOSDriver), this);
	}
	
	/**
	 * iOS element for progress view title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Progress Views\"]")
	IOSElement progressViewTitle;
	
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
	 * iOS element for default text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[0].progressIndicators()[\"Progress\"]")
	IOSElement defaultProgressIndicators;
	
	/**
	 * iOS element for bar text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].groups()[\"BAR\"]")
	IOSElement barText;
	
	/**
	 * iOS element for bar progress indicator.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[1].progressIndicators()[\"Progress\"]")
	IOSElement barProgressIndicators;
	
	/**
	 * iOS element for tinted text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].groups()[\"BAR\"]")
	IOSElement tintedText;
	
	/**
	 * iOS element for tinted progress indicator.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[2].progressIndicators()[\"Progress\"]")
	IOSElement tintedProgressIndicators;
	
	/**
	 * @return boolean (true if Progress view title visible else false)
	 */
	public boolean isProgressViewsTitleVisible(){
		return isUIElementVisible(this.progressViewTitle);
	}
	
	/**
	 * @return boolean (true if UI catalog button visible else false)
	 */
	public boolean isUICatalogButtonVisible(){
		return isUIElementVisible(this.uiCatalog);
	}
	
	/**
	 * Method to navigate UICatalog page.
	 */
	public void navigateToUICatalogPage(){
		this.uiCatalog.click();
	}
	
	/**
	 * @return boolean (true if default text visible else false)
	 */
	public boolean isDefaultTextVisible(){
		return isUIElementVisible(this.defaultText);
	}
	
	/**
	 * @return boolean (true if default page indicators visible else false)
	 */
	public boolean isDefaultPageIndicatorsVisible(){
		return isUIElementVisible(this.defaultProgressIndicators);
	}
	
	/**
	 * @return boolean (true if bar text visible else false)
	 */
	public boolean isBarTextVisible(){
		return isUIElementVisible(this.barText);
	}
	
	/**
	 * @return boolean (true if bar page indicators visible else false)
	 */
	public boolean isBarPageIndicatorsVisible(){
		return isUIElementVisible(this.barProgressIndicators);
	}
	
	/**
	 * @return boolean (true if Tinted text visible else false)
	 */
	public boolean isTintedTextVisible(){
		return isUIElementVisible(this.tintedText);
	}
	
	/**
	 * @return boolean (true if bar page indicators visible else false)
	 */
	public boolean isTintedPageIndicatorsVisible(){
		return isUIElementVisible(this.tintedProgressIndicators);
	}

}
