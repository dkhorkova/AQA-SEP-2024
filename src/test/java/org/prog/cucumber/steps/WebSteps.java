package org.prog.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.prog.util.DataHolder;
import org.prog.web.pages.GooglePage;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class WebSteps {
    public static GooglePage googlePage;

    @Given("Load google page")
    public void loadGooglePage() {
        googlePage.loadPage();
    }

    @Given("Accept Google cookies if present")
    public void acceptCookiesIfPresent() {
        if (googlePage.isCookiesOnScreen()) {
            googlePage.cookiesAction("ACCEPT");
        }
    }

    @When("I google for {string}")
    public void searchForCelebrity(String alias) {
        googlePage.setSearchValue((String) DataHolder.HOLDER.get(alias));
        googlePage.executeSearch();
    }

    @Then("I can see {int} search results for name {string}")
    public void validateResults(int amount, String alias) {
        List<WebElement> searchHeaders = googlePage.getSearchHeaders();

        int searchResultsCount = 0;
        for (WebElement searchHeader : searchHeaders) {
            if (searchHeader.getText().contains((String) DataHolder.HOLDER.get(alias))) {
                searchResultsCount++;
            }
        }

        Assert.assertTrue(searchResultsCount > amount);
    }
}
