package task5;

import java.util.Scanner;

public class Palindrome {

	private static Scanner sc;
	
	public static void main(String[] args) {
	
		System.out.println("Введите слово для проверки на полиндромность");
		sc = new Scanner(System.in);
		String wordForCheck = sc.next();
		wordForCheck = wordForCheck.toUpperCase();
		char[] charArray = wordForCheck.toCharArray();

        Boolean isCheck = true;

        for (int i=0; i<wordForCheck.length(); i++) {
            if (charArray[i] != charArray[wordForCheck.length()-i-1]) {
                isCheck = false;
            }
        }

        if (isCheck) {
            System.out.println("Полиндром");
        } else {
            System.out.println("Не полиндром");
        }
	}

}
