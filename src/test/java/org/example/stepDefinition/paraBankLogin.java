package org.example.stepDefinition;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Sleeper;

import static com.codeborne.selenide.Selenide.*;

public class paraBankLogin {
    @Given("user should  be on login page")
    public void method2() {open("www.google.com");
     sleep(6000);
    }

    @When("user will enter the wrong username and password")
    public void userWillEnterTheWrongUsernameAndPassword() {
        $(By.xpath("//textarea[@class='gLFyf']")).sendKeys("https://parabank.parasoft.com/parabank/index.htm",Keys.ENTER);
        $(By.xpath("//h3[contains(text(),'ParaBank - Parasoft')]]")).click();
        $(By.xpath("//input[@name='username']")).sendKeys("priyankamunaga");
       $(By.xpath("//input[@name='password']")).sendKeys("14567", Keys.ENTER);
       // $(By.xpath("//input[@name='password']")).sendKeys("14567", Keys.ENTER);
        $(By.xpath("//p[@class='error']")).should(Condition.exist);
    }
}


