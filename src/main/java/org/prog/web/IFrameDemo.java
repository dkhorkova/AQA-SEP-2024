package org.prog.web;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class IFrameDemo {

    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            driver = new ChromeDriver();
            driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
            new WebDriverWait(driver, Duration.ofSeconds(30)).until(
                    ExpectedConditions.presenceOfElementLocated(By.id("accept-choices"))).click();

            WebElement runBtn = driver.findElement(By.id("runbtn"));
            System.out.println(runBtn.isDisplayed());

            WebElement iFrame = driver.findElement(By.id("iframeResult"));
            driver.switchTo().frame(iFrame);

            WebElement iFrameInner = driver.findElement(By.tagName("iframe"));
            driver.switchTo().frame(iFrameInner);

            WebElement logo = driver.findElement(By.id("sn-back"));
            System.out.println(logo.getAttribute("style"));

            driver.switchTo().parentFrame();

            WebElement header = driver.findElement(By.tagName("h1"));
            System.out.println(header.getText());

            driver.switchTo().defaultContent();
            WebElement runBtn2 = driver.findElement(By.id("runbtn"));
            System.out.println(runBtn2.isDisplayed());
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
