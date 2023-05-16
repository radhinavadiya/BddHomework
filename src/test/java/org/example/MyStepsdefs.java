package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepsdefs {
    HomePage homePage = new HomePage();
    RegistrationResult registerResult = new RegistrationResult();
    RegistrationDetails registrationDetails = new RegistrationDetails();
    LogIn logIn = new LogIn();
    BuildYourComputerPage buildYourComputerPage = new BuildYourComputerPage();
    RefferalMailSentPage refferalMailSentPage = new RefferalMailSentPage();

    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnRegisterButton();
    }


    @When("I enter required registraion details")
    public void i_enter_required_registraion_details() {

        registrationDetails.enterRegistrationDetails();
    }

    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {
        registerResult.registerSuccess();

    }

    @Given("I am on homepage")
    public void i_am_on_homepage() {
       homePage.clickOnRegisterButton();
       registrationDetails.enterRegistrationDetails();
       logIn.login();
    }
    @When("I select a build your own computer")
    public void i_select_a_build_your_own_computer() {
        homePage.clickonComputer();

    }
    @When("I select mail")
    public void i_select_mail() {
        buildYourComputerPage.buildOwnComputer();


    }
    @Then("I should be able to refer to friend")
    public void i_should_be_able_to_refer_to_friend() {
        refferalMailSentPage.productRefferedMailResult();
    }
}