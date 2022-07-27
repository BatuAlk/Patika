import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Sayı giriniz: ");
		int n = sc.nextInt();

		if (isPalindrom(n)) {
			System.out.println(n + " bir palindrom sayıdır.");
		} else {
			System.out.println(n + " palindrom değildir.");
		}
    sc.close();
	}

	static boolean isPalindrom(int n) {
		boolean pal = false;
		int sum = 0, temp = n;
		while (n > 0) {
			int kalan = n % 10;
			sum = (sum * 10) + kalan;
			n /= 10;
		}
		if (temp == sum) {
			pal = true;
		} else {
			pal = false;
		}
    
		return pal;
	}
}
