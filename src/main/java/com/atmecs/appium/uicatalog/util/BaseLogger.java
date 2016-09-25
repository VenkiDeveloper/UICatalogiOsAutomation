package com.atmecs.appium.uicatalog.util;

import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

/**
 * BaseLoggger.
 * 
 * @author Venkatesh Aarelly
 */
class BaseLogger {
	/**
	 * Screen shot directory name.
	 */
	public static final String SCREEN_SHOT_DIR_NAME = "Screenshots";

	/**
	 * factory.
	 * 
	 * @param clazz
	 *            class.
	 * @return {@link BaseLogger}
	 */
	public static BaseLogger getLogger(final Class<?> clazz) {
		return new BaseLogger(clazz);
	}

	/**
	 * factory.
	 * 
	 * @param className
	 *            name.
	 * @return {@link BaseLogger}
	 */
	public static BaseLogger getLogger(final String className) {
		return new BaseLogger(className);
	}

	/**
	 * logger.
	 */
	private final Logger logger;

	/**
	 * Constructor.
	 * 
	 * @param clazz
	 *            Class
	 */
	protected BaseLogger(final Class<?> clazz) {
		this.logger = Logger.getLogger(clazz);
	}

	/**
	 * Constructor.
	 * 
	 * @param className
	 *            name.
	 */
	BaseLogger(final String className) {
		this.logger = Logger.getLogger(className);
	}

	/**
	 * Debug.
	 * 
	 * @param message
	 *            debug message to log.
	 */
	public void debug(final String message) {
		logger.debug(message);
		Reporter.log(message);
	}

	/**
	 * error.
	 * 
	 * @param message
	 *            error message to log.
	 */
	public void error(final String message, final Object... objects) {
		String msg = String.format(message, objects);
		StringBuilder str = new StringBuilder();
		str.append("<font color=\"red\">");
		str.append(msg);
		str.append("</font>");
		logger.error(str.toString());
		Reporter.log(str.toString());
	}

	/**
	 * fatal.
	 * 
	 * @param message
	 *            the message to log..
	 */
	public void fatal(final String message) {
		logger.fatal(message);
		Reporter.log(message);
	}

	/**
	 * info.
	 * 
	 * @param message
	 *            the message to log..
	 */
	public void info(final String message) {
		logger.info(message);
		Reporter.log(message);
	}

	/**
	 * Warn.
	 * 
	 * @param message
	 *            the message to log..
	 */
	public void warn(final String message) {
		logger.warn(message);
		Reporter.log(message);
	}

	/**
	 * Post a screenshot and in test report. 
	 * @param msg
	 *            like message to be logged with the screen shot.
	 * @param driver
	 */
	public void postScreenShot(String message, WebDriver driver) {
		TakeBrowserScreenshot ts = new TakeBrowserScreenshot(driver);
		File imgFile = ts.takeScreenShot();
		String imgPath = String.format("%s/%s", SCREEN_SHOT_DIR_NAME, imgFile.getName());
		String htmlStr = createhtmlTagString(message, imgPath);
		Reporter.log(htmlStr);
		info(imgFile.getAbsolutePath());
	}

	/**
	 * Creates a html string tag to be added to html reports.
	 * 
	 * @param msg
	 *            like "screenshot before join"
	 * @param imgPath
	 *            like "../piranhascreenshot/myimagename.png"
	 * @return string
	 */
	private static String createhtmlTagString(final String msg, final String imgPath) {
		String htmlStr = String.format(
				"" + "<strong style=\"color: blue;\">%s</strong>" + "<p>" + "<a href=\"%s\" target=\"_blank\">"
						+ "<img width=\"256\" src=\"%s\" alt=\"%s \" title=\"%s\"/>" + "</a>" + "</p>",
				msg, imgPath, imgPath, "Screenshot should be here for msg : " + msg, msg);
		return htmlStr;
	}

}
