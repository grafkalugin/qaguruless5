package com.qaguruless5.gitTest;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    public SelenideElement solutionsButton = $$(".HeaderMenu-link").findBy(text("Solutions"));
    public SelenideElement enterpriseButton = $$(".HeaderMenu-dropdown-link").findBy(text("Enterprise"));
}