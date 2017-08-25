package task4;

import java.util.Scanner;

public class NodNokNumbers {

	private static Scanner sc;
	public static void main(String[] args) {
	
		sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int x = sc.nextInt();
		System.out.println("Enter the second number");
		int y = sc.nextInt();
		nod(x, y);
		System.out.println("NOD "+nod(x, y));
		int nok = x * y / nod(x, y);
		System.out.println("NOK "+nok);
	}
	public static int nod(int a,int b) {
		while (b !=0) {
	            int tmp = a%b;
	            a = b;
	            b = tmp;
	        }
	   return a;
	}
}
