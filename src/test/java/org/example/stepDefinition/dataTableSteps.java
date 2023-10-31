package org.example.stepDefinition;

import com.codeborne.selenide.Condition;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.ConfigManager;
import org.example.Page;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.*;

public class dataTableSteps extends Page {
    String firstName;
    String lastName;
    String userName;
    String password;
    String company;
    String role;
    String email;
    String mobile;
private final Properties prop= ConfigManager.getResourceProperties("Configurator.properties");
    private final String BaseUrl = prop.getProperty("baseUrl");


    @Given("navigates to home page")
    public void navigatesToHomePage(){
        open(BaseUrl);

    }


    @Given("user should on User List Table")
    public void userShouldOnUserListTable() {
        $(By.xpath("//button[contains(.,'Add User')]")).should(exist);
    }


    @When("add new users to the Table with the following details:")
    public void addNewUserToTheTable(DataTable dataTable) {
        List<Map<String, String>> userDataList = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> userData : userDataList) {

             firstName = userData.get("FirstName");
             lastName = userData.get("LastName");
             userName = userData.get("UserName");
             password = userData.get("Password");
             company = userData.get("Company");
             role = userData.get("Role");
             email = userData.get("Email");
             mobile = userData.get("Mobile");
        }

        clickElementBy(Locator.xpath, "//button[contains(.,'Add User')]");
        sendKeysElementBy(Locator.xpath, "//input[@name='FirstName']", firstName); //First name
        sendKeysElementBy(Locator.xpath, "//input[@name='LastName']", lastName); //Last name
        sendKeysElementBy(Locator.xpath, "//input[@name='UserName']", userName); //User name
        sendKeysElementBy(Locator.xpath, "//input[@name='Password']", password); //Password name

        // Assuming that "Company BBB" is the text inside the label element
        $(By.xpath("//label[contains(.,'" + company + "')]")).click();
        $(By.xpath("//select[@name='RoleId']")).click();
        $(By.xpath("//select[@name='RoleId']")).selectOption(role);

        sendKeysElementBy(Locator.xpath, "//input[@name='Email']", email);
        sendKeysElementBy(Locator.xpath, "//input[@name='Mobilephone']", mobile);

        clickElementBy(Locator.xpath, "//button[contains(text(),'Save')]");


    }

    @Then("validate the users are created in the User List Table")
    public void validateTheUsersAreCreatedInTheUserListTable() {
        $(By.xpath("//td[contains(text(),'" + firstName + "')]")).should(Condition.exist);
    }
}