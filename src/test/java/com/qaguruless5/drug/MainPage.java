package com.qaguruless5.drug;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    public SelenideElement colomnA = $("#column-a");
    public SelenideElement colomnB = $("#column-b");
}
