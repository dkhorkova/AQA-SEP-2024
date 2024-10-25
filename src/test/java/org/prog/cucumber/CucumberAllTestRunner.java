package org.prog.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.prog.cucumber.steps.WebSteps;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.prog.cucumber.steps",
        plugin = {"pretty",
                "json:target/cucumber-reports/Cucumber.json",
                "html:target/cucumber-report.html"
        })
public class CucumberAllTestRunner extends AbstractTestNGCucumberTests {

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        WebSteps.driver = new RemoteWebDriver(
                new URL("http://selenoid-selenoid-1:4444/wd/hub"), remoteChrome());
    }

    @AfterSuite
    public void tearDown() {
        WebSteps.driver.quit();
    }

    private ChromeOptions remoteChrome() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.setCapability("selenoid:options", new HashMap<String, Object>() {{
            put("enableVideo", true);
            put("enableVNC", true);
        }});
        return chromeOptions;
    }
}
