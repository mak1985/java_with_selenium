package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

public class BrkenLnks {
    public static void main(String[] args) {
        //Launch chrome web browser
        System.getProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Downloads\\chromedriver_win32\\chromedriver.exe");

        //Create an object of webdriver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //Launch google web page
        driver.get("http://www.deadlinkcity.com/");

        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println("Total links on page: " + linkList.size());////Total links on page: 48

        int resCode = 500;
        int brokenLinksCount = 0;

        for(WebElement element : linkList)
        {
            String url = element.getAttribute("href");

            try {
                URL urlLink = new URL(url);
                HttpURLConnection huc = (HttpURLConnection) urlLink.openConnection();
                huc.setRequestMethod("HEAD");
                huc.connect();

                resCode = huc.getResponseCode();
                if(resCode >=500)
                {
                    System.out.println(url + "broken link");
                    brokenLinksCount++;
                }
            } catch (ProtocolException e) {
                throw new RuntimeException(e);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Total broken links: " + brokenLinksCount); //Total broken links: 42

    }
}
