import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sayi;

		System.out.println("Sayı giriniz: ");
		sayi = sc.nextInt();

		dongu(sayi, (sayi <= 0), 0);

		sc.close();
	}

	static void dongu(int n, boolean neg, int count) {
		if (neg) {
			if (count == 0) {
				System.out.print(n);
			} else {
				System.out.print(n + " ");
				count--;
				dongu(n + 5, neg, count);
			}
		} else {
			System.out.print(n + " ");
			if (n - 5 <= 0) {
				neg = true;
			}
			count++;
			dongu(n - 5, neg, count);
		}
	}
}
