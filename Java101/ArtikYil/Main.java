import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int yil;

		System.out.println("Yıl giriniz: ");
		yil = sc.nextInt();

		if (yil % 4 == 0) {
			if (yil % 100 == 0) {
				if (yil % 400 == 0) {
					System.out.println(yil + " artık yıldır");
				} else {
					System.out.println(yil + " artık yıl değildir");
				}
			} else {
				System.out.println(yil + " artık yıldır");
			}
		} else {
			System.out.println(yil + " artık yıl değildir");
		}

		sc.close();
	}
}
