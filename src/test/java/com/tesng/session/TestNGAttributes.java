package com.tesng.session;

import org.testng.annotations.Test;

public class TestNGAttributes {

    @Test(description = "TC_01")
    public void testCase1() //1st
    {
        System.out.println("Mobile testing");
    }
    @Test(dependsOnMethods = {"testCase1"}) //2nd
    public void testCase2()
    {
        System.out.println("Web testing");
    }
    @Test(priority = 1) //
    public void testCase3()
    {
        System.out.println("API testing");
    }
    @Test(dependsOnMethods = {"testCase3"} )
    public void testCase4()
    {
        System.out.println("Manual testing");
    }
    @Test(priority = 1)
    public void testCase5()
    {
        System.out.println("Automation testing");
    }
}
