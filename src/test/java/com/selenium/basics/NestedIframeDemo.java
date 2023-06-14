package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedIframeDemo {
    public static void main(String[] args) {

        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        driver.manage().window().maximize();

        driver.switchTo().frame("frame1"); //parent/outer frame
        driver.switchTo().frame("frame3"); //child/inner frame

        //find web element input box
        driver.findElement(By.id("a")).click();

        //switch to parent frame
        driver.switchTo().parentFrame();

        //find webelement for Topic input box
        driver.findElement(By.tagName("input")).sendKeys("Test123");

        //switch to default contain/main page
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");

        //find web element for frame2 animal dropdown
        WebElement dropdown = driver.findElement(By.id("animals"));
        Select dd = new Select(dropdown);
        dd.selectByVisibleText("Big Baby Cat");


    }
}
