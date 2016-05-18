import java.util.Scanner;

public class CollegeAdmission {
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = kb.next();
		System.out.println("Hi " + name + "! What is your high school GPA?");
		double gpa = kb.nextDouble();
		System.out.println("What is your math SAT score?");
		int math = kb.nextInt();
		System.out.println("What is your verbal SAT score?");
		int verbal = kb.nextInt();
		double score = 500 * gpa + math + verbal;  
		if (score > 3350) {
			System.out.println("Congratulations " + name + ", you are eligible for the Honors program at Harvard College!");
		}
		else if (score > 2500 && score < 3350) {
			System.out.println("Congratulations " + name + ", you are eligible for the regular program at Harvard College!");
		}
		else {
			System.out.println("Sorry " + name + ", you are not eligible for our school. Maybe try Nova Community College?");
		}
	}
}
