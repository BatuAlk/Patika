import java.util.Scanner;

/* 
 *  @author: Batuhan Efe Alkış
 * 
 * 	Patika Java101 Hipotenüs ve alan
 * */

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a_dik, b_dik;

		System.out.println("Üçgenin 1. dik kenarını giriniz: ");
		a_dik = scan.nextInt();

		System.out.println("Üçgenin 2. dik kenarını giriniz: ");
		b_dik = scan.nextInt();

		double c = Math.sqrt(Math.pow(a_dik, 2) + Math.pow(b_dik, 2));
		System.out.println("Hipotenüs:   " + c + "\n");

		int k1, k2, k3;

		System.out.println("Üçgenin 1. kenarını giriniz: ");
		k1 = scan.nextInt();

		System.out.println("Üçgenin 2. kenarını giriniz: ");
		k2 = scan.nextInt();

		System.out.println("Üçgenin 3. kenarını giriniz: ");
		k3 = scan.nextInt();

		int cevre = k1 + k2 + k3;
		int u = cevre / 2;
		double alan = Math.sqrt(u * (u - k1) * (u - k2) * (u - k3));
		System.out.println("Üçgenin alanı:  " + alan);

		scan.close();

	}
}
