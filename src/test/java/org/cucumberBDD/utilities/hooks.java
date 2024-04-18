package org.cucumberBDD.utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.cucumberBDD.utilities.BrowserDriver.driver;

public class hooks {
    public static BrowserDriver driver;
    public static ChromeOptions options;

    @Before
    public void setUp() {
        driver = new BrowserDriver();
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
