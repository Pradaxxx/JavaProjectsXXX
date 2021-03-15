package com.class04;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 2;
		if (number1 % 5 == 0) {
			System.out.println("Number is divisible by 5");
		} else if (number1 % 2 == 0) {
			System.out.println("number is divisible by 2");

		} else if (number1 % 10 == 0) {
			System.out.println("Number is divisibke by 10");

			if (number1 % 5 == 0) {
				System.out.println("Number is divisible by");
				if (number1 % 2 == 0) {
					System.out.println("Number is divisible by 2");
					if (number1 % 10 == 0) {
						System.out.println("Number is divisible by 10");

					}
				}
			}
		}
	}
}
