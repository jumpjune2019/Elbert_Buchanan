package genarrayswap;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] sw = {"Han", "Luke", "Chewey", "Leia", "Lando", "Anikin"};
		
		List<String> x = new ArrayList<String>(Arrays.asList(sw));
		
		System.out.println("Some Star Wars characters are: " + Arrays.toString(sw));
		
		ElementSwap.swap(x, 1, 4);
		System.out.println("Swap Luke and Lando : " + x);

	}

}
