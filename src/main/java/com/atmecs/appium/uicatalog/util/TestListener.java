package com.atmecs.appium.uicatalog.util;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IInvokedMethodListener2;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Implementation of {@link ITestListener},{@link ISuiteListener} interface.
 * 
 * @author venkatesh
 *
 */
public class TestListener implements ITestListener, ISuiteListener {

	TestLogger LOG = TestLogger.getLogger(TestListener.class);

	@Override
	public void onFinish(ITestContext testContext) {
		// LOG.logInfo("Test : "+testContext.getName()+" FINISHED");
	}

	@Override
	public void onStart(ITestContext testContext) {
		// LOG.logInfo("Test : "+testContext.getName()+" STARTED");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

	@Override
	public void onTestFailure(ITestResult testResult) {
		StringBuffer sb = new StringBuffer();
		sb.append("\nTest Case: "+testResult.getMethod().getRealClass().getSimpleName() +"."+ testResult.getName() + " =========>  FAILED \n");
		sb.append("--------------------------------------------------------------------------------- \n");
		LOG.logInfo(sb.toString());
	}

	@Override
	public void onTestSkipped(ITestResult testResult) {
		StringBuffer sb = new StringBuffer();
		sb.append("\nTest Case: "+testResult.getMethod().getRealClass().getSimpleName() +"."+ testResult.getName() + " =========>  SKIPPED \n");
		sb.append("------------------------------------------------------------------------------- \n");
		LOG.logInfo(sb.toString());
	}

	@Override
	public void onTestStart(ITestResult testContext) {
		StringBuffer sb = new StringBuffer();
		sb.append("\n ------------------------------------------------------------------------------ \n");
		sb.append("Test Case: "+testContext.getMethod().getRealClass().getSimpleName() +"."+ testContext.getName() + " =========>  STARTED \n");
		LOG.logInfo(sb.toString());
	}

	@Override
	public void onTestSuccess(ITestResult testResult) {
		StringBuffer sb = new StringBuffer();
		sb.append("\nTest Case: "+testResult.getMethod().getRealClass().getSimpleName() +"."+ testResult.getName() + " =========>  PASSED \n");
		sb.append("------------------------------------------------------------------------------ \n");
		LOG.logInfo(sb.toString());
	}

	@Override
	public void onFinish(ISuite suite) {
		StringBuffer sb = new StringBuffer();
		sb.append("\n ############################################################################### \n");
		sb.append("           			Suite: " + suite.getName() + " Finished");
		sb.append("\n ############################################################################### \n");
		LOG.logInfo(sb.toString());
	}

	@Override
	public void onStart(ISuite suite) {
		StringBuffer sb = new StringBuffer();
		sb.append("\n ################################################################################ \n");
		sb.append("         			Suite: " + suite.getName() + " Started         \n");
		sb.append(" ################################################################################## \n");
		LOG.logInfo(sb.toString());
	}

	/*@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		StringBuffer sb = new StringBuffer();
		sb.append("\n ------------------------------------------------------------------------------ \n");
		sb.append("After Method: "+testResult.getMethod().getRealClass().getSimpleName() +"."+ testResult.getName());
		sb.append("\n ------------------------------------------------------------------------------ \n");
		LOG.logInfo(sb.toString());
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		StringBuffer sb = new StringBuffer();
		sb.append("\n ------------------------------------------------------------------------------ \n");
		sb.append("Before Method: "+testResult.getMethod().getRealClass().getSimpleName() +"."+ testResult.getName());
		sb.append("\n ------------------------------------------------------------------------------ \n");
		LOG.logInfo(sb.toString());
	}*/

}
