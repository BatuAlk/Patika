public class MineSweeper {
	String[][] matris;
	int elemanSayisi;
	int mayinSayisi;
	boolean[][] mayinList;
	boolean gameOver = false;

	public MineSweeper(int row, int col) {
		matris = new String[row][col];
		elemanSayisi = row * col;
		mayinSayisi = elemanSayisi / 4;
		mayinList = new boolean[row][col];
		mayinDizme();
	}

	public void mayinDizme() {
		for (int i = 0; i < mayinSayisi; i++) {
			int rowIndex = (int) (Math.random() * matris.length);
			int colIndex = (int) (Math.random() * matris[0].length);
			if (!mayinList[rowIndex][colIndex]) {
				matris[rowIndex][colIndex] = "* ";
				mayinList[rowIndex][colIndex] = true;
			}
		}
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] != "* ") {
					matris[i][j] = "- ";
				}
			}
		}
	}

	public void print() {
		System.out.println("===========================");
		for (String[] list : matris) {
			for (String s : list) {
				if (s.equals("* ")) {
					System.out.print("-  ");
				} else {
					System.out.print(s + " ");
				}
			}
			System.out.println();
		}
	}

	public void play(int row, int col) {
		if (row >= matris.length || col >= matris[0].length) {
			System.out.println("Yanlış konum girişi!");
		} else {
			if (mayinList[row][col]) {
				gameOver = true;
			} else {
				String count = Integer.toString(mayinSayimi(row, col));
				matris[row][col] = count + " ";
			}
		}
	}

	public int mayinSayimi(int row, int col) {
		int count = 0;
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (i == row && j == col) {
					if (i > 0) {
						if (mayinList[i - 1][j]) {
							count++;
						}
						if (j > 0 && mayinList[i - 1][j - 1]) {
							count++;

						}
						if (j < matris[0].length - 1 && mayinList[i - 1][j + 1]) {
							count++;
						}
					}
					if (i < matris.length - 1) {
						if (mayinList[i + 1][j]) {
							count++;
						}
						if (j > 0 && mayinList[i + 1][j - 1]) {
							count++;
						}
						if (j < matris[0].length - 1 && mayinList[i + 1][j + 1]) {
							count++;
						}
					}
					if (j < matris[0].length - 1 && mayinList[i][j + 1]) {
						count++;
					}
					if (j > 0 && mayinList[i][j - 1]) {
						count++;
					}
				}
			}
		}
		return count;
	}
}
