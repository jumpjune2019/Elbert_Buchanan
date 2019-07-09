package matrixchoice;

import java.util.Scanner;
import java.io.*;

public class MatrixChoice {
	
	// need a method to print to console
	// Reuse print statements to form method bodies for both
	static void printToScreen(String[][] diceLabels) {
		
		//print the header
		System.out.println("Dice Combinations Label Matrix\n");
		System.out.print("\tDie 1 \t\t\tDie 2 \t\t\tDie 3 \t\t\tDie 4 \t\t\tDie 5 \t");
		System.out.println("\t\tDie 6");
		
		//print line 1
		System.out.print("Die 1 \t" + diceLabels[0][0] + "\t\t" + diceLabels[0][1] + "\t"); 
		System.out.print(diceLabels[0][2] + "\t\t" + diceLabels[0][3] + "\t\t" + diceLabels[0][4]); 
		System.out.println("\t" + diceLabels[0][5]);
		
		//print line 2
		System.out.print("Die 2 \t" + diceLabels[1][0] + "\t\t" + diceLabels[1][1] + "\t\t"); 
		System.out.print(diceLabels[1][2] + "\t\t\t" + diceLabels[1][3] + "\t\t" + diceLabels[1][4]); 
		System.out.println("\t\t" + diceLabels[1][5]);
		
		//print line 3
		System.out.print("Die 3 \t" + diceLabels[2][0] + "\t" + diceLabels[2][1] + "\t\t"); 
		System.out.print(diceLabels[2][2] + "\t\t" + diceLabels[2][3] + "\t\t" + diceLabels[2][4]); 
		System.out.println("\t\t" + diceLabels[2][5]);
		
		//print line 4
		System.out.print("Die 4 \t" + diceLabels[3][0] + "\t\t" + diceLabels[3][1] + "\t\t"); 
		System.out.print(diceLabels[3][2] + "\t\t\t" + diceLabels[3][3] + "\t\t" + diceLabels[3][4]); 
		System.out.println("\t\t" + diceLabels[3][5]);
		
		//print line 5
		System.out.print("Die 5 \t" + diceLabels[4][0] + "\t\t" + diceLabels[4][1] + "\t\t"); 
		System.out.print(diceLabels[4][2] + "\t" + diceLabels[4][3] + "\t\t" + diceLabels[4][4]); 
		System.out.println("\t\t" + diceLabels[4][5]);
		
		//print line 6
		System.out.print("Die 6 \t" + diceLabels[5][0] + "\t" + diceLabels[5][1] + "\t\t"); 
		System.out.print(diceLabels[5][2] + "\t" + diceLabels[5][3] + "\t" + diceLabels[5][4]); 
		System.out.println("\t\t\t" + diceLabels[5][5]);
	}
	
	// Need a method to save as text file
	// Reused print statements for method body but
	// Changed Sysout to out.write
	
	static void saveToFile(String[][] diceLabels) {		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("filematrix"));
	         
	        //print the header
	 		out.write("Dice Combinations Label Matrix\n");
	 		out.write("\tDie 1 \t\t\tDie 2 \t\t\tDie 3 \t\t\tDie 4 \t\t\tDie 5 \t");
	 		out.write("\t\tDie 6");
	 		
	 		//print line 1
	 		out.write("\nDie 1 \t" + diceLabels[0][0] + "\t\t" + diceLabels[0][1] + "\t"); 
	 		out.write(diceLabels[0][2] + "\t\t" + diceLabels[0][3] + "\t\t" + diceLabels[0][4]); 
	 		out.write("\t" + diceLabels[0][5]);
			
			//print line 2
	 		out.write("\nDie 2 \t" + diceLabels[1][0] + "\t\t" + diceLabels[1][1] + "\t\t"); 
	 		out.write(diceLabels[1][2] + "\t\t\t" + diceLabels[1][3] + "\t\t" + diceLabels[1][4]); 
	 		out.write("\t\t" + diceLabels[1][5]);
	 		
	 		//print line 3
	 		out.write("\nDie 3 \t" + diceLabels[2][0] + "\t" + diceLabels[2][1] + "\t\t"); 
	 		out.write(diceLabels[2][2] + "\t\t" + diceLabels[2][3] + "\t\t" + diceLabels[2][4]); 
	 		out.write("\t\t" + diceLabels[2][5]);
			
