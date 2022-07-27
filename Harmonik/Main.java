import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input;
		double toplam = 0;

		System.out.println("Sayı giriniz: ");
		input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			toplam += (double) 1 / i;
		}

		System.out.println(input + " sayısının harmonik serisi: " + toplam);
		sc.close();
	}
}
