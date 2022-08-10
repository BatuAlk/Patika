import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N, r, Nfaktor = 1, rfaktor = 1, NfarkRfaktor = 1;
		double sonuc;

		System.out.println("Eleman sayısını giriniz: ");
		N = sc.nextInt();

		System.out.println("Kombinasyon gruplarının eleman sayısını giriniz: ");
		r = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			Nfaktor *= i;
		}

		for (int i = 1; i <= r; i++) {
			rfaktor *= i;
		}

		for (int i = 1; i <= N - r; i++) {
			NfarkRfaktor *= i;
		}

		sonuc = Nfaktor / (rfaktor * NfarkRfaktor);

		System.out.println("kombinasyon sonucu: " + sonuc);

		sc.close();
	}
}
