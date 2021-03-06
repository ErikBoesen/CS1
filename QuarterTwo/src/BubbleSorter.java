

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class BubbleSorter {
	public static void main(String[] args) {
		double[] array = new double[20];
		String counter = "";
		DecimalFormat df = new DecimalFormat("#.##"); 
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * 4;
			counter += '\n' + df.format(array[i]);
		}
		JOptionPane.showMessageDialog(null, "GPAs:\n" + counter);
		// Bubble sort
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j-1] > array[j]) {
					double temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		counter = "";
		for (int i = 0; i < array.length; i++) {
			counter += '\n' + df.format(array[i]);
		}
		JOptionPane.showMessageDialog(null, "Sorted:\n" + counter);
	}
}
