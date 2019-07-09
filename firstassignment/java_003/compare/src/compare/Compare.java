package compare;

import java.io.*;

public class Compare {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// try to read txt files from specified location 
		// file 1
		/* paths 
		 * sample1.txt: C:\JavaTraining\assignments\java_003\compare\src\compare\sample1.txt
		 * sample2.txt: C:\JavaTraining\assignments\java_003\compare\src\compare\sample2.txt
		 * sample3edited.txt: C:\JavaTraining\assignments\java_003\compare\src\compare\sample3edited.txt
		 * 
		 * paths can be copied and pasted for comparison. Spring adds the additional \
		 */
		File file1 = new File("C:\\JavaTraining\\assignments\\java_003\\compare\\src\\compare\\sample1.txt"); //specify path in quotes
		
		// file 2
		File file2 = new File("C:\\JavaTraining\\assignments\\java_003\\compare\\src\\compare\\sample3edited.txt"); //specify path in quotes
		
		//Buffered reader and FileInputStream objects
        BufferedInputStream fis1 = new BufferedInputStream(new FileInputStream(file1)); //fis short for FileInputStream
        BufferedInputStream fis2 = new BufferedInputStream(new FileInputStream(file2));
        
        int b1 = 0, b2 = 0, pos = 1;
        while (b1 != -1 && b2 != -1) {
            if (b1 != b2) {
                System.out.println("Files differ at position " + pos);
            }
            pos++;
            b1 = fis1.read();
            b2 = fis2.read();
        }
        if (b1 != b2) {
            System.out.println("Files have different length");
        } else {
            System.out.println("Files are identical, you can delete one of them.");
        }
        fis1.close();
        fis2.close();
	}

}
