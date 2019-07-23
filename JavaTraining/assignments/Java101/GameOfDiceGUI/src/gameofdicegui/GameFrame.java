package gameofdicegui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame {
	
	 //Global labels
	private static JLabel lbwinner = new JLabel("Let's Play!!",  SwingConstants.CENTER);	
	private static JLabel lbresults = new JLabel("Feeling Lucky?", SwingConstants.CENTER);
	
//--------------------------------------------------------------------------------------------------------
	// Setting up the Container
	
	private JFrame jfrm;
	// Constructor
	GameFrame(String title) {
		// Create a new JFrame container.
		jfrm = new JFrame(title);		
		
		printLabels ();
		
		Container con = getContentPane();
		jfrm.add(con);
		
//-----------------------------------------------------------------------------------------------------
		// Click to play button
		// labels added to container
		con.add(lbresults, BorderLayout.NORTH);	
		con.add(lbwinner);

		
		
		JButton button1 = new JButton("Click to play");
		jfrm.add(button1, BorderLayout.NORTH);
		

		
		button1.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e){	
				playDice();			
			}			
		});
		
		JButton button2 = new JButton("Reset");
		jfrm.add(button2, BorderLayout.SOUTH);
		
		button2.addActionListener(new ActionListener(){			
			public void actionPerformed(ActionEvent e){	
				lbresults.setText("New Game!");						
			}			
		});
	}
	

//------------------------------------------------------------------------------------------------------------------------	
	public JFrame getFrame() {
		return jfrm;
	}

	
//------------------------------------------------------------------------------------------------------------------------
	// The array
	static String[][] diceLabels = new String[6][6];
	
	// The labels based on previous work
	
	private void printLabels () {
		//fill diceLabels array
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
	}
	
	static int dieToss() {
		return (int)(Math.random() * 6) + 1;
	}
	
	static void playDice() {
		
		String results = "";
		String winner = "";
		
		
		lbresults.setText("Rolling the dice...");
		
		//roll the dice
		int x = dieToss();
		int y = dieToss();
		
		int a = dieToss();
		int b = dieToss();
		
		// player's roll
		results = "You have rolled a " + x + " and " + y + " > the " + rollName(x,y);
		
		// the computer's rolled
		results += "\nI have rolled a " + a + " and " + b + " > the " + rollName(a,b);

		//display the results of the game
		lbresults.setText(results);
		
		//determine who won
		if ((x+y) > (a+b)) {
			//user won
			winner = "You win!!";
			winner += "\nDid you cheat?? Gimme another try, c'mon ";
			lbresults.setText(winner);
			
		} else if ((x+y) < (a + b)) {
			//the computer won
			winner = "I win!!";
			winner += "\nWanna try again? ";
			lbwinner.setText(winner);
			
		} else if ((x+y) == (a + b)) {
			//there's a tie
			if ((x == y) && (a == b)) {
				//everybody has doubles, stale mate
				winner = "Stalemate! You're tough, let's try for a tiebreaker ";
				lbwinner.setText(winner);
			} else if (x == y) {
				//user has doubles and wins
				winner = "Damn! You win on a Double! What luck!";
				winner += "\nDid you cheat?? Gimme another try, c'mon ";
				lbwinner.setText(winner);
			} else if (a == b) {
				//computer has doubles and wins
				winner = "Damn! I win on a Double! Ah! I pity you fool!";
				winner += "\nWanna try again? ";
				lbwinner.setText(winner);
			} else {
				//no one has doubles
				winner = "Stalemate! You're tough, let's try for a tiebreaker ";
				lbwinner.setText(winner);
			}
			
			//display the winner
			lbwinner.setText(winner);
			System.out.println(winner);
		}
	}
	
	static String rollName(int x, int y) {
		
		return diceLabels[x-1][y-1].toString();
	}
	
}
