package org.example.fbPage;

import org.example.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class createFaceBookAccountPage extends Page {

    public static void createNewFbAccount(String name, String lastName, String email, String passcode){
        clickCreateNewAccount();

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys(passcode);

        WebElement birth_Day = driver.findElement(By.name("birthday_day"));
        WebElement birth_Month = driver.findElement(By.name("birthday_month"));
        WebElement birth_Year = driver.findElement(By.name("birthday_year"));

        Select selectDropdownByDay= new Select(birth_Day);
        Select selectDropdownByMonth= new Select(birth_Month);
        Select selectDropdownByYear= new Select(birth_Year);
        selectDropdownByDay.selectByValue("25");
        selectDropdownByMonth.selectByVisibleText("April");
        selectDropdownByYear.selectByVisibleText("2022");

        driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
        driver.findElement(By.xpath("//button[contains(.,'Sign Up')]")).click();

    }


}
