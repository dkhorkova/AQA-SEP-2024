package org.prog.web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GooglePage extends AbstractPage {

    private final static String COOKIES_LINK = "//a[contains(@href,'technologies/cookies')]";

    public GooglePage(WebDriver driver) {
        super(driver, "https://google.com/");
    }

    public boolean isCookiesOnScreen() {
        List<WebElement> cookiesLink = driver.findElements(By.xpath(COOKIES_LINK));
        return !cookiesLink.isEmpty();
        // cookiesLink.isEmpty() -> true -> if cookies for is NOT displayed
        // cookiesLink.isEmpty() -> false -> if cookies for IS displayed
    }

    public void cookiesAction(String action) {
        switch (action) {
            case "ACCEPT":
                driver.findElements(By.tagName("button"))
                        .get(4)
                        .click();
                return;
            case "REJECT":
                driver.findElements(By.tagName("button"))
                        .get(3)
                        .click();
                return;
            default:
                //do nothing
                System.out.println("cookies will remain");
        }
    }

    public void setSearchValue(String value) {
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.click();
        searchInput.sendKeys(value);
    }

    public void executeSearch() {
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys(Keys.ENTER);
    }

    public List<WebElement> getSearchHeaders() {
        return new WebDriverWait(driver, Duration.ofSeconds(30L))
                .until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("h3"), 2));
    }
}
