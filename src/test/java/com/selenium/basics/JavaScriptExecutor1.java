package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1 {
    public static void main(String[] args) throws InterruptedException {
        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Click on any button
//        WebElement element = driver.findElement(By.xpath("//button[text()='Click Me']"));
//        js.executeScript("arguments[0].click();", element);
//        Thread.sleep(400);

        //zoom web page
        //js.executeScript("document.body.style.zoom='50%'");

        //draw border arround web element
        //js.executeScript("arguments[0].style.border='3px solid red';",driver.findElement(By.xpath("//button[text()='Click Me']")));

//        //scroll vertically scroll-down till the end of webpage
//        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//
//        //scroll vertically scroll-up
//        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//
        //navigate to different url:
        js.executeScript("window.location='https://www.tutorialspoint.com/index.htm'");



        //scroll to midle with js executor
        WebElement ele = driver.findElement(By.linkText("View more"));
        ele.click();
        js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'})", ele);




    }
}
