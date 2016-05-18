import java.util.Scanner;

public class PublicService {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("How much do you weigh (in pounds)?");
		double weight = kb.nextDouble();
		if (weight <= 130) {
			System.out.println("Congratulations! You can be a firefighter administrator!");
		}
		else if (weight > 130) {
			System.out.println("You can be a fire truck driver!");
		}
		else {
			System.out.println("Sorry, you can't be in the fire service.");
		}
		if (weight > 190) {
			System.out.println("Cogratulations, you can be a policeman!");
		}
		else {
			System.out.println("You can be a police administrator.");
		}
	}
}