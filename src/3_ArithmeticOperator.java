
/**
 *
 *  Arithmetic Operators
 * */
public class Main {

	public static void main(String[] args) {

		// Arithmetic Operator
		int result =  3 + 1 - 7 * 5 % 3 / 2;        // Left to Right, [ * / % ] > [ + - ]

		System.out.println(result);
		// => 3 + 1 - 7 * 5 % 3 / 2
		// => 3 + 1 - 35 % 3 / 2
		// => 3 + 1 - 2 / 2
		// => 3 + 1 - 1
		// => 4 - 1
		// => 3
	}
}
