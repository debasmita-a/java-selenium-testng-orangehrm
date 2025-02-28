package driver.entity;

import enums.BrowserType;
import enums.RemoteModeType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DriverData {

    private BrowserType browserType;
    private RemoteModeType remoteModeType;
}
