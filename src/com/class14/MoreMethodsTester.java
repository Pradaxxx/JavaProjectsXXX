package com.class14;

public class MoreMethodsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoreMethodExamples obj1 = new MoreMethodExamples();

		System.out.println(obj1.print());
		System.out.println(obj1.doubleTheValue(10));
		obj1.isRaining(true);
//System.out.println(obj1.isRaining(true)); error as we are not return

		obj1.print5Times();
		System.out.println(obj1.returnGreater(122, 56));
	}

	/*
	 * create a method that takes a number if number is even print number is even
	 * otherwise print number is odd
	 */
	void printEvenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("Odd number");
		}

	}

	/*
	 * write a method that takes an array and returns the sum of the elements that
	 * are present in the array
	 */
	double returnTheArraySum(double[] arr) {
		double sum = 0;
		for (double element : arr) {
			sum = sum + element;
		}
		return sum;
	}

	/*
	 * write a method that returns true if a string is a mirror of itself otherwise
	 * it returns false aba yes bbb yes bba no
	 * 
	 */

boolean isMirror(String str) {
	String newStr="";
	
	for(int i =str.length()-1;i>=0;i--) {
		System.out.println(i+""+ str.charAt(i));
newStr+=str.charAt(i);
	}
	
	
	
	return false;	
}}
