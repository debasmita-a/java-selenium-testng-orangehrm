package orangeHRM.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import orangeHRM.basetest.BaseTest;

public final class HomePageTest extends BaseTest{
	
	private HomePageTest() {
		
	}
	
	@Test
	public void clickLogoutTest() throws InterruptedException {
		Assert.assertTrue(loginPage.enterUserName("Admin").enterPassword("admin123")
		         .doLogin().clickLogout().isForgotPwdLinkAvailable());
	}
}
