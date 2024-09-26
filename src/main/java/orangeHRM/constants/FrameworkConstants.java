package orangeHRM.constants;

import orangeHRM.enums.ConfigProperties;
import orangeHRM.utilities.ReadPropertyFile;

public final class FrameworkConstants {

	// This class should not be extended by any other classes. -- make it final
	// class
	// This class will have only static members. So we will have just getter
	// methods.
	// Don't need to create objects to access the static methods. Restrict this
	// class's object creation
	// Private Constructor - will restrict object creation

	private FrameworkConstants() {

	}

	private static final String EXTENTREPORTPATH = System.getProperty("user.dir") + "/extent-test-output";
	private static final String CHROMEDRIVERPATH = "";
	private static final String CONFIGFILE_PATH = System.getProperty("user.dir")
			+ "./src/test/resources/config/configproperties.properties";
	private static final String EXCELFILE_PATH = System.getProperty("user.dir") 
			+ "./src/test/resources/excel/testdata.xlsx";
	private static final int EXPLICITWAIT = 10;
	private static final String JSON_CONFIG_FILE_PATH = System.getProperty("user.dir")
			+ "./src/test/resources/config/config.json";

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}	
	
	public static String getExcelfilePath() {
		return EXCELFILE_PATH;
	}

	public static String getConfigfilePath() {
		return CONFIGFILE_PATH;
	}

	public static String getJsonConfigfilePath() {
		return JSON_CONFIG_FILE_PATH;
	}

	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}

	public static String getExtentreportpath(){
		if (ReadPropertyFile.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("yes")) {
			return EXTENTREPORTPATH + "/" + System.currentTimeMillis() + "index.html";
		} else {
			return EXTENTREPORTPATH + "/" + "index.html";
		}
	}
}
