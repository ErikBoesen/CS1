
public class FourSimpleArrays {
	public static void main(String[] args) {
		int [] lottoArray = new int [3];
		for (int i = 0; i < lottoArray.length; i++) {
			lottoArray[i] = (int)(Math.random() * 10);
		}
		
		int[] danLotto = {6, 9, 7};
		int matches = 0;
		boolean won = false;
		
		int rounds = 1;
		
		do {
			System.out.println("Round " + rounds);
			for (int i = 0; i <= 2; i++) {
				System.out.println(lottoArray[i]);
				System.out.println("Dan: " + danLotto[i]);
				if (lottoArray[i] == danLotto[i]) {
					matches++;
				}
			}
			if (matches == 3) {
				System.out.println("CONGRATULATIONS YOU WIN MONEY");
				won = true;
			}
			matches = 0;
			rounds++;
		} while (!won);
	}
}
