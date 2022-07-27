import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input, a = 0, b = 1;

		System.out.println("Sayı giriniz: ");
		input = sc.nextInt();

		System.out.print(0 + " " + 1 + " ");

		for (int i = 2; i < input; i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;

		}

		sc.close();
	}
}
