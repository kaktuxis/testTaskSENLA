package task3;

import java.util.Scanner;


public class IntersectionSegments {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.print("Enter the coordinates of the segment A x1: ");
		int ax1 = sc.nextInt();
		System.out.print("Enter the coordinates of the segment A y1: ");
		int ay1 = sc.nextInt();
		System.out.print("Enter the coordinates of the segment A x2: ");
		int ax2 = sc.nextInt();
		System.out.print("Enter the coordinates of the segment A y2: ");
		int ay2 = sc.nextInt();
		System.out.print("Enter the coordinates of the segment B x1: ");
		int bx1 = sc.nextInt();
		System.out.print("Enter the coordinates of the segment B y1: ");
		int by1 = sc.nextInt();
		System.out.print("Enter the coordinates of the segment B x2: ");
		int bx2 = sc.nextInt();
		System.out.print("Enter the coordinates of the segment B y1: ");
		int by2 = sc.nextInt();
		int v1=(bx2-bx1)*(ay1-by1)-(by2-by1)*(ax1-bx1);
		int v2=(bx2-bx1)*(ay2-by1)-(by2-by1)*(ax2-bx1);
		int v3=(ax2-ax1)*(by1-ay1)-(ay2-ay1)*(bx1-ax1);
		int v4=(ax2-ax1)*(by2-ay1)-(ay2-ay1)*(bx2-ax1);
		if (v1*v2<0 && v3*v4<0) {
			System.out.println("The segments intersect");
		}
		else {
			System.out.println("The segments do not intersect");
		}
		
	}

}
