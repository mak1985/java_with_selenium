package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountRadioButtons {
    public static void main(String[] args) {
        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        //driver.get("https://www.calculator.net/");
        driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
        driver.manage().window().maximize();

        List<WebElement> radioBtnList = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("Total no.of radio buttons on webpage: " + radioBtnList.size());

    }
}
