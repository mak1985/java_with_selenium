package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

    public static void main(String[] args) {

        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");

        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();

        //Launch google web page
        driver.get("https://www.google.com/");

        //capture the title of webpage and print
        String title = driver.getTitle();
        System.out.println("Page title: " + title);

        //Capture url of the web page
        System.out.println("URL: " + driver.getCurrentUrl());

        //capture page source
        System.out.println("Page source :" + driver.getPageSource());

        driver.close();
        driver.quit();
    }
}
