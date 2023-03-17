package Stepobject;

import Pageobject.Homepage;

public class Homepage_steps extends Homepage {
    public Homepage_steps Cookiesclose(){
        cookiesclose.click();
        return this;
    }
    public Homepage_steps registrationclick(){
        registration.click();
        return this;
    }
}
