package AddToCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class validateTheAddToCartTest {
    WebDriver wd;
    @BeforeTest
    public void testSetUp(){
        wd = new ChromeDriver();
        wd.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    @Test
    public void testCase(){
//        wd.findElement(By.xpath(""))


    }



}
