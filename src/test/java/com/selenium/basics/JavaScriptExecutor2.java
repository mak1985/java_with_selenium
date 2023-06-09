package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutor2 {
    public static void main(String[] args) {
        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://www.calculator.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4000));

        //To scroll down the web page by pixel
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,500)"); //scroll down

        //scroll till visibility of web element
//        WebElement element = driver.findElement(By.linkText("Due Date Calculator"));
//        js.executeScript("arguments[0].scrollIntoView();", element);
//        element.click();

        //To scroll down the web page at the bottom of the page
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");



    }
}
