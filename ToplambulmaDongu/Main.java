import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input, toplam = 0;
		do {
			System.out.println("Sayı giriniz: ");
			input = sc.nextInt();
			if (input % 4 == 0) {
				toplam += input;
			}
		} while (input % 2 != 1);

		System.out.println("Girilen sayıların toplamı: " + toplam);

		sc.close();
	}
}
