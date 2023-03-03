package com.qaguruless5.drug;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest {
    MainPage drugPage = new MainPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @Test
    public void drugndropFailed(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        //actions().dragAndDrop(gh.colomnA, gh.colomnB); //визуально никакие действия не наблюдаются, фигуры местами не меняются, ошибка при перемещении не возникает
        //actions().dragAndDropBy(gh.colomnA, 250,0);//визуально никакие действия не наблюдаются, фигуры местами не меняются, ошибка при перемещении не возникает
        //actions().clickAndHold(gh.colomnA).moveByOffset(250, 0).release().build().perform(); // переносимая фигура прилипает к оригинальному крусору
        actions().clickAndHold(drugPage.colomnA).moveToElement(drugPage.colomnB).release().build().perform(); // переносимая фигура прилипает к оригинальному крусору
        drugPage.colomnA.shouldHave(text("B"));
        sleep(1000); // слип для визуального контроля теста
    }

    @Test
    public void drugndropPassed(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        drugPage.colomnA.dragAndDropTo(drugPage.colomnB);// работает
        drugPage.colomnA.shouldHave(text("B"));
        sleep(1000); // слип для визуального контроля теста
    }

}
