package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class fbLogin {
    @Given("user is on fb page")
    public void method(){open("https://www.google.com");
    }
@When("user enter validating text")
    public void userEnterValidatingText(){
        $(By.xpath("//textarea[@class='gLFyf']")).setValue("https://facebook.com");


}

}
