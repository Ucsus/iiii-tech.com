package com.iiiitech;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.iiiitech.config.WebDriverProvider;
import com.iiiitech.helpers.AllureAttachments;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase extends AllureAttachments {
    @BeforeAll
    static void setUp() {
        WebDriverProvider.config();
    }

//    @BeforeAll
//    static void setUp() {
//        SelenideLogger.addListener("Allure", new AllureSelenide());
//        Configuration.baseUrl = "http://iiii-tech.com";
//        Configuration.browser = System.getProperty("browser", "chrome");
//        Configuration.browserVersion = System.getProperty("browserVersion", "100");
//        Configuration.browserSize = System.getProperty("browserSize", "1920x1080");
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        System.setProperty("chromeoptions.prefs", "intl.accept_languages=ru");
//        capabilities.setCapability("enableVNC", true);
//        capabilities.setCapability("enableVideo", true);
//        Configuration.browserCapabilities = capabilities;
//        Configuration.remote = System.getProperty("remote", "https://user1:1234@selenoid.autotests.cloud/wd/hub");
//    }

    @BeforeEach
    public void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttach() {
        AllureAttachments.addVideo();
        AllureAttachments.browserConsoleLogs();
        AllureAttachments.screenshotAs("Last screenshot");
        AllureAttachments.pageSource();
    }
}
