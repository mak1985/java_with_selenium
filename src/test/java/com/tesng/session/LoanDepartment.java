package com.tesng.session;

import org.testng.annotations.Test;

public class LoanDepartment {

    @Test(enabled = true)
    public void MobileLoginPersonalLoan()
    {
        System.out.println("Web Login Personal Loan");
    }

    @Test(enabled = false) //If false then test case exclude from execution
    public void APILoginPersonalLoan()
    {
        System.out.println("API Login Personal Loan");
    }

    @Test
    public void AppleLoginAutomobileLoan()
    {
        System.out.println("Apple");
    }

    @Test
    public void Test()
    {
        System.out.println("Test");
    }

}

