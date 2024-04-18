package org.cucumberBDD.pages;

import org.cucumberBDD.utilities.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductCategory extends BrowserDriver {
    public static String productsHeadings_xpath = "//*[@id=\"ShoeType\"]";

    public static void visibility_productCategories(){
        List<WebElement> categories = driver.findElements(By.xpath(productsHeadings_xpath));
        for (WebElement ProductCategories : categories){
            ProductCategories.isDisplayed();
            ProductCategories.getText();
        }



    }
}
