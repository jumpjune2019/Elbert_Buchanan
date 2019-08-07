package FileIO;

import java.io.*;

public class FileIO {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		// The following example will demonstrate how to read from a .txt file
		
		FileInputStream input1 = null;
		input1 = new FileInputStream("FileInputEx.txt");
		
		int number1;
		
		while ((number1 = input1.read()) != -1) {
			System.out.println(number1);
		}
		
		
		// The following demonstrates how to write a file from IOStream
		
		FileOutputStream output1 = null;
		output1 = new FileOutputStream("Awesome.txt");
		output1.write(65);
		
//---------------------------------------------------------------------------------------------------------------------------------------	
		// The following demonstrates how to read and write using FileReader
		
		FileReader input2 = null;
		input2 = new FileReader("FileInputEx.txt");
		
		int number2;
		
		while ((number2 = input2.read()) != -1) {
			System.out.println(number2);
		}
		
		
		// The following demonstrates how to write a file from IOStream
		
		FileWriter output2 = null;
		output2 = new FileWriter("Awesome.txt");
		
		
		// can look up 16 bit unicode designations from an Internet search
	}
}



























