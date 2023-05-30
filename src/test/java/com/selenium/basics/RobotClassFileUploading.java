package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.security.Key;

public class RobotClassFileUploading {
    public static void main(String[] args) throws AWTException {

        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();

        //Using Robot class
        WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));

        Actions act = new Actions(driver);
        act.moveToElement(button).click().perform();

        Robot rb = new Robot();
        rb.delay(2000);

        //copy file to clip board
        StringSelection ss = new StringSelection("C:\\Users\\Makhan AutomationHub\\IdeaProjects\\java_with_selenium\\src\\test\\resources\\test_docs\\pom.xml");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //Perform control+V action to paste file
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

    }
}
