package orangeHRM.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class DriverManager {

	private static ThreadLocal<WebDriver> tlDriver = ThreadLocal.withInitial(()->{
		System.out.println("With initials method. Functional interface - Supplier ");
		return new ChromeDriver(); //default value is new ChromeDriver()
	});

	private DriverManager() {
		
	}
	public static WebDriver getDriver() {
		return tlDriver.get();
	}

	public static void setDriver(WebDriver tlDriverRef) {
		tlDriver.set(tlDriverRef);
	}
	
	public static void unloadDriver() {
		tlDriver.remove(); //reset it to default value, not Null
	}
}
