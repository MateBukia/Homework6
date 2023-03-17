package Pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Homepage {
    public static SelenideElement
                           registration = $(byText("რეგისტრაცია")),
                           cookiesclose = $(byText("დახურვა"));
}
