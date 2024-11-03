package org.prog.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class HomeWorkNG {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        String phone = "Xiaomi 14T Pro 12/512Gb Titan Black";

            driver.get("https://allo.ua/");


            WebElement searchInput = driver.findElement(By.name("search"));
            searchInput.sendKeys("Xiaomi 14T Pro 12/512Gb Titan Black");
            searchInput.sendKeys(Keys.ENTER);

             String element1 = String.valueOf(driver.findElement(By.cssSelector("product-card__title")).getText());
             System.out.println ( element1);

             String  element2 = String.valueOf(driver.findElement(By.cssSelector( " <div class=v-pb")).getText());
             System.out.println (element2); 

            driver.close();
        }


    }


