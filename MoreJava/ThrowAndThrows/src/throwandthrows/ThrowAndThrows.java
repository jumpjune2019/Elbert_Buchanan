package throwandthrows;

public class ThrowAndThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Throw and Throws keywords are used in exception handling
		System.out.println("Using \"Throw\" and \"Throws\" keywords");
		
		System.out.println("Throw allows you to trigger an exception");
		System.out.println(" ");
		System.out.println("Throws would be attached to a method");
		System.out.println("which means thast the method could potentially trigger an exception");
		System.out.println(" ");
		
		// put method in a try/catch block as such
		try {
			func();
		}
		catch (ArithmeticException error){
			System.out.println("We caught it!!!! Aieeeeeee...");
		}
		
		
	}
	
	
	public static void func() throws ArithmeticException{
		throw new ArithmeticException();
	}

}
