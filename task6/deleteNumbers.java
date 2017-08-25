package task6;

import java.util.Scanner;

public class deleteNumbers {

	private static String deleteNumber (String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i))) sb.append(s.charAt(i));
			}
		return sb.toString();
		}
	
	public static void main(String[] args) {
		System.out.println("Enter text:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("New text "+deleteNumber(s));

	}

}
