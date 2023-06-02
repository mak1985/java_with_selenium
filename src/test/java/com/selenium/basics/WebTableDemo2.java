package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTableDemo2 {
    public static void main(String[] args) {
        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        List <WebElement> rowList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
        System.out.println("Rows: "+ rowList.size() ); //7

        List <WebElement> columnList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
        System.out.println("Rows: "+ columnList.size() ); //4

        for(int r = 2; r <=rowList.size(); r++) //row 2, 3, 4, 5, 6, 7
        {
            for (int c =1; c <=columnList.size(); c++) //column 1, 2, 3, 4
            {
                String s = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+ r +"] /td["+c+"]")).getText();
                System.out.println(s);
            }
        }
    }
}
