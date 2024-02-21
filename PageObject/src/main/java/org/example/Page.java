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



}
