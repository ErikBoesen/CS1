import java.util.Scanner;

public class Project5 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int secret = (int)(Math.random() * 15 + 1);
		System.out.println("What is your name?");
		String name = kb.next();
		System.out.println("The computer has selected a number between 1 and 15, inclusive. You have ten tries to guess the number. Good luck!");
		int input;
		boolean guessed = false;
		for (int i = 1; i <= 10; i++) {
			if (guessed == false) {
				System.out.println("Try " + i + ":");
				input = kb.nextInt();
				if (input == secret) {
					System.out.println("Congratulations, you won the game!");
					guessed = true;
				}
				else {
					System.out.println("Try again.");
				}
			}
		}
	}
}
