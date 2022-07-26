import java.util.Scanner;

/* 
 *  @author: Batuhan Efe Alkış
 * 
 * 	Patika Java101 kullanıcı girişi
 * 
 */

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int mat, fizik, turkce, kimya, muzik;
		double averaj;

		System.out.println("Matematik notunuzu giriniz:");
		mat = scan.nextInt();
		System.out.println("Fizik notunuzu giriniz:");
		fizik = scan.nextInt();
		System.out.println("Türkçe notunuzu giriniz:");
		turkce = scan.nextInt();
		System.out.println("Kimya notunuzu giriniz:");
		kimya = scan.nextInt();
		System.out.println("Müzik notunuzu giriniz:");
		muzik = scan.nextInt();

		if ((0 > mat || 100 < mat) || (0 > fizik || 100 < fizik) || (0 > turkce || 100 < turkce)
				|| (0 > kimya || 100 < kimya) || (0 > muzik || 100 < muzik)) {
			System.out.println("Notlar 0 ile 100 arasında olmalı!");
		} else {
			averaj = (mat + fizik + turkce + kimya + muzik) / 5;
			System.out.println("Ortalamanız: " + averaj);

			if (averaj >= 55) {
				System.out.println("Geçtiniz");
			} else {
				System.out.println("Kaldınız");
			}
		}

		scan.close();

	}
}
