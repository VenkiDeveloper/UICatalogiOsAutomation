package com.atmecs.appium.uicatalog.views;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class UICatalogView extends BaseIOSView{

	/**
	 * @param appiumDriver
	 */
	public UICatalogView(AppiumDriver<IOSElement> appiumDriver) {
		super(appiumDriver);
		PageFactory.initElements(new AppiumFieldDecorator(this.appiumIOSDriver), this);
	}
	
	/**
	 * iOS element for action sheets.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Action Sheets\"]")
	IOSElement actionSheets;
	
	/**
	 * iOS element for activity indicators.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Activity Indicators\"]")
	IOSElement activityIndicator;
	
	/**
	 * iOS element for Alert Views.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Alert Views\"]")
	IOSElement alertViews;
	
	/**
	 * iOS element for Buttons.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Buttons\"]")
	IOSElement buttons;
	
	/**
	 * iOS element for Date Picker.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Date Picker\"]")
	IOSElement datePicker;
			
	/**
	 * iOS element for Image view.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Image View\"]")
	IOSElement imageView;
	
	/**
	 * iOS element for Page controls.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Page Control\"]")
	IOSElement pageControls;
	
	/**
	 * iOS element for Picker View.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Picker View\"]")
	IOSElement pickerView;
	
	/**
	 * iOS element for Progress Views.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Progress Views\"]")
	IOSElement progressViews;
	
	/**
	 * iOS element for Segmented Controls.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Segmented Controls\"]")
	IOSElement segmentedControls;
	
	/**
	 * iOS element for Slider View.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Sliders\"]")
	IOSElement sliderViews;
	
	/**
	 * iOS element for Steppers View.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Steppers\"]")
	IOSElement stepperViews;
	
	/**
	 * iOS element for Switches View.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Switches\"]")
	IOSElement switchViews;
	
	/**
	 * iOS element for Text Fields View.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Text Fields\"]")
	IOSElement textFieldViews;
	
	/**
	 * iOS element for Search Bars View.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Search Bars\"]")
	IOSElement searchBarsView;
	
	/**
	 * iOS element for Toolbars View.
	 */
	@iOSFindBy(uiAutomator="target.frontMostApp().mainWindow().tableViews()[0].cells()[\"Toolbars\"]")
	IOSElement toolBarsView;
	
	/**
	 * Method to click on action sheets
	 */
	public void tapActionSheets(){
		this.actionSheets.click();
	}
	
	/**
	 * @return boolean (true if action sheets visible else false)
	 */
	public boolean isActionSheetsVisible(){
		return isUIElementVisible(this.actionSheets);
	}
	
	/**
	 * Method to tap on Activity Indicator.
	 */
	public void tapActivityIndicator(){
		this.activityIndicator.click();
	}
	
	/**
	 * @return boolean (true if activity indicator visible else false)
	 */
	public boolean isActivityIndicatorVisible(){
		return isUIElementVisible(this.activityIndicator);
	}
	
	/**
	 * @return boolean (true if Alert Views visible else false)
	 */
	public boolean isAlertViewsVisible(){
		return isUIElementVisible(this.activityIndicator);
	}
	
	/**
	 * Method to tap Alert Views.
	 */
	public void tapAlertViews(){
		this.alertViews.click();
	}
	
	/**
	 * @return boolean (true if buttons visible else false)
	 */
	public boolean isButtonsVisible(){
		return isUIElementVisible(this.buttons);
	}
	
	/**
	 * Method to tap Buttons.
	 */
	public void tapButtons(){
		this.buttons.click();
	}
	
	/**
	 * @return boolean (true if Date Picker visible else false)
	 */
	public boolean isDatePickerVisible(){
		return isUIElementVisible(this.datePicker);
	}
	
	/**
	 * Method to tap Date Picker.
	 */
	public void tapDatePicker(){
		this.datePicker.click();
	}
	
	/**
	 * @return boolean (true if Image View visible else false)
	 */
	public boolean isImageViewVisible(){
		return isUIElementVisible(this.imageView);
	}
	
	/**
	 * Method to tap Image View.
	 */
	public void tapImageView(){
		this.imageView.click();
	}
	
	/**
	 * @return boolean (true if Page Control visible else false)
	 */
	public boolean isPageControlVisible(){
		return isUIElementVisible(this.pageControls);
	}
	
	/**
	 * Method to tap Page Control.
	 */
	public void tapPageControl(){
		this.pageControls.click();
	}
	
	/**
	 * @return boolean (true if Picker View visible else false)
	 */
	public boolean isPickerViewVisible(){
		return isUIElementVisible(this.pageControls);
	}
	
	/**
	 * Method to tap Picker View.
	 */
	public void tapPickerView(){
		this.pickerView.click();
	}
	
	/**
	 * @return boolean (true if Progress View visible else false)
	 */
	public boolean isProgressViewsVisible(){
		return isUIElementVisible(this.pageControls);
	}
	
	/**
	 * Method to tap Progress Views.
	 */
	public void tapProgressViews(){
		this.progressViews.click();
	}
	
	/**
	 * @return boolean (true if Segmented Controls visible else false)
	 */
	public boolean isSegmentedControlsVisible(){
		return isUIElementVisible(this.segmentedControls);
	}
	
	/**
	 * Method to tap Segmented Controls.
	 */
	public void tapSegmentedControlsViews(){
		this.segmentedControls.scrollTo("Segmented Controls");
		this.segmentedControls.click();
	}
	
	/**
	 * @return boolean (true if Slider view visible else false)
	 */
	public boolean isSliderssVisible(){
		return isUIElementVisible(this.sliderViews);
	}
	
	/**
	 * Method to tap Slider Views.
	 */
	public void tapSlidersViews(){
		this.sliderViews.click();
	}
	
	/**
	 * @return boolean (true if Steppers view visible else false)
	 */
	public boolean isStepperViewVisible(){
		return isUIElementVisible(this.stepperViews);
	}
	
	/**
	 * Method to tap Steppers Views.
	 */
	public void tapStepperViews(){
		this.stepperViews.click();
	}
	
	/**
	 * @return boolean (true if Switches view visible else false)
	 */
	public boolean isSwitchViewVisible(){
		return isUIElementVisible(this.switchViews);
	}
	
	/**
	 * Method to tap Switch Views.
	 */
	public void tapSwitchViews(){
		this.switchViews.click();
	}
	
	/**
	 * @return boolean (true if Text Fields view visible else false)
	 */
	public boolean isTextFieldsViewVisible(){
		return isUIElementVisible(this.textFieldViews);
	}
	
	/**
	 * Method to tap Text Fields View.
	 */
	public void tapTextFieldsView(){
		this.textFieldViews.click();
	}
	
	/**
	 * @return boolean (true if Search bars visible else false)
	 */
	public boolean isSearchBarsViewVisible(){
		return isUIElementVisible(this.searchBarsView);
	}
	
	/**
	 * Method to tap Search Bars View.
	 */
	public void tapSearchBarsView(){
		this.searchBarsView.click();
	}
	
	/**
	 * @return boolean (true if Toolbars visible else false)
	 */
	public boolean isToolBarsViewVisible(){
		return isUIElementVisible(this.toolBarsView);
	}
	
	/**
	 * Method to tap Toolbars View.
	 */
	public void tapToolbarsView(){
		this.toolBarsView.click();
	}
	
}
