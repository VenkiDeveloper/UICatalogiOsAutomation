package com.atmecs.appium.uicatalog.util;

/**
 * This class is for Generating logger at different levels.
 * @author venkatesh
 *
 */
public class TestLogger {
	
	/**
	 * factory.
	 * 
	 * @param clazz
	 *            class.
	 * @return {@link BaseLogger}
	 */
	public static TestLogger getLogger(final Class<?> clazz) {
		return new TestLogger(clazz);
	}

	/**
	 * factory.
	 * 
	 * @param className
	 *            name.
	 * @return {@link BaseLogger}
	 */
	public static TestLogger getLogger(final String className) {
		return new TestLogger(className);
	}
	
	/**
	 * logger.
	 */
	private static BaseLogger logger;

	/**
	 * Constructor.
	 * 
	 * @param clazz
	 *            Class
	 */
	protected TestLogger(final Class<?> clazz) {
		logger = BaseLogger.getLogger(clazz);
	}

	/**
	 * Constructor.
	 * 
	 * @param className
	 *            name.
	 */
	TestLogger(final String className) {
		logger = BaseLogger.getLogger(className);
	}

	
	/**
	 * Logger at Debug level.
	 * @param message
	 */
	public void logDebug(String message){
		logger.debug(message);
	}
	
	/**
	 * Logger at Error level.
	 * @param message
	 */
	public void logError(String message,final Object... objects){
		logger.error(message);
	}
	
	/**
	 * Logger at Info level.
	 * @param message
	 */
	public void logInfo(String message){
		logger.info(message);
	}
	
	/**
	 * Logger at Warn level.
	 * @param message
	 */
	public void logWarning(String message){
		logger.warn(message);
	}
	
	/**
	 * Logger for set up methods.
	 * @param message
	 */
	public void logSetUpStep(String message){
		logInfo("SetUp: "+message);
	}
	
	/**
	 * Logger for tear down methods.
	 * @param message
	 */
	public void logTearDownStep(String message){
		logInfo("Tear Down: "+message);
	}
	
	/**
	 * Logger for Test step.
	 * @param message
	 */
	public void logTestStep(String message){
		logInfo(message);
	}
	
	/**
	 * Logger for Test verification step.
	 * @param message
	 */
	public void logTestVerificationStep(String message){
		logger.info("Verification: "+message);
	}
	
}
