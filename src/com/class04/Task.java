package com.class04;

public class Task {

public static void main(String[] args) {
boolean diploma= false;
boolean degree= true;
double score=3.4;


if(diploma) {
	System.out.println("Congratulations");
	
}else {
	if (degree) {
		if( score>=3.5 ) {
			System.out.println("You are eligible for scholarship");
		}else {
			System.out.println("You should have studied harder");
			
		}
	}
	
   }

}
}
