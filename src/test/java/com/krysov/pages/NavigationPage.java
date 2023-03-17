package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class NavigationPage {

    private SelenideElement
            careerMenu = $("#dd-menu").$(byText("Карьера")),
            iTUniversity = $("#dd-menu").$(byText("IT-университет")),
            internship = $(".dd-menu-dropdown-career").$(byText("Стажировка")),
            internshipQA = $("[data-toggle='modal']", 4),
            schoolQA = $(".item-top",7);

    public void stepToCareerMenu() {
        step("Клик на 'карьера'", () -> {
            careerMenu.click();
        });
    }

    public void stepToInternship() {
        step("Переход на страницу стажировки", () -> {
            internship.click();
        });
    }

    public void stepToInternshipQA() {
        step("Клик на 'Стажер - инженер по тестированию'", () -> {
            internshipQA.click();
        });
    }

    public void stepToITUniversity() {
        step("Переход на страницу 'IT-университет'", () -> {
            iTUniversity.click();
        });
    }
    public void stepToSchoolQA() {
        step("Переход на страницу 'Школа тестировщика'", () -> {
            schoolQA.click();
        });
    }
}
