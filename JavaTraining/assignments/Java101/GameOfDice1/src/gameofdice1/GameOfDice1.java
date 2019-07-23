package gameofdice1;

import java.util.Scanner;

public class GameOfDice1 {
	/* 
	 * On this assignment, I apparently didn't have it in my Git folder or my
	 * local workspace. I did, however do it at the time it was supposed to be done.
	 * I just never moved the files to their proper place. I'm not exactly
	 * sure at what point I overlooked doing this and thought I had turned it in.
	 * I worked with Angela Leighton at the time and she helped me get up to speed
	 * since I was terribly out of practice with Java. 
	 * Therefore, I will have to do this and push the original also
	*/
	
	static String[][] diceCombos = new String[6][6];
	
	static String rollName(int x, int y) {		
		return diceCombos[x-1][y-1].toString();
	}
	
	static int dieToss() {		
		// gets a random number between 1 and 6
		int roll = (int)(Math.random() * 6) + 1;		
		// returns number
		return roll;
	}

	public static void main(String[] args) {	
		//fill diceCombos array
		diceCombos[0][0] = "Snake eyes";
		diceCombos[0][1] = "Ace caught a deuce";
		diceCombos[0][2] = "Easy four";
		diceCombos[0][3] = "Little Phobe";
		diceCombos[0][4] = "Sixie from Dixie";
		diceCombos[0][5] = "The Devil";
		diceCombos[1][0] = "Austrailian yo";
		diceCombos[1][1] = "Ballerina";
		diceCombos[1][2] = "OJ";
		diceCombos[1][3] = "Easy six";
		diceCombos[1][4] = "Skinny Dugan";
		diceCombos[1][5] = "Easy eight";
		diceCombos[2][0] = "Little Joe from Kokomo";
		diceCombos[2][1] = "The fever";
		diceCombos[2][2] = "Brooklyn forest";
		diceCombos[2][3] = "Skinny McKinney";
		diceCombos[2][4] = "Easy eight";
		diceCombos[2][5] = "Lou Brown";
		diceCombos[3][0] = "No field five";
		diceCombos[3][1] = "Jimmie Hicks";
		diceCombos[3][2] = "Big Red";
		diceCombos[3][3] = "Square pair";
		diceCombos[3][4] = "Jesse James";
		diceCombos[3][5] = "Tennessee";
		diceCombos[4][0] = "Easy six";
		diceCombos[4][1] = "Bennie Blue";
		diceCombos[4][2] = "Eighter from Decater";
		diceCombos[4][3] = "Railroad nine";
		diceCombos[4][4] = "Puppy paws";
		diceCombos[4][5] = "Six five no jive";
		diceCombos[5][0] = "Six one you're done";
		diceCombos[5][1] = "Easy eight";
		diceCombos[5][2] = "Nina from Pasadena";
		diceCombos[5][3] = "Big one on the road";
		diceCombos[5][4] = "Yo";
		diceCombos[5][5] = "Midnight";

//------------------------------------------------------------------------------		
		System.out.println("Welcome to the dice throw challenge!");
		System.out.println("Do you feel lucky? \"Punk\"...Do ya?");
		System.out.print("Press any key and ENTER to throw your dice or ");
		System.out.println("(Q or q) to chicken your butt off...");
//----------------------------------------------------------------------------

		Scanner scan = new Scanner(System.in);			
		String userInput = scan.next();		
		
		if (userInput.toUpperCase().charAt(0) == 'Q') {			
			scan.close();			
			System.out.println("See ya later alligator!");
			return;
		}
		
		do {
			System.out.println("Rolling the dice...");
			// call dieToss
			int x = dieToss();
			int y = dieToss();
			
			int a = dieToss();
			int b = dieToss();
						
			// output results
			System.out.print("You have rolled a " + x + " and " + y + " > the ");
			System.out.println(rollName(x,y));
			
			// output computer's results
			System.out.print("I have rolled a " + a + " and " + b + " > the ");
			System.out.println(rollName(a,b));
			
			// output winner
			if ((x+y) > (a+b)) {
				// if player wins
				System.out.println("You win!!");
				System.out.print("Did you cheat?? Gimme another try, c'mon ");
				
			} else if ((x+y) < (a + b)) {
				// if computer wins
				System.out.println("I win!!");
				System.out.print("Wanna try again? ");
				
			} else if ((x+y) == (a + b)) {
				
				if ((x == y) && (a == b)) {
					
					System.out.print("Stalemate! You're tough, let's try for a tiebreaker ");
				} else if (x == y) {
					
					System.out.println("Damn! You win on a Double! What luck!");
					System.out.print("Did you cheat?? Gimme another try, c'mon ");					
				} else if (a == b) {
					
					System.out.println("Damn! I win on a Double! Ah! I pity you fool!");
					System.out.print("Wanna try again? ");
				} else {
					
					System.out.print("Stalemate! You're tough, let's try for a tiebreaker "); 	
				}				
			}				
			
			System.out.print("Press any key and ENTER to throw your dice or ");
			System.out.println("press (Q or q) to quit");			
			
			userInput = scan.next();			
		
		} while (userInput.toUpperCase().charAt(0) != 'Q');		
		scan.close();
		System.out.println("Thanks for being a sport! Laters!");
		return;
	}
}
