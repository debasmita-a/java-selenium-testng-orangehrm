package orangeHRM.dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderPOJOTest {

	private String username;
	private String password;
	
	public DataProviderPOJOTest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	
	@DataProvider
	public static DataProviderPOJOTest[] dataProviderPOJO() {
		return new DataProviderPOJOTest[] {
				new DataProviderPOJOTest("Suman", "pass123!"),
				new DataProviderPOJOTest("Smith", "7878Pass!")
		};
	}
}
