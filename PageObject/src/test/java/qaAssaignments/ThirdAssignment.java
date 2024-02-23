package qaAssaignments;

import org.example.ConfigManager;
import org.example.Page;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ThirdAssignment {

    static String flipCartUrl = ConfigManager.getProperty("flipCartUri");


    @Before
    public void testSetUp() {
        Page.SetUp("chrome");
    }

    @Test
    public void validateTheLinksOnFlipCart() {
        Page.driver.get(flipCartUrl);
        List<WebElement> webLinks = Page.driver.findElements(By.tagName("a"));
        for (WebElement link : webLinks) {
            System.out.println(link.getSize());
            System.out.println(link.getText() + " - " + link.getAttribute("href"));

        }

    }

    @After
    public void tearDown() {
        Page.closeDriver();
    }
}
