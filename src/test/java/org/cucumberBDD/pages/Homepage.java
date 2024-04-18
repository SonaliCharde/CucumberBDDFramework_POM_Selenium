package org.cucumberBDD.pages;

import org.cucumberBDD.utilities.BrowserDriver;
import org.openqa.selenium.By;

import static org.cucumberBDD.utilities.BrowserDriver.driver;

public class Homepage extends BrowserDriver {
    public static String HamburgerMenu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String SigninLink_Xpath = "//*[@id=\"menu\"]/a[2]/li";

    public static void click_HamburgerMenu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(HamburgerMenu_xpath)).click();
    }
    public static void clickSigninLink() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(SigninLink_Xpath)).click();
    }
}
