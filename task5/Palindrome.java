package task5;

import java.util.Scanner;

public class Palindrome {

	private static Scanner sc;
	
	public static void main(String[] args) {
	
		System.out.println("Type a word to check for polydromy");
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
            System.out.println("Polynometh");
        } else {
            System.out.println("Not a polandrom");
        }
	}

}
