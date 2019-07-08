package bookpack;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This is a simple Coin Toss program
		// Since a coin toss is a game of chance, 
		// The results should be random. Therefore, 
		// I will use random method
		System.out.println("Coin Flip Program");
		System.out.println();
		if (Math.random() < 0.5){
			System.out.println("The coin flip is: Heads");
			}else{
			System.out.println("The coin flip is: Tails");
		}
	}
}
