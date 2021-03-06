import javax.swing.JOptionPane;

public class StudentArray {
	public static void main(String[] args) {
		String[] names = new String[5];
		String phrase = "The students are ";
		for (int i = 0; i < 5; i++) {
			names[i] = JOptionPane.showInputDialog("What is the name of student " + (i + 1) + "?");
			phrase += (i == 4 ? "and " + names[i] + "." : names[i] + ", ");
		}
		JOptionPane.showMessageDialog(null, phrase);
		
		for (int i = 0; i < 5; i++) {
			int ran = (int)(Math.random() * (i + 1));
			String temp = names[ran];
			names[ran] = names[i];
			names[i] = temp;
		}
		
		String input = JOptionPane.showInputDialog("Enter your string.");
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) output += input.charAt(i);
		JOptionPane.showMessageDialog(null, input + " backwards is " + output + ".");
	}
}
