package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OpenNewTabOrWindow {
    public static void main(String[] args) {

        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //Launch google web page
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());


        //Open new tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());

        //get window handles of open windows
        Set <String> windowHandles = driver.getWindowHandles(); //Handle multiple windows using set interface along with getWindowHandles() method
        List<String> handles = new ArrayList<String>();
        handles.addAll(windowHandles);
        //driver.close();
        driver.switchTo().window(handles.get(0)); //switch back to google.com
        System.out.println(driver.getTitle());
        driver.switchTo().window(handles.get(1));
    }
}
