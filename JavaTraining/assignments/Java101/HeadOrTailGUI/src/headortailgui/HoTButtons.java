package headortailgui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;

public class HoTButtons implements ActionListener{
	
	static JLabel jlab;
	String flip;
	String reset;
	String second;
	static String firstMsg;
	static String secondMsg;
	String thirdMsg;
	
	// possibly remove the parameters to see if that will allow me to set multiple panels
	// with different setups
	
	                               // "Click to Flip!", "Reset", "Heads", "Tails", "waiting......"
	public void setButtons(JPanel frm, String f, String r, String fMsg, String sMsg, String tMsg) {
		flip = f;
		reset = r;
		//second = s;
		firstMsg = fMsg;
		secondMsg = sMsg;
		thirdMsg = tMsg;
		
		JButton jbtnFlip = new JButton(flip);
		JButton jbtnReset = new JButton(reset);
		
		// Add action listeners.
		jbtnFlip.addActionListener(this);
		jbtnReset.addActionListener(this);
		
		// Add the buttons to the content pane.
		frm.add(jbtnFlip);
		frm.add(jbtnReset);
		
		// Create a label.
		jlab = new JLabel("Waiting.....");
		// Add the label to the frame.
		frm.add(jlab);
		
	}
	
	// Handles button events
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals(flip)) {
		//coinFlip();
			//get a random number between 1 and 2 inclusive
			int toss = (int)(Math.random() * 2) + 1;
			//if the number is 1 return Head
			if (toss == 1) {
				jlab.setText(firstMsg);
				//coin = "Head";
			//if the number is 2 return Tail
			} else {
				jlab.setText(secondMsg);
				//coin = "Tail";
			}
		}
		if(ae.getActionCommand().equals(reset)) {
			jlab.setText(thirdMsg);
		}
	}		
		
		/*
		if(ae.getActionCommand().equals(flip)) {
			jlab.setText(firstMsg);
		} else {
			jlab.setText(secondMsg);
		}
	}*/
	/*
	static int coinFlip() {
		
		//get a random number between 1 and 2 inclusive
		int toss = (int)(Math.random() * 2) + 1;
		
		//return random number
		return toss;
	}
	
	static String headsOrTails(int toss) {
		String coin = null;
		
		//if the number is 1 return Head
		if (toss == 1) {
			jlab.setText(firstMsg);
			//coin = "Head";
		//if the number is 2 return Tail
		} else {
			jlab.setText(secondMsg);
			//coin = "Tail";
		}
		
		return coin;
	}*/
}




















