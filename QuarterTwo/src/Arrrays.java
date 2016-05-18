import javax.swing.JOptionPane;

public class Arrrays {
	public static void main(String[] args) {
		String[] names = new String[10];
		for (int i = 0; i < 10; i++) {
			String name = JOptionPane.showInputDialog("What is your name?");
			names[i] = name;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Student " + (i + 1) + ", your name is " + names[i]);
		}
		int winner = (int)(Math.random() * 10);
		System.out.println("Congratulations " + names[winner] + ", you do not die this quarter!");
	}
}
