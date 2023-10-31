package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v117.network.Network;
import org.openqa.selenium.devtools.v117.network.model.Request;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class Page {
    private boolean result = false;

    public enum Locator {
        xpath, id, css, name, className, linkText, tagName
    }
    public boolean clickElementBy(Locator Locators, String LocatorString) {
        final int MAX_STALE_ELEMENT_RETRIES = 2;
        int retries = 0;
        if (retries > 0) {
            System.out.println("Retrying again for the " + retries + " time.");
        }
        while (true) {
            try {
                switch (Locators) {
                    case xpath:
                        $(By.xpath(LocatorString)).click();
                        break;
                    case id:
                        $(By.id(LocatorString)).click();
                        break;
                    case css:
                        $(By.cssSelector(LocatorString)).click();
                        break;
                    case name:
                        $(By.name(LocatorString)).click();
                        break;
                    case className:
                        $(By.className(LocatorString)).click();
                        break;
                    case linkText:
                        $(By.linkText(LocatorString)).click();
                        break;
                }
            } catch (StaleElementReferenceException | NoSuchElementException e) {
                System.out.println("A stale element reference was detected for the element : " + LocatorString);
                if (retries < MAX_STALE_ELEMENT_RETRIES) {
                    System.out.println("The ClickElement method was re-run");
                    retries++;
                    continue;
                } else {
                    throw e;
                }
            }
            return result;

        }

    }

    public boolean sendKeysElementBy(Locator Locators, String LocatorString, String value) {
        final int MAX_STALE_ELEMENT_RETRIES = 2;
        int retries = 0;
        if (retries > 0) {
            System.out.println("Retrying again for the " + retries + " time.");
        }
        while (true) {
            try {
                switch (Locators) {
                    case xpath:
                        $(By.xpath(LocatorString)).setValue(value);
                        break;
                    case id:
                        $(By.id(LocatorString)).setValue(value);
                        break;
                    case css:
                        $(By.cssSelector(LocatorString)).setValue(value);
                        break;
                    case name:
                        $(By.name(LocatorString)).setValue(value);
                        break;
                    case className:
                        $(By.className(LocatorString)).setValue(value);
                        break;
                    case linkText:
                        $(By.linkText(LocatorString)).setValue(value);
                        break;
                }
            } catch (StaleElementReferenceException | NoSuchElementException e) {
                System.out.println("A stale element reference was detected for the element : " + LocatorString);
                if (retries < MAX_STALE_ELEMENT_RETRIES) {
                    System.out.println("The ClickElement method was re-run");
                    retries++;
                    continue;
                } else {
                    throw e;
                }
            }
            return result;

        }

    }


//    public void verifyingXhrResponse() {
//        DevTools devTools = ((ChromeDriver)driver).getDevTools();
//        devTools.createSession();
//        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
//        List<String> capturedURLs = new ArrayList<>();
//        devTools.addListener(Network.requestWillBeSent(), requestConsumer -> {
//            Request request = requestConsumer.getRequest();
//            capturedURLs.add(request.getUrl());
//            logger.info(capturedURLs.toString());
//            Assert.assertTrue(capturedURLs.contains("https://stage6.evyy.net/xc/"));
//        });
//        driver = new ChromeDriver();
//        driver.get(url);
//    }

}
