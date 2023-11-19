package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestOnSelenium {
    public static void main(String[] args) {
        System.out.println("testing");
        System.setProperty("webdriver.chrome.driver", "SeleniumPractice/src/main/resources/chromedriver.exe");

        WebDriver wd = new ChromeDriver();
        wd.get("https://rahulshettyacademy.com/seleniumPractise");
        System.out.println("test finished");

    }



}
