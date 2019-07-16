package trafficlight;

public class MyThread implements Runnable {
	
	Thread thread; 
	boolean suspended;
	boolean stopped;
	String name; 
	int wait; 
	

	 public MyThread(String name) {
	        thread = new Thread(this, name);
	        suspended = false; 
	        stopped = false; e
	        thread.start();
	 }
	
	//--------------------------------------------------------------------------------------------
		
	// Thread run method with loop for the timing for each thread
	// Begin execution of new thread
	public void run() {
		try {
			while(!stopped) { //this while statement ensures the thread continues running

				if(!stopped) {
					System.out.println(Lights.GREEN.getLabel()); //green message
					Thread.sleep(Lights.GREEN.getTime()); //green timer
				} else {
					break;
				}
                // yellow if statement
                if(!stopped) {
                	System.out.println(Lights.YELLOW.getLabel()); //yellow message
                	Thread.sleep(Lights.YELLOW.getTime()); //yellow timer
                } else {
                	break;
                }
                // red if statement
                if(!stopped) {
                	System.out.println(Lights.RED.getLabel()); //red message
                	Thread.sleep(Lights.RED.getTime()); //red timer
                } else {
                	break;
                }
            }
		} catch (InterruptedException e) {
			System.out.println("Exception caught.");
			e.printStackTrace();
		}
	}
	//----------------------------------------------------------------------------------------------	
	// This will suspend the thread until called again
	synchronized void mySuspend() {
		suspended = true;	
	}
	
	// This will resume the thread
	synchronized void myResume() {
		suspended = false;
		notify();
	}
	
	//this will stop the thread once enter is pressed
	synchronized void myStop() {
		//this should make all suspended threads stopped as well
		suspended = false;
		notifyAll(); //notifies other threads that are stopped
		stopped = true;
	}	
}
