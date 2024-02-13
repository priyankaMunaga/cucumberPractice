package com.test.assignment.steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SecondAssignmentSteps {
    @Given("user navigate to the fb page")
    public void userNavigateToTheFbPage() {
        open("https://en-gb.facebook.com/login/");
    }



    @Then("Verify that there is a Create an account section on the page")
    public void verifyThatThereIsACreateAnAccountSectionOnThePage() {
        $(By.xpath("//a[normalize-space()='Sign up for Facebook']")).click();
        

    }

    @Then("fill all the text boxes")
    public void fillAllTheTextBoxes() {
        $(By.xpath("//input[@name='firstname']")).sendKeys("priya");
        sleep(3000);
        $(By.xpath("//input[@name='lastname']")).sendKeys("kode");
        sleep(2000);
        $(By.xpath("//input[@name='reg_email__']")).sendKeys("lakshmisagi181@gmail.com");
        sleep(2000);
        $(By.xpath(" //input[@name='reg_passwd__']")).sendKeys("Killsheep");
    }

    @And("Update the date of birth in the dropdown")
    public void updateTheDateOfBirthInTheDropdown() {
        $(By.xpath("//select[@name='birthday_day']")).selectOption(4);
        sleep(2000);
        $(By.xpath("//select[@name='birthday_month']")).selectOption(5);
        sleep(2000);
        $(By.xpath("//select[@name='birthday_year']")).selectOption(3);
        sleep(2000);

    }

    @And("Select gender")
    public void selectGender() {
        $(By.xpath("//label[normalize-space()='Female']")).click();
        sleep(2000);
    }

    @Then("Click on Create an account")
    public void clickOnCreateAnAccount() {
        $(By.xpath("//button[@name='websubmit']")).click();
        sleep(2000);
    }

    @Then("Verify that the account is created successfully")
    public void verifyThatTheAccountIsCreatedSuccessfully() {
        System.out.println("create sucessfully");
    }
}
