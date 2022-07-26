import java.util.Scanner;

/* 
 *  @author: Batuhan Efe Alkış
 * 
 * 	Patika Java101 Hesap makinesi
 * 
 */

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n1, n2, secim;

		System.out.println("1. sayıyı giriniz: ");
		n1 = scan.nextInt();

		System.out.println("2. sayıyı giriniz: ");
		n2 = scan.nextInt();

		System.out.println("1 - Toplama \n2 - Çıkarma \n3 - Çarpma \n4 - Bölme \nSeçiminizi giriniz: ");
		secim = scan.nextInt();

		if (secim == 1)
			System.out.println("Toplam: " + (n1 + n2));
		else if (secim == 2)
			System.out.println("Çıkarma: " + (n1 - n2));
		else if (secim == 3)
			System.out.println("Çarpma: " + (n1 * n2));
		else if (secim == 4)
			System.out.println("Bölme: " + (n1 / n2));

		scan.close();

	}
}
