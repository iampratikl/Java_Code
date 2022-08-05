package com.tetsNG.code;

import org.testng.annotations.*;

public class Catch_Implementing_TestNg_Annotations {

	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launch Browser Logic");
	}

	@Test
	public void checktest() {
		System.out.println("I have to be there to execute other annotations");
	}

	@AfterTest
	public void TierDown() {
		System.out.println("Code is over");
	}

}