package qaAssaignments;

import org.example.ConfigManager;
import org.example.Page;
import org.example.fbPage.createFaceBookAccountPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class secondAssignment {


    static String fbUrl= ConfigManager.getProperty("fbUri");

    @Before
    public void testSetUp(){
        Page.SetUp("chrome");

    }
    @Test
    public void validateFacebook(){
        Page.navigateToFbPage(fbUrl);
        WebElement fb= Page.driver.findElement(By.xpath("//img[@alt='Facebook']"));
        Assert.assertTrue(fb.isDisplayed());
        createFaceBookAccountPage.createNewFbAccount("vishnu","kode", "vk@gmail.com", "@K1llsh33p");
    }


}