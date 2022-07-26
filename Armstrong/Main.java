import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input, toplam = 0, temp = 0;

		System.out.println("Basamak toplamı hesaplanacak sayı: ");
		input = sc.nextInt();

		do {
			temp = input % 10;
			toplam += temp;

			input /= 10;

		} while (input != 0);

		System.out.println("Basamak toplamı: " + toplam);
		sc.close();
	}
}
