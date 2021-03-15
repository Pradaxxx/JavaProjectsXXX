package com.class06;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
 /*
  * we need to calculate final price after the discount 
  * 
  *  we check if there is sale 
  *  if no sale --> I am not going for shopping 
  *  if there is sale 
  *  
  *      we will ask the item
  *      we will ask price
  *      
  *      if price is less than 10 --> apply 5% discount
  *      if price is between 10 and 100 --> apply 10 % discount 
  *      if price is between 100 to 500 --> apply 20% discount 
  *      if price is more than 500 --> apply 30 % 
  *      
  *      "which item your purchased, what was original price, what discount applies and final price"
  *      
  */

		 Boolean sale;
		 String item = null;
		 double price = 0,discount = 0, finalPrice = 0;
		 Scanner scan = new Scanner (System.in);
		 
		 System.out.println("Do we have sale today?");
		 sale=scan.nextBoolean();
		 
		 if(!sale) { 
			 System.out.println("I am not going for shopping");
		 }else {
			 System.out.println("What do you want to buy");
			 item=scan.next ();
			 System.out.println("What is the price of that item");
			 price = scan.nextDouble();
		if (price <10) {
			discount= price * 0.05;
			finalPrice=price-discount;
		}else if (price>= 10 && price <100) {
				discount = price *0.1;
				finalPrice=price-discount;
		}else if (price>=100 && price <= 500) {
			discount = price *0.2;
		}else if (price >500) {
			discount = price *0.3;
			
		}
		finalPrice=price-discount;
		System.out.println("You are buying "+item+" with original price ="+ price+");
		 }
		}
		 
		 }
		
		
		
		
		
		
		
	}

}
