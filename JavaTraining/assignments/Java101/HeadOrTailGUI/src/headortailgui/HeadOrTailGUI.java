package headortailgui;

import javax.swing.SwingUtilities;
import javax.swing.*;
import java.awt.*;

public class HeadOrTailGUI {
	
	// Program to add a GUI to the Heads Or Tails game
	// Here, I will start with using a basic JFrame, title and a few labels
	// In the provided examples, A second class is used, I will follow suit
	// Simple Swing class named 'Container' created
	
	public static void centerAndSizeJFrameOnScreen(JFrame frm, int width, int height) {

		// sets the frame to half in width and height
		frm.setSize(width, height);
		// centers the JFrame
		frm.setLocationRelativeTo(null);
	}
	public static JFrame frameSet(JFrame frm, int onExit, int width, int height) {
        // centers and sets Frame
		centerAndSizeJFrameOnScreen(frm, width, height);
		frm.setDefaultCloseOperation(onExit);
		
		JPanel panel1 = new JPanel();		
		panel1.setLayout(new FlowLayout());
				
		HoTButtons bd = new HoTButtons();
		bd.setButtons(panel1, "Click to Flip!", "Reset", "Heads", "Tails", "waiting......");
		
		frm.add(panel1);
		return frm;
		
		/*
		JLabel lab = new JLabel(label);
		frm.add(lab);
		return frm;
		*/
	}

// All of the above sets up the container for the game.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			Container demo;
			JFrame frm;
			
			public void run() {
				demo = new Container("Head or Tails"); // Title bar name
				frm = demo.getFrame();
				frm = frameSet(frm, JFrame.EXIT_ON_CLOSE, 400, 180);
				frm.setVisible(true);
			}
		});

	}

}
