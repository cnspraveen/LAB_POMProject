package com.ilab.automation;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertTest 
{
	public static void main(String args[])
	{
	SoftAssert softassert = new SoftAssert();
    softassert.assertEquals("User find article in predective search", "User have not find article in global search");
    System.out.println("Test");
    
    /*try {
    Assert.assertEquals("Test", "test");
   // System.out.println("Test2"); 
    }
    catch(Exception e)
    {
    	System.out.println("Assert Fails");
    }
   */ 
      

	}
}
