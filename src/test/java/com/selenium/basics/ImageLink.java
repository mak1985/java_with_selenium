package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLink {
    public static void main(String[] args) {
        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://www.opencart.com/index.php?route=common/home");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).click();

        if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
        {
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }

    }
}
