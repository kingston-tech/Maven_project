package org.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class C extends BaseClass{
	@Test(priority=1)
	private void Test() {
		BrowserLaunch("chrome");
		ImplicitlyWait(3000);
		urlLaunch("https://www.flipkart.com/");
		System.out.println("Test");

	}
}
