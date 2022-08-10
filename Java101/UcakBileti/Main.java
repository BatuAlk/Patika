import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int mesafe, yas, tip;
		double hesap = 0.10, tutar = 0;

		System.out.println("Gidilen mesafeyi km cinsinden giriniz: ");
		mesafe = sc.nextInt();

		System.out.println("Yaşınızı giriniz: ");
		yas = sc.nextInt();

		System.out.println("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
		tip = sc.nextInt();

		if (mesafe < 0 || yas < 0 || (tip != 1 && tip != 2)) {
			System.out.println("Hatalı veri girişi!");
		} else if (yas > 0) {
			if (yas < 12 && yas >= 0) {
				tutar = mesafe * hesap * (1 / 2);
			} else if (yas <= 24 && yas >= 12) {
				tutar = mesafe * hesap * 0.9;
			} else if (yas > 65) {
				tutar = mesafe * hesap * 0.7;
			} else {
				tutar = mesafe * hesap;
			}

			if (tip == 2) {
				tutar = tutar * 0.8 * 2;
			}
			System.out.println("Toplam tutar: " + tutar);
		}

		sc.close();
	}
}
