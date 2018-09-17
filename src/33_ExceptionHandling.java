
// Exception Handling
// 1. Basics of Exception Handling
// 2. Handling multiple exceptions at same time
// 3. Handling unknown exceptions
public class Main {

	public static void main(String[] args) {

		System.out.println("Program starts");           // Executed

		int[] myArray = { 3, 9, 45, 22, 16 };

		try {
			int result = myArray[1] / 0;                   // Arithmetic Exception

			System.out.println(myArray[1]);                // ArrayIndexOutOfBoundException, App crashed
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException exception) {
			// Your code.. Optional
			System.out.println(exception);
		} finally {
			// your code.. Optional
			System.out.println("The finally block is always executed");
		}

		try {
			String name = null; // No object
			System.out.println(name.length());
		} catch (Exception exception) {         // General way to handle the exception
			System.out.println(exception);
		}

		System.out.println("Program ends");             // Executed .
	}
}
