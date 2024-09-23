package orangeHRM.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import orangeHRM.annotations.FrameworkAnnotation;
import orangeHRM.basetest.BaseTest;
import orangeHRM.enums.CategoryType;

public final class HomePageTest extends BaseTest{
	
	private HomePageTest() {
		
	}
	
	@FrameworkAnnotation(author={"Debasmita Adhikari", "Nadira"}, category= {CategoryType.REGRESSION, CategoryType.SANITY})
	@Test
	public void clickLogoutTest() throws InterruptedException {
		Assert.assertTrue(loginPage.enterUserName("Admin").enterPassword("admin123")
		         .doLogin().clickLogout().isForgotPwdLinkAvailable());
	}
}
