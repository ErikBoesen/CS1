import java.util.Scanner;

public class Texts {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int answer = 0;
		int texts = 0;
		do {
			System.out.println("In this 10 minute period, how many texts did you send? (Enter -1 to quit.)");
			answer = kb.nextInt();
			texts += answer;
		} while (answer > 0);
		System.out.println("You sent " + texts + " texts.");
	}
}
