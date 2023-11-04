package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class gmailLogin {
    @Given("user is on login page")
    public void method1(){open("https://www.google.com");
    }

   @When("the user enters the valid username and password")
   public void theUserEntersTheValidUsernameAndPassword() {
       $(By.xpath("//a[contains(text(),'Gmail')]")).click();
        $(By.xpath("//a[contains(.,'Sign in')]")).click();
        $(By.xpath("//*[@id='identifierId']")).setValue("priyamunaga468@gmail.com");
        //sleep(5000);
        //$(By.xpath("//span[contains(.,'Next')]")).click();
       // sleep(5000);
       // $(By.xpath("//input[@type='password']")).setValue("KillSheep");
       // $(By.xpath("//span[contains(.,'Next')]")).click();


    }

    @Given("navigating to home page")
    public void navigatingToHomePage() {open("https://google.com");
    }
}
