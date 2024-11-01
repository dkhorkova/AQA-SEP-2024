package org.prog.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class WebDriverFactory {

    private static WebDriver currentDriver;

    public static WebDriver getDriver() throws MalformedURLException {
        if (currentDriver != null) {
            return currentDriver;
        }
        //LOCAL - Intellij
        //SELENOID - Intellij + Selenoid
        //JENKINS - Jenkins + Selenoid
        String env = System.getProperty("env", "LOCAL");
        switch (env) {
            case "LOCAL":
                currentDriver = new ChromeDriver();
                break;
            case "SELENOID":
                currentDriver = new RemoteWebDriver(
                        new URL("http://localhost:4444/wd/hub"), remoteChrome());
                break;
            case "JENKINS":
                currentDriver = new RemoteWebDriver(
                        new URL("http://selenoid-selenoid-1:4444/wd/hub"), remoteChrome());
                break;
            default:
                throw new RuntimeException("No env defined!");
        }
        return currentDriver;
    }

    public static void quitDriver() {
        if (currentDriver != null) {
            currentDriver.quit();
        }
    }

    private static ChromeOptions remoteChrome() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.setCapability("selenoid:options", new HashMap<String, Object>() {{
            put("enableVideo", true);
            put("enableVNC", true);
        }});
        return chromeOptions;
    }
}
