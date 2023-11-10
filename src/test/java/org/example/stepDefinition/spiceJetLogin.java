package org.example.stepDefinition;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class spiceJetLogin {
    public static void main(String[] args) {
     open("https://www.spicejet.com/");
   SelenideElement element= $(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']"));
   element.click();
     sleep(7000);
sleep(7000);
String exceptValue=element.getText();
       System.out.println("my husband hero "+element.getText());
       $(By.xpath("//div[@class='r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-1i6wzkk r-lrvibr r-184en5c css-1dbjc4n']//*[name()='svg']//*[name()='g' and contains(@fill,'none')]//*[name()='circle' and contains(@cx,'24.5')]")).click();
       sleep(5000);
        $(By.xpath("css-76zvg2.r-jwli3a r-ubezar r-16dba41")).click();
    sleep(2000);
    }
}
