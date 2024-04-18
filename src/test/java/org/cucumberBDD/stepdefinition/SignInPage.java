package org.cucumberBDD.stepdefinition;

import io.cucumber.java.en.When;

import static org.cucumberBDD.pages.SignInPage.*;

public class SignInPage {
@When("User successfully enters the login details")
    public void User_SignIn_Valid_Credentials() throws InterruptedException {

    Username_sendKeys();
    Password_sendKeys();
    LoginButton_click();
}


}
