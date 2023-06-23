package com.tesng.session;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo {

    @Test
    public void testMethod()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println("Verify title of webpage");

        //Hard assertion code
        String expectedTitle = "Automation Testing Practice1";
        String actualTitle = driver.getTitle();
        //Assert.assertEquals(expectedTitle, actualTitle, "custom message");
        System.out.println("Test execution done");

        System.out.println("Verifying presence of wikipedia icon");
        WebElement icon = driver.findElement(By.className("wikipedia-search-wiki-link"));
        Assert.assertTrue(icon.isDisplayed());


        //Soft assertion code
        SoftAssert softVerify = new SoftAssert();
        softVerify.assertEquals(expectedTitle, actualTitle,"");
        System.out.println("Test execution done - soft assertion");
        driver.close();
        //report all failure messages/exceptions
        softVerify.assertAll();


    }
}
