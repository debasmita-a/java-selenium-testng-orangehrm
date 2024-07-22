package orangeHRM.pages;

import org.openqa.selenium.By;

import orangeHRM.enums.WaitStrategy;

public final class LoginPage extends BasePage{

	private static final By inputUsername = By.xpath("//input[@name='username']");
	private static final By inputPassword = By.name("password");
	private static final By btnLogin = By.xpath("//button[@type ='submit']");
	private static final By linkForgotPwd = By.xpath("//p[text()='Forgot your password? ']");
	private static final By footerText = By.className("orangehrm-copyright-wrapper");

	public LoginPage enterUserName(String username){
		sendKeys(inputUsername, username, WaitStrategy.PRESENCE);
		return this;
	}

	public LoginPage enterPassword(String password) {
		sendKeys(inputPassword, password, WaitStrategy.PRESENCE);
		return this;
	}

	public HomePage doLogin() {
		click(btnLogin, WaitStrategy.CLICKABLE);
		return new HomePage();
	}

	public String getPageTitle() {
		return getPageTitle();
	}

	public String getPageFooterText() {
		return getText(footerText);
	}

	public boolean isForgotPwdLinkAvailable() {
		return isElementDisplayed(linkForgotPwd);
	}

}
