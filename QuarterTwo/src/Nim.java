import java.util.ArrayList;
import java.util.Scanner;

public class Nim {
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		System.out.println("What is Player 1's name?");
		names.add(kb.nextLine());
		System.out.println("What is Player 2's name?");
		names.add(kb.nextLine());
		System.out.println("You may take either 1 or 2 sticks each turn. Whoever has the last stick loses.");
		boolean gameRunning = true;
		int playerSticks = 0;
		int sticks = 21;
		do {
			for (int i=0; i<=1; i++) {
				System.out.println("There are " + sticks + " sticks remaining.");
				do {
					System.out.println(names.get(i) + ", how many sticks do you want to pick up?");
					playerSticks = kb.nextInt();
					if (playerSticks < 1 || playerSticks > 2 || playerSticks > sticks) {
						if (playerSticks > sticks) {
							System.out.println("There are not that many sticks in the pile.");
						}
						else if (playerSticks < 1) {
							System.out.println("You must pick up at least 1 stick.");
						}
						else if (playerSticks > 2) {
							System.out.println("You may not pick up that many sticks.");
						}
					}
				} while (playerSticks < 1 || playerSticks > 2);
				if (sticks <= 1) {
					System.out.println(names.get(i) + " wins!");
					gameRunning = false;
				}
			}
		} while (gameRunning == true);
		System.out.println("Thank you for playing.");
	}
}
