package assignment08_StringArrayUtilities;
import java.util.Arrays;

public class Assignment08_StringArrayUtilities {
	
	static boolean arrayHasExactMatch(String[] arr, String match, boolean caseSen) {
		
		//if the match is case sensitive
		if (caseSen) {
			//loop thru the array
			for(int x=0;x<arr.length;x++) {
				//if there's a match return true
				if (arr[x] == match) {
					return true;
				}
			}
		//if the match is not case sensitive
		}else {
			//loop thru the array
			for(int x=0;x<arr.length;x++) {
				//if there's a match return true
				if (arr[x].equalsIgnoreCase((match))) {
					return true;
				}
			}
		}
		
		//if there is not a match return false
		return false;
		
	}
	
	static int[] indexOfOccuranceInArray(String[] arr, String match, boolean caseSen) {
		
		 int[] matches = new int[] {0};
		 
	 	//if the match is case sensitive
		if (caseSen) { // loop thru the array

			for(int x=0;x<arr.length;x++) { // if there's a match
				if (arr[x] == match) {
					matches[0] = x;
				}
			}
			
		//if the match is not case sensitive
		}else { // loop thru the array
			for(int x=0;x<arr.length;x++) {
				//if there's a match add index to matches
				if (arr[x].equalsIgnoreCase((match))) {
					matches[0] = x;
				}
			}
		}
		
		// if there are no matches return -1
		if (matches[0] == 0) {
			matches[0] = -1;
		}
		
		//return the array of indexes
		return matches;
		
	 }	

	public static void main(String[] args) {
		
		// The array of Strings
		String myList[] = new String[] {"Bozo", "FooBar", "Delta", "Foozball", "Demo", "Money","Zoo"};
		
		// Header
		System.out.println("This is the a test of the arrayHasExactMatch and indexOfOccurenceInArray methods");
		System.out.println("The array to test contains the following items: ");
		System.out.println("{\"Bozo\", \"FooBar\", \"Delta\", \"Foozball\", \"Demo\", \"Money\", \"Zoo\"}");
		
		// Test Cases
		System.out.println("Scenario 1");
		System.out.println("arrayHasExactMatch(myList, \"zo\", false): is "+ arrayHasExactMatch(myList,"zo",false));
		
		System.out.println("Scenario 2");
		System.out.println("arrayHasExactMatch (myList, \"zoo\", false);"+arrayHasExactMatch (myList, "zoo", false));
		
		System.out.println("Scenario 3");
		System.out.println("arrayHasExactMatch (myList, \"zoo\", true)"+arrayHasExactMatch (myList, "zoo", true));
		
		System.out.println("Scenario 4");
		System.out.println("arrayHasExactMatch (myList, \"foo\", true)"+arrayHasExactMatch (myList, "foo", true));
		
		System.out.println("Scenario 5");
		System.out.println("arrayHasExactMatch (myList, \"foo\", false)"+arrayHasExactMatch (myList, "foo", false));
		
		System.out.println("Scenario 6");
		System.out.println("arrayHasExactMatch (myList, \"delta\", true)"+arrayHasExactMatch (myList, "delta", true));
		
		System.out.println("Scenario 7");
		System.out.println("arrayHasExactMatch (myList, \"Delta\", true)"+arrayHasExactMatch (myList, "Delta", true));
		
		System.out.println("\nScenario 8");
		System.out.print("indexOfOccuranceInArray(myList, \"zo\", false): returns ");
		System.out.println(Arrays.toString(indexOfOccuranceInArray(myList, "zo", false)));		
	
		System.out.println("\nScenario 9");
		System.out.print("indexOfOccuranceInArray(myList, \"zoo\", false): returns ");
		System.out.println(Arrays.toString(indexOfOccuranceInArray(myList, "zoo", false)));
		
		System.out.println("\nScenario 10");
		System.out.print("indexOfOccuranceInArray(myList, \"zoo\", true): returns ");
		System.out.println(Arrays.toString(indexOfOccuranceInArray(myList, "zoo", true)));
		
		System.out.println("\nScenario 11");
		System.out.print("indexOfOccuranceInArray(myList, \"foo\", true): returns ");
		System.out.println(Arrays.toString(indexOfOccuranceInArray(myList, "foo", true)));
		
		System.out.println("\nScenario 12");
		System.out.print("indexOfOccuranceInArray(myList, \"foo\", false): returns ");
		System.out.println(Arrays.toString(indexOfOccuranceInArray(myList, "foo", false)));
		
		System.out.println("\nScenario 13");
		System.out.print("indexOfOccuranceInArray(myList, \"delta\", true): returns ");
		System.out.println(Arrays.toString(indexOfOccuranceInArray(myList, "delta", true)));
		
		System.out.println("\nScenario 14");
		System.out.print("indexOfOccuranceInArray(myList, \"Delta\", true): returns ");
		System.out.println(Arrays.toString(indexOfOccuranceInArray(myList, "Delta", true)));


	}

}
