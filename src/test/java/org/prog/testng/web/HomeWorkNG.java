package org.prog.testng.web;
 import org. openqa. selenium. By;
import java.util.List;
import java.util.stream.Collectors;

 import org.openqa.selenium.Keys;
 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 import org. openqa. selenium. WebElement;

public class HomeWorkNG {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver ();
       try{
           String phone = " Xiaomi 14T Pro 12/512Gb Titan Black";

   driver. get( "https://allo.ua/");
   WebElement Input = driver.findElement ( By.name ("search"));

   searchInput.sendKeys ( "Хiaomi 14T Pro 12/512 Gb Titan Black");
   searchInput.sendKeys (Keys.Enter);
   System.out.println ("Xiaomi 14T Pro 12/512Gb Titan Black, 32999 UA ");

        }
        finally {
                    driver.quit();

            }
            }

    }
