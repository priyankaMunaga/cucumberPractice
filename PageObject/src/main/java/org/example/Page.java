package org.example;

import static com.codeborne.selenide.Selenide.open;

public class Page {
    static final String BASE_URL = ConfigManager.getProperty("Base_Url");

    public static void navigateToParaBank() {
        open(BASE_URL);
    }


}
