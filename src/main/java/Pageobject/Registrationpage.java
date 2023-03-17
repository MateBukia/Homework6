package Pageobject;

import Dataobject.Registrationpage_data;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Registrationpage  {
    public static SelenideElement
                          quickregistration = $(byText("სწრაფი რეგისტრაცია")),
                          name = $(By.id("firstName")),
                          lastname = $(By.id("lastName")),
                          email = $(By.id("email")),
                          password = $(By.id("password")),
                          confirmpassword = $(By.id("confirmPassword")),
                          signup = $(By.id("singup"));
}
