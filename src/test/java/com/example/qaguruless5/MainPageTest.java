package com.example.qaguruless5;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    MainPage gh = new MainPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @Test
    public void search() {
        open("https://github.com/");
        gh.solutionsButton.hover();
        gh.enterpriseButton.click();
        gh.enterpriseContent.shouldHave(text("Build like the best"));
    }
    @Test
    public void drugndropFirst(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().dragAndDrop(gh.colomnA, gh.colomnB); //не работает
        gh.colomnA.shouldHave(text("B"));
        sleep(1000); // слип для визуального контроля теста// слип для визуального контроля теста
    }

    @Test
    public void drugndropSecond(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        gh.colomnA.dragAndDropTo(gh.colomnB);// работает
        gh.colomnA.shouldHave(text("B"));
        sleep(1000); // слип для визуального контроля теста// слип для визуального контроля теста
    }

}
