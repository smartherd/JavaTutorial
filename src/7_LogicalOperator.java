
/**
 *
 *   Logical Operator
 * */
public class Main {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		boolean A = num1 > 50; // False
		boolean B = num2 > 5;   // True

		System.out.println(A && B);

		System.out.println(A || B);

		System.out.println(!(A || B));

	}
}
