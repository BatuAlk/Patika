import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Bir sayı giriniz: ");
		int sayi = sc.nextInt();

		System.out.print(sayi + " sayısından küçük dördün kuvvetleri: ");
		for (int i = 1; i < sayi; i *= 4) {
			System.out.println(i);
		}

		System.out.print(sayi + " sayısından küçük beşin kuvvetleri: ");
		for (int i = 1; i < sayi; i *= 5) {
			System.out.println(i);
		}

		sc.close();
	}
}
