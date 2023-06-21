package com.tesng.session;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    @Test(dataProvider = "searchDataSet")
    public void testCaseGoogleSearch(String city, String monument)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        WebElement search_box = driver.findElement(By.name("q"));
        search_box.sendKeys(city, monument);
        driver.findElement(By.name("btnK")).click();
        driver.quit();
    }

    @DataProvider(name="searchDataSet")
    public Object[][] searchData()
    {
        Object[][] searchKeyword = new Object[3][2];

        searchKeyword[0][0] = "India";
        searchKeyword[0][1] = "Qutub Minar";

        searchKeyword[1][0] = "Agra";
        searchKeyword[1][1] = "Taj Mahal";

        searchKeyword[2][0] = "Hyderabad";
        searchKeyword[2][1] = "Charminar";

        return searchKeyword;
    }

}
