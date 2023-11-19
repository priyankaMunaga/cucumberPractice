package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class autoMotionPractice1 {
    @Given("user login to green kart")
    public void userLoginToGreenKart(){
        open("https://rahulshettyacademy.com/practice-project");
        sleep(2000);
        $(By.xpath("//input[@id='name']")).setValue("vishnukode");
        $(By.xpath("//input[@id='email']")).setValue("vishnukodelogin@gmail.com");
        $(By.xpath("//button[@id='form-submit']")).click();
       sleep(3000);
       $(By.xpath("//a[@href='https://rahulshettyacademy.com/seleniumPractise/#/']")).click();
       sleep(3000);
       $(By.xpath("//input[@value='2']"));
       $(By.xpath("//button[@fdprocessedid='w5r2hq']")).click();
       sleep(2000);

    }

    @Then("select the item")
    public void selectTheItem() {

    }
}
