package afk;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.*;

public class Assignment1 extends JFrame  implements KeyListener,
ActionListener{
	private static final long serialVersionUID = 1L;
	JTextArea displayArea;
	JTextField typingArea;
	static final String newline = System.getProperty("line.separator");
	Assignment1Runnable t1 = new Assignment1Runnable("Thread1");
	
	Assignment1Runnable t2 = new Assignment1Runnable("Thread2");
	
	Assignment1Runnable t3 = new Assignment1Runnable("Thread");
	
	Assignment1Runnable t4 = new Assignment1Runnable("Thread");
	
	Assignment1Runnable t5 = new Assignment1Runnable("Thread");
	
	Assignment1Runnable thread;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Robot r = new Robot();
//		Scanner input = new Scanner(System.in);
//		int number1= input.nextInt();
		
		  
		  
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		//if(r.keyPress(keycode);)


//---------------------------------------------------------------------------------------------
		//AWT stuff
		


    /* Use an appropriate Look and Feel */
    try {
        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
    } catch (UnsupportedLookAndFeelException ex) {
        ex.printStackTrace();
    } catch (IllegalAccessException ex) {
        ex.printStackTrace();
    } catch (InstantiationException ex) {
        ex.printStackTrace();
    } catch (ClassNotFoundException ex) {
        ex.printStackTrace();
    }
    /* Turn off metal's use of bold fonts */
    UIManager.put("swing.boldMetal", Boolean.FALSE);
    
    //Schedule a job for event dispatch thread:
    //creating and showing this application's GUI.
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            createAndShowGUI();
        }
    });
}

/**
 * Create the GUI and show it.  For thread safety,
 * this method should be invoked from the
 * event-dispatching thread.
 */
private static void createAndShowGUI() {
    //Create and set up the window.
	Assignment1 frame = new Assignment1("KeyEventDemo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //Set up the content pane.
    frame.addComponentsToPane();
    
    
    //Display the window.
    frame.pack();
    frame.setVisible(true);
}

private void addComponentsToPane() {
    
    JButton button = new JButton("Clear");
    button.addActionListener(this);
    
    typingArea = new JTextField(20);
    typingArea.addKeyListener(this);
    
    //Uncomment this if you wish to turn off focus
    //traversal.  The focus subsystem consumes
    //focus traversal keys, such as Tab and Shift Tab.
    //If you uncomment the following line of code, this
    //disables focus traversal and the Tab events will
    //become available to the key event listener.
    //typingArea.setFocusTraversalKeysEnabled(false);
    
    displayArea = new JTextArea();
    displayArea.setEditable(false);
    JScrollPane scrollPane = new JScrollPane(displayArea);
    scrollPane.setPreferredSize(new Dimension(375, 125));
    
    getContentPane().add(typingArea, BorderLayout.PAGE_START);
    getContentPane().add(scrollPane, BorderLayout.CENTER);
    getContentPane().add(button, BorderLayout.PAGE_END);
}

public Assignment1(String name) {
    super(name);
}
//writeArea.addKeyListener(new KeyListener() {
//---------------------------------------------------------------------------------------------



//---------------------------------------------------------------------------------------------
// Possible logic for key press function

// Handle the key typed event from the text field. 


@Override
public void keyTyped(KeyEvent e) {
	
}

@Override
public void keyReleased(KeyEvent e) {
	
}

@Override
public void keyPressed(KeyEvent e) {
//  if(e.getKeyCode() == KeyEvent.VK_1) {
//		//display this message if '1' is pressed
//  	String msg1 = "Controlling Thread 1";
//  	//displayInfo(msg1);
//		//if thread 1 is paused already
//  	if(t1.suspended == true) {
//  		t1. myResume();	//resume
//  	}
//		//if thread 1 is not paused
//  	else if(t1.suspended == false) {
//  		t1.mySuspend();	//pause
//  	}
//  }
	System.out.println(e.getKeyChar());
	displayInfo(e);
}

//});

/** Handle the button click. */
public void actionPerformed(ActionEvent e) {
    //Clear the text components.
    displayArea.setText("");
    typingArea.setText("");
    
    //Return the focus to the typing area.
    typingArea.requestFocusInWindow();
}

/*
 * We have to jump through some hoops to avoid
 * trying to print non-printing characters
 * such as Shift.  (Not only do they not print,
 * but if you put them in a String, the characters
 * afterward won't show up in the text area.)
 */
private void displayInfo(KeyEvent e){
    
    //You should only rely on the key char if the event
    //is a key typed event.
    

    char c = e.getKeyChar();
    switch (c) {
        case '1':  
        	thread = t1;
        	if(t1.suspended == true)
        		t1.myResume();
        	else { 
        		t1.mySuspend();
        	}
            break;
                
        case '2':  
        	thread = t2;
        	if(t2.suspended == true)
        		t2.myResume();
        	else { 
        		t2.mySuspend();
        	}
            break;
        case '3':  
        	thread = t3;
        	if(t3.suspended == true)
        		t3.myResume();
        	else { 
        		t3.mySuspend();
        	}
                 break;
        case '4':  
        	thread = t4;
        	if(t4.suspended == true)
        		t4.myResume();
        	else { 
        		t4.mySuspend();
        	}
                 break;
        case '5': 
        	thread = t5;
        	if(t5.suspended == true)
        		t5.myResume();
        	else { 
        		t5.mySuspend();
        	}
                 break;
        case 'n':  
        	setThreadPriority(c);
                 break;
        case 't':  
        	setThreadPriority(c);
                 break;
        case 'l':  
        	setThreadPriority(c);
                 break;
        case 's':  
        	setThreadPriority(c);
                 break;

        default: 
        	System.out.println("That's not a valid input.");
            break;
                 
        
    	}
	}


//    displayArea.append(keyStatus + newline
//            + "    " + keyString + newline
//            + "    " + modString + newline
//            + "    " + actionString + newline
//            + "    " + locationString + newline);
//    displayArea.setCaretPosition(displayArea.getDocument().getLength());
    
		
// Set Priority methods
public void setThreadPriority (char c) {
    
    switch (c) {
    case 't':
        thread.thrdName.setPriority(Thread.MAX_PRIORITY);
        break;
    case 'l':
        thread.thrdName.setPriority(Thread.MIN_PRIORITY);
        break;
    case 'n':
        thread.thrdName.setPriority(Thread.NORM_PRIORITY);
        break;
    case 's':
    	System.out.println(c);
        thread.myStop();
        break;

    default:
        System.out.println("Not a valid input.");
    }
    
    thread.thrdName.setPriority(10);
	}
}







		      
