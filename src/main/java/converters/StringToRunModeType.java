package converters;

import java.lang.reflect.Method;
import java.util.Map;
import org.aeonbits.owner.Converter;
import enums.RunModeType;

public class StringToRunModeType implements Converter<RunModeType>{
    @Override
	public RunModeType convert(Method method, String runmode) {
		Map<String, RunModeType> stringRunModeType = Map.of("LOCAL", RunModeType.LOCAL, 
                                                       "REMOTE", RunModeType.REMOTE);
		return stringRunModeType.getOrDefault(runmode.toUpperCase(), RunModeType.LOCAL);
	}
}
