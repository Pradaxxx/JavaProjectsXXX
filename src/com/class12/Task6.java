package com.class12;

public class Task6 {

	public static void main(String[] args) {
		int num = -7;
		boolean prime=true;
		
		for (int i = 2; i < num; i++) {
			if (num>1) {
				for (int i=2; i<num;)
				prime = false;
				break;
			}
		}

	}else { 
    prime=false; 
	}
		 
		
		if (prime) {
			System.out.println(num+"is a prime number");
		}
	}

}
