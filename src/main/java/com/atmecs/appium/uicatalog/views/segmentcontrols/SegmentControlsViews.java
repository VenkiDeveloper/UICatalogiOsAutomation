package com.atmecs.appium.uicatalog.views.segmentcontrols;

import org.openqa.selenium.support.PageFactory;

import com.atmecs.appium.uicatalog.views.BaseIOSView;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * This class contains Segmenet Control view features.
 * @author venkatesh
 *
 */
public class SegmentControlsViews extends BaseIOSView{

	/**
	 * Constructor Initialization.
	 * @param appiumDriver
	 */
	public SegmentControlsViews(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}
	
	/**
	 * iOS element for Segmented Controls Title.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().navigationBar().staticTexts()[\"Segmented Controls\"]")
	IOSElement segmentedControlsTitle;
	
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
	 * iOS element for Tinted text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].groups()[\"TINTED\"]")
	IOSElement tintedText;
	
	/**
	 * iOS element for Custom Segments.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].groups()[\"CUSTOM SEGMENTS\"]")
	IOSElement customSegmentsText;
	
	/**
	 * iOS element for Custom Background.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].groups()[\"CUSTOM BACKGROUND\"]")
	IOSElement customBackgroundText;
	
	/**
	 * iOS element for default Check control button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[0].segmentedControls()[0].buttons()[\"Check\"]")
	IOSElement defaultCheckControl;
	
	/**
	 * iOS element for default Search control button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[0].segmentedControls()[0].buttons()[\"Search\"]")
	IOSElement defaultSearchControl;
	
	/**
	 * iOS element for default Tools control button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[0].segmentedControls()[0].buttons()[\"Tools\"]")
	IOSElement defaultToolsControl;
	
	/**
	 * iOS element for tinted Check control button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[1].segmentedControls()[0].buttons()[\"Check\"]")
	IOSElement tintedCheckControl;
	
	/**
	 * iOS element for tinted Search control button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[1].segmentedControls()[0].buttons()[\"Search\"]")
	IOSElement tintedSearchControl;
	
	/**
	 * iOS element for tinted Tools control button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[1].segmentedControls()[0].buttons()[\"Tools\"]")
	IOSElement tintedToolsControl;
	
	/**
	 * iOS element for custom segments Done control button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[2].segmentedControls()[0].buttons()[\"Done\"]")
	IOSElement customSegmentDoneControl;
	
	/**
	 * iOS element for custom segments Search control button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[2].segmentedControls()[0].buttons()[\"Search\"]")
	IOSElement customSegmentSearchControl;
	
	/**
	 * iOS element for custom segments Settings control button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[2].segmentedControls()[0].buttons()[\"Settings\"]")
	IOSElement customSegmentSettingsControl;
	
	/**
	 * iOS element for custom background Check control button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[3].segmentedControls()[0].buttons()[\"Check\"]")
	IOSElement customBGCheckControl;
	
	/**
	 * iOS element for custom background Search control button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[3].segmentedControls()[0].buttons()[\"Search\"]")
	IOSElement customBGSearchControl;
	
	/**
	 * iOS element for custom back ground Tools control button.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[3].segmentedControls()[0].buttons()[\"Tools\"]")
	IOSElement customBGToolsControl;
	
	/**
	 * iOS element for attributed text.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0]")
	IOSElement swipe;
	
	/**
	 * @return boolean (Segmented Controls Title)
	 */
	public boolean isSegmentedControlsTitleVisible(){
		return this.isUIElementVisible(this.segmentedControlsTitle);
	}
	
	/**
	 * @return boolean (true if UICatalog button visible else false)
	 */
	public boolean isUICatalogButtonVisible(){
		return this.isUIElementVisible(uiCatalog);
	}
	
	/**
	 * Method to tap on UICatalog Button.
	 */
	public void tapUICatalogButton(){
		this.uiCatalog.click();
	}
	
	/**
	 * @return boolean (true if Default text visible else false)
	 */
	public boolean isDefaultTextVisible(){
		return isUIElementVisible(this.defaultText);
	}
	
	/**
	 * @return boolean (true if Tinted text visible else false)
	 */
	public boolean isTintedTextVisible(){
		return isUIElementVisible(this.tintedText);
	}

	/**
	 * @return boolean (true if Custom Segments text visible else false)
	 */
	public boolean isCustomSegmentsTextVisible(){
		return isUIElementVisible(this.customSegmentsText);
	}
	
	/**
	 * @return boolean (true if Custom backGround text visible else false)
	 */
	public boolean isCustomBackgroundTextVisible(){
		return isUIElementVisible(this.customBackgroundText);
	}
	
	/**
	 * Method to swipe up Segmented Controls page.
	 */
	public void swipeUpSegmentedControls(){
		//swipe.scrollToExact("CUSTOM SEGMENTS");
		swipeUp();
	}
	
