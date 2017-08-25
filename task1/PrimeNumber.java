package task1;

import java.util.Scanner;

public class PrimeNumber {

	private static Scanner sc;
				
	public static void main(String[] args) {
		System.out.println("Введите число n больше 1;");
		
		sc = new Scanner(System.in);
		
		if (sc.hasNextInt()) {
			int n = sc.nextInt();
			
			if(n < 1) System.out.println("Вы ввели число меньше 1! Перезапустите приложение и попробуйте снова!");
			
			for (int i = 1; i <= n ; i++) {
				if (isPrime(i)) {
					System.out.print(i+", ");
				}
			}
		}else {
			System.out.println("Вы ввели не целое число! Перезапустие приложение и попробуйте заново!");
		}
	}
	
	public static Boolean isPrime(int number) {
		if (number < 1) return false;
		for (int i = 2; i<number; i++) {
			if (number %i==0) {
				return false;
			}
		}
		return true;
	}
}
