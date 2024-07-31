package orangeHRM.basetest;

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
	
	@BeforeMethod
	protected void setup() throws Exception {
		DriverFactory.initDriver();
		loginPage = new LoginPage();
	}
	
	@AfterMethod
	protected void teardown() {
	
		//DriverFactory.quitDriver();
	}
	
}