			//print line 4
	 		out.write("\nDie 4 \t" + diceLabels[3][0] + "\t\t" + diceLabels[3][1] + "\t\t"); 
	 		out.write(diceLabels[3][2] + "\t\t\t" + diceLabels[3][3] + "\t\t" + diceLabels[3][4]); 
	 		out.write("\t\t" + diceLabels[3][5]);
			
			//print line 5
	 		out.write("\nDie 5 \t" + diceLabels[4][0] + "\t\t" + diceLabels[4][1] + "\t\t"); 
	 		out.write(diceLabels[4][2] + "\t" + diceLabels[4][3] + "\t\t" + diceLabels[4][4]); 
	 		out.write("\t\t" + diceLabels[4][5]);
			
			//print line 6
	 		out.write("\nDie 6 \t" + diceLabels[5][0] + "\t" + diceLabels[5][1] + "\t\t"); 
	 		out.write(diceLabels[5][2] + "\t" + diceLabels[5][3] + "\t" + diceLabels[5][4]); 
	 		out.write("\t\t\t" + diceLabels[5][5]);
	         
	         out.close();
	         System.out.println("File created successfully");
	      }
	      catch (IOException e) {
	      }
		
	}
	
	// Options and method calls in the 'main'

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		// A Header to inform the user what this does
		System.out.println("Dice Labels!!!");
		System.out.println("This app tell you all the names of two-dice combinations");
		System.out.println("");
		
		// prompt user to enter selection
		System.out.println("Please, make your selection: \n1 to print to the screen \n"
				+ "2 to print to file \n3 to do both");
		
		// Declare a two dimensional array that has 
		// 6 column and six rows
		// DiceLabels is as descriptive as it needs to be so I'm sticking with that
		String [][] diceLabels = new String[6][6];
		
		// Assign string Labels to dice combinations
		// Indexes start at 0
		diceLabels[0][0] = "Snake eyes";
		diceLabels[0][1] = "Ace caught a deuce";
		diceLabels[0][2] = "Easy four";
		diceLabels[0][3] = "Little Phobe";
		diceLabels[0][4] = "Sixie from Dixie";
		diceLabels[0][5] = "The Devil";
		diceLabels[1][0] = "Austrailian yo";
		diceLabels[1][1] = "Ballerina";
		diceLabels[1][2] = "OJ";
		diceLabels[1][3] = "Easy six";
		diceLabels[1][4] = "Skinny Dugan";
		diceLabels[1][5] = "Easy eight";
		diceLabels[2][0] = "Little Joe from Kokomo";
		diceLabels[2][1] = "The fever";
		diceLabels[2][2] = "Brooklyn forest";
		diceLabels[2][3] = "Skinny McKinney";
		diceLabels[2][4] = "Easy eight";
		diceLabels[2][5] = "Lou Brown";
		diceLabels[3][0] = "No field five";
		diceLabels[3][1] = "Jimmie Hicks";
		diceLabels[3][2] = "Big Red";
		diceLabels[3][3] = "Square pair";
		diceLabels[3][4] = "Jesse James";
		diceLabels[3][5] = "Tennessee";
		diceLabels[4][0] = "Easy six";
		diceLabels[4][1] = "Bennie Blue";
		diceLabels[4][2] = "Eighter from Decater";
		diceLabels[4][3] = "Railroad nine";
		diceLabels[4][4] = "Puppy paws";
		diceLabels[4][5] = "Six five no jive";
		diceLabels[5][0] = "Six one you're done";
		diceLabels[5][1] = "Easy eight";
		diceLabels[5][2] = "Nina from Pasadena";
		diceLabels[5][3] = "Big one on the road";
		diceLabels[5][4] = "Yo";
		diceLabels[5][5] = "Midnight";
		
		Scanner scan = new Scanner(System.in);
		// Take input from the user
		int select = scan.nextInt();
		
		// try
		
		// if user chooses 1 call print to console method
		if (select == 1) {
			printToScreen(diceLabels);
		}
		
		// if user chooses 2, call save to file method
		if (select == 2) {
			saveToFile(diceLabels);
		}
		
		// if user chooses 3, call 1 and 2 
		if(select == 3) {
			printToScreen(diceLabels);
			saveToFile(diceLabels);
		}
		
	}

}

