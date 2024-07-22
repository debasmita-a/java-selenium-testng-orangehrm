package orangeHRM.dataproviders;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class DataProviders {

	@DataProvider
	public Object[] dataProvider01(Method m) {
		if(m.getName().equalsIgnoreCase("test01")) {
			return new String[] { "data1", "data2", "data3" };
		}
		else if(m.getName().equalsIgnoreCase("testPOJO")) {
			return new DataProviderPOJOTest[] {
					new DataProviderPOJOTest("Suman", "pass123!"),
					new DataProviderPOJOTest("Smith", "7878Pass!")
			};
		}
		return null;
	}
	
	@DataProvider
	public static DataProviderPOJOTest[] dataProviderPOJO() {
		return new DataProviderPOJOTest[] {
				new DataProviderPOJOTest("Suman", "pass123!"),
				new DataProviderPOJOTest("Smith", "7878Pass!")
		};
	}

	@DataProvider
	public Object[] dataProvider02() {
		return new Object[] { "obj1", "obj2" };
	}

	@DataProvider
	public Object[][] dataProvider03() {
		return new Object[][] { { "obj1" }, { "obj2" }, { "obj3" } };
	}

	@DataProvider
	public Object[] dataProvider04() {
		Map<String, Object> map1 = new HashMap<>();
		map1.put("testKey01", "testValue01");
		Map<String, Object> map2 = new HashMap<>();
		map2.put("testKey02", "testValue02");
		Map<String, Object> map3 = new HashMap<>();
		map3.put("testKey03", "testValue03");

		Object[] data = new Object[3];
		data[0] = map1;
		data[1] = map2;
		data[2] = map3;
		return data;
	}

	@DataProvider
	public Iterator<Entry<String, Object>> dataProvider05() {
		Map<String, Object> map1 = new HashMap<>();
		map1.put("testKey01", "testValue01");
		map1.put("testKey02", "testValue02");
		Map<String, Object> map2 = new HashMap<>();
		map2.put("testKey02", "testValue02");
		map2.put("testKey03", "testValue03");
		Map<String, Object> map3 = new HashMap<>();
		map3.put("testKey03", "testValue03");
		map3.put("testKey04", "testValue04");

		List<Map<String, Object>> listOfMaps = new ArrayList<>();
		listOfMaps.add(map1);
		listOfMaps.add(map2);
		listOfMaps.add(map3);
		Iterator<Entry<String, Object>> it = null;
		for (Map<String, Object> map : listOfMaps) {
			Set<Entry<String, Object>> entry = map.entrySet();
			it = entry.iterator();
		}
		return it;
	}
	
	@DataProvider(name = "dp2", parallel = true)
	public Iterator<Object[]> dp2() {
	    return Stream.from(this.map().entrySet())
	            .transform(new Function<Map.Entry<Integer, String>, Object[]>() {
	                @Override
	                public Object[] apply(Map.Entry<Integer, String> input) {
	                    return new Object[]{input.getKey(), input.getValue()};
	                }
	            })
	            .iterator();
	}
	
		
	@Test(dataProvider="dataProvider01")
	public void testPOJO(DataProviderPOJOTest data) {
		System.out.println(data.getUsername() + " ==== " + data.getPassword());
	}

	@Test(dataProvider = "dataProvider01")
	public void test01(String data) {
		System.out.println(data);
	}


}
