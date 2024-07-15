package orangeHRM.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import orangeHRM.basetest.BaseTest;

public final class LoginPageTest extends BaseTest{
	
	private LoginPageTest() {
		
	}
	
	@Test
	public void getPageTitleTest() {
		Assert.assertTrue(loginPage.getPageTitle().contains("OrangeHRM"));
		
	}
	
	@Test
	public void doLoginTest() throws InterruptedException {
		homePage = loginPage.enterUserName("Admin").enterPassword("admin123")
		         .doLogin();
		Assert.assertEquals(homePage.getDashboardText(), "Dashboard");
	}

}
