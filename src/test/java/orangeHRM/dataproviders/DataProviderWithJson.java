package orangeHRM.dataproviders;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataProviderWithJson {

	@DataProvider
	public Object[] getDataFromJson() throws JsonProcessingException, DatabindException, IOException {
		
		HashMap<String, Object> map1 = new ObjectMapper().readValue(new File("./src/test/resources/json/testdata.json"), 
				new TypeReference<HashMap<String, Object>>() {});
		HashMap<String, Object> map2 = new ObjectMapper().readValue(new File("./src/test/resources/json/config.json"), 
				new TypeReference<HashMap<String, Object>>(){});
		
			return new Object[] {map1, map2};				
	}
	
	@Test(dataProvider = "getDataFromJson")
	public void test01(Map<String, Object> map) {
		
		for(Map.Entry<String, Object> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		//map.forEach((k,v) -> System.out.println(k + " : " + v));
	}
}
