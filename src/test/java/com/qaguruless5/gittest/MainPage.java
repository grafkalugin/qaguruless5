package com.qaguruless5.gittest;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    public SelenideElement solutionsButton = $$(".HeaderMenu-link").findBy(text("Solutions"));
    public SelenideElement enterpriseButton = $$(".HeaderMenu-dropdown-link").findBy(text("Enterprise"));
    public void openMain(){
        open("https://github.com/");
    }
    public void goToEnterprise(){
        solutionsButton.hover();
        enterpriseButton.click();
    }
}
