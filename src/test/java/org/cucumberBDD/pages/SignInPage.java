package org.cucumberBDD.pages;

import org.openqa.selenium.By;

import static org.cucumberBDD.utilities.BrowserDriver.driver;

public class SignInPage {

    public static String Username_xpath = "//*[@id=\"usr\"]";
    public static String Password_xpath = "//*[@id=\"pwd\"]";
    public static String LoginButton_xpath = "//*[@class=\"btn btn-info\"]";

    public static String RegistrationButton_xpath = "//*[@id=\"NewRegistration\"]";

    public static void Username_sendKeys() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(Username_xpath)).sendKeys("Sonali");
    }
    public static void Password_sendKeys() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(Password_xpath)).sendKeys("Password");
    }
    public static void LoginButton_click() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(LoginButton_xpath)).click();
    }
    public static void RegistrationButton_click() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath(RegistrationButton_xpath)).click();
    }
}
