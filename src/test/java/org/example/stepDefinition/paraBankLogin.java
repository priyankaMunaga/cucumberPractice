package org.example.stepDefinition;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Sleeper;

import static com.codeborne.selenide.Selenide.*;

public class paraBankLogin {
    @Given("user navigates to para bank home page")
    public void userNavigatesToParaBankHomePage() {
        open("https://parabank.parasoft.com/parabank/index.htm");
    }
//    @Given("user should  be on login page")
//    public void method2() {open("www.google.com");
//     sleep(6000);
//    }

//    @When("user will enter the wrong username and password")
//    public void userWillEnterTheWrongUsernameAndPassword() {
//        $(By.xpath("//textarea[@class='gLFyf']")).sendKeys("https://parabank.parasoft.com/parabank/index.htm",Keys.ENTER);
//        $(By.xpath("//h3[contains(text(),'ParaBank - Parasoft')]]")).click();
//        $(By.xpath("//input[@name='username']")).sendKeys("priyankamunaga");
//       $(By.xpath("//input[@name='password']")).sendKeys("14567", Keys.ENTER);
//       // $(By.xpath("//input[@name='password']")).sendKeys("14567", Keys.ENTER);
//        $(By.xpath("//p[@class='error']")).should(Condition.exist);
//   // }

    @Given("user is on registration page")
    public void userIsOnRegistrationPage() {

        $(By.xpath("//a[contains(text(),'Register')]")).click();
        $(By.xpath("//input[@id='customer.firstName']")).setValue("priyanka");
        $(By.xpath("//input[@id='customer.lastName']")).setValue("Kode");
        $(By.xpath("//input[@id='customer.address.street']")).setValue("Dcpl");
        $(By.xpath("//input[@id='customer.address.city']")).setValue("gnt");
        $(By.xpath("//input[@id='customer.address.state']")).setValue("AP");
        $(By.xpath("//input[@id='customer.address.zipCode']")).setValue("522123");
        $(By.xpath("//input[@id='customer.phoneNumber']")).setValue("0987654321");
        $(By.xpath("//input[@id='customer.ssn']")).setValue("456");
        $(By.xpath("//input[@id='customer.username']")).setValue("priyank");
        $(By.xpath("//input[@id='customer.password']")).setValue("143468");
        $(By.xpath("//input[@id='repeatedPassword']")).setValue("143468");
        $(By.xpath("//input[@value='Register']")).click();
        sleep(7000);


    }


    @Then("user logged in")
    public void userLoggedIn() {
        $(By.xpath("//h1[@class='title']")).should(Condition.exist);
    }

    @Given("user is on new account page")
    public void userIsOnNewAccountPage() {
        $(By.xpath("//input[@name='username']")).setValue("priyank");
        $(By.xpath("//input[@name='password']")).setValue("143468");
        $(By.xpath("//input[@value='Log In']")).click();
        $(By.xpath("//a[contains(text(),'Open New Account')]")).click();
        sleep(7000);
    }

    @Then("user will get the account details")
    public void userWillGetTheAccountDetails() {
        $(By.id("type")).selectOption("SAVINGS");


sleep(7000);

    }
}


