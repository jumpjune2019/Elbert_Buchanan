package headortailgui;

import javax.swing.*;

public class Container {
		
	private JFrame jfrm;
	// Constructor
	Container(String title) {
		// Create a new JFrame container.
		jfrm = new JFrame(title);
		jfrm.setLayout(new BoxLayout(jfrm.getContentPane(), BoxLayout.Y_AXIS));
	}
	public JFrame getFrame() {
		return jfrm;
	}
}

