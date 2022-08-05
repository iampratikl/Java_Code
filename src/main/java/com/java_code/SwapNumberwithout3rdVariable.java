package com.java_code;

public class SwapNumberwithout3rdVariable {

	public static void main(String args[]) {
		int a = 40;
		int b = 50;

		a = a + b; //90
		b = a - b; //90 -50
		a = a - b; //90-40

		System.out.println(a);
		System.out.println(b);

	}

}
