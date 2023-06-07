package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWaitDemo {
    public static void main(String[] args) {
        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        //driver.manage().window().maximize();

        //After Selenium 4
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ctl00_ContaceHolder1_txtUa55454545454mNo")));
        System.out.println("Test**********************");

//        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(5))
//                .ignoring(NoSuchElementException.class);

        //driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_txtUamNo")).sendKeys("Test");




    }
}
