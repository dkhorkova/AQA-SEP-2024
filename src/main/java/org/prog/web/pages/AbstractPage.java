package org.prog.web.pages;

import org.openqa.selenium.WebDriver;

public class AbstractPage {

    protected final WebDriver driver;
    private final String pageUrl;

    public AbstractPage(WebDriver driver, String pageUrl) {
        this.driver = driver;
        this.pageUrl = pageUrl;
    }

    public void loadPage() {
        driver.get(pageUrl);
    }
}
