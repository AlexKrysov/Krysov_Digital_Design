package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class CheckPage {
    private SelenideElement
            conditionsQA = $(".modal-content"),
            buttonOrange = $(".btn-orange.btn-wide",1),
            questionsQA = $(".it-university-faq-items");
    private String questionsText = "Как поступить в IT-университет?";
    private String questionsText2 = "Чтобы поступить в IT-университет, необходимо заполнить заявку на сайте. Наши сотрудники обязательно проинформируют всех кандидатов.";

    public void checkConditionsQA() {
        step("Проверка названия вакансии", () -> {
            conditionsQA.shouldHave(text("Стажер - инженер по тестированию"));
        });
    }
    public void checkButton() {
        step("Проверка кнопки", () -> {
            buttonOrange.shouldHave(text("Отправить"));
        });
    }
    public void checkQuestionsQA(String questionsText, String questionsText2) {
        step("Проверка поля с вопросами", () -> {
            questionsQA.shouldHave(text(questionsText));
            questionsQA.shouldHave(text(questionsText2));
        });
    }
}
