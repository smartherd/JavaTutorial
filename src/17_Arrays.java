
/**
 *
 *      Arrays
 * */
public class Main {

	public static void main(String[] args) {

		int[] firstSet = {2, 4, 7, 5, 11};

		int[] secondSet = new int[5];
		secondSet[0] = 2;
		secondSet[1] = 4;
		secondSet[2] = 7;
		secondSet[3] = 5;
		secondSet[4] = 11;

		for (int i = 0; i < firstSet.length; i++) {
			System.out.println(firstSet[i]);
		}

		System.out.println();

		for (int number: secondSet) {
			System.out.println(number);
		}
	}
}
