import java.util.Scanner;

public class RandomWord {
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		boolean runAgain = false;
		do {
			System.out.println("Enter your word:");
			String word = kb.next();
			int numE = 0;
			for (int i = 0; i < word.length(); i++) {
				if (word.toLowerCase().charAt(i) == 'e') {
					numE++;
				}
			}
			System.out.println("There are " + numE + " E's in the word " + word + ".");
			System.out.println("Play again?");
			String playAgainIntent = kb.next();
			if (playAgainIntent.charAt(0) == 'y') {
				runAgain = true;
				System.out.println("Great! Restarting game.");
			}
			else if (playAgainIntent.charAt(0) == 'n') {
				System.out.println("Thank you for playing! Have a good day.");
			}
			else {
				System.out.println("That is not a valid option. Exiting.");
			}
		} while (runAgain);
	}
}
