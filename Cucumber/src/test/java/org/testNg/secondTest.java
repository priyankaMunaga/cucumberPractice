package org.testNg;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class secondTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@value='radio2']")).click();
Select drpOptions=new Select(driver.findElement(By.name("dropdown-class-example")));
drpOptions.selectByIndex(2);
driver.findElement(By.xpath("//input[@value='option3']")).click();
Thread.sleep(2000);
//Switch to newly created tab
      //  driver.switchTo().newWindow(WindowType.TAB);
        //driver.get("https://github.com/priyankaMunaga/cucumberPractice");
        //Thread.sleep(2000);
        //Switch to newly created window
      //  driver.switchTo().newWindow(WindowType.WINDOW);
  //      driver.get("https://www.amazon.in/?ref_=twa_22_14_2_350&twa_app=22_14_2_350");
        //switch to alert example
      driver.findElement(By.xpath("//input[@id='name']")).sendKeys("priya");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Alert']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.close();



    }
}
