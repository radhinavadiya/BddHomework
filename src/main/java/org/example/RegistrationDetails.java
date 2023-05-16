package org.example;

import org.openqa.selenium.By;

import java.time.Duration;

public class RegistrationDetails extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _email = By.name("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");

    public void enterRegistrationDetails() {
        //Type FirstName");
        sendText(_firstName, loadProp.getProperty("firstName"));
        //Type last name
        sendText(_lastName, loadProp.getProperty("lastName"));
        //Add birth date
        index(By.xpath("//select[@name='DateOfBirthDay']"), 2);
        text(By.xpath("//select[@name='DateOfBirthMonth']"), "June");
        value(By.xpath("//select[@name='DateOfBirthYear']"), "1915");
        //type mail
        sendText(_email, loadProp.getProperty("email"));
        //enter password
        sendText(_password, loadProp.getProperty("password"));
        //confir your password
        sendText(_confirmPassword, loadProp.getProperty("confirmPassword"));
        //click on register button
        clickOnElement(By.id("register-button"));
        // wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
}
