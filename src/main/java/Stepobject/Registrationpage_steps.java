package Stepobject;

import Pageobject.Registrationpage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

import static Dataobject.Registrationpage_data.*;

public class Registrationpage_steps extends Registrationpage {
    public Registrationpage_steps registrationvisible(){
        quickregistration.shouldBe(Condition.visible, Duration.ofMillis(5000));
        return this;
    }
    public Registrationpage_steps nameinput(){
        name.setValue(myname);
        return this;
    }
    public Registrationpage_steps lastnameinput(){
        lastname.setValue(mylastname);
        return this;
    }
    public Registrationpage_steps emailinput(){
        email.setValue(myemail);
        return this;
    }
    public Registrationpage_steps passwordinput(){
        password.setValue(mypassword);
        return this;
    }
    public Registrationpage_steps confirmpasswordinput(){
        confirmpassword.setValue(myconfirmpassword);
        return this;
    }
}
