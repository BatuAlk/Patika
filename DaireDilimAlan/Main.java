import java.util.Scanner;

/* 
 *  @author: Batuhan Efe Alkış
 * 
 * 	Patika Java101 Daire dilim alanı
 * 
 */

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int r, aci;
		double alan, pi = 3.14;

		System.out.println("Yarıçapın uzunluğunu giriniz:  ");
		r = scan.nextInt();

		System.out.println("Merkez açı boyutunu giriniz:  ");
		aci = scan.nextInt();

		alan = pi * r * r * (aci / 360);

		System.out.println("Daire diliminin alanı:  " + alan);

		scan.close();

	}
}
