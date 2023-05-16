package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    By _registerButton = By.className("ico-register");
    public void clickOnRegisterButton() {
        clickOnElement(_registerButton);
    }
    public void clickonComputer() {
        //CLICK ON buld your comuter
        clickOnElement(By.xpath("//*[text()='Build your own computer']"));


    }
}


