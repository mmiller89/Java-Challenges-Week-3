package week3CodingChallenge;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Scanner;

public class challengeproblems {

	public static void main(String[] args) {
//		Challenge: Write a method that will find the maximum value in an array of integers.
//		
		int[] testArray1 = {500,6,7,12,87,10,1};
		System.out.println(maximumValueInArray(testArray1));
//		
	
//		Challenge: Write the code necessary to populate an array that contains 50 numbers that are evenly divisible by 7.
//		Modify the code to prompt the user to enter how many numbers they want populated and what they should be divisible by.
		
		Scanner input = new Scanner(System.in);
	
		System.out.printf("Enter the size of the Numbers Divisible by array (whole number): %n");
		int arraySize = input.nextInt();
		
		System.out.printf("What number should each new value be divisible by (whole number): %n");
		int arrayMultipleNum = input.nextInt();
		
		
		int[] multiplesArray = new int[arraySize];
		
		for (int i = 0; i <= multiplesArray.length - 1; i++) {
			multiplesArray[i] = (i+1) * arrayMultipleNum;
			System.out.println(multiplesArray[i]);
		}
		
		
		
//		Challenge: Would you rather… get a penny doubled every day for 30 days, or $10,000 every day?
		
		pennyChallengeCalculator();
		
		
		//Draw a solid square.
		
//		int rows = 2;
//		int columns = 5;
//		
//		for (int i = 1; i <= rows; i++) {
//			if (i > 1) {
//				System.out.println("*");
//			}
//			
//		
//	
//			for (int k = 1; k <= columns - 1; k++) {
//				System.out.print("*");
//			}
//			
//		}
//	
//		System.out.print("*");
		
	
		
		
		//This is set up to be dynamic (change value of rows/columns and it will adjust). 
		//The first loop draws the initial * and establishes if the line drawn is the top or bottom.
		//The inner loop does the checks, draws * if on bottom/top row OR the first or last spot in the row.
		//QUESTION: At the very end, I had to put in an additional print * statement, otherwise the very last * will always be missing. I can't understand why.
		//The inner loop prints * the same number of times for each line, except the last one. 
		
		
		int rows = 10;
		int columns = 10;
		boolean drawingBottomOrTop = true;
		
		for (int i = 1; i <= rows; i++) {
			if (i > 1) {
				System.out.println("*");
			}
	
			if (i == 1 || i == rows) {
				drawingBottomOrTop = true;
			} else {
				drawingBottomOrTop = false;
			}
			
			
		
			for (int k = 1; k <= columns - 1; k++) {
				if (drawingBottomOrTop == true) {
					System.out.print("*");
				} else if (k == 1 || k == columns) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			
		}
		
		System.out.print("*");
		
	}
	
	public static int maximumValueInArray(int[] array) {
		int largestInteger = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > largestInteger) {
				largestInteger = array[i];
			}
		}
		
		return largestInteger;

	}

	public static void pennyChallengeCalculator() {
		BigDecimal pennyADayValue = new BigDecimal("0.01");
		int tenThousandValue = 10000;
		BigDecimal doubl = new BigDecimal("2");
		
		for (int i = 1; i < 30; i++) {
			pennyADayValue = pennyADayValue.multiply(doubl);
			
		}
		
		for (int i = 1; i < 30; i++) {
			tenThousandValue += 10000;
		}
		System.out.println("Penny Doubled A Day or $10,000 a day?");
		System.out.println("After 30 days....");
		System.out.println("Penny value: " + "$" + pennyADayValue);
		System.out.println("Ten thousand a day value: " + "$" + tenThousandValue);
	}

}
