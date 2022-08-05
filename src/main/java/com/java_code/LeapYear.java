package com.java_code;

public class LeapYear {
	public static void main(String[] args) {
		int year = 2016;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("This is Leap Year");
				} else {
					System.out.println("This is not leap year");
				}

			} else {
				System.out.println("This is Leap Year");
			}

		} else {
			System.out.println("This is Not Leap Year");
		}
	}

}
