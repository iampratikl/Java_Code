package com.while_loops;

public class AddingMultipleOfN {
	public static void main(String[] args) {

		int i = 1;
		int sum = 0;

		while (i <= 1000) {
			sum = sum + (5 * i);
			i++;
			System.out.println(sum);

		}
	}
}
