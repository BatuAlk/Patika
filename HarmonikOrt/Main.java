public class Main {
	public static void main(String[] args) {
		int[] numbers = { 5, 3, 2, 6, 7, 8 };
		double harmonicSum = 0;

		for (int num : numbers) {
			harmonicSum += (double) 1 / num;
		}

		System.out.println(harmonicSum / numbers.length);
	}
}
