package org.prog.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class MyWebTest {

    private final static String COOKIES_LINK = "//a[contains(@href,'technologies/cookies')]";

    private WebDriver driver;

    @BeforeSuite
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void myNgTests1() {
        String celebrityName = "Ben Affleck";
        driver.get("https://google.com/");
        List<WebElement> cookiesLink = driver.findElements(By.xpath(COOKIES_LINK));
        if (!cookiesLink.isEmpty()) {
            driver.findElements(By.tagName("button"))
                    .get(4)
                    .click();
        }

        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.click();
        searchInput.sendKeys(celebrityName);
        searchInput.sendKeys(Keys.ENTER);

        List<WebElement> searchHeaders = new WebDriverWait(driver, Duration.ofSeconds(30L))
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("h3"), 2));

        int searchResultsCount = 0;
        for (WebElement searchHeader : searchHeaders) {
            if (searchHeader.getText().contains(celebrityName)) {
                searchResultsCount++;
            }
        }

        Assert.assertTrue(searchResultsCount > 2);
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
