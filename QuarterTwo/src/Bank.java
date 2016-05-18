import java.text.NumberFormat;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		System.out.println("What is your bank balance?");
		Scanner kb = new Scanner(System.in);
		double balance = kb.nextDouble();
		if (balance > 0) {
			String answer = "";
			boolean validAction = true;
			do {
				do {
					System.out.println("Do you want to make a withdrawal or deposit?");
					String action = kb.next();
					if (action.equalsIgnoreCase("withdrawal")) {
						System.out.println("How much would you like to withdrawal?");
						double withdrawal = kb.nextDouble();
						if (withdrawal < balance) {
							balance = balance - withdrawal;
						}
						else {
							System.out.println("You do not have that much money.");
						}
					}
					else if (action.equalsIgnoreCase("deposit")) {
						System.out.println("How much would you like to deposit?");
						double deposit = kb.nextDouble();
						if (deposit < 0) {
							System.out.println("You can't deposit a negative number, please try again.");
						}
						else {
							balance = balance + deposit;
						}
					}
					else {
						validAction = false;
						System.out.println("That is not a valid action. Valid answers are \"withdrawal\" and \"deposit\". Please try again.");
					}
				} while (validAction != true);
				if (balance >= 0) {
					NumberFormat formatter = NumberFormat.getCurrencyInstance();
					System.out.println("Thank you for doing your banking with Java Bank! Your balance is now " + formatter.format(balance) + "."); 
					System.out.println("Do you want to perform another action?");
					answer = kb.next();
				}
			} while (answer.equalsIgnoreCase("yes") && balance >= 0);
			System.out.println("Thank you for your business!");
		}
		else {
			System.out.println("You do not have any remaining money. Get a job.");
		}
	}
}
