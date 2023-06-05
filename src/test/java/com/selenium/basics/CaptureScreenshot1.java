package com.selenium.basics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshot1 {
    public static void main(String[] args) throws IOException {
        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0");
        driver.manage().window().maximize();

        //capture full page screenshot
        //step1: convert webdriver object to TakesScreenshot interface
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        //Step2: Call getScreenshotAs() method to create image file
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\Makhan AutomationHub\\IdeaProjects\\java_with_selenium\\src\\test\\resources\\test_docs\\testResult.png");
        //Step3: Copy image file to destination
        FileUtils.copyFile(src, destination);


        //Capture section of a webpage
        WebElement section = driver.findElement(By.xpath("//input[@placeholder='Search for groups, artifacts, categories']"));
        section.sendKeys("Apache Commons IO");
        File src1 = section.getScreenshotAs(OutputType.FILE);
        File destination1 = new File("C:\\Users\\Makhan AutomationHub\\IdeaProjects\\java_with_selenium\\src\\test\\resources\\test_docs\\testResult1.png");
        FileUtils.copyFile(src1, destination1);
        driver.quit();

    }
}
