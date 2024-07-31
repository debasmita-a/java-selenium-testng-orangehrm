package orangeHRM.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import orangeHRM.basetest.BaseTest;
import orangeHRM.reports.ExtentManager;
import orangeHRM.reports.ExtentReportUtil;

public final class LoginPageTest extends BaseTest{
	
	private LoginPageTest() {}
	
	@Test
	public void getPageTitleTest() {
		//ExtentReportUtil.createTest("Get Title Test");
		Assert.assertTrue(loginPage.getTitle().contains("OrangeHRM"));		
	}
	
	@Test(dataProvider="LoginTestDataProvider")
	public void doLoginTest(String username, String pass){
		//ExtentReportUtil.createTest("Do Login Test");
		homePage = loginPage.enterUserName(username).enterPassword(pass)
		         .doLogin();
		Assert.assertEquals(homePage.getDashboardText(), "Dashboard");
	}
	
	@DataProvider(name="LoginTestDataProvider", parallel=true)
	public Object[][] getData(){
		return new Object[][] {
			{"Admin", "admin123"},
			{"Admin123", "admin"}			
		};
	}

}
