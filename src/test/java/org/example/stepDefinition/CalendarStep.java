package org.example.stepDefinition;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.*;

public class CalendarStep {
    @Given("Navigating to home page")
    public void navigatingToHomePage() {
        open("https://www.spicejet.com/");
    }

    @Given("Selecting the Calendar")
    public void selectingTheCalendar() {
        SelenideElement element= $(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']"));
        element.click();
    }

    @When("select specif dates on the calendar")
    public void selectSpecifDatesOnTheCalendar() {
        $x("//div[@data-testid='undefined-month-November-2023']//div[@data-testid='undefined-calendar-day-17']").click();
        //div[@data-testid='undefined-calendar-day-17']
        //div[@data-testid='undefined-month-November-2023']
    }

    @Then("the date should select")
    public void theDateShouldSelect() {
        $x("//div[contains(text(),'Fri, 17 Nov 2023')]").shouldBe(Condition.visible);
    }
}
