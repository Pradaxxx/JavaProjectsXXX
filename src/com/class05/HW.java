package com.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		/*
		 * 
		 */
		String creditCard;
		Double balance;
		Scanner scan;

		scan = new Scanner(System.in);
		System.out.println("Do you have a credit card");
		creditCard = scan.next();

		if (creditCard.equals("yes=Yes")) {
			System.out.println("What is the balance on the cc?");
			balance = scan.nextDouble();
			if (balance > 1000) {
				System.out.println("pay off immediadiately");
			} else {
				System.out.println("spend more");

			}

		} else {
			System.out.println("would you like a credit card?");

		}
	}

}
