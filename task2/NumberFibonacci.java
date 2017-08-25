package task2;

import java.util.Scanner;

public class NumberFibonacci {
	
	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("Enter a number greater than 0!");
		
		sc = new Scanner (System.in);
		
		if (sc.hasNextInt()) {
			int n = sc.nextInt();
			
			if (n < 0) System.out.println("You have entered a number less than 0! Restart the application and try again!");
			int prevNumber = 0;
			int prevPrevNumber = 1;
			int newNumber =prevNumber + prevPrevNumber;
			while (newNumber <= n) {
				System.out.print(newNumber+ ", ");
				prevNumber = prevPrevNumber;
				prevPrevNumber = newNumber;
				newNumber =prevNumber + prevPrevNumber;
			}
		}
		else {
			System.out.println("You did not enter a whole number! Restart the application and try again!");
		}
		

	}

}
