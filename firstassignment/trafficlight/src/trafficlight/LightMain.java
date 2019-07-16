package trafficlight;

import java.util.Scanner;
import java.io.IOException;

public class LightMain {
	
	synchronized static void enterPress() {
		MyThread trafficlights = new MyThread("trafficlights"); //sets up thread
		
        Scanner input = new Scanner(System.in); 
        String key = input.nextLine(); 
        
        // This block will end the thread when 'Enter' is pressed
        while(key.equals("")) {
        	
            if (key.isEmpty()) {
                System.out.println("Traffic Light Simulator is Done!");
                trafficlights.myStop();

                break;
            }

            if (input.hasNextLine()) {
                key = input.nextLine();
            } else {
                key = null;
            }

        }
        
        input.close();
        System.exit(0);
    }

	public static void main(String[] args)  throws IOException {
		// Starting message
		System.out.println("Traffic Light Simulator is a go!!"); 
		enterPress();
	}

}
