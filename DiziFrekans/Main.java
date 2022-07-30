import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = { 10, 20, 20, 10, 10, 20, 5, 20 };
		System.out.println("Dizi : " + Arrays.toString(nums));
		Arrays.sort(nums);
		int[] dup = new int[nums.length];

		for (int i = 0; i < dup.length; i++) {
			dup[i] = 1;
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[i] == nums[j]) {
					dup[i]++;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if ((i != j) && (nums[i] == nums[j])) {
					nums[j] = 0;
				}
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (dup[i] > 1) {
				if (nums[i] != 0)
					System.out.println(nums[i] + " sayısı " + dup[i] + " kere tekrar edildi.");
			}
		}
	}
}
