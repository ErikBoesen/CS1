import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		for (int i = 0; i <= 10; i++) {
			System.out.println(3*i);
		}
		for (int k = 40; k >= 20; k = k-5) {
			System.out.println(k/3);
		}
		String answer;
		boolean result = true;
		do {
			System.out.println("What is your name?");
			String name = kb.next();
			System.out.print(name);
			for (int i = 0; i <= 4; i++) {
				System.out.print(", " + name);
			}
			System.out.println("!");
			System.out.println("Would you like to run again?");
			answer = kb.next();
		} while (answer.equalsIgnoreCase("yes"));
		System.out.println("Congratulations on your participation!");
	}
}
