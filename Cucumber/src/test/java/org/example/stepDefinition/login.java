package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import utils.PropertyUtil;
import org.example.Page;
import io.restassured.path.xml.element.Node;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class login extends Page{

    private final String prop = "Configurator.properties";
    private final Properties properties = PropertyUtil.getResourceProperties(prop);
    private final String url = properties.getProperty("googUrl");

    @Given("user navigate to home page")
    public void userNavigateToHomePage(){

        open(url);

    }


    @Then("user should enter validating text")
    public void userShouldEnterValidatingText() {
        $(By.xpath("//textarea[@id='APjFqb']")).setValue("vishnukode");
        $(By.xpath("//textarea[@id='APjFqb']")).setValue("priyanka kode");


    }


    @Given("user should see the google icon")
    public void userShouldSeeTheGoogleIcon() {

        $(By.xpath("//img[@alt='Google']")).should(exist);

    }

    @Then("user navigate to amazon website")
    public void userNavigateToAmazonWebsite() {
        open("https://amazon.com");
    }


    @And("user navigate to google webpage")
    public void userNavigateToGoogleWebpage() {

        Response response = given()
                .header("value","asdas")
                .header("asd","asd")
                .queryParam("","").when().post();

        response.then().statusCode(200);
        String xmlResponse= response.body().xmlPath().get().toString();

        back();

    }
}
