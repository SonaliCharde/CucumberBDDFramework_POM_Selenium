package org.cucumberBDD.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/org/cucumberBDD/features",
        glue ={"src/test/java/org/cucumberBDD/stepdefinition","src/test/java/org/cucumberBDD/utilities"},
        plugin = {"pretty","html:target/cucumber-html-report", "json:cucumber.json"}
)

public class TestRunner {

}
