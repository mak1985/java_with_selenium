package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckHyperlinks {
    public static void main(String[] args) {
        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://www.calculator.net/");

        driver.manage().window().maximize();

        //Count total numbers of hyperlinks on web page
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        System.out.println("Total links on webpage: " + linkElements.size());//55

        //print total numbers of hyperlinks on webpage
        for(WebElement el:linkElements)
        {
            System.out.println(el.getText()); //fetch the value
        }
        driver.quit();//Entire sessions will be killed
    }
}
