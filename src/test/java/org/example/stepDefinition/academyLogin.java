package org.example.stepDefinition;

import com.codeborne.selenide.commands.SelectRadio;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class academyLogin{
  @Given("use will open the login page")
    public void useWillOpenTheLoginPage(){
    open("https://rahulshettyacademy.com/practice-project");
    $(By.xpath("//input[@id='name']")).setValue("vishnukode");
    $(By.xpath("//input[@id='email']")).setValue("vishnukodelogin@gmail.com");
    $(By.xpath("//button[@id='form-submit']")).click();
sleep(5000);
    sleep(3000);

  }
  @Then("user should get all the login details")
  public void userShouldGetAllTheLoginDetails() {
    $(By.xpath("//a[@href='https://rahulshettyacademy.com/angularpractice/']")).click();
    sleep(2000);
    $(By.xpath("//input[@minlength='2']")).setValue("vishnu");
    sleep(2000);
    $(By.xpath("//input[@name='email']")).setValue("vishnukodelogin@gmail.com");
    $(By.xpath("//input[@type='password']")).setValue("123456");
    sleep(2000);
    $(By.xpath("//input[@type='checkbox']")).click();
    sleep(2000);
    $(By.id("exampleFormControlSelect1")).selectOption(1);
    //$(By.id("//input[@id='inlineRadio2']"));
    //$(By.xpath("//label[contains(text(),'Employed')]")).click();
    $(By.xpath("//label[contains(text(),'Student')]")).click();
    sleep(2000);
    $(By.xpath("//input[@name='bday']")).click();
    sleep(3000);
    $(By.xpath("//input[@type='submit']")).click();






  }
}
