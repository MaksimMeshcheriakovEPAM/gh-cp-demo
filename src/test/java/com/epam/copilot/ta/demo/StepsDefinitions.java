package com.epam.copilot.ta.demo;

import com.epam.copilot.ta.demo.pageobjects.LoginForm;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class StepsDefinitions {

    private WebDriver driver;
    private LoginForm loginForm;

    @Given("User is on Home Page")
    public void user_is_on_home_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginForm = PageFactory.initElements(driver, LoginForm.class);
        //driver.get("https://jdi-testing.github.io/jdi-light/index.html"); // replace with your website URL
    }

    @When("User navigates to Login Page")
    public void user_navigates_to_login_page() {
        driver.get("https://jdi-testing.github.io/jdi-light/index.html"); // replace with your login page URL

    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        loginForm.getLoginDropdown().click();
        loginForm.enterCredentials("Roman", "Jdi1234"); // replace with valid credentials
        loginForm.submit();
    }

    @Then("Message displayed Login Successfully")
    public void message_displayed_login_successfully() {
        // Here you should add the code to verify that the login was successful
        // This will depend on how your application displays this information
    }
}
