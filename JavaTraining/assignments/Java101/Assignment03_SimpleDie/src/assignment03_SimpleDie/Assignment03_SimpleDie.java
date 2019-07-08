package assignment03_SimpleDie;
import java.util.Scanner;

public class Assignment03_SimpleDie {
	
	static int dieToss() {		
		// Random method that produces a 1 - 6
		int roll = (int)(Math.random() * 6) + 1;
		return roll;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Needs user input so Scanner was imported
		
		// Scanner object
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Press any key to throw a pair of dice and press Enter");
		System.out.println("(or Q and Enter to quit)");
		
		String userPlay = scan.nextLine();
		
		if (userPlay.toUpperCase().charAt(0) == 'Q') {
			// char at index 0 will be read.
			scan.close();			
			return;
		}
		
		// If the user does not enter Q, roll die
		
		do{
			// Reveals what the user rolled
			System.out.println("You have rolled the following: " + dieToss());
		
			// as the user if they wants to play again
			System.out.print("Play again? Press Y and Enter, ");
			System.out.println("any other key and Enter to Quit");
			
			userPlay = scan.nextLine();
			
		//continue to roll the die while the user says y
		} 
		while (userPlay.toUpperCase().charAt(0) == 'Y');
		
		// Closes scanner
		scan.close();
		return;
	}
}
