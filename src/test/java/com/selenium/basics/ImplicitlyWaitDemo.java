package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitlyWaitDemo {
    public static void main(String[] args) {
        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //ImplicitlyWait
        System.out.println("ImplicitlyWait implemented");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtUamNo']")).sendKeys("9814544541");
        System.out.println("ImplicitlyWait for 1st element");

        driver.findElement(By.xpath("//input[@name='ctl$ContentPlaceHolder1$txtUamN']")).sendKeys("Test purpose only");
        System.out.println("ImplicitlyWait for 2nd element");
        System.out.println("ImplicitlyWait done");
    }
}
