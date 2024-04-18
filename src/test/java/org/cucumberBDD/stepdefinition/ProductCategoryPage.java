package org.cucumberBDD.stepdefinition;

import io.cucumber.java.en.Then;

import static org.cucumberBDD.pages.ProductCategory.visibility_productCategories;

public class ProductCategoryPage {
    @Then("User should able to view the product category page")
    public void visibility_categories(){
        visibility_productCategories();

    }
}
