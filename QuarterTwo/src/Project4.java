import java.util.Scanner;

public class Project4 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = kb.next();
		System.out.println("How many rows of stars do you want?");
		int rows = kb.nextInt();
		System.out.println(name + " wants " + rows + " rows of stars!");
		for (int i = 0; i < rows; i++) {
			for (int i2 = 0; i2 < i; i2++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
