package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.Timestamp;


public class Hooks {
    DriverManager driver = new DriverManager();
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
       // return timestamp.getTime();
    @Before
    public void setup() {
        driver.openBrowser();
    }
    @After
    public void tearDOwn(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) BasePage.driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot" + timestamp+scenario);
        }
        driver.closeBrowser();

    }
}
