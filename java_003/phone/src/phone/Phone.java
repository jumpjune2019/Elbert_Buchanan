package phone;
import java.io.*;
import java.util.*;


public class Phone {

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
		String [][] contacts= new String[5][3];
		Scanner scan = new Scanner(System.in);
		String inputString ="";
		
		contacts[0][0]="Name";
		contacts[0][1]="Phone Number";
		contacts[0][2]="City";
		
		for (int row = 1; row < contacts.length; row++) {
			for (int col = 0; col < contacts[row].length; col++) {
				if(col==0){
					System.out.println("Enter name: ");
					inputString = scan.nextLine();
					contacts[row][0]=inputString;
				}else if(col==1){
					System.out.println("Enter phone number: ");
					inputString = scan.nextLine();
					contacts[row][1]=inputString;
				}else if(col==2){
					System.out.println("Enter city: ");
					inputString = scan.nextLine();
					contacts[row][2]=inputString;
				}
			}
		}
		
		// Print statement for header
				
		System.out.println("name  \t\t\tPhone Number \t\t\t Cityname");
		System.out.println("");
		// Print to console
		for (int row = 1; row < contacts.length; row++) {
			for (int col = 0; col < contacts[row].length; col++) {
				// Above loops do iterates through the indexes rows and columns
				
				// prints name
				if(col==0){
					System.out.print(contacts[row][0] + "\t\t\t");					
				
				//prints number
				}else if(col==1){
					System.out.print(contacts[row][1] + "\t\t\t\t ");					
									
				// prints city	
				}else if(col==2){
					System.out.print(contacts[row][2] + "\t\t\t");				
				}
			}
			// next line
			System.out.println("\n"); // this line makes the rows go to the next line at the end of the row
		}		
		
		// Print to file
		BufferedWriter out = new BufferedWriter(new FileWriter("Phone Book"));
		
		for (int row = 1; row < contacts.length; row++) {
			for (int col = 0; col < contacts[row].length; col++) {
								
				// writes name
				if(col==0){
					out.write(contacts[row][0] + "\t\t\t");					
				
				// writes number
				}else if(col==1){
					out.write(contacts[row][1] + "\t\t\t\t ");					
									
				// writes city	
				}else if(col==2){
					out.write(contacts[row][2] + "\t\t\t");				
				}
			}
			// next line
			System.out.println("\n"); // this line makes the rows go to the next line at the end of the row
		}
		
		
		// Do both
	}
}
