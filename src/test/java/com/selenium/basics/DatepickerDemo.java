package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatepickerDemo {
    public static void main(String[] args) {

        String expectedDay = "2";
        String expectedMonth = "July";
        String expectedYear = "2032";

        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4000));

        //Switch to iframe
        driver.switchTo().frame(0);

        //find date picker webelement to perform click action
        WebElement  datePicker = driver.findElement(By.id("datepicker"));
        datePicker.click();

        while (true)
        {
            String calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (calenderMonth.equals(expectedMonth) && calenderYear.equals(expectedYear))
            {
                List<WebElement> dayList = driver.findElements(By.xpath("//table/tbody/tr/td"));

                for (WebElement e: dayList)
                {
                    String calenderDay = e.getText();
                    if(calenderDay.equals(expectedDay))
                    {
                        e.click();
                        break;
                    }
                }
                break;

            }
            else
            {
                //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//previous button
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next button

            }
        }

    }
}
