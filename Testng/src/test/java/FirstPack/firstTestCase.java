package FirstPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class firstTestCase {
 WebDriver driver;
 @BeforeTest

 public void testSetUp() {
  driver = new ChromeDriver();
 }
 
@Test
 public void openGoogleAccount(){
  driver.get("https://www.google.co.in/");

}
}
