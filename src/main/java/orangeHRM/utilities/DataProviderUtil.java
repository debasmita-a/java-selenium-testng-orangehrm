package orangeHRM.utilities;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

public final class DataProviderUtil {

	private DataProviderUtil() {}
	
	private static List<Map<String, String>> list = new ArrayList<>();
	
	@DataProvider(parallel=true)
	public static Object[] getData(Method m) {
		String testname = m.getName();
		if(list.isEmpty()) {
			list = ExcelUtil.getData("data");
		}
		List<Map<String, String>> smallList = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).get("testname").equalsIgnoreCase(testname)) {
				if(list.get(i).get("execute").equalsIgnoreCase("yes")) {
					smallList.add(list.get(i));
				}
			}
		}	
		list.removeAll(smallList);
		return smallList.toArray();
	}
}
