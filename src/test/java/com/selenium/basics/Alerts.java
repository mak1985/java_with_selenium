package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[@id='alertButton']")).click();
        Thread.sleep(4000);
        //switch to alert window and accept the alert
        driver.switchTo().alert().accept(); //OOK button is clicked

        driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
        Thread.sleep(4000);
        //switch to alert window and accept the alert
        driver.switchTo().alert().dismiss(); //Cancel button is clicked

        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
        Thread.sleep(4000);
        //switch to alert window and accept the alert
        driver.switchTo().alert().sendKeys("Test purpose only"); //input by the user
        driver.switchTo().alert().accept(); //Click to OK button

    }
}
