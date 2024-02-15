import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class page {
    static WebDriver driver;

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
}
