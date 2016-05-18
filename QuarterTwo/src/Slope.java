import java.util.Scanner;

public class Slope {
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		System.out.println("What is the slope of the line?");
		int slope = kb.nextInt();
		System.out.println("What is the y intercept of the line?");
		int yIntercept = kb.nextInt();
		System.out.println("What x should we start at?");
		int startX = kb.nextInt();
		System.out.println("What x should we end at?");
		int endX = kb.nextInt();
		for (int i = startX; i <= endX; i++) {
			System.out.println("(" + i + ", " + (slope * i + yIntercept) + ")");
		}
	}
}
