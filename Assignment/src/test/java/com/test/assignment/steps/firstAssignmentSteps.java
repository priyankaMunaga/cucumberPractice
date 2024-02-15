package com.test.assignment.steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class firstAssignmentSteps {
    @Given("user navigate to the qaTechHub page")
    public void userNavigateToTheQaTechHubPage() {
        System.out.println("starting the web browser");
        open("https://qatechhub.com");
        $(By.xpath("//h3[contains(text(),'QA Tech Hub: QA Automation Tools Trainings and Tut')]")).click();
    }

    @Then("Print the page title")
    public void printThePageTitle() {
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