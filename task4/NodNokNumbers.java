package task4;

import java.util.Scanner;

public class NodNokNumbers {

	private static Scanner sc;
	public static void main(String[] args) {
	
		sc = new Scanner(System.in);
		
		System.out.println("������� ������ �����");
		int x = sc.nextInt();
		System.out.println("������� ������ �����");
		int y = sc.nextInt();
		nod(x, y);
		System.out.println("��� "+nod(x, y));
		int nok = x * y / nod(x, y);
		System.out.println("��� "+nok);
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
