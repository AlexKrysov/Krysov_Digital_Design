package com.krysov.tests;

import com.codeborne.selenide.Configuration;
import com.krysov.pages.CheckPage;
import com.krysov.pages.NavigationPage;
import com.krysov.pages.OpenDigitalDesignPage;
import com.krysov.pages.UserDataPage;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    OpenDigitalDesignPage openDigitalDesign = new OpenDigitalDesignPage();
    NavigationPage navigationPage = new NavigationPage();
    CheckPage checkPage = new CheckPage();
    UserDataPage userDataPage = new UserDataPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }
}
