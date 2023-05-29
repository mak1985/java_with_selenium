package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClicksActions {
    public static void main(String[] args) {
        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        WebElement DoubleClickMeBtn = driver.findElement(By.xpath("//button[@type='button'][text()='Double Click Me']"));
        WebElement RightClickBtn = driver.findElement(By.cssSelector("#rightClickBtn"));
        WebElement clickMeBtn = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]"));


        Actions act = new Actions(driver);

        //Double Click action
        //act.doubleClick(DoubleClickMeBtn).perform();

        //Right click action
        //act.contextClick(RightClickBtn).perform(); // Right click action method

        //ClickMe action
        act.click(clickMeBtn).perform();



    }
}
