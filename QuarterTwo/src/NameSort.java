import javax.swing.JOptionPane;

public class NameSort 
{

	public static void main(String[] args) {
		int amount = Integer.parseInt(JOptionPane.showInputDialog("How many name do you want to sort?"));
		String[] name = new String[amount];
		for(int i = 0; i < amount; i++) {
			name[i] = JOptionPane.showInputDialog("What is the name of student #" + (i+1) + "?");
		}
		String counter = "";
		for(int i = 0; i < amount; i++) {
			counter = counter + name[i] + " ";
		}
		JOptionPane.showMessageDialog(null, "Names (not in order): " + counter + " ");
		System.out.println("Names (not in order): " + counter + "  ");
		for(int i = 0; i < amount; i++) {
			int minimum = i;
			for(int j = 1; j < amount; j++) {
				int choice = name[j].charAt(0);
				
				if(choice < name[minimum].charAt(0)) {
					minimum = j; 
				}
				else if(choice == name[minimum].charAt(0)) {
					int minimumAmount = name[minimum].length();
					if(minimumAmount > name[j].length()) {
						minimumAmount = name[j].length();
					}
					for(int k = 1; k < minimumAmount; k++) {
						if(name[j].charAt(k)<name[minimum].charAt(k)) {
							minimum = j; 
							break;
						}
					}
				}
			}
			String temp = name[i];
			name[i] = name[minimum];
			name[minimum] = temp; 
		}
		
		counter = ""; 
		for(int i = 0; i < amount; i++) {
			counter = counter + name[i] + " ";
		}
		JOptionPane.showMessageDialog(null, "Names (in order): " + counter + "  ");
		System.out.println("Names (in order): " + counter + "  ");
	}
}