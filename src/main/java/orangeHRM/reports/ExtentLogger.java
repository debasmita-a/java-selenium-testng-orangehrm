package orangeHRM.reports;

import com.aventstack.extentreports.MediaEntityBuilder;

import orangeHRM.enums.ConfigProperties;
import orangeHRM.utilities.ReadPropertyFile;
import orangeHRM.utilities.ScreenshotUtil;

public final class ExtentLogger {

	private ExtentLogger() {
	}

	public static void pass(String mesg) {
		ExtentManager.getExtentTest().pass(mesg);
	}

	public static void fail(String mesg) {
		ExtentManager.getExtentTest().fail(mesg);
	}

	public static void skip(String mesg) {
		ExtentManager.getExtentTest().skip(mesg);
	}

	public static void pass(String message, boolean isScreenshotNeeded){
		if (ReadPropertyFile.get(ConfigProperties.PASSEDSTEPSSCREENSHOT).equalsIgnoreCase("yes")
				&& isScreenshotNeeded) {
			ExtentManager.getExtentTest().pass(message,
					MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtil.getBase64Image()).build());
		} else {
			pass(message);
		}
	}

	public static void fail(String message, boolean isScreenshotNeeded) {
		if (ReadPropertyFile.get(ConfigProperties.FAILEDSTEPSSCREENSHOT).equalsIgnoreCase("yes")
				&& isScreenshotNeeded) {
			ExtentManager.getExtentTest().fail(message,
					MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtil.getBase64Image()).build());
		} else {
			fail(message);
		}
	}

	public static void skip(String message, boolean isScreenshotNeeded){
		if (ReadPropertyFile.get(ConfigProperties.SKIPPEDSTEPSSCREENSHOT).equalsIgnoreCase("yes")
				&& isScreenshotNeeded) {
			ExtentManager.getExtentTest().skip(message,
					MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtil.getBase64Image()).build());
		} else {
			skip(message);
		}
	}
}
