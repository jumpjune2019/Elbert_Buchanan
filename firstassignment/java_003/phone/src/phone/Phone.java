package phone;
import java.io.*;
import java.util.*;


public class Phone {
	
	//this function uses the class name of the same name to throw an exception
	public static void BlankString(String line) throws EmptyException{
		/*
		 * If line is blank throws a new exception
		 */
		if(line.equals("")) {
			throw new EmptyException("Empty String detected. ");
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Print statements to tell user what the application is
		
		// array can be made to be dynamic by using a list
		/*
	    List<int[]> rowList = new ArrayList<int[]>();

	    rowList.add(new String[] { });
	    rowList.add(new String[] { }); 
	    rowList.add(new String[] { });
	    */
		
		// Using a fixed one for now
		String [][] contacts= new String[6][3];
		Scanner scan = new Scanner(System.in);
		String inputString ="";
		/*
		 * Printstream objects that use a file and prints to it.
		 */
		PrintStream o = new PrintStream(new File("phone.txt"));
		PrintStream console = System.out;
		
		contacts[0][0]="Name";
		contacts[0][1]="Phone Number";
		contacts[0][2]="City";
		
		for (int row = 1; row < contacts.length; row++) {
			for (int col = 0; col < contacts[row].length; col++) {
				try {
					if(col==0){
						System.out.println("Enter name: ");
						inputString = scan.nextLine();
						BlankString(inputString);
						contacts[row][0]=inputString;
						
					}else if(col==1){
						System.out.println("Enter phone number: ");
						inputString = scan.nextLine();
						BlankString(inputString);
						contacts[row][1]=inputString;
					}else if(col==2){
						System.out.println("Enter city: ");
						inputString = scan.nextLine();
						BlankString(inputString);
						contacts[row][2]=inputString;
					}
				}catch (Exception e) {
					System.out.println("Exception found " + e);
					System.out.println("Enter something!");
					inputString = scan.nextLine();
					contacts[row][col] = inputString;
				}
			}
			
//------------------------------------------------------------------------------------------------------------------------------------------------------
			// give the option to exclude row
			
			System.out.println("You have entered: " + contacts[row][0] + "\t" + contacts[row][1] + "\t" + contacts[row][2]);
			System.out.println("Do you want to keep this information? Y/N");
			
			// get userInput
			inputString = scan.nextLine();
			
			if (inputString.equalsIgnoreCase("Y")) {
				// user wants data continue as usual
				continue;
			} else {
				// decrement counter to overwrite row
				row--;
			}
			
		}
		
//-------------------------------------------------------------------------------------------------------------------------------------
		
		// Print statement for header
		System.out.println("Print to file(f), screen(s), or both(b)?");
		inputString = scan.nextLine();
		if(inputString.equalsIgnoreCase("s")) {
			System.setOut(console);
			System.out.println("name  \t\t\tPhone Number \t\t\t Cityname");
			System.out.println("");
			// Print to console
			for (int row = 1; row < contacts.length; row++) {
				System.out.println(contacts[row][0] + "\t\t\t" + contacts[row][1] + "\t\t\t\t" + contacts[row][2]);
				// next line
				System.out.println("\n"); // this line makes the rows go to the next line at the end of the row
			}
		
		} else if(inputString.equalsIgnoreCase("f")) {
//-----------------------------------------------------------------------------------------------------------------------------------
		// Print to file
			System.setOut(o);
			System.out.println("");
			for (int row = 1; row < contacts.length; row++) {
				System.out.println(contacts[row][0] + "\t\t\t" + contacts[row][1] + "\t\t\t\t" + contacts[row][2]);
				// next line
				System.out.println("\n"); // this line makes the rows go to the next line at the end of the row
			}
		
		} else if(inputString.equalsIgnoreCase("b")) {
			System.setOut(console);
			for (int row = 1; row < contacts.length; row++) {
				System.out.println(contacts[row][0] + "\t\t\t" + contacts[row][1] + "\t\t\t\t" + contacts[row][2]);
				// next line
				System.out.println("\n"); // this line makes the rows go to the next line at the end of the row
			}
			System.setOut(o);
			for (int row = 1; row < contacts.length; row++) {
				System.out.println(contacts[row][0] + "\t\t\t" + contacts[row][1] + "\t\t\t\t" + contacts[row][2]);
				// next line
				System.out.println("\n"); // this line makes the rows go to the next line at the end of the row
			}
		}
		// Do both
	}
}
