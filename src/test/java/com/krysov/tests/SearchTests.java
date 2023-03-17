package com.krysov.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SearchTests extends TestBase {


    @DisplayName("Проверка названия вакансии в разделе 'Стажировка'")
    @Owner("Krysov")
    @Test
    void internshipQATest() {
        openDigitalDesign.openDigitalDesignPage();
        navigationPage.stepToCareerMenu();
        navigationPage.stepToInternship();
        navigationPage.stepToInternshipQA();
        checkPage.checkConditionsQA();
    }

    @DisplayName("Проверка заполнения формы")
    @Owner("Krysov")
    @Test
    void checkForm() {
        openDigitalDesign.openDigitalDesignPage();
        navigationPage.stepToCareerMenu();
        navigationPage.stepToInternship();
        navigationPage.stepToInternshipQA();
        userDataPage.setName();
        userDataPage.setLastName();
        userDataPage.setEmail();
        userDataPage.setPhone();
        userDataPage.setVacancy();
        userDataPage.setComment();
        checkPage.checkButton();
    }

    @DisplayName("Проверка раздела 'Часто задаваемые вопросы', на странице 'IT-университет'")
    @Owner("Krysov")
    @CsvSource({
            "Какие перспективы после окончания?, Как поступить в IT-университет?",
            "Как часто проходит обучение?, Студенты из каких вузов могут обучаться?",
            "Есть ли программы в других городах?, Почему я не могу подать заявку на курс?",
    })
    @ParameterizedTest(name = "Проверка наличия раздела {0} и раздела: {1}")
    void CheckQuestionsTest(String questionsText, String questionsText2) {
        openDigitalDesign.openDigitalDesignPage();
        navigationPage.stepToITUniversity();
        navigationPage.stepToSchoolQA();
        checkPage.checkQuestionsQA(questionsText, questionsText2);
    }
}
