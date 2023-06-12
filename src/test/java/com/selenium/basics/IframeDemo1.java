package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IframeDemo1 {
    public static void main(String[] args) {
        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://www.rediff.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5000));

        //iframe tag - switchTo().frame()
        //driver.switchTo().frame("moneyiframe");

        //driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='moneyiframe']")));

        String nseindex = driver.findElement(By.id("nseindex")).getText();
        System.out.println(nseindex);
        driver.close();

    }
}
