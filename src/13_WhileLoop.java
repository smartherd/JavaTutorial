
/**
 *
 *      While Loop
 * */
public class Main {

	public static void main(String[] args) {

		int i = 0;
		while (i <= 20) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}

		System.out.println();

		int j = 20;
		while (j >= 0) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
			j--;
		}
	}
}
