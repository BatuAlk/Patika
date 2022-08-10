import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input, adet = 0, toplam = 0;
		double ortalama;

		System.out.println("Bir sayı giriniz: ");
		input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			if (i % 12 == 0) {
				toplam += i;
				adet++;
			}
		}

		ortalama = toplam / adet;
		System.out.println(input + "\'a kadar girilen sayılardan 3 ve 4\'e bölünenlerin ortalaması: " + ortalama);
		
		sc.close();
	}
}
