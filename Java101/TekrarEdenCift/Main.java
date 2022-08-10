import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] num = { 3, 7, 3, 3, 2, 9, 10, 21, 1, 9, 3, 1, 2, 4, 4, 4 };
		int[] duplicates = new int[num.length];
		int index = 0;
		Arrays.sort(num);
		for (int i = 0; i < num.length - 1; i++) {
			if (num[i] == num[i + 1] && num[i] % 2 == 0) {
				duplicates[index++] = num[i];
			}
		}

		for (int i : duplicates) {
			if (i != 0) {
				System.out.println(i);
			}
		}
	}
}
