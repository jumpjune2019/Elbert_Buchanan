package gameofdicegui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GameMain {
	
	public static void centerAndSizeJFrameOnScreen(JFrame frm, int width, int height) {
		// set the size of the frame to half in width and height
		frm.setSize(width/2, height/2);
		// here's the part where the JFrame gets actually centered
		frm.setLocationRelativeTo(null);
}
	
	public static JFrame setFrameStuff(JFrame frm, int onExit, int width, int height) {
		// this will center and size the JFrame on screen
		// it will have a height and width of half the screen
		centerAndSizeJFrameOnScreen(frm, width, height);
		frm.setDefaultCloseOperation(onExit);
		
		return frm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwingUtilities.invokeLater(new Runnable() {
			GameFrame demo;
			JFrame frm;
			
			public void run() {
				demo = new GameFrame("Game Of Dice");
				frm = demo.getFrame();
				frm = setFrameStuff(frm, JFrame.EXIT_ON_CLOSE, 800, 400);							
				frm.setVisible(true);
			}
		});
	}
}



