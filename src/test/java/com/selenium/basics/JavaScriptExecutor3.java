package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutor3 {

    public static void main(String[] args) {
    //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4000));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.cssSelector("ui-slider-handle ui-corner-all ui-state-default"));
        js.executeScript("arguments[0].scrollLeft = arguments[0].offsetWidth", element);

    }
}
