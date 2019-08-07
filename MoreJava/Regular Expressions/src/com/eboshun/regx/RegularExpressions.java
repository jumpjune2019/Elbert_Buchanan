package com.eboshun.regx;

import java.util.regex.*;

// import the regex Class
// The "*" signifies all the Classes in the package

public class RegularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This program illustrates \"regular expression\"");
		System.out.println("These expressions are case sensitive");
		System.out.println(" ");
		
		Pattern pat = Pattern.compile(".f");
		Matcher mat = pat.matcher("Ebony");
		
		boolean result1 = mat.matches();
		
		System.out.println(result1);

	}

}
