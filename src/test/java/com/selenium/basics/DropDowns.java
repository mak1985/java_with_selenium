package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDowns {
    public static void main(String[] args) throws InterruptedException {
        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        WebElement element = driver.findElement(By.name("country"));
        Select dropdowns = new Select(element);
        //dropdowns.selectByVisibleText("ALBANIA");
        dropdowns.selectByIndex(0);
        //dropdowns.selectByValue("ALBANIA");

        if (dropdowns.isMultiple() ==true)
        {
            System.out.println("Dropdown is multiple");
        }
        else
        {
            System.out.println("Dropdown not is multiple");
        }

        List<WebElement> alldropdownsoptions = dropdowns.getOptions();
        for(WebElement el:alldropdownsoptions )
        {
            System.out.println(el.getText()); //fetch and print all the data from the dropdown
        }
        System.out.println("Total options" +alldropdownsoptions.size() );
    }
}
