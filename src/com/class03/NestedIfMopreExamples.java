package com.class03;

public class NestedIfMopreExamples {

	public static void main(String[] args) {
		/*
		 * if it is friday --> go to the movie, otherwise stay at home and study if it
		 * is friday then I will check if day is 13 --> if yes --> watch scary movies if
		 * no --> wacth any movies you like
		 */
		boolean isFriday = true;
		int day = 13;

		if (isFriday) {
			System.out.println("I it is a movie day !!!");

			if (day == 13) {
				System.out.println("I will watch a scary movie");

			} else {
				System.out.println("I wacth any available movie");
			}

		} else {
			System.out.println("I will stay at home and studay Java");

		}

		System.out.println("--------Example 2 ----------");
		/*
		 * check assigment and baed on the score we diplay a message
		 * 
		 * 
		 */
		boolean completed = true;
		int score = 88;
		
		if (completed) {
			if (score>90) {
				System.out.println("Great job");
			}else if (score>80) {
				System.out.println("Good job");
			}else if (score>70) {
			}else {
				System.out.println("Good for trying, but study more!!!");
			}
			
		} else {
			System.out.println(" Please make sure to compleate all assignments on time");
			

		}
	}
}
