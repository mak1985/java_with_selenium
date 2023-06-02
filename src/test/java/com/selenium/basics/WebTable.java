package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTable {
    public static void main(String[] args) {
        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("file:///C:/Users/Makhan%20AutomationHub/Downloads/webtable.html");
        driver.manage().window().maximize();

        //find second cell in web table and print second cell data
        String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
        System.out.println(text);

        //Find all rows and columns on table using List(findElements)
        //For rows xpath: //table/tbody/tr
        //For columns xpath: //table/tbody/tr[1]/th

        List< WebElement> rowList = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("Total no.of rows:" + rowList.size());//3

        List<WebElement> colList = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
        System.out.println("Total no.of columns:" +colList.size());//2

        //Read all cell data using for loop - 1st for row
        for (int r = 2; r <=rowList.size(); r++) //2, 3
        {
            for (int c =1; c <=colList.size(); c++) //1, 2
            {
                //table/tbody/tr[2]/td[2]
                String data = driver.findElement(By.xpath("//table/tbody/tr[" + r + "]/td[" + c + "]")).getText();

                System.out.println("Cell data value print from 1st to 4th: " +data);
            }

        }

    }
}
