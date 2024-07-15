package orangeHRM.pages;

import org.openqa.selenium.By;

public final class LoginPage extends BasePage{

	private static final By inputUsername = By.xpath("//input[@name='username']");
	private static final By inputPassword = By.name("password");
	private static final By btnLogin = By.xpath("//button[@type ='submit']");
	private static final By linkForgotPwd = By.xpath("//p[text()='Forgot your password? ']");
	private static final By footerText = By.className("orangehrm-copyright-wrapper");

	public LoginPage enterUserName(String username){
		sendKeysWithWait(inputUsername, username, 5);
		return this;
	}

	public LoginPage enterPassword(String password) {
		sendKeysWithWait(inputPassword, password, 5);
		return this;
	}

	public HomePage doLogin() {
		clickWithWait(btnLogin, 5);
		return new HomePage();
	}

	public String getPageTitle() {
		return getTitle();
	}

	public String getPageFooterText() {
		return getText(footerText);
	}

	public boolean isForgotPwdLinkAvailable() {
		return isElementDisplayedWithWait(linkForgotPwd, 5);
	}

}
