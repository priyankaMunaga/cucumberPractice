import org.example.ConfigManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class firstAssignment {
    public static String qaAutoUrl = ConfigManager.getProperty("qaUri");
    public static String fbUrl = ConfigManager.getProperty("fbUri");
    @Before
    public void testSetUp() {
        page.SetUp("firefox");
    }
    @Test
    public void validateTheFirstAssignment() {
        page.navigateToHomePage(qaAutoUrl);
        String currentPageTitle = page.getPageTitle();
        System.out.println("current page title :" + currentPageTitle);
        Assert.assertEquals(currentPageTitle, "QA Automation Tools Trainings and Tutorials | QA Tech Hub");
        page.navigateToFbPage(fbUrl);
        page.navigateToBack();
        String currentPageUrl = page.getCurrentUrl();
        System.out.println("current url :" + currentPageUrl);
        Assert.assertEquals(currentPageUrl, qaAutoUrl);
    }
    @After
    public void tearDown() {
        page.closeDriver();
    }

}