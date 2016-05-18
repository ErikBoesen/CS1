import java.util.Scanner;

public class SATMath {
	public static void main(String[] args) {
		String password = "password#12345";
		String username = "JohnCena42";
		Scanner kb = new Scanner(System.in);
		Boolean entranceGranted = false;
		do {
			System.out.println("Please enter your password:");
			String typedUsername = kb.next();
			if (username.equals(typedUsername)) {
				System.out.println("Please type your password:");
				String typedPassword = kb.next();
				if (password.equals(typedPassword)) {
					System.out.println("Welcome to your account.");
					entranceGranted = true;
					System.out.println("What is your Math SAT Score?");
					int mathSAT = kb.nextInt();
					System.out.println("What is your English SAT Score?");
					int englishSAT = kb.nextInt();
					int total = (2 * mathSAT) + (2 * englishSAT);
					if (total > 3000) {
						System.out.println("Congratulations, you have been accepted to MIT!");
					}
					else {
						System.out.println("Sorry, you have not passed our test.");
						System.out.println("Maybe try Nova Community College?");
					}
				}
				else {
					System.out.println("That password is incorrect, please try again.");
				}
			}
		} while (entranceGranted = false);
	}
}