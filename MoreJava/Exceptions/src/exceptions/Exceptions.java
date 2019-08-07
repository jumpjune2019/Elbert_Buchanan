package exceptions;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Catching \"Exceptions\" is a way to keep your program from crashing");
		System.out.println("if an event occurs that would cause a Run-Time error");
		System.out.println("This is done by using a try catch block");
		System.out.println("The following is an example that will catch an array \"OutOfBounds\" exception");
		System.out.println(" ");
		
		String [] cars =  {"Ford", "Nissan", "Dodge", "Lexus", "Jaguar", "BMW", "Chevy"};
		
		System.out.println("The array that was created is as follows:");
		System.out.println("Ford, Nissan, Dodge, Lexus, Jaguar, BMW, Chevy");
		System.out.println(" ");
		
		// try/catch block
		
		System.out.println("The code will be inclosed in a \"try/Catch\" block");
		System.out.println("Which will ensure that the program will not crash");
		System.out.println("if faulty code is written or faulty input");
		System.out.println(" ");
		
		try
		{		   
			//System.out.println(cars[8]);
			System.out.println(cars[5]);
			int i = 10/0;
		}
		//    must have an exception to catch
		catch (ArrayIndexOutOfBoundsException error)
		{
			System.out.println("Array Error");
			System.out.println(error);
		}
		catch (ArithmeticException error)
		{
			System.out.println("Math Error");
			System.out.println(error);
		}
		System.out.println("End");
	}

}

