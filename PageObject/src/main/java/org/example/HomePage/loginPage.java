package org.example.HomePage;

import org.example.ConfigManager;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class loginPage {



    public static void signInWithCredentials(String username, String password){
        $x("").setValue(username);
        $x("").setValue(password);
    }


}
