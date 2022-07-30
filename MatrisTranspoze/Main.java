public class Main {
	public static void main(String[] args) {
		int[][] list1 = { { 2, 3, 4 }, { 5, 6, 4 } };
		System.out.println("Matris: ");
		printList(list1);

		int[][] list2 = new int[list1[0].length][list1.length];

		for (int j = 0; j < list1.length; j++) {
			for (int i = 0; i < list1[j].length; i++) {
				list2[i][j] = list1[j][i];
			}
		}
		System.out.println("\nTranspoze: ");
		printList(list2);
	}

	public static void printList(int[][] list) {
		for (int[] x : list) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
}
