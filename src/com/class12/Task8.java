package com.class12;

public class Task8 {

	public static void main(String[] args) {
   //*Maximum and minimum number in the array?
		
			
				int []array= {10,30,56,768,98,89,90,78,56,45,35,67,108,2};
				int max=array[0];
				int min=array[0];
				
				for(int i=0;i<array.length;i++) {
					if(array[i]>max) {
						max=array[i];
					}
				if(array[i]<min) {
					min=array[i];
				}
				
				
				}
		System.out.println("The largest number in array is "+max);
		System.out.println("The smallest number in array is "+min);
			}
		}
