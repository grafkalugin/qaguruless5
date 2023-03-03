package com.qaguruless5.gittest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class EnterpriseTest {
    MainPage gh = new MainPage();
    EnterprisePage ep = new EnterprisePage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
    @Test
    public void enterprise() {
        open("https://github.com/");
        gh.solutionsButton.hover();
        gh.enterpriseButton.click();
        ep.enterpriseContent.shouldHave(text("Build like the best"));
    }
}
