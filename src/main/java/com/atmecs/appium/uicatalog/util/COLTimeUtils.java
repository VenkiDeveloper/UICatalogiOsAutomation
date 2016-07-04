package com.atmecs.appium.uicatalog.util;

public class COLTimeUtils {

	/**
	 * Method to sleep for specified amount of time.
	 * 
	 * @param seconds
	 */
	public void sleep(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns current time in milliseconds as long int.
	 * @return system time as a long int.
	 */
	public static long time() {
		return System.currentTimeMillis();
	}

	/**
	 * Returns current time in milliseconds as String.
	 * @return system time as a String.
	 */
	public static String timeAsString() {
		return String.valueOf(time());
	}

}
