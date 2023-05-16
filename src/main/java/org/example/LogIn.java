package org.example;

import org.openqa.selenium.By;

public class LogIn extends Utils {
    LoadProp loadProp = new LoadProp();

    public void login() {
        clickOnElement(By.className("ico-login"));
        //enter email
        sendText(By.id("Email"), loadProp.getProperty("email"));
        //enter password
        sendText(By.id("Password"), loadProp.getProperty("password"));
        //click on login button
        clickOnElement(By.xpath("//button[@class=\"button-1 login-button\"]"));
    }
}

