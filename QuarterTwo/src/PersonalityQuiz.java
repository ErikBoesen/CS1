import java.util.Scanner;

public class PersonalityQuiz {
	public static void main(String[] args) {
		System.out.println("Welcome to the personality quiz! Please answer all questions honesly, with 'yes' or 'no'.\nAlternate answers may be provided in 'single' 'quotes', like that.");
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Does Hockey suck?");
		String ans = kb.next();
		
		if (ans.equals("yes")) {
			System.out.println("That's the right answer, good job.\nIs soccer the best sport?");
			ans = kb.next();
			
			if (ans.equals("yes")) {
				System.out.println("Correct. Do you enjoy spending time at George Mason?");
				ans = kb.next();

				if (ans.equals("yes")) {
					System.out.println("Do you have a lot of friends?");
					ans = kb.next();

					if (ans.equals("yes")) {
						System.out.println("You are a sensible and sociable person with reasonable views on sports. Congratulations.");
					} else if (ans.equals("no")) {
						System.out.println("You hold reasonable views on sports, and have a small solid group of friends. You will succeed in all future endeavors.");
					}
				} else if (ans.equals("no")) {
					System.out.println("Star 'wars' or Star 'trek'?");
					ans = kb.next();

					if (ans.equals("wars")) {
						System.out.println("You are a geeky person who likes mainstream movies better than old TV shows. You will succeed in all future endeavors.");
					} else if (ans.equals("trek")) {
						System.out.println("You are a geeky person who likes old TV shows better than mainstream movies. You will succeed in all future endeavors, especially if you decide to be a hipster.");
					}
				}
			} else if (ans.equals("no")) {
				System.out.println("Incorrect, moving on.\n'pie' or 'cookies'?");
				ans = kb.next();

				if (ans.equals("pie")) {
					System.out.println("'cherry' or 'blueberry'?");
					ans = kb.next();

					if (ans.equals("cherry")) {
						System.out.println("Despite questionable views on soccer, you have good taste in pie and will succeed in life.");
					} else if (ans.equals("blueberry")) {
						System.out.println("Despite questionable views on soccer, you have quality taste in pie and will succeed later in life.");
					}
				} else if (ans.equals("cookies")) {
					System.out.println("Do you believe that Oatmeal Raisin cookies were sent to Earth by Satan?");
					ans = kb.next();

					if (ans.equals("yes")) {
						System.out.println("Your knowledge of the history of desserts is impressive, although you hold questionable views on sports. Regardless, you will do well in life.");
					} else if (ans.equals("no")) {
						System.out.println("Despite answering two questions incorrectly, you have shown yourself to be a wise person who will do well in life.");
					}
				}
			}
		} else if (ans.equals("no")) {
			System.out.println("Yes it does.\nIs soccer the best sport?");
			ans = kb.next();
			
			if (ans.equals("yes")) {
				System.out.println("Which do you like better, 'cake' or 'ice cream'?");
				ans = kb.next();

				if (ans.equals("cake")) {
					System.out.println("'marvel' or 'dc'?");
					ans = kb.next();

					if (ans.equals("marvel")) {
						System.out.println("Despite questionable views on hockey, you have good taste in comics and will do well in life.");
					} else if (ans.equals("dc")) {
						System.out.println("Despite questionable views on hockey, you have good taste in comics and will do well in life.");
					}
				} else if (ans.equals("ice")) {
					System.out.println("'vanilla' or 'chocolate'?");
					ans = kb.next();

					if (ans.equals("vanilla")) {
						System.out.println("You have good taste in ice cream, despite poor taste in sports. Regardless, you will succeed in all future endeavors.");
					} else if (ans.equals("chocolate")) {
						System.out.println("You have poor taste in ice cream and sports. Regardless, you will succeed in all future endeavors. Thank you for taking the quiz.");
					}
				}
				
			} else if (ans.equals("no")) {
				System.out.println("Congratulations, you are Mr. Snyder.");
			}
		}
	}
}