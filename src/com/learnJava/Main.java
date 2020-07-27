package com.learnJava;

public class Main {
	/**
	 * Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
	 * The method should not return any value
	 * Using a switch statement print "Sunday", "Monday", ... , "Saturday" 
	 * if the int parameter "day" is 0, 1, ..., 6 respectively, otherwise it should print "Invalid day".
	 * 
	 * BONUS
	 * Write a second solution using if then else, instead of using switch.
	 */
	public static void main(String[] args) {
		System.out.println("/*--- First solution ---*/");
		// Should return "Monday"
		printDayOfTheWeek(1);
		// Should return "Friday"
		printDayOfTheWeek(5);
		// Should return "Invalid day"
		printDayOfTheWeek(9);
		
		System.out.println("/*--- Bonus solution ---*/");
		// Should return "Monday"
		printDayOfTheWeekBonus(1);
		// Should return "Friday"
		printDayOfTheWeekBonus(5);
		// Should return "Invalid day"
		printDayOfTheWeekBonus(9);
	}
	
	public static void printDayOfTheWeek(int day) {
		switch(day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:			
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Invalid day");
				break;
		}
	}
	
	/**
	 * Bonus
	 */
	public static void printDayOfTheWeekBonus(int day) {
		if(day == 1) {
			System.out.println("Monday");
		} else if(day == 2) {
			System.out.println("Tuesday");
		} else if(day == 3) {
			System.out.println("Wednesday");
		} else if(day == 4) {
			System.out.println("Thursday");
		} else if(day == 5) {
			System.out.println("Friday");
		} else if(day == 6) {
			System.out.println("Saturday");
		} else if(day == 7) {
			System.out.println("Saunday");
		} else {
			System.out.println("Invalid day");
		}
	}

}
