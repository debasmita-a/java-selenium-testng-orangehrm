package driver.entity;

import enums.BrowserType;
import enums.RemoteModeType;
import enums.RunModeType;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DriverData {

    private BrowserType browserType;
    private RemoteModeType remoteModeType;
    private RunModeType runModeType;
    
}
