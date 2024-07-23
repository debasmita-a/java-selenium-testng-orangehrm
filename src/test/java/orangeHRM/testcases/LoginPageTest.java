package orangeHRM.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import orangeHRM.basetest.BaseTest;

public final class LoginPageTest extends BaseTest{
	
	private LoginPageTest() {
		
	}
	
	@Test
	public void getPageTitleTest() {
		Assert.assertTrue(loginPage.getTitle().contains("OrangeHRM"));		
	}
	
	@Test(dataProvider="LoginTestDataProvider")
	public void doLoginTest(String username, String pass){
		homePage = loginPage.enterUserName(username).enterPassword(pass)
		         .doLogin();
		Assert.assertEquals(homePage.getDashboardText(), "Dashboard");
	}
	
	@DataProvider(name="LoginTestDataProvider", parallel=true)
	public Object[][] getData(){
		return new Object[][] {
			{"Admin", "admin123"},
			{"Admin123", "admin"},
			{"Admin", "admin123"},
			{"Admin123", "admin"}
		};
	}

}
