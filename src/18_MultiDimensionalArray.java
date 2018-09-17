
/**
 *
 *      2D Array and Jagged Array
 * */
public class Main {

	public static void main(String[] args) {

		int[][] myArray = {
				{2, 45, 6, 32},
				{4, 65, 34},
				{7, 8, 12, 5}
		};

		for (int r = 0; r < myArray.length; r++) {
			for (int c = 0; c < myArray[r].length; c++) {
				System.out.print(myArray[r][c] + " ");
			}
			System.out.println();
		}

		// WAP to find sum

		int sum = 0;
		for (int[] aMyArray: myArray) {
			for (int anMyArray: aMyArray) {
				sum = sum + anMyArray;
			}
		}

		System.out.println("Sum is: " + sum);
	}
}
