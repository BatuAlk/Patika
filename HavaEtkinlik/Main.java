import java.util.Scanner;

/* 
 *  @author: Batuhan Efe Alkış
 * 
 * 	Patika Java101 hava etkinlik öneri
 * 
 */

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int temp;

		System.out.println("Hava sıcaklığını derece cinsinden giriniz: ");
		temp = scan.nextInt();

		if (temp < 5) {
			System.out.println("Kayak yapabilirsiniz.");
		} else if (5 <= temp && temp <= 15) {
			System.out.println("Sinemaya gidebilirsiniz.");
		} else if (15 <= temp && temp <= 25) {
			System.out.println("Piknik yapmaya gidebilirsiniz.");
		} else if (temp > 25) {
			System.out.println("Yüzmeye gidebilirsiniz.");
		}

		scan.close();

	}
}
