import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;

		System.out.println("Taban: ");
		n1 = sc.nextInt();

		System.out.println("Üs: ");
		n2 = sc.nextInt();

		System.out.println("Sonuç: " + uslu(n1, n2));
	}

	static int uslu(int n1, int n2) {
		if (n2 == 1) {
			return n1;
		} else {
			return n1 * uslu(n1, n2 - 1);
		}
	}
}
