import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int s1, s2, ebob = 1, ekok;

		System.out.println("1. sayı: ");
		s1 = sc.nextInt();

		System.out.println("2. sayı: ");
		s2 = sc.nextInt();

		for (int i = 1; i <= s1; i++) {
			if (s1 % i == 0 && s2 % i == 0) {
				ebob = i;
			}
		}
		ekok = (s1 * s2) / ebob;
		System.out.println("Ebob: " + ebob);
		System.out.println("Ekok: " + ekok);

		sc.close();
	}
}
