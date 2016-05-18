import java.util.Scanner;

public class ProjectOne {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = kb.next();
		System.out.println("What is your pay per hour (in USD)?");
		double hourly = kb.nextDouble();
		System.out.println("How many hours did you work this week?");
		double hours = kb.nextDouble();
		double totalPay;
		if (hours > 40) {
			double overtimeHours = hours - 40;
			totalPay = 40 * hourly + overtimeHours * hourly * 1.5;
		}
		else {
			totalPay = hourly * hours;
		}
		System.out.println(name + ", you will make $" + totalPay + " this week.");
	}
}