package com.tetsNG.code;

import org.testng.annotations.Test;

public class Only_TestCases_ExecutionPreferrance { // test cases are executed alphabetically as per method names
	// if you are not using priority in all test cases, testing will follow
	// alphabetical sequence.

	@Test
	public void BB() {
		System.out.println("Logic part 1");
	}

	@Test
	public void AA() {
		System.out.println("Logic part 2");
	}

	@Test(enabled = false)
	public void DD() {
		System.out.println("Logic part 3");
	}

	@Test
	public void CC() {
		System.out.println("Logic part 4");
	}

}
