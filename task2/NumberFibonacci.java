package task2;

import java.util.Scanner;

public class NumberFibonacci {
	
	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("������� ����� ������ 0!");
		
		sc = new Scanner (System.in);
		
		if (sc.hasNextInt()) {
			int n = sc.nextInt();
			
			if (n < 0) System.out.println("�� ����� ����� ������ 0! ������������� ���������� � ���������� �����!");
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
			System.out.println("�� ����� �� ����� �����! ������������ ���������� � ���������� ������!");
		}
		

	}

}
