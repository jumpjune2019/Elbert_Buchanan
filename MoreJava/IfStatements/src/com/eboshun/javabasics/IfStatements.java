package com.eboshun.javabasics;

public class IfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// random variables to test conditionals
		int a = 4;
		int b = 4;
		int c = 5;
		
		System.out.println("If a is equal to b, the line will print: ");
		if (a == b) {
			System.out.println("They are equal");
		}
		System.out.println(" ");
		
		
		System.out.println("If the condition is false, then the second option will print: ");
		if(a == c) {
			System.out.println("They are equal");
		}else{
			System.out.println("They are not the same");
		}
		
		System.out.println(" ");
		System.out.println("If the first condition is false, and the second condition is true,");
		System.out.println("then the second line will print; ");
		if (a == c) {
			System.out.println("The first condition is true");
		}else if(b == a) {
			System.out.println("The second condition is true");
		}
		
		System.out.println("This can be used with other comparison statements also");
		System.out.println("Else if can be chained multiple times");
		System.out.println(" ");
		System.out.println("If statements can also be used with Logical Operators");
		
		
				
				

	}

}
