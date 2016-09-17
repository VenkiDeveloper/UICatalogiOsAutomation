package com.atmecs.appium.uicatalog.util;

import org.testng.log4testng.Logger;

/**
 * This class is for Generating logger at different levels.
 * @author venkatesh
 *
 */
public class LogUtil {
	private static final Logger LOG = Logger.getLogger(LogUtil.class);
	
	/**
	 * Logger at Debug level.
	 * @param message
	 */
	public static final void logDebug(String message){
		LOG.debug(message);
	}
	
	/**
	 * Logger at Error level.
	 * @param message
	 */
	public static final void logError(String message){
		LOG.error(message);
	}
	
	/**
	 * Logger at Info level.
	 * @param message
	 */
	public static final void logInfo(String message){
		LOG.info("%s "+message);
	}
	
	/**
	 * Logger at Warn level.
	 * @param message
	 */
	public static final void logWarning(String message){
		LOG.warn(message);
	}
	
	/**
	 * Logger for set up methods.
	 * @param message
	 */
	public static final void logSetUpStep(String message){
		StringBuffer sb = new StringBuffer();
		sb.append("###### SetUp ##########");
		sb.append(message);
		logInfo(sb.toString());
	}
	
	/**
	 * Logger for tear down methods.
	 * @param message
	 */
	public static final void logTearDownStep(String message){
		StringBuffer sb = new StringBuffer();
		sb.append("###### Tear Down ##########");
		sb.append(message);
		logInfo(sb.toString());
	}
	
	/**
	 * Logger for Test step.
	 * @param message
	 */
	public static final void logTestStep(String message){
		logInfo(message);
	}
	
	/**
	 * Logger for Test verification step.
	 * @param message
	 */
	public static final void logTestVerificationStep(String message){
		LOG.info("Verification: %s "+message);
	}
	
}
