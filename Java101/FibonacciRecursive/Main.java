public class Main {

	public static void main(String[] args) {

		System.out.println(fibonacci(5));

	}

	static int fibonacci(int n) {

		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
