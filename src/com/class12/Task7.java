package com.class12;

public class Task7 {

	/*
	 * Write a Java Program to print the first 10 numbers of Fibonacci series.
	 */
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;

		for (int i = 1; i <= 10; i++) {
			System.out.println(a + "");

			c = a + b;
			a = b;
			b = c;

		}
		
		
		
		System.out.println("-------------------------------------------- ANOTHER WAY ------------------------------------------------------- ");
		
		int f1=0;
				int f2=1;
				
				
				for(int f=1;f<=10;f++) {
					
					
					System.out.println(f1+"");
					f1=f1+f2;
					f2=f1-f2;
					
				}
	}

}
