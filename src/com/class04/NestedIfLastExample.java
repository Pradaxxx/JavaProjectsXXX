package com.class04;

public class NestedIfLastExample {

	public static void main(String[] args) {
		/*
		 * to donate:
		 * you must be 18 and older, otherwise you cannot 
		 * your weight must be more than 110 lbs< otherwise you cannot donate
		 */
int age=18;
int weight=112;
String eyes="green";

if (age>=18) {
	System.out.println("You may be eligible to donate");
	if (weight>110) { 
		System.out.println("You can donate");
	}else { 
		System.out.println("You can not donate");
	}
	
	if (eyes="green") {
		System.out.println("You are qualify");
	} else {
		System.out.println("You are not qualify");
		
	}
}else { 
	System.out.println(" I can not ");
}

}


	}


