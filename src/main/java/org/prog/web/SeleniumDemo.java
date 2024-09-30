package org.prog.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            driver = new ChromeDriver();
            driver.get("https://google.com/");
            System.out.println("done!");
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
