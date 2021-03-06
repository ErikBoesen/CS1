public class ScoreAverage {
	public static void main(String[] args) {
		int[] scores = new int[10];
		for (int i = 0; i < 10; i++) {
			scores[i] = (int)(Math.random() * 100 + 1);
		}
		int greatest = scores[0];
		for (int i = 1; i < 10; i++) if (scores[i] > greatest) greatest = scores[i];
		int lowest = scores[0];
		for (int i = 1; i < 10; i++) if (scores[i] < lowest) lowest = scores[i];
		double a = 0;
		for (int i = 0; i < 10; i++) a += scores[i];
		a -= greatest + lowest;
		a /= 8.0;
		System.out.println(a);
	}
}
