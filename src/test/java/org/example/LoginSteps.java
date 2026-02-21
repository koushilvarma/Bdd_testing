package org.example;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class LoginSteps {

    private boolean onLoginPage;
    private boolean loginSuccessful;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("User navigates to login page");
        onLoginPage = true;
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        if (onLoginPage) {
            System.out.println("User enters valid credentials");
            loginSuccessful = true; // simulate successful login
        }
    }

    @Then("user should be redirected to home page")
    public void user_should_be_redirected_to_home_page() {
        System.out.println("User is redirected to home page");
        assertTrue(loginSuccessful, "Login should be successful");
    }
}
