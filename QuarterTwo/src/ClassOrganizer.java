import javax.swing.JOptionPane;

public class ClassOrganizer {
	public static void main(String[] args) {
		String[] names = new String[6];
		for (int i =  0; i < names.length; i++) {
			names[i] = JOptionPane.showInputDialog("What is your name?");
		}
		int[] nums = new int[6];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog("What is " + names[i] + "'s favorite number?"));
		}
		for (int i = nums.length; i > 0; i--) {
			int highest = nums[0];
			int spot = 0;
			for (int j = 1; j < i; j++) {
				if (nums[j] > highest) {
					highest = nums[j];
					spot = j;
				}
			}
			int temp = nums[i - 1];
			nums[i - 1] = highest;
			nums[spot] = temp;
			String tempName = names[i - 1];
			names[i - 1] = names[spot];
			names[spot] = tempName;
		}
		int query = Integer.parseInt(JOptionPane.showInputDialog("Which number do you want to find?"));
		int results = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == query) System.out.println(names[i] + " has the favorite number of " + query);
			results++;
		}
		if (results == 0) System.out.println(query + " isn't anyone's favorite. Sorry!");
	}
}
