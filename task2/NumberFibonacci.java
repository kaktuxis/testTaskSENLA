package task2;

import java.util.Scanner;

public class NumberFibonacci {
	
	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("Введите число больше 0!");
		
		sc = new Scanner (System.in);
		
		if (sc.hasNextInt()) {
			int n = sc.nextInt();
			
			if (n < 0) System.out.println("Вы ввели число меньше 0! Перезапустите приложение и попробуйте снова!");
			int x = 0;
			int y = 1;
			int f =x + y;
			while (f <= n) {
				System.out.print(f+ ", ");
				x = y;
				y = f;
				f =x + y;
			}
		}
		else {
			System.out.println("Вы ввели не целое число! Перезапустие приложение и попробуйте заново!");
		}
		

	}

}
