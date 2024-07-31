package orangeHRM.reports;

import java.util.Objects;

import com.aventstack.extentreports.ExtentTest;

public class ExtentManager {

	private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

	private ExtentManager() {
	}

	static ExtentTest getExtentTest() { //private for packages. can only be accessed from within the packag
		return extentTest.get();
	}

	static void setExtentTest(ExtentTest test) {
			if(Objects.nonNull(test)) {
				extentTest.set(test);
			}
	}

	static void unloadExtentTest() {
		extentTest.remove(); // reset it to default value, not Null
	}

}
