package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IframeDemo2 {
    public static void main(String[] args) throws InterruptedException {
        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        driver.manage().window().maximize();


        /**
         * 1st approach
         */
        //switch to first frame using index
//        driver.switchTo().frame(0);
//        //find web element
//        driver.findElement(By.linkText("org.openqa.selenium")).click();
//        Thread.sleep(5000);


        /**
         * 2nd approach
         */
        //switch to frame using webelement
        WebElement iframeEle = driver.findElement(By.xpath("//iframe[@name='packageListFrame']"));
        driver.switchTo().frame(iframeEle);

        driver.findElement(By.linkText("org.openqa.selenium")).click();
        Thread.sleep(5000);

        //switch to main frame(page)
        driver.switchTo().defaultContent(); //main page/window

        //switch to 2nd iframe
        driver.switchTo().frame(1);
        driver.findElement(By.linkText("Alert")).click();

        Thread.sleep(5000);

        //driver.close();

        //find & print total no. of iframes on web page
        driver.switchTo().defaultContent(); //Return to main page
        int noOfIframes = driver.findElements(By.tagName("iframe")).size();
        System.out.println("No of iframes : " + noOfIframes);
        driver.quit();

    }
}
