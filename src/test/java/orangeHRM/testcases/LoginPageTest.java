package orangeHRM.testcases;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import orangeHRM.basetest.BaseTest;
import orangeHRM.utilities.DataProviderUtil;

public final class LoginPageTest extends BaseTest{
	
	private LoginPageTest() {}
	
	@Test
	public void getPageTitleTest() {
		//ExtentReportUtil.createTest("Get Title Test");
		Assert.assertTrue(loginPage.getTitle().contains("OrangeHRM"));		
	}
	
	@Test(dataProvider="getData", dataProviderClass=DataProviderUtil.class)
	public void doLoginTest(Map<String, String> data){
		//ExtentReportUtil.createTest("Do Login Test");
		homePage = loginPage.enterUserName(data.get("username")).enterPassword(data.get("password"))
		         .doLogin();
		Assert.assertEquals(homePage.getDashboardText(), "Dashboard");
	}

}
