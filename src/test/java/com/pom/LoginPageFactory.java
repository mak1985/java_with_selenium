package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
    WebDriver driver;

    LoginPageFactory(WebDriver local)
    {
        driver = local;
        PageFactory.initElements(driver, this);
    }

    //Store all the web elements
    @FindBy(id = "user-name") WebElement username;
    @FindBy(id = "password") WebElement password;
    @FindBy(id = "login-button") WebElement loginBtn;

    //create method for each element
    public void enterUserName(String uname)
    {
        username.sendKeys(uname);
    }

    public void enterPassword(String pwd)
    {
        password.sendKeys(pwd);
    }

    public void clickLoginBtn()
    {
        loginBtn.click();
    }

}
