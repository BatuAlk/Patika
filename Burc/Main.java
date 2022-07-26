import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int ay, gun;

		System.out.println("Doğduğunuz ayı (0-12 arasında) giriniz: ");
		ay = scan.nextInt();

		System.out.println("Doğduğunuz günü giriniz: ");
		gun = scan.nextInt();

		if (ay == 1) {
			if (gun > 0 && gun <= 21) {
				System.out.println("Burcunuz oğlak");
			} else if (gun > 0 && gun <= 31) {
				System.out.println("Burcunuz kova");
			} else
				System.out.println("Geçersiz gün girişi");

		} else if (ay == 2) {
			if (gun > 0 && gun <= 19) {
				System.out.println("Burcunuz kova");
			} else if (gun > 0 && gun <= 29) {
				System.out.println("Burcunuz balık");
			} else
				System.out.println("Geçersiz gün girişi");

		} else if (ay == 3) {
			if (gun > 0 && gun <= 20) {
				System.out.println("Burcunuz balık");
			} else if (gun > 0 && gun <= 31) {
				System.out.println("Burcunuz koç");
			} else
				System.out.println("Geçersiz gün girişi");

		} else if (ay == 4) {
			if (gun > 0 && gun <= 20) {
				System.out.println("Burcunuz koç");
			} else if (gun > 0 && gun <= 30) {
				System.out.println("Burcunuz boğa");
			} else
				System.out.println("Geçersiz gün girişi");

		} else if (ay == 5) {
			if (gun > 0 && gun <= 21) {
				System.out.println("Burcunuz boğa");
			} else if (gun > 0 && gun <= 31) {
				System.out.println("Burcunuz ikizler");
			} else
				System.out.println("Geçersiz gün girişi");

		} else if (ay == 6) {
			if (gun > 0 && gun <= 22) {
				System.out.println("Burcunuz ikizler");
			} else if (gun > 0 && gun <= 30) {
				System.out.println("Burcunuz yengec");
			} else
				System.out.println("Geçersiz gün girişi");

		} else if (ay == 7) {
			if (gun > 0 && gun <= 22) {
				System.out.println("Burcunuz yengec");
			} else if (gun > 0 && gun <= 31) {
				System.out.println("Burcunuz aslan");
			} else
				System.out.println("Geçersiz gün girişi");

		} else if (ay == 8) {
			if (gun > 0 && gun <= 22) {
				System.out.println("Burcunuz aslan");
			} else if (gun > 0 && gun <= 31) {
				System.out.println("Burcunuz başak");
			} else
				System.out.println("Geçersiz gün girişi");

		} else if (ay == 9) {
			if (gun > 0 && gun <= 22) {
				System.out.println("Burcunuz başak");
			} else if (gun > 0 && gun <= 30) {
				System.out.println("Burcunuz terazi");
			} else
				System.out.println("Geçersiz gün girişi");

		} else if (ay == 10) {
			if (gun > 0 && gun <= 22) {
				System.out.println("Burcunuz terazi");
			} else if (gun > 0 && gun <= 31) {
				System.out.println("Burcunuz akrep");
			} else
				System.out.println("Geçersiz gün girişi");

		} else if (ay == 11) {
			if (gun > 0 && gun <= 21) {
				System.out.println("Burcunuz terazi");
			} else if (gun > 0 && gun <= 30) {
				System.out.println("Burcunuz yay");
			} else
				System.out.println("Geçersiz gün girişi");

		} else if (ay == 12) {
			if (gun > 0 && gun <= 21) {
				System.out.println("Burcunuz yay");
			} else if (gun > 0 && gun <= 31) {
				System.out.println("Burcunuz oğlak");
			} else
				System.out.println("Geçersiz gün girişi");
		} else {
			System.out.println("Geçersiz ay girişi");
		}

		scan.close();
	}
}
