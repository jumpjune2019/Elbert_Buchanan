package com.eboshun.forloops;

public class ForLoops {
	
	public static void main(String[] args) {
		
		// Simple program that goes over for loops
		//   variable; condition; increment operation
		System.out.println("For Loop");
		for ( int i = 0; i < 40 ; i++ ) {
			// operation
			System.out.println(i );
		}
		System.out.println(" ");
		
		
		System.out.println("While Loop");
		int j = 0;
		while(j < 40) {
			System.out.println(j);
			j++;
		}
		
		System.out.println(" ");
		System.out.println("Do While Loop ");
		int k = 0;
		do {
			System.out.println(k);
			k++;
		}while(k < 40);
		
		System.out.println(" ");
		// Break statement
		System.out.println("Break Statement");
		for ( int i = 0; i < 40 ; i++ ) {
			// operation
			System.out.println(i );
			 if (i == 20) {
				 break;	
			 }
		}		
		
		System.out.println(" ");
		System.out.println("Continue Statement");
		for ( int i = 0; i < 40 ; i++ ) {
			// operation
			System.out.println(i );
			 if (i == 20) {
				 continue;	
			 }
		}
	}
}
