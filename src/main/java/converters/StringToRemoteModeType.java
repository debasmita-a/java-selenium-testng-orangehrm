package converters;

import enums.RemoteModeType;
import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;

public class StringToRemoteModeType implements Converter<RemoteModeType>{

    @Override
    public RemoteModeType convert(Method method, String remotemode) {
        Map<String, RemoteModeType> stringRemoteModeType = Map.of("SELENOID", RemoteModeType.SELENOID,
                                                   "BROWSERSTACK", RemoteModeType.BROWSERSTACK,
                                                   "SELENIUMGRID", RemoteModeType.SELENIUMGRID);
        return stringRemoteModeType.getOrDefault(remotemode.toUpperCase(), RemoteModeType.SELENIUMGRID);                                  
    }
    
}
