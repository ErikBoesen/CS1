import java.util.Scanner;

public class Dice {
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		System.out.println("How many sides do you want on the die?");
		int dieSides = kb.nextInt();
		System.out.println("How many rolls?");
		int rolls = kb.nextInt();
		int winningRoll = (int)(Math.random() * dieSides + 1);
		System.out.println("Grand Prix Winning Number is " + winningRoll + "!");
		System.out.println("Your rolls:");
		int roll;
		for (int i = 0; i < rolls; i++) {
			roll = (int)(Math.random() * dieSides + 1); 
			if (roll == winningRoll) {
				System.out.println(roll + " - You won a prize!");
			}
			else {
				System.out.println(roll + " - You didn't win. Sorry.");
			}
		}
	}
}
