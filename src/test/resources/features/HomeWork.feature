Feature: My HomeWork Cucumber Runner @homework

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Assert;
import java.util.List;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",  // Path to the feature files
        glue = {"stepdefs"},              // Package where the step definitions are located
        plugin = {"pretty", "html:target/cucumber-report.html"} // Optional: for report generation
)
public class CucumberTestRunner {
}

  Scenario: Find an iPhone on the allo.ua website
     Given I open the allo.ua website
     When I search for "Xiaomi 14T Pro 12/512Gb Titan Black"
     Then I should see the title and price of the iPhone Xiaomi 14T Pro 12/512Gb Titan Black

public class SearchIphoneSteps {

private WebDriver driver;


@Given("I open the allo.ua website")
public void i_open_the_allo_ua_website() {
 WebDriver driver = new ChromeDriver();
   driver.get("https://allo.ua/");

}

@When("I search for {string}") {
public void i_search_for(Xiaomi 14T Pro 12/512Gb Titan Black);
WebElement searchBox = driver.findElement(By.name("search"));
searchBox.sendKeys(Xiaomi 14T Pro 12/512Gb Titan Black);
 searchInput.sendKeys(Keys.ENTER);

}

@Then("I should see a product available for purchase") {
 String phone = "Xiaomi 14T Pro 12/512Gb Titan Black" = driver.getTitle();

 String element1 = String.valueOf(driver.findElement(By.cssSelector("product-card__title")).getText());
  System.out.println ( element1);

    String  element2 = String.valueOf(driver.findElement(By.cssSelector( " <div class=v-pb")).getText());
    System.out.println (element2);

     Assert.assertTrue("Title is empty", !title.isEmpty());
     Assert.assertTrue("Price is empty", !price.isEmpty());

}

 @io.cucumber.java.After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",  // Path to the feature files
        glue = {"stepdefs"},              // Package where the step definitions are located
        plugin = {"pretty", "html:target/cucumber-report.html"} // Optional: for report generation
)
public class CucumberTestRunner {
}