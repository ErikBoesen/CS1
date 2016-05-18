public class Lockers {
	public static void main(String[] args) {
		int rand;
		boolean[] lockers = new boolean[100];
		int[] open = new int[10];
		int openPosition = 0;
		for (int i = 0; i < lockers.length; i++) {
			lockers[i] = false;
		}
		for (int i = 0; i < open.length; i++) {
			do {
				rand = (int)(Math.random() * lockers.length);
			} while (lockers[rand]);
			lockers[rand] = true;
		}
		for (int i = 0; i < lockers.length; i++) {
			if (lockers[i]) {
				open[openPosition] = i;
				openPosition++;
			}
		}
		System.out.print("Locker numbers ");
		for (int i = 0; i < open.length; i++) {
			if (open.length - i == 1) {
				System.out.print("and " + open[i] + " are open.");
			}
			else {
				System.out.print(open[i] + ", ");
			}
		}
	}
}
