package com.tesng.session;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParallelTestDemo1 {
    WebDriver driver;

    @Test(priority = -1)
    public void verifyTitle(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
        driver.quit();
    }

    @Test
    public void verifyLogo(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement logo = driver.findElement(By.xpath("//div[@class='login_logo']"));
        Assert.assertTrue(logo.isDisplayed());
        driver.quit();
    }
    @Test(priority = 1)
    public void verifyFireFox()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
    }
}
