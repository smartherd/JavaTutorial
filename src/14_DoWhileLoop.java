
/**
 *
 *      Do-While Loop
 * */
public class Main {

	public static void main(String[] args) {

		int i = 0;
		do {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 20);

		System.out.println();

		int j = 20;
		do {
			if (j % 2 == 0) {
				System.out.println(j);
			}
			j--;
		} while (j >= 0);
	}
}
