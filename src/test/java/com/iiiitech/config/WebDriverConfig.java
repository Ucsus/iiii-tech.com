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
    @DefaultValue("100")
    String getBrowserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("remote")
    String getRemote();
}
