package org.test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class B extends BaseClass{
	@Test(priority=-1)
	private void Test() {
		WebElement driver;
		BrowserLaunch("chrome");
		ImplicitlyWait(3000);
		urlLaunch("https://facebook.com");
		System.out.println("Test");

	}
	}
