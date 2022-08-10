import java.util.Scanner;

/* 
 *  @author: Batuhan Efe Alkış
 * 
 * 	Patika Java101 VKİ hesabı
 * 
 */

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int kilo;
		double boy, indeks;

		System.out.println("Boyunuzu metre cinsinden giriniz:  ");
		boy = scan.nextDouble();

		System.out.println("Kilonuzu giriniz:  ");
		kilo = scan.nextInt();

		indeks = kilo / (boy * boy);

		System.out.println("Vücut Kitle İndeksiniz: " + indeks);

		scan.close();

	}
}
