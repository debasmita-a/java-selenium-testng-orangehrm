package orangeHRM.pages;

import org.openqa.selenium.By;

public final class HomePage extends BasePage{

	private static final By dashboardText = By.xpath("//h6[text()='Dashboard']");
	private static final By userprofile = By.className("oxd-userdropdown-name");
	private static final By linkLogout = By.linkText("Logout");
	
	public String getDashboardText() {
		return getTextWithWait(dashboardText, 5);
	}
	
	public String getPageTitle() {
		return getTitle();
	}
	
	public LoginPage clickLogout() {
		clickWithWait(userprofile, 5);
		clickWithWait(linkLogout, 5);
		return new LoginPage();
	}
}
