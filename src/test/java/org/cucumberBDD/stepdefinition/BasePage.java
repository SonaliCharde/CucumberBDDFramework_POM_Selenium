package org.cucumberBDD.stepdefinition;

import io.cucumber.java.en.Given;
import org.cucumberBDD.pages.Homepage;

import static org.cucumberBDD.pages.Homepage.clickSigninLink;
import static org.cucumberBDD.pages.Homepage.click_HamburgerMenu;

public class BasePage  {
    @Given("User navigate to the login page")
    public void user_Navigate_To_LoginPage() throws InterruptedException {
       click_HamburgerMenu();
       clickSigninLink();


    }

}
