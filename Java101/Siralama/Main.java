import java.util.Scanner;

/* 
 *  @author: Batuhan Efe Alkış
 * 
 * 	Patika Java101 sayı sıralama
 * 
 */

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b, c;

		System.out.println("1. sayıyı (a) giriniz: ");
		a = scan.nextInt();

		System.out.println("2. sayıyı (b) giriniz: ");
		b = scan.nextInt();

		System.out.println("3. sayıyı (c) giriniz: ");
		c = scan.nextInt();

		if (a > b) {
			if (c > a) {
				System.out.println("c > a > b");
			} else if (c > b) {
				System.out.println("a > c > b");
			} else {
				System.out.println("a > b > c");
			}
		} else {
			if (c > b) {
				System.out.println("c > b > a");
			} else if (c > a) {
				System.out.println("b > c > a");
			} else {
				System.out.println("b > a > c");
			}
		}

		scan.close();
	}
}
