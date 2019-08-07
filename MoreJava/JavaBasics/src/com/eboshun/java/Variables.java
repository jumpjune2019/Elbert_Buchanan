package com.eboshun.java;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating variables
		
		int age;
		int hello = 9;
		
		age = 26;
		
		System.out.println(age);
		System.out.println(hello);  // will still print out 9 because java reads the lines sequentially
		
		hello = -6;
		
		System.out.println(hello); // will print out -6 because this print statement comes after the reassignment
	}

}
