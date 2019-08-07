package com.eboshun.methodbasics;

public class Methods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calling methos \"func1\" gives us: ");
		func1();
		System.out.println(" ");
		
		System.out.println("Calling method \"return Val1\" gives us: ");
		int i = returnVal1(); // this assigns the function to a variable 
		System.out.println(i);
		System.out.println(" ");
		
		
		System.out.println("Calling \"returnVal2 \" adds 6 + 6");
		int j = returnVal2();
		System.out.println(j);
		System.out.println(" ");
		
		System.out.println("A method can have variables inside of it called local variables");
		System.out.println("a is declared with the value of 5");
		System.out.println("Calling \"returnVal3 \" returns the operation 6 * 2 + a");
		int k = returnVal3();
		System.out.println(k);
		System.out.println(" ");
		
		System.out.println("This method demonstrates how to pass values into a method");
		System.out.println("The method declaration is as follows: \npublic static void passVal1(int var1, String name)");
		System.out.println("Inside the parenthesis is where the values are declared \nbut they are passed in the method call ");
		passVal1(155, "Ebony"); //String enclosed in double quotes	
		System.out.println(" ");
		
		System.out.println(" ");
		System.out.println("A method can be overloaded ");
		System.out.println("This is when a method has the same name \nbut a different number of parameters or parameter types");
		passVal1("When a method is overloaded", 5, true);
		System.out.println(" ");
	

	}
	
	// Methods are written outside of the Main except in strict situations
	// Methods are usually called inside of the main 
	
	public static void func1() {
		System.out.println(5);
	}
	
	
	public static int returnVal1() {
		// if a method does not have a "void" return type
		// it must have a return statement in the method body
		return 6;		
	}
	
	public static int returnVal2() {
		// A method can also be coded to do operations
		return 6 + 6;
	}	
	
	public static int returnVal3() {
		// A method can have variables inside of it
		// These are called local variables
		var a = 5;
		return 6 * 2 + a;
	}	
	
	public static void passVal1(int var1, String name) {
		// this method can pass values. An Int and a String
		System.out.println(var1 +" " + name);
	}	
	
	// A method can be overloaded
	// This is when a method has the same name 
	// However, they will have different number of parameters or parameter types
	public static void passVal1( String statement, int num, boolean x) {
		// this method can pass values. An Int and a String
		System.out.println(statement + " " + num + " " + x);
	}	
	
	// Revisit the 30th lecture 
	
}









































