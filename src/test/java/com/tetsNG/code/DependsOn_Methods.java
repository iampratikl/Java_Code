package com.tetsNG.code;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn_Methods {

	@Test
	public void Test1() {
		System.out.println("This is test 1");
		Assert.fail("Delibertaly Failing");
	}

	@Test(dependsOnMethods = "Test1", alwaysRun = true)
	public void Test2() {
		System.out.println("This is test 2");
	}

	@Test
	public void Test3() {
		System.out.println("This is test 3");
	}

	@Test
	public void Test4() {
		System.out.println("This is test 4");
	}

	@Test
	public void Test5() {
		System.out.println("This is test 5");
	}

}
