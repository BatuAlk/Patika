import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sayi;

		System.out.println("Sayı giriniz: ");
		sayi = sc.nextInt();

		for (int i = 1; i <= sayi; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < 2 * (sayi - i + 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}
}
