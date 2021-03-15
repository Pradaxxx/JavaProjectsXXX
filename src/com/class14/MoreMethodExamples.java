package com.class14;

public class MoreMethodExamples {
	/*
	 * Create a method that does not take any values and always return String Hi
	 */
	String print() {
		return "Hi";

	}
	/*
	 * create a method that takes a number and returns the double of that number
	 */

	double doubleTheValue(double input) {

		return input * 2;
	}
	/*
	 * Create a method that takes a boolean as input 
	 * if the value is true I want to print take the umbrella 
	 * and if the value is falseprint please go for a walk
	 */
	
	
	
	void isRaining(boolean isRain) {
		if(isRain) {
			System.out.println("Please take the umbrella");
		}else {
			System.out.println("Please go for aa walk");
			
		}
	}
	
	
	void print5Times( ) {
		for (int i=0; i <5; i++) {
			System.out.println("Batch 9 is great");
			
		}
	}
	
	int num(int num1, int num2) {
		if (num1<num2) {
			return num2; 
		}else {
			return num1;
		}
	}

	public char[] returnGreater(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
