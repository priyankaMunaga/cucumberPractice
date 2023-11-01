package org.example.stepDefinition;

import com.codeborne.selenide.Condition;
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
        $(By.xpath("//textarea[@class='gLFyf']")).sendKeys("facebook.com",Keys.ENTER);
        $(By.xpath("//h3[contains(text(),'Facebook - log in or sign up')]")).click();
        $(By.xpath("//input[@id='email']")).sendKeys("priyamunaga468@gmail.com");
        $(By.xpath("//input[@id='pass']")).sendKeys("Mokthika@143",Keys.ENTER);
        $(By.xpath("//span[contains(text(),'Priyanka Munaga')]")).should(Condition.exist);
        sleep(7000);



sleep(6000);

}

    @When("the user enter the invalid text")
    public void theUserEnterTheInvalidText() {
        $(By.xpath("//textarea[@class='gLFyf']")).sendKeys("facebook.com",Keys.ENTER);
        $(By.xpath("//h3[contains(text(),'Facebook - log in or sign up')]")).click();
        $(By.xpath("//input[@id='email']")).sendKeys("priya2134");
        $(By.xpath("//input[@id='pass']")).sendKeys("143",Keys.ENTER);
$(By.className("_9ay7")).should(Condition.exist);
    }
}
