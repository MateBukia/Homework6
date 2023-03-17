import Utils.Chromerunner;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import Stepobject.Homepage_steps;
import Stepobject.Registrationpage_steps;
import Pageobject.Registrationpage;


import java.time.Duration;

import static Dataobject.Registrationpage_data.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Eliteelectronics_test extends Chromerunner {
    Homepage_steps Homepage_steps = new Homepage_steps();
    Registrationpage Registrationpage = new Registrationpage();
    Registrationpage_steps Registrationpage_steps = new Registrationpage_steps();
    @Test
    public void Satesto(){
        Homepage_steps.Cookiesclose();
        Homepage_steps.registrationclick();
        Registrationpage_steps.registrationvisible();
        Registrationpage_steps.nameinput();
        Assert.assertEquals(Registrationpage.name.getValue(),myname,"Name check");
        Registrationpage_steps.lastnameinput();
        Assert.assertEquals(Registrationpage.lastname.getValue(),mylastname,"Lastname check");
        Registrationpage_steps.emailinput();
        Assert.assertEquals(Registrationpage.email.getValue(),myemail,"Email check");
        Registrationpage_steps.passwordinput();
        Assert.assertEquals(Registrationpage.password.getValue(),mypassword,"Password check");
        Registrationpage_steps.confirmpasswordinput();
        Assert.assertEquals(Registrationpage.confirmpassword.getValue(),myconfirmpassword,"Confirm password check");
        Assert.assertTrue(Registrationpage.signup.isEnabled(),"Signup button check");
    }
}

