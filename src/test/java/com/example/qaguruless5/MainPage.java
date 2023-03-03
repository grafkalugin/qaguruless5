package com.example.qaguruless5;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    public SelenideElement solutionsButton = $$(".HeaderMenu-link").findBy(text("Solutions"));
    public SelenideElement enterpriseButton = $$(".HeaderMenu-dropdown-link").findBy(text("Enterprise"));
    public SelenideElement enterpriseContent = $(".enterprise-hero");
    public SelenideElement colomnA = $("#column-a");
    public SelenideElement colomnB = $("#column-b");
}
