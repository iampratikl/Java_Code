package com.tetsNG.code;

import org.testng.annotations.*;

public class Tri_Combo_TestNG {

	// @BeforMethod +@Test+ @AfterMethod

	@BeforeMethod
	public void BeforeMethodTest() {
		System.out.println("Beginning logic");
	}

	@Test
	public void testcase1() {
		System.out.println("Logic part 1");
	}

	@Test
	public void testcase2() {
		System.out.println("Logic part 2");
	}

	@Test
	public void testcase3() {
		System.out.println("Logic part 3");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("Ending code");
	}

}
