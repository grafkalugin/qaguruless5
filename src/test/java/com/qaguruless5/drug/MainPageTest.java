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
        drugPage.openDrug();
        drugPage.failedDrug();
        drugPage.checkDrug();
    }

    @Test
    public void drugndropPassed(){
        drugPage.openDrug();
        drugPage.succesDrug();
        drugPage.checkDrug();
    }

}
