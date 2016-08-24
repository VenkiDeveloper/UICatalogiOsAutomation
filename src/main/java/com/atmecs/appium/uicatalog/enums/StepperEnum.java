package com.atmecs.appium.uicatalog.enums;

/**
 * Enum for Steppers(default, tinted and custom (inc/dec))
 * @author venkatesh
 *
 */
public enum StepperEnum {

	/**
	 * Enum for Default decrement stepper.
	 */
	DEFAULT_DEC(0, "Decrement"),
	
	/**
	 * Enum for Default Increment stepper.
	 */
	DEFAULT_INC(0, "Increment"),
	
	/**
	 * Enum for Default decrement stepper.
	 */
	TINTED_DEC(1, "Decrement"),
	
	/**
	 * Enum for Tinted Increment stepper.
	 */
	TINTED_INC(1, "Increment"),
	
	/**
	 * Enum for Custom decrement stepper.
	 */
	CUSTOM_DEC(2, "Decrement"),
	
	/**
	 * Enum for Custom Increment stepper.
	 */
	CUSTOM_INC(2, "Increment");
	
	/**
	 * Instance variable for cell index.
	 */
	int index;
	
	/**
	 * Instance varaible for stepper.
	 */
	 String stepper;
	
	StepperEnum(int index, String stepper){
		this.index = index;
		this.stepper = stepper;
	}
	
	/**
	 * Method to get cell index.
	 * @return index
	 */
	public int getIndex(){
		return index;
	}
	
	/**
	 * Method to get stepper value.
	 * @return String
	 */
	public String getStepperValue(){
		return stepper;
	}
}
