package oopLabs;

import java.util.Scanner;

public class Lab2Prg2 {

	public static void main(String[] args) {
	
	
			Scanner Sc = new Scanner(System.in);
			System.out.print("Enter the number a,b and c:");
			int a = Sc.nextInt();
			int b = Sc.nextInt();
			int c = Sc.nextInt();
			int temp = (a > b) ? a : b;
			int larg = (temp > c) ? temp : c;
			System.out.println("Largest No:" + larg);
			temp = ((a < b) ? a : b);
			larg = ((temp < c) ? temp : c);
			System.out.println("Smallest No:" + larg);
	}

}
