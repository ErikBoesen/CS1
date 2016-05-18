import java.util.Scanner;

public class Palindromes {
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		System.out.println("Please enter the word you want printed backwards.");
		String word = kb.next();
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		System.out.println(reverse); 
		if (word.equalsIgnoreCase(reverse)) {
			System.out.println(word + " is a palindrome.");
		}
		else {
			System.out.println(word + " is not a palindrome.");
		}
	}
}
