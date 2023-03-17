package com.krysov.pages;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class OpenDigitalDesignPage {

    private final String CompanyUrl = "https://digdes.ru/";

    public void openDigitalDesignPage() {
        step("Открыть страницу", () ->
                open(CompanyUrl));
    }
}
