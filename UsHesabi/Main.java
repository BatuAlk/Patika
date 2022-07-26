import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, n2, sonuc = 1;

		System.out.println("Üssü alınacak sayı: ");
		n1 = sc.nextInt();

		System.out.println("Üs: ");
		n2 = sc.nextInt();

		for (int i = 1; i <= n2; i++) {
			sonuc *= n1;
		}

		System.out.println("Sonuç: " + sonuc);

		sc.close();
	}
}
