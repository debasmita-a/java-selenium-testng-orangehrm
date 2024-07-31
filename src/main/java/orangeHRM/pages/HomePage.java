package orangeHRM.pages;

import org.openqa.selenium.By;

import orangeHRM.enums.WaitStrategy;

public final class HomePage extends BasePage{

	private static final By dashboardText = By.xpath("//h6[text()='Dashboard']");
	private static final By userprofile = By.className("oxd-userdropdown-name");
	private static final By linkLogout = By.linkText("Logout");
	
	public String getDashboardText() {
		return getText(dashboardText);
	}
	
	public String getPageTitle() {
		return getPageTitle();
	}
	
	public LoginPage clickLogout() {
		click(userprofile, WaitStrategy.CLICKABLE, "Click user profile.");
		click(linkLogout, WaitStrategy.CLICKABLE, "Click Logout link.");
		return new LoginPage();
	}
}
