package com.krysov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class UserDataPage {

    private SelenideElement
            firstName = $("[name='data[firstname]']", 1),
            lastName = $("[name='data[lastname]']", 1),
            phone = $("[name='data[phone]']", 1),
            email = $("[name='data[email]']", 1),
            vacancy = $("[name='data[vacancy]']", 1),
            comment = $("[name='data[comment]']", 1);

    private String login = "Алексей";
    private String lastNameData = "Крысов";
    private String phoneData = "9609898725";
    private String emailData = "krysov-95@mail.ru";
    private String vacancyData = "qa engineer";
    private String commentData = "Добрый день!";


    public void setName() {
        step("Вводим имя", () -> {
            firstName.setValue(login);
        });
    }
    public void setLastName() {
        step("Вводим фамилию", () -> {
            lastName.setValue(lastNameData);
        });
    }
    public void setPhone() {
        step("Вводим номер телефона", () -> {
            phone.setValue(phoneData);
        });
    }
    public void setVacancy() {
        step("Вводим Интересующую вакансию", () -> {
            vacancy.setValue(vacancyData);
        });
    }
    public void setEmail() {
        step("Вводим почту", () -> {
            email.setValue(emailData);
        });
    }
    public void setComment() {
        step("Передаем приветы=)", () -> {
            comment.setValue(commentData);
        });
    }
}
