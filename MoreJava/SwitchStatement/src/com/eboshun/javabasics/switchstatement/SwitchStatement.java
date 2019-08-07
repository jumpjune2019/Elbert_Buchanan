package com.eboshun.javabasics.switchstatement;

import java.util.Scanner;


public class SwitchStatement {
	
	// Gets user input
	static Scanner scan = new Scanner(System.in);
	
	static boolean exit;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Switch statements are great for menu choices
		 * A switch statement is similar to a chained else if statement
		 * }
		 */
		
		// create SwitchStatement object
		
		 SwitchStatement myObj = new  SwitchStatement();
		 myObj.runOptions();
		 
		 while(!exit) {
			
			runMenu();
			int choice = getInput();
			messages(choice);
			
		}
		
	}
		

	private void runOptions() {
		
		
	}


	public static void runMenu() {
	System.out.println("Make a choice and see a decision");
	System.out.println("Enter \"1\" for a lovely message");
	System.out.println("Enter \"2\" for an angry message");
	System.out.println("Enter \"3\" for a happy message");
	System.out.println("Enter \"4\" for a sad message");
	System.out.println("Enter 0 to exit");
	System.out.println(" ");
	System.out.println("Please make your choice");
	System.out.println(" ");
	}
	
	// ensures that the option picked is within range
	public static int getInput() {
		int option = -1;
		do { 
			System.out.println("Please make a selection: ");
			try {
				option = Integer.parseInt(scan.nextLine());
				
			}
			catch(NumberFormatException e){
				System.out.println("Invalid selection. Please choose a number.");
			}
			if(option < 0 || option > 5) {
				System.out.println("Selection outside of range. Please try another selection.");
				
			}
		}while(option < 0 || option > 5);
		return option;
	}
	
	
	private static void messages(int option) { 
		//switch / case to perform actions methods
		//break ensures that the options stop before going to the next one
		//the switch statement can have a number of possible execution paths.
		switch(option) {
		case 0:
			System.out.println("Choose your feeling");
			System.exit(0);
			break;
		case 1:
			System.out.println("You are adorable!");
			break;
			
		case 2:
			System.out.println("You make me sick!");
			
			break;
		case 3:
			System.out.println("Awesome Sauce!!!!");
			break;
			
		case 4:
			System.out.println("I miss you");
			break;

			default:
				System.out.println("Unknown error has occurred.");
		
		}
		
		System.out.println(" ");
		
	}
	
}


