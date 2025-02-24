package tests;

import org.testng.annotations.Test;

import config.ConfigFactory;

public class DemoTest {
	
	@Test
	public void launchBrowser() {
		//FrameworkConfig config = ConfigFactory.create(FrameworkConfig.class);
		System.out.println(ConfigFactory.getConfig().browser());
		
	}
	

}
