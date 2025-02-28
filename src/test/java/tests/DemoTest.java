package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class DemoTest extends WebBase {

	@Test(description = "User logs in with Username and Password")
	public void userLogin() {
		new LoginPage().LoginToApplication("Admin", "admin123")
				.navigateToAddUsersPage();
				
	}

}
