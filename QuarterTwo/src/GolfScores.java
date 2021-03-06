import javax.swing.JOptionPane;

public class GolfScores {
	public static void main(String[] args) {
		int[] mason = new int[6];
		int[] clarke = new int[6];
		for (int i = 0; i < 6; i++) {
			mason[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter Mason score #" + (i + 1)));
		}
		for (int i = 0; i < 6; i++) {
			clarke[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter Clarke score #" + (i + 1)));
		}

		int mGreatest1 = mason[0];
		int mGreatest2 = mason[0];
		for (int i = 1; i < 6; i++) {
			if (mason[i] > mGreatest1) {
				mGreatest2 = mGreatest1 = mason[i];
			}
		}
		int cGreatest1 = clarke[0];
		int cGreatest2 = clarke[0];
		for (int i = 1; i < 6; i++) {
			if (mason[i] > cGreatest1) {
				cGreatest2 = cGreatest1 = clarke[i];
			}
		}
		
		double mA = 0;
		double cA = 0;
		for (int i = 0; i < 6; i++) {
			mA += mason[i];
			cA += clarke[i];
		}
		
		mA = (mA - mGreatest1 - mGreatest2) / 4.0;
		cA = (cA - cGreatest1 - cGreatest2) / 4.0;
		
		JOptionPane.showMessageDialog(null, "Mason average is " + mA + ", Clarke average is " + cA + ". " + (mA < cA ? "Mason had better average scores." : "Clarke had better average scores."));
	}
}
