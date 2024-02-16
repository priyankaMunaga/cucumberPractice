package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.*;

public class Page {

    static final String BASE_URL = ConfigManager.getProperty("Base_Url");

    public static void navigateToParaBank() {
        open(BASE_URL);
    }
    public static WebDriver driver;

    public static void SetUp(String browser){

        switch (browser){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver= new FirefoxDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
        }


        driver.manage().window().maximize();

    }
    public static void closeDriver(){
        driver.close();
    }
    public static String getPageTitle(){
        return driver.getTitle();
    }
    public static String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
    public static void navigateToBack(){
        driver.navigate().back();
    }

    public static void navigateToHomePage(String url){
        driver.get(url);
    }
    public static void navigateToFbPage(String url){
        driver.get(url);
    }
    public static void clickCreateNewAccount(){
        driver.findElement(By.xpath("//a[contains(.,'Create new account')]")).click();
    }
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
