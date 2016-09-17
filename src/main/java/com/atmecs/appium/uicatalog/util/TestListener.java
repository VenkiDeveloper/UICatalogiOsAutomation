package com.atmecs.appium.uicatalog.util;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Implementation of {@link ITestListener},{@link ISuiteListener} interface.
 * @author venkatesh
 *
 */
public class TestListener implements ITestListener, ISuiteListener, IInvokedMethodListener{

	@Override
	public void onFinish(ITestContext testContext) {
		LogUtil.logInfo("Test : "+testContext.getName()+" FINISHED");
	}

	@Override
	public void onStart(ITestContext testContext) {
		LogUtil.logInfo("Test : "+testContext.getName()+" STARTED");		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}

	@Override
	public void onTestFailure(ITestResult testResult) {
		LogUtil.logInfo("########  Test case: "+testResult.getName()+": -------> FAILED #############");
	}

	@Override
	public void onTestSkipped(ITestResult testResult) {
		LogUtil.logInfo("########  Test case: "+testResult.getName()+": -------> SKIPPED #############");
	}

	@Override
	public void onTestStart(ITestResult testContext) {
		LogUtil.logInfo("Test Case: "+testContext.getName()+" STARTED");	
	}

	@Override
	public void onTestSuccess(ITestResult testResult) {
		LogUtil.logInfo("########  Test case: "+testResult.getName()+": -------> PASSED #############");
	}

	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		
	}

	@Override
	public void onFinish(ISuite suite) {
		LogUtil.logInfo("########  Suite finished: "+suite.getName()+" #################");
	}

	@Override
	public void onStart(ISuite suite) {
		LogUtil.logInfo("########  Suite started: "+suite.getName()+" #################");
	}

}
