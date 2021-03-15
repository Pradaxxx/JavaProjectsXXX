package com.class12;

public class Task9 {

	public static void main(String[] args) {
		
		int[] arr2 = { 900, 900, 3, 45, 89, 76, 45, 125, 36, 145 };
		int large, secondLarge;
		
		
		large = 0;
		secondLarge = 0;
		
		
		
		
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] > large) {
				secondLarge = large;
				large = arr2 [i];
			} else if (arr2[i] > secondLarge) {
				secondLarge = arr2 [i];
			}
		}
		System.out.println("largest num is" + large);
		System.out.println("2nd Largest num is "+secondLarge);
	}

}
