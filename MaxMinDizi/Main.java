import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] numbers = { 15, 12, 788, 1, -1, -778, 2, 0 };
		System.out.println("Dizi: " + Arrays.toString(numbers));

		Scanner sc = new Scanner(System.in);
		int input, min = 0, max = 0;

		System.out.println("Sayı giriniz: ");
		input = sc.nextInt();
		Arrays.sort(numbers);

		for (int n : numbers) {
			if (n < input) {
				min = n;
			}
			if (n > input) {
				max = n;
				break;
			}
		}
		System.out.println(
				"Girilen sayıdan küçük en yakın sayı :" + min + "\n" + "Girilen sayıdan büyük en yakın sayı :" + max);

		sc.close();

	}
}
