package com.iiiitech.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${control}.properties"
})
public interface WebDriverConfig extends Config {
    @Key("baseUrl")
    @DefaultValue("https://iiii-tech.com")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String getBrowserVersion();

    @Key("remote")
    String getRemote();
}
