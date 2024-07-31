package orangeHRM.pages;

import org.openqa.selenium.By;

import orangeHRM.enums.WaitStrategy;
import orangeHRM.reports.ExtentLogger;
import orangeHRM.reports.ExtentManager;

public final class LoginPage extends BasePage{

	private static final By inputUsername = By.xpath("//input[@name='username']");
	private static final By inputPassword = By.name("password");
	private static final By btnLogin = By.xpath("//button[@type ='submit']");
	private static final By linkForgotPwd = By.xpath("//p[text()='Forgot your password? ']");
	private static final By footerText = By.className("orangehrm-copyright-wrapper");

	public LoginPage enterUserName(String username){
		sendKeys(inputUsername, username, WaitStrategy.PRESENCE, "User name entered.");
		return this;
	}

	public LoginPage enterPassword(String password) {
		sendKeys(inputPassword, password, WaitStrategy.PRESENCE, "Password entered.");
		return this;
	}

	public HomePage doLogin() {
		ExtentLogger.pass("Do Login.");
		click(btnLogin, WaitStrategy.CLICKABLE, "Login btn clicked.");
		return new HomePage();
	}

	public String getTitle() {
		ExtentLogger.pass("Get page title.");
		return getPageTitle();
	}

	public String getPageFooterText() {
		return getText(footerText);
	}

	public boolean isForgotPwdLinkAvailable() {
		return isElementDisplayed(linkForgotPwd);
	}

}
