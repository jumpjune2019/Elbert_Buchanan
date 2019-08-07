package com.eboshun.arraysandforeach;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// square brackets can go before or after the array name
		int [] arr = {1, 2, 3, 4, 5, 6, };
		// this prinbts out the value at the array index
		// arrays are 0 bound so the first index is zero
		// therefor3, index 3 is the fourth index
		System.out.println("Value at index 3 is: " + arr[3]);
		
		System.out.println("The length of this array is " + arr.length);
		
		// loop through the array to pring all values
		// is a for loop, the variable refers to the array's index, not the data type of the values of the array
		for (int i = 0; i< arr.length; i++ ) {
			System.out.println("Each value printed one at a time is: " + arr[i]);
		}
		
		// Next is the "for each" loop
		
		System.out.println(" ");
		System.out.println("The next values are produced using a \"for each\" loop");
		System.out.println("It is also known as an enhanced for loop.");
		
		for (int e : arr) {
			System.out.println(e);
		}

	}

}
