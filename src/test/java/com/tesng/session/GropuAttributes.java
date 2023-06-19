package com.tesng.session;

import org.testng.annotations.Test;

public class GropuAttributes {
    @Test(groups = "pack01")
    public void sanityTest()
    {
        System.out.println("sanityTestCase");
    }
    @Test(groups = "pack01")
    public void smokeTest()
    {
        System.out.println("smokeTestCase");
    }
    @Test(groups = "pack02")
    public void regressionTest()
    {
        System.out.println("regressionTestCase");
    }
    @Test(groups = "pack02")
    public void functionalTest()
    {
        System.out.println("functionalTestCase");
    }

}
