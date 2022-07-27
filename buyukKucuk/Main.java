import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int adet, min = 0, max = 0;

		System.out.println("Gireceğiniz sayı adedi: ");
		adet = sc.nextInt();

		for (int i = 1; i <= adet; i++) {
			System.out.println(i + ". sayıyı giriniz: ");
			int sayi = sc.nextInt();
			if (i == 1) {
				min = max = sayi;
			}
			if (sayi < min) {
				min = sayi;
			}
			if (sayi > max) {
				max = sayi;
			}
		}

		System.out.println("En büyük sayı: " + max);
		System.out.println("En küçük sayı: " + min);

		sc.close();
	}
}
