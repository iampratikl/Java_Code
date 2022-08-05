package com.tetsNG.code;

import org.testng.annotations.*;

public class Ruff_Work {

	@Test(priority = 5)
	public void Test1() {
		System.out.println("This is test 1");

	}

	@Test(priority = 4)
	public void Test2() {
		System.out.println("This is test 2");
	}

	@Test(priority = 3)
	public void Test3() {
		System.out.println("This is test 3");
	}

	@Test(priority = 2)
	public void Test4() {
		System.out.println("This is test 4");
	}

	@Test(priority = 1)
	public void Test5() {
		System.out.println("This is test 5");
	}
}
