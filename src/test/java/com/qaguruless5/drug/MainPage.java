package com.qaguruless5.drug;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    public SelenideElement colomnA = $("#column-a");
    public SelenideElement colomnB = $("#column-b");
    public void openDrug(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
    }
    public void failedDrug(){
        //actions().dragAndDrop(gh.colomnA, gh.colomnB); //визуально никакие действия не наблюдаются, фигуры местами не меняются, ошибка при перемещении не возникает
        //actions().dragAndDropBy(gh.colomnA, 250,0);//визуально никакие действия не наблюдаются, фигуры местами не меняются, ошибка при перемещении не возникает
        //actions().clickAndHold(gh.colomnA).moveByOffset(250, 0).release().build().perform(); // переносимая фигура прилипает к оригинальному крусору
        actions().clickAndHold(colomnA).moveToElement(colomnB).release().build().perform(); // переносимая фигура прилипает к оригинальному крусору
    }
    public void succesDrug(){
        colomnA.dragAndDropTo(colomnB);// работает
    }
    public void checkDrug(){
        colomnA.shouldHave(text("B"));
        sleep(1000); // слип для визуального контроля теста
    }
}
