package com.pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {

    /**
     * Without page factory(POM)
     * @param args
     */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Create an object for LoginPage class
//        LoginPage loginPage = new LoginPage(driver);
//
//        driver.get("https://www.saucedemo.com/v1/");
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));
//        loginPage.enterUserName("standard_user");
//        loginPage.enterPassword("secret_sauce");
//        loginPage.clickLoginBtn();
//        driver.close();


        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));

        ///Create an object for LoginPageFactory class
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.enterUserName("standard_user");
        loginPageFactory.enterPassword("secret_sauce");
        loginPageFactory.clickLoginBtn();
        driver.quit();
    }
}
