
/**
 *
 *   Increment and Decrement Operator
 * */
public class Main {

	public static void main(String[] args) {

		// Post-increment:  First operation then increment [ age++ ]
		// Pre-increment:   First Increment then operation [ ++age ]

		int age = 10;
		System.out.println(age++); // Prints 10
		// => age = 11
		System.out.println(++age); // Prints 12
		// => age = 12

		System.out.println(age++ + ++age); // 12 + 14 = 26


		int sonAge = 10;
		System.out.println(sonAge--); // Prints 10
		// => sonAge = 9
		System.out.println(--sonAge); // Prints 8
		// => sonAge = 8

		System.out.println(sonAge-- + --sonAge); // 8 + 6 = 14
	}
}
