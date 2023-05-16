package org.example;
import org.openqa.selenium.By;


import org.openqa.selenium.support.ui.Select;
public class Utils extends BasePage {
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static void sendText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static void index(By by, int num) {
       Select select = new Select(driver.findElement(by));
       select.selectByIndex(num);
    }

    public static  void text(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static void value(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);

    }
}