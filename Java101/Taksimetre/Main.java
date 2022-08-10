import java.util.Scanner;

/* 
 *  @author: Batuhan Efe Alkış
 * 
 * 	Patika Java101 Taksimetre
 * 
 */

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int km, baslangicUcreti = 10;
		double kmBasinaFiyat = 2.20, fiyat;

		System.out.println("Gidilen km miktarını giriniz: ");
		km = scan.nextInt();

		fiyat = (km * kmBasinaFiyat + baslangicUcreti < 20) ? 20 : km * kmBasinaFiyat + baslangicUcreti;

		System.out.println("Tutar: " + fiyat + " TL");

		scan.close();

	}
}
