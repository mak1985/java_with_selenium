package com.tesng.session;

import org.testng.annotations.*;


public class TestCase1 {
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("beforeSuite");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("AfterSuite");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("BeforeTest");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("AfterTest");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("BeforeClass");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("AfterClass");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("BeforeMethod");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("AfterMethod");
    }
    @Test
    public void test1()
    {
        System.out.println("Test");
    }
    @Test
    public void test2()
    {
        System.out.println("Test");
    }

}

