package orangeHRM.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import orangeHRM.constants.FrameworkConstants;
import orangeHRM.enums.ConfigProperties;

public class ReadJSONFile {

	private static Map<String, String> CONFIG_MAP;

	private ReadJSONFile() {

	}

	static {
		try {
			CONFIG_MAP = new ObjectMapper().readValue(new FileInputStream(FrameworkConstants.getJsonConfigfilePath()), 
					new TypeReference<HashMap<String, String>>() {});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String get(ConfigProperties key) throws Exception {
		if(Objects.isNull(key) || Objects.isNull(CONFIG_MAP.get(key.name().toLowerCase()))) {
			throw new Exception("Property name " + key + "not found. Please check config.json file."); 
		}		
		return CONFIG_MAP.get(key.name().toLowerCase());
	}
}