	/**
	 * Method to swipe down Segmented Controls page.
	 */
	public void swipeDownSegmentedControls(){
		//swipe.scrollToExact("TINTED");
		swipeDown();
	}
	
	/**
	 * @return boolean (true if Default check control button visible else false)
	 */
	public boolean isDefaultCheckControlVisible(){
		return isUIElementVisible(this.defaultCheckControl);
	}
	
	/**
	 * Method to tap on default Check Control button.
	 */
	public void tapDefaultCheckControlButton(){
		this.defaultCheckControl.click();
	}
	
	/**
	 * @return boolean (true if Default Search control button visible else false)
	 */
	public boolean isDefaultSearchControlVisible(){
		return isUIElementVisible(this.defaultSearchControl);
	}
	
	/**
	 * Method to tap on default Search Control button.
	 */
	public void tapDefaultSearchControlButton(){
		this.defaultSearchControl.click();
	}
	
	/**
	 * @return boolean (true if Default Tools control button visible else false)
	 */
	public boolean isDefaultToolsControlVisible(){
		return isUIElementVisible(this.defaultToolsControl);
	}
	
	/**
	 * Method to tap on default Tools Control button.
	 */
	public void tapDefaultToolsControlButton(){
		this.defaultToolsControl.click();
	}
	
	/**
	 * @return boolean (true if Tinted check control button visible else false)
	 */
	public boolean isTintedCheckControlVisible(){
		return isUIElementVisible(this.tintedCheckControl);
	}
	
	/**
	 * Method to tap on Tinted Check Control button.
	 */
	public void tapTintedCheckControlButton(){
		this.tintedCheckControl.click();
	}
	
	/**
	 * @return boolean (true if Tinted Search control button visible else false)
	 */
	public boolean isTintedSearchControlVisible(){
		return isUIElementVisible(this.tintedSearchControl);
	}
	
	/**
	 * Method to tap on Tinted Search Control button.
	 */
	public void tapTintedSearchControlButton(){
		this.tintedSearchControl.click();
	}
	
	/**
	 * @return boolean (true if Tinted Tools control button visible else false)
	 */
	public boolean isTintedToolsControlVisible(){
		return isUIElementVisible(this.tintedToolsControl);
	}
	
	/**
	 * Method to tap on Tinted Tools Control button.
	 */
	public void tapTintedToolsControlButton(){
		this.tintedToolsControl.click();
	}
	
	/**
	 * @return boolean (true if Custom Segmented Search control button visible else false)
	 */
	public boolean isCustomSegmentedSearchControlVisible(){
		return isUIElementVisible(this.customSegmentSearchControl);
	}
	
	/**
	 * Method to tap on Custom Segmented Search Control button.
	 */
	public void tapCustomSegmentedSearchControlButton(){
		this.customSegmentSearchControl.click();
	}
	
	/**
	 * @return boolean (true if Custom Segmented Done control button visible else false)
	 */
	public boolean isCustomSegmentedDoneControlVisible(){
		return isUIElementVisible(this.customSegmentDoneControl);
	}
	
	/**
	 * Method to tap on Custom Segmented Done Control button.
	 */
	public void tapCustomSegmentedDoneControlButton(){
		this.customSegmentDoneControl.click();
	}
	
	/**
	 * @return boolean (true if Custom segmented settings control button visible else false)
	 */
	public boolean isCustomSegmentedSettingsControlVisible(){
		return isUIElementVisible(this.customSegmentSettingsControl);
	}
	
	/**
	 * Method to tap on Custom segmented settings Control button.
	 */
	public void tapCustomSegmentedSettingsControlButton(){
		this.customSegmentSettingsControl.click();
	}
	
	/**
	 * @return boolean (true if Custom background Check control button visible else false)
	 */
	public boolean isCustomBGSearchControlVisible(){
		return isUIElementVisible(this.customBGSearchControl);
	}
	
	/**
	 * Method to tap on Custom Segmented Search Control button.
	 */
	public void tapCustomBGSearchControlButton(){
		this.customBGSearchControl.click();
	}
	
	/**
	 * @return boolean (true if Custom background Check control button visible else false)
	 */
	public boolean isCustomBGCheckControlVisible(){
		return isUIElementVisible(this.customBGCheckControl);
	}
	
	/**
	 * Method to tap on Custom background Check Control button.
	 */
	public void tapCustomBGCheckControlButton(){
		this.customBGCheckControl.click();
	}
	
	/**
	 * @return boolean (true if Custom background Tools control button visible else false)
	 */
	public boolean isCustomBGToolsControlVisible(){
		return isUIElementVisible(this.customBGToolsControl);
	}
	
	/**
	 * Method to tap on Custom background Tools Control button.
	 */
	public void tapCustomBGToolsControlButton(){
		this.customBGToolsControl.click();
	}
	
}
