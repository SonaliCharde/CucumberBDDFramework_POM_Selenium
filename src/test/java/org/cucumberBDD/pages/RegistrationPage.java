package org.cucumberBDD.pages;

import org.cucumberBDD.utilities.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class RegistrationPage extends BrowserDriver {
    public static String RegistrationPageText_xpath = "//*[text()='User Registration Page']";

    public static void visibilityRegistrationHeading(){
       String GetRegistrationHeading= driver.findElement(By.xpath(RegistrationPageText_xpath)).getText();
        Assert.assertEquals(GetRegistrationHeading,"User Registration Page");


    }
}
