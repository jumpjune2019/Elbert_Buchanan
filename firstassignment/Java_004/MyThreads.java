package afk;

public class Assignment1Runnable implements Runnable {
	Thread thrdName;
	
	// boolean variables for stop and suspend methods
	boolean suspended;  // For control methods
	boolean stopped;    // For control methods
	
	// Constructor t
	Assignment1Runnable(String name) {
		thrdName = new Thread(this, name);
		suspended = false;  // For control methods
		stopped = false;	// For control methods	
		thrdName.start(); // start the thread
	}
	
	// Begin execution of new thread
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// print           calls object
		System.out.println(thrdName.getName() + " Starting");	
		int i = 0;
		try {
			// While loop that will run until event is met
			// Boolean (while true)
			//     system.out(Thread running) --> Substitute with a counter that will display when completed.
			while(!suspended) {
				Thread.sleep(1000);
				i++;
				synchronized (this) {
					while (suspended) {
						System.out.println(thrdName.getName() + " Has been suspended");
						wait();
					}
					if(stopped) {
						break;
					}
				}
			}
		}
		catch(InterruptedException exc) {
			System.out.println(thrdName.getName() + " interrupted.");
		}
		System.out.println(thrdName.getName() + " terminating.  It ran for " + i + " seconds.");
		
		}
	// public void stop thread method
	// --Will toggle boolean in while loop
	// Stop the thread.
//-----------------------------------------------------------------------------
// Suspend, Stop, and Resume methods
	synchronized void myStop() {
		stopped = true;
		// The following ensures that a suspended thread can be stopped.
		suspended = false;
		notify();
	}
	// Suspend the thread.
	synchronized void mySuspend() {
		suspended = true;
		
	}
	// Resume the thread.
	synchronized void myResume() {
		suspended = false;
		System.out.println(thrdName.getName() + " Has resumed");
		notify();
	}
}
//----------------------------------------------------------------------------------------


