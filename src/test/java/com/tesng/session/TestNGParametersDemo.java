package com.tesng.session;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {

@Test
@Parameters({"i", "j"})
    public void sub(int a, int b)
    {
        System.out.println(a-b);
    }

    @Test
    @Parameters({"i", "j"})
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
    @Test
    @Parameters({"i", "j"})
    public void multi(int a, int b)
    {
        System.out.println(a*b);
    }
    @Test
    @Parameters({"i", "j"})
    public void div(int a, int b)
    {
        System.out.println(a/b);
    }

    @Test
    @Parameters({"inputName"})
    public void setMyName(String name)
    {
        System.out.println(name);
    }
}
