
public class SecondGreatest {
	public static void main(String[] args) {
		int greatest = 0,
			second = 0;
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 15 + 1);
			if (nums[i] > greatest) {
				second = greatest;
				greatest = nums[i];
			}
		}
		System.out.println("Greatest: " + greatest + ", Second: " + second);
	}
}
