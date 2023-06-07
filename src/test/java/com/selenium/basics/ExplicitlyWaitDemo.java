package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitlyWaitDemo {
    public static void main(String[] args) {
        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        //driver.manage().window().maximize();

        //ExplicitlyWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='ctl00$ntPlaceHolder1$txtUamNo']"))).sendKeys("Test purpose only");



//        driver.findElement(By.xpath("//input[@name='ctl$ContentPlaceHolder1$txtUamN']")).sendKeys("Test purpose only");
//        System.out.println("ImplicitlyWait for 2nd element");
//        System.out.println("ImplicitlyWait done");
    }
}
