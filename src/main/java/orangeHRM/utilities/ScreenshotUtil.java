package orangeHRM.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import orangeHRM.driver.DriverManager;

public final class ScreenshotUtil {

	private ScreenshotUtil() {}
	
	public static String getBase64Image() {
		return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
	}
}
