import javax.swing.JOptionPane;

public class Order {
	public static void main(String[] args) {
		String[] fnames = new String[10];
		String[] lnames = new String[10];
		int[] grades = new int[10];
		for (int i =  0; i < fnames.length; i++) {
			fnames[i] = JOptionPane.showInputDialog("What is student #" + (i+1) + "'s first name?");
			lnames[i] = JOptionPane.showInputDialog("What is student #" + (i+1) + "'s last name?");
			grades[i] = Integer.parseInt(JOptionPane.showInputDialog("What grade is student #" + (i+1) + " in?"));
		}
		for (int i = 0; i < 5; i++) {
			for (int j = lnames.length - 1; j > 0; j--) {
				if (lnames[j].charAt(0) > lnames[j - 1].charAt(0)) {
					String sTemp = lnames[j - 1];
					lnames[j - 1] = lnames[j];
					lnames[j] = sTemp;
					
					int temp = grades[j - 1];
					grades[j - 1] = grades[j];
					grades[j] = temp;
	
					sTemp = fnames[j - 1];
					fnames[j - 1] = fnames[j];
					fnames[j] = sTemp;
				} else if (lnames[j].charAt(0) == lnames[j - 1].charAt(0)) {
					if (lnames[j].charAt(1) > lnames[j - 1].charAt(1)) {
						String sTemp = lnames[j - 1];
						lnames[j - 1] = lnames[j];
						lnames[j] = sTemp;
						
						int temp = grades[j - 1];
						grades[j - 1] = grades[j];
						grades[j] = temp;
		
						sTemp = fnames[j - 1];
						fnames[j - 1] = fnames[j];
						fnames[j] = sTemp;
				}
			}
		}}
		for (int k = grades.length; k > 0; k--) {
			int highest = grades[0];
			int spot = 0;
			for (int j = 1; j < k; j++) {
				if (grades[j] > highest) {
					highest = grades[j];
					spot = j;
				}
			}
			int temp = grades[k - 1];
			grades[k - 1] = highest;
			grades[spot] = temp;
			String tempName = lnames[k - 1];
			lnames[k - 1] = lnames[spot];
			lnames[spot] = tempName;
			tempName = fnames[k - 1];
			fnames[k - 1] = fnames[spot];
			fnames[spot] = tempName;
		}
		
		for (int l = 0; l < fnames.length; l++) {
			System.out.println(lnames[l] + ", " + fnames[l] + ", " + grades[l]); 
		}
	}
}
