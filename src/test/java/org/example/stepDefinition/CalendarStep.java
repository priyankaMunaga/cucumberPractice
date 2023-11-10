package org.example.stepDefinition;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

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
        $x("//div[@data-testid='undefined-month-November-2023']//div[@data-testid='undefined-calendar-day-23']").click();
    }

    @Then("the date should select")
    public void theDateShouldSelect() {
        $x("//div[contains(text(),'Thu, 23 Nov 2023')]").shouldBe(Condition.visible);

    }

    @When("user should select the future moth using the arrow")
    public void userShouldSelectTheFutureMothUsingTheArrow() {
        sleep(5000);
        $x("//div[@class='css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']").click();
        sleep(5000);

        $x("//div[@data-testid='undefined-month-January-2024']").should(Condition.visible);
    }

    @And("user should select the before month arrow")
    public void userShouldSelectTheBeforeMonthArrow() {
        sleep(5000);

        $x("//div[@class='css-1dbjc4n r-1loqt21 r-19bllq0 r-u8s1d r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']").click();
        sleep(5000);

        $x("//div[@data-testid='undefined-month-November-2023']").should(Condition.visible);
    }

    @Then("select the date on the calendar")
    public void selectTheDateOnTheCalendar() {
    }
}

