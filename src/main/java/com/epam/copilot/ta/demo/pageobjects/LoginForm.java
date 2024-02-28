package com.epam.copilot.ta.demo.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginForm {

    @FindBy(css = ".dropdown.uui-profile-menu")
    private WebElement loginDropdown;
    @FindBy(id = "name")
    private WebElement loginInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement submitButton;

    public WebElement getLoginDropdown() {
        return loginDropdown;
    }
    public void enterCredentials(String username, String password) {
        loginInput.sendKeys(username);
        passwordInput.sendKeys(password);
    }

    public void submit() {
        submitButton.click();
    }
}
