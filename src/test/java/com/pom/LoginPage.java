package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    //constructor
    LoginPage(WebDriver localDriver)
    {
        driver = localDriver;
    }

    //Web elements for each function
    By userName = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");


    //create method for each element
    public void enterUserName(String uname)
    {
        driver.findElement(userName).sendKeys(uname);
    }

    public void enterPassword(String pwd)
    {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickLoginBtn()
    {
        driver.findElement(loginButton).click();
    }

}
