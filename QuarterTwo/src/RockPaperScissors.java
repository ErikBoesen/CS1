import java.util.Scanner;

public class RockPaperScissors {
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissors! What is your name?");
		String name = kb.nextLine();
		System.out.println("Welcome, " + name + "!");
		boolean playAgain = false;
		String playAgainIntent = "";
		do {
			System.out.println("How many games would you like to play?");
			int games = kb.nextInt();
			boolean validComparison = true;
			int score = 0;
			int computerScore = 0;
			String choice = "";
			boolean validAnswer = true;
			String computerChoice = "";
			for (int i = 0; i < games; i++) {
				do {
					validComparison = true;
					System.out.println(name + " has " + score + " points, Computer has " + computerScore + ". There are " + (games - i) + " turns left.");
					do {
						System.out.println("Do you choose rock, paper, or scissors?");
						choice = kb.next().toLowerCase();
						if (!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors")) {
							validAnswer = false;
							System.out.println("That is not a valid answer. Valid answers are \"rock\", \"paper\", and \"scissors\". Please try again.");
						}
					} while (!validAnswer);
					int randomChoice = (int)(Math.random() * 3 + 1);
					if (randomChoice == 1) {
						computerChoice = "rock";
					}
					else if (randomChoice == 2) {
						computerChoice = "paper";
					}
					else if (randomChoice == 3) {
						computerChoice = "scissors";
					}
					System.out.print("The computer chose " + computerChoice + ", ");
					if (choice.equals(computerChoice)) {
						validComparison = false;
						System.out.println("please try again.");
					}
					else if ((choice.equals("rock") && computerChoice.equals("scissors")) || (choice.equals("paper") && computerChoice.equals("rock")) ||(choice.equals("scissors") && computerChoice.equals("paper"))) {
						System.out.println("so you win this turn! Congratulations!");
						score++;
					}
					else if ((computerChoice.equals("rock") && choice.equals("scissors")) || (computerChoice.equals("paper") && choice.equals("rock")) ||(computerChoice.equals("scissors") && choice.equals("paper"))) {
						System.out.println("and wins this turn.");
						computerScore++;
					}
					System.out.println("");
				} while (!validComparison);
				if (score > games / 2) {
					System.out.println("You win this round! Nice job!");
					i = games;
				}
				else if (computerScore > games / 2) {
					System.out.println("The computer wins the game. Sorry! Better luck next time!");
					i = games;
				}
			}
			System.out.println("Do you want to play again?");
			playAgainIntent = kb.next();
			if (playAgainIntent.substring(0, 1).equalsIgnoreCase("y")) {
				playAgain = true;
			}
			else {
				System.out.println("Thanks for playing! Have a good day!");
				playAgain = false;
			}
		} while (playAgain);
	}
}
