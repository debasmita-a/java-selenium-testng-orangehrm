package orangeHRM.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import orangeHRM.enums.ConfigProperties;
import orangeHRM.utilities.ReadPropertyFile;

public class RetryFailedTests implements IRetryAnalyzer {

	private int count = 0;
	private int retries = 1;

	@Override
	public boolean retry(ITestResult result) {
		boolean value = false;
		try {
			if (ReadPropertyFile.get(ConfigProperties.RETRYFAILEDTESTS).equalsIgnoreCase("yes")) {
				value = count < retries;
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

}
