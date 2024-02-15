package com.test.assignment.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class firstAssignmentSteps {
    @Given("user navigate to the qaTechHub page")
    public void userNavigateToTheQaTechHubPage() {

        open("https://qatechhub.com");
    }

    @Then("Print the page title")
    public void printThePageTitle() {
        String currentPageTitle = title();
        Assert.assertEquals(currentPageTitle, "QA Automation Tools Trainings and Tutorials | QA Tech Hub");
        System.out.println("current page title  :" + currentPageTitle);


    }

    @When("the user navigate to the facebook page")
    public void theUserNavigateToTheFacebookPage() {
        open("https://www.facebook.com/");
    }

    @Then("user navigate to the back page")
    public void userNavigateToTheBackPage() {
        Selenide.back();

    }

    @Then("Print the URL of the current page")
    public void printTheURLOfTheCurrentPage() {
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        System.out.println("current Url :" + currentUrl);
        Assert.assertTrue(currentUrl.contains("https://qatechhub.com"));

    }

    @When("the user navigate to the forward page")
    public void theUserNavigateToTheForwardPage() {
        Selenide.forward();
    }

    @Then("the user Reload the page")
    public void theUserReloadThePage() {
        Selenide.refresh();

    }

    @Then("Close the Browser.")
    public void closeTheBrowser() {
        Selenide.closeWindow();
    }
}