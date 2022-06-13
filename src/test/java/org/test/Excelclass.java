package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.*;

public class Excelclass extends BaseClass {
	@BeforeClass
	private void BeforeClass() {
        System.out.println("BeforeClass");
         }
	@AfterClass
	private void AfterClass() {
     System.out.println("AfterClass");
	}  
	@BeforeMethod
	private void BeforeMethod() {
        BrowserLaunch("chrome");
        ImplicitlyWait(10);
       System.out.println("BeforeMethod");
	}
    @AfterMethod
    private void AfterMethod() {
     System.out.println("AfterMrthod");
     quit();
	}
    @Test
    private void Test1() throws IOException {
    	urlLaunch("https://facebook.com");
    	sendKeys(driver.findElement(By.id("email")), getExcelData("king", "facebook", 1, 0));
    	
    	System.out.println("Test........"+".........one");
	}
    
    @Test(priority=1)
    private void Test2() {
    	urlLaunch("https://flipkart.com");
      System.out.println("Test2");
	}
    @Test(enabled=true,priority=-1)
    private void Test3() {
      System.out.println("Test3");
      urlLaunch("https://www.king.com/");
	}
}
