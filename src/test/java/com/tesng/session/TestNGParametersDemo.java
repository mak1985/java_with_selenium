package com.tesng.session;

import org.testng.annotations.Test;

public class TestNGParametersDemo {

    @Test
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}
