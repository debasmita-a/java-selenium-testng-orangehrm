package orangeHRM.constants;

public final class FrameworkConstants {
	
	//This class should not be extended by any other classes. -- make it final class
	//This class will have only static members. So we will have just getter methods.
	//Don't need to create objects to access the static methods. Restrict this class's object creation
	//Private Constructor - will restrict object creation

	private FrameworkConstants() {
		
	}

	private static final String CHROMEDRIVERPATH = "";
	private static final String CONFIGFILE_PATH = System.getProperty("user.dir") + "./src/test/resources/config/configproperties.properties";
	private static final int EXPLICITWAIT = 10;

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}
		
	public static String getConfigfilePath() {
		return CONFIGFILE_PATH;
	}

	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}
}
