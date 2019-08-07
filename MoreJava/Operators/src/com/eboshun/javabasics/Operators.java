package com.eboshun.javabasics;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 5;
		int num2 = 3;
		
		// Add
		System.out.println("num1 + num2 =" + (num1 + num2));
		System.out.println(" ");
		// Multiply
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println(" ");
		
		// Subtract
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println(" ");
		
		// Modulus ( finds the remainder)
		System.out.println("num1 % num2 = " + (num1 % num2));
		System.out.println(" ");
		
		// Divide
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println(" ");
		
		// post increment
		System.out.println("post increment num1= " + (num1++));
		System.out.println("post increment num1 + 2 = " + (num1+2));
		System.out.println("post increment = num1 + 5 " + (num1+5));
		
		
		// pre increment
		System.out.println("pre increment num2 = " + (++num2));
		
		// post decrement 
		System.out.println("post decrement num1 = " + (num1--));
		System.out.println("post decrement num1 + 2 = " + (num1-2));
		System.out.println("post decrement num1 + 5 = " + (num1-5));
		
		// Pre decrement
		System.out.println("Pre decrement = " + (--num2));
		System.out.println(" ");
		
		// COMPARISONS
		
		// comparison operators using ==
		System.out.println("Is num1 equal to num 1: " + (num1 == num1));
		System.out.println("Is num1 equal to num 2: " + (num1 == num2));
		System.out.println("Is num1 NOT equals to num 1: " + (num1 != num1));
		System.out.println("Is num1 NOT equals to num 2: " + (num1 != num2));
		System.out.println(" ");
		
		// greater than or less than
		System.out.println("Is num1 greater than to num 2: " + (num1 > num2));
		System.out.println("Is num1 greater than or equal to num 2: " + (num1 >= num2));
		System.out.println("Is num1 less than to num 2: " + (num1 < num2));
		System.out.println("Is num1 less than or equal to num 2: " + (num1 <= num2));
		
		
		// BITWISE OPERATORS
		// using binary operations
		System.out.println("Bitwise operations are conducted on binary numbers");
		System.out.println(" ");
		System.out.println("Bits ");
		System.out.println("128 64 32 16 8 4 2 1 ");
		System.out.println("---------------------");
		System.out.println(" ");
		System.out.println("0   0  0  0  0 1 0 1 ");
		System.out.println("& ");
		System.out.println("0   0  0  0  0 0 1 1 ");
		System.out.println("-------------------- ");
		System.out.println(" ");
		System.out.println("Using the AND operator ");
		System.out.println(num1 & num2);
		System.out.println(" ");		
		System.out.println("Using the AND operator ");
		System.out.println(num1 & num1);
		
		
		// LOGICAL OPERATORS
		//  new boolean variables
		boolean var1 = true;
		boolean var2 = true;
		System.out.println("var1 && var1: " + (var1 && var1) + " \n" + "var1 && var2: "+ (var1 && var2));
		System.out.println(" ");
		boolean var3 = false;
		boolean var4 = false;
		System.out.println("var3 && var3: " + (var3 && var3) + " \n" + "var3 && var4: "+ (var3 && var4));
		System.out.println(" ");
		boolean var5 = true;
		boolean var6 = false;
		System.out.println("var5 && var5: " + (var5 && var5) + " \n" + "var5 && var6: "+ (var5 && var6));
		System.out.println(" ");
		
		boolean varA = true;
		boolean varB = true;
		System.out.println("varA && varA: " + (var1 || var1) + " \n" + "varA && varB: "+ (var1 || var2));
		System.out.println(" ");
		boolean varC = false;
		boolean varD = false;
		System.out.println("varC && varC: " + (varC || varC) + " \n" + "varC && varD: "+ (varC || varD));
		System.out.println(" ");
		boolean varE = true;
		boolean varF = false;
		System.out.println("varE && varE: " + (varE || varE) + " \n" + "varE && varF: "+ (varE || varF));
		System.out.println(" ");
		
		// ASSIGNMENT OPERATORS 
		// same as increment with numbers and can be done with the other operators
		
		
		// CONDITIONAL OPERATORS
		// ternary operators
		System.out.println("Comparable to an if statement");
		System.out.println("If a condition is true, then do");
		int num1a = 65;
		int num1b = 65;
		int result = (num1a == num1b) ? 34 : 12;
		System.out.println("If num1a == num1b, ");
		System.out.println("then the result will be 34");
		System.out.println(result);
		
			
	}

}
