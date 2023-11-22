package org.testNg;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class firstTest {


    @Test
    public void actions() {
       WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
  //      open("https://google.com");


}
}
