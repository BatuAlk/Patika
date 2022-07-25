import java.util.Scanner;

/* 
 *  @author: Batuhan Efe Alkış
 * 
 * 	Patika Java101 KDV projesi
 * */

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int para;

		System.out.println("KDV'si hseaplanacak ücreti giriniz: ");
		para = scan.nextInt();

		float kdv = 0;
		if (0 < para && para < 1000) {
			kdv = 0.18f;
		} else if (para >= 1000) {
			kdv = 0.08f;
		}

		scan.close();
		System.out.println("KDV'li para: " + (para + para * kdv));
	}
}
