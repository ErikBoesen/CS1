public class RandomArray {
	public static void main(String[] args) {
		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 1000);
			System.out.println(i + ": " + nums[i]);
		}
		int greatest = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > greatest) {
				greatest = nums[i];
			}
		}
		System.out.println("The greatest number is " + greatest + ".");
	}
}
