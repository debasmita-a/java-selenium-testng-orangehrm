package orangeHRM.reports;

public final class ExtentLogger {

	private ExtentLogger() {}
	
	public static void pass(String mesg) {
		ExtentManager.getExtentTest().pass(mesg);
	}
	
	public static void fail(String mesg) {
		ExtentManager.getExtentTest().fail(mesg);
	}
	
	public static void skip(String mesg) {
		ExtentManager.getExtentTest().skip(mesg);
	}
}
