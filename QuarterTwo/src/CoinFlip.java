import java.util.Scanner;

public class CoinFlip {
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		boolean playAgain = false;
		System.out.println("Which coin will you be flipping?");
		String coin = kb.next().toLowerCase();
		do {
			boolean validInput = true;
			int guessData = -1;
			do {
				System.out.println("Do you think the " + coin + " will be heads or tails?");
				String guess = kb.next();
				if (guess.equalsIgnoreCase("heads")) {
					guessData = 1;
				}
				else if (guess.equalsIgnoreCase("tails")) {
					guessData = 0;
				}
				else {
					System.out.println("That is not a valid answer, please try again.");
					validInput = false;
				}
			} while (!validInput);
			int coinData = (int)(Math.random());
			if (coinData == guessData) {
				System.out.println("You win! Congrats!");
			}
			else {
				System.out.println("You lose this round. Sorry.");
			}
			System.out.println("Play again?");
			String playAgainIntent = kb.next();
			if (playAgainIntent.charAt(0) == 'y') {
				playAgain = true;
				System.out.println("Great! Restarting game.");
			}
			else if (playAgainIntent.charAt(0) == 'n') {
				System.out.println("Thank you for playing! Have a good day.");
			}
			else {
				System.out.println("That is not a valid option. Exiting.");
			}
		} while (playAgain);
	}
}
