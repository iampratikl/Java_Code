package com.java_code;

public class Prime_Number {
	public static void main(String[] args) {
		int a = 24;
		int k = 0;
		for (int i = 2; i <= a; i++) {
			if (a % i == 0)
				k++;
		}
		if (k > 0) {
			System.out.println(a + " is Prime no");
		} else {
			System.out.println(a + " is composite no");
		}
	}

}
