package com.tetsNG.code;

import org.testng.annotations.*;

public class Sequenceof_TestNG_Annotations {

	@BeforeSuite

	public void beforeSuiteTest() {
		System.out.println("This is BeforeSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is BeforeTest Annotations");
	}

	@BeforeClass
	public void beforeclas() {
		System.out.println("This is BeforeClass");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("This is BeforMethod");
	}

	@Test
	public void checktest() {
		System.out.println("This is my TestCase");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("This is AfterMethod Annotations");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("This is AfterClass Annotations");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("This is AfterTest Annotations");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("This is AfterSuite Annotations");
	}

}
