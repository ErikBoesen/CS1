import java.util.Scanner;

public class Project3 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("First number:");
		int num1 = kb.nextInt();
		System.out.println("Second number:");
		int num2 = kb.nextInt();
		for (int i = num1; i <= num2; i = i + 1) {
			System.out.println(i + " * 2 = " + (i * 2));
		}
	}
	
}
