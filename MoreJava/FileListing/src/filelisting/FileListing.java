package filelisting;

import java.io.File;

public class FileListing {
	
	// This example demonstrates how to list directories

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = null;
		
		String paths[];
		
		f = new File("/JavaPrograms"); 
		paths = f.list();
		
		for(String p: paths) {
			System.out.println(p);
		}
	}

}
