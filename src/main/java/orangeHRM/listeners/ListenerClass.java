package orangeHRM.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import orangeHRM.reports.ExtentLogger;
import orangeHRM.reports.ExtentReportUtil;

public class ListenerClass implements ITestListener, ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		try {
			ExtentReportUtil.initReports();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onFinish(ISuite suite) {
		ExtentReportUtil.flushReports();
	}

	@Override
	public void onTestStart(ITestResult result) {
		ExtentReportUtil.createTest(result.getMethod().getDescription());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentLogger.pass(result.getMethod().getMethodName() + " is passed.");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			ExtentLogger.fail(result.getMethod().getMethodName() + " is failed.", true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentLogger.skip(result.getMethod().getMethodName() + " is skipped.");
	}
}
