package com.tesng.session;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNGSample {

    @Test
    public void verifyPageTitle()
    {
        //Launch chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Open url
        driver.get("https://www.google.com");

        String expectedTitle = "Google1";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle );

    }
}
