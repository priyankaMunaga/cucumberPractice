package qaAssaignments;

import org.example.ConfigManager;
import org.example.Page;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class firstAssignment {
    Page page= new Page();
    public static String qaAutoUrl = ConfigManager.getProperty("qaUri");
    public static String fbUrl = ConfigManager.getProperty("fbUri");
    @Before
    public void testSetUp() {
        Page.SetUp("firefox");
    }
    @Test
    public void validateTheFirstAssignment() {
        Page.navigateToHomePage(qaAutoUrl);
        String currentPageTitle = Page.getPageTitle();
        System.out.println("current page title :" + currentPageTitle);
        Assert.assertEquals(currentPageTitle, "QA Automation Tools Trainings and Tutorials | QA Tech Hub");
        Page.navigateToFbPage(fbUrl);
        Page.navigateToBack();
        String currentPageUrl = Page.getCurrentUrl();
        System.out.println("current url :" + currentPageUrl);
        Assert.assertEquals(currentPageUrl, qaAutoUrl);
    }
    @After
    public void tearDown() {
        Page.closeDriver();
    }

}