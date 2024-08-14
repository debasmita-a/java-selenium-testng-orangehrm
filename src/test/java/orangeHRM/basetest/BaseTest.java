package orangeHRM.basetest;

import java.util.Map;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import orangeHRM.driver.DriverFactory;
import orangeHRM.pages.HomePage;
import orangeHRM.pages.LoginPage;

public class BaseTest {
	
	protected LoginPage loginPage;
	protected HomePage homePage;

	protected BaseTest() {
		
	}
	
	@SuppressWarnings("unchecked")
	@BeforeMethod
	protected void setup(Object[] data) throws Exception {
		Map<String, String> map = (Map<String, String>)data[0];
		DriverFactory.initDriver(map.get("browser"));
		loginPage = new LoginPage();
	}
	
	@AfterMethod
	protected void teardown() {
	
		DriverFactory.quitDriver();
	}
	
}
