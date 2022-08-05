package com.java_code;

public class YoungerOld {
	public static void main(String[] args) {
		int Ram = 16;

		if (Ram <= 18) {
			System.out.println("Ram is 18 or younger");
		} else if (Ram > 18 && Ram <= 29) {
			System.out.println("Ram is above 19 or below 35");
		}else {
			System.out.println("Ram is older than 35");
		}
	}

}
