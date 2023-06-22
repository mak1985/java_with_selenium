package com.tesng.session;

import org.testng.annotations.Test;

public class InvocationCountDemo {

    @Test(invocationCount = 5)
    public void testMethod1()
    {
        System.out.println("Test 01");
    }
    @Test(invocationCount = 2)
    public void testMethod2()
    {
        System.out.println("Test 02");
    }
}
