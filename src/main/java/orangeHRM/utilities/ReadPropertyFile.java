package orangeHRM.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import orangeHRM.constants.FrameworkConstants;
import orangeHRM.enums.ConfigProperties;

public final class ReadPropertyFile {

	private static Properties property = new Properties();
	private static final Map<String, String> CONFIG_MAP = new HashMap<>();

	private ReadPropertyFile() {
		
	}

	static {
		FileInputStream inputFile;
		try {
			inputFile = new FileInputStream(FrameworkConstants.getConfigfilePath());
			property.load(inputFile);
		
			for(Map.Entry<Object, Object> entry : property.entrySet()) {
				CONFIG_MAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
			}
			
		//	property.entrySet().forEach(entry -> CONFIG_MAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue())));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String get(ConfigProperties key) throws Exception{
		if(Objects.isNull(key) || Objects.isNull(property.get(key.name().toLowerCase()))) {
			throw new Exception("Property name " + key + " not found. Please check config.properties file");
		}
		return CONFIG_MAP.get(key.name().toLowerCase());
	}

    //Hashtable - little slow, but threadsafe
	// Converting a property file to a hashmap is gonna take some time.
	// If we are loading the property file just once, it is good to use a hashtable,
	// but if we are fetching values from property file multiple times, then should
	// use a hashmap

	/*
	 * public static String getValue(String key) throws Exception { if
	 * (Objects.isNull(property.getProperty(key)) || Objects.isNull(key)) { throw
	 * new Exception("Property name " + key +
	 * " not found. Please check config.properties file"); } return
	 * property.getProperty(key); }
	 */
}
