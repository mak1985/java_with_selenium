package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {
    public static void main(String[] args) throws InterruptedException {
        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        String actualToolTip = driver.findElement(By.xpath("//div[@jsname='F7uqIe']")).getAttribute("aria-label");

        String expectedTooTip = "Search by voice";

        if(actualToolTip.equals(expectedTooTip))
        {
            System.out.println("Test case passed");
        }
        else
        {
            System.out.println("Test case failed");
        }
    }
}
