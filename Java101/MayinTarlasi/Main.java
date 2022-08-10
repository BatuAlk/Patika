import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row, col;
		System.out.println("Matris satır sayısı: ");
		row = sc.nextInt();

		System.out.println("Matris sütun sayısı: ");
		col = sc.nextInt();

		MineSweeper mine = new MineSweeper(row, col);

		System.out.println("Mayın tarlası oyununa hoşgeldiniz!");

		while (!mine.gameOver) {
			int rowInput, colInput;
			mine.print();
			System.out.println("Satır giriniz: ");
			rowInput = sc.nextInt();
			System.out.println("Sütun giriniz: ");
			colInput = sc.nextInt();
			mine.play(rowInput, colInput);

		}
		if (mine.gameOver) {
			System.out.println("Game over!!");
		}

		sc.close();
	}
}
