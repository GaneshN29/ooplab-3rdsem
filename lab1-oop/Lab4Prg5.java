package oopLabs;

import java.util.Scanner;

public class Lab4Prg5 {

	public static void main(String[] args) {
		int m, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter m: ");
		m = sc.nextInt();
		System.out.print("Enter n: ");
		n = sc.nextInt();
		int[][] arr = new int[m][n];
		
		if(m==n){
	    	System.out.println("Enter the elements");
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			} System.out.println("\n");
		}
		
		
		int trace = 0;
		int norm = 0;
		
		for(int i=0; i<m; i++) {
		    trace += arr[i][i];
			for(int j=0; j<n; j++) {
					norm += arr[i][j] * arr[i][j];
			}
		}
			System.out.println("Trace is: " + trace + ". Norm is: " + norm);
	}
	else{
	    	System.out.println("Not a square matrix");
	}
	}

}
