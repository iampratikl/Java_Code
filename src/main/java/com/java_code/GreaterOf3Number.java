package com.java_code;

public class GreaterOf3Number {
	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		int c = 40;

		if (a > b && a > c) {
			System.out.println("a is greater number");
		} else if (b > a && b > c) {
			System.out.println("b is greater number");
		} else {
			System.out.println("c is greater number");
		}

	}

}
