package com.qaguruless5.gittest;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class EnterprisePage {
    public SelenideElement enterpriseContent = $(".enterprise-hero");
    public void checkEnterpriseLoad(){
        enterpriseContent.shouldHave(text("Build like the best"));
    }
}
