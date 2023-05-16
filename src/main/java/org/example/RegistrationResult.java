package org.example;

import org.openqa.selenium.By;

import org.testng.Assert;

public class RegistrationResult extends Utils {
    public void registerSuccess() {
        String message = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        //print message
        System.out.println(message);
        //Assertion
        Assert.assertEquals( message, "Registered successful");

    }
}

