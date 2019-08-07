package com.eboshun.javabasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		// this is an alternate method versus using Scanner
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//input needs to be stored into a variable
		String name = reader.readLine();
		
		System.out.println(name);
		
		

	}

}
