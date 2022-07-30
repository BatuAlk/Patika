import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.println("Dizi boyutunu giriniz: ");
		input = sc.nextInt();

		int[] numbers = new int[input];

		for (int i = 0; i < input; i++) {
			System.out.println((i + 1) + ". sayıyı giriniz: ");
			numbers[i] = sc.nextInt();
		}

		Arrays.sort(numbers);
		System.out.print("Sıralama: ");
		for (int n : numbers) {
			System.out.print(n + " ");
		}
	}
}
