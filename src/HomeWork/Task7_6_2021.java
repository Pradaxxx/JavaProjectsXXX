package HomeWork;

public class Task7_6_2021 {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to print the first 10 numbers of Fibonacci series.
		 */
		
		int n1=0;
		int n2=1;
		int n3;
		 System.out.print(n1+" "+n2);  //printing 0 and 1    
		    
		 for(int i=2;i<10;++i)  //loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }  System.out.println();  
		System.out.println("-------------------------another way-------------------");
		
		int f1=0;
		int f2=1;
			for(int f=1;f<=10;f++) {
				System.out.print(f1+" ");
				f1=f1+f2;
				f2=f1-f2;	
		
		//output 	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
		
		
	}

}}
