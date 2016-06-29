

public class ArrayAssignment {
	public static void main(String[] args) {
		int[] n = new int[5];
		for (int i = 0; i < n.length; i++) {
			n[i] = (int)(Math.random() * 100);
		}
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		System.out.println("");
		for (int i = n.length; i > 0; i--) {
			int highest = n[0];
			int spot = 0;
			for (int j = 0; j < i; j++) {
				if (n[j] > highest) {
					highest = n[j];
					spot = j;
				}
			}
			int temp = n[i - 1];
			n[i - 1] = highest;
			n[spot] = temp;
		}
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}
}
