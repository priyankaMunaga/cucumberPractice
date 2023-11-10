package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.*;

public class CalendarStep {
    @Given("Navigating to home page")
    public void navigatingToHomePage() {
        open("https://www.spicejet.com/");
    }

    @Given("Selecting the Calendar")
    public void selectingTheCalendar() {

    }

    @When("select specif dates on the calendar")
    public void selectSpecifDatesOnTheCalendar() {
    }

    @Then("the date should select")
    public void theDateShouldSelect() {
    }
}
