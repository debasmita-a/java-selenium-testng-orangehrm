package converters;

import java.lang.reflect.Method;
import java.util.Map;
import org.aeonbits.owner.Converter;
import enums.BrowserType;

public class StringToBrowserType implements Converter<BrowserType>{

	@Override
	public BrowserType convert(Method method, String browserName) {
		Map<String, BrowserType> stringBrowserType = Map.of("CHROME", BrowserType.CHROME,
				"FIREFOX", BrowserType.FIREFOX, "EDGE", BrowserType.EDGE);
		return stringBrowserType.getOrDefault(browserName.toUpperCase(), BrowserType.CHROME);
	}

}
