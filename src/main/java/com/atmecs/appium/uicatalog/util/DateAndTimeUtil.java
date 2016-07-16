package com.atmecs.appium.uicatalog.util;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class contains Date and time utilities.
 * @author venkatesh
 *
 */
public class DateAndTimeUtil {

	public DateTime getNowDate(){
		return DateTime.now();
	}
	
	/**
	 * Method to convert Date object to String.
	 * @param dateTime 
	 * @param format
	 * @return String (date as string)
	 */
	public static String convertDateObjectToString(DateTime dateTime,String format){
		DateTimeFormatter fmt = DateTimeFormat.forPattern(format);
		return fmt.print(dateTime);
	}
	
	/**
	 * Method to convert String as date Object.
	 * @param dateAsString
	 * @param format
	 * @return DateTime
	 */
	public DateTime convertStringToDateObject(String dateAsString,String format){
		DateTimeFormatter dtf = DateTimeFormat.forPattern(format);
		DateTime jodatime = dtf.parseDateTime(dateAsString);
		return jodatime;
	}
	
}
