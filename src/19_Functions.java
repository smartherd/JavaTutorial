
/**
 *
 *		Methods or Functions
 * */
public class Main {

	public static void main(String[] args) {

		// WAP to find if a number is even or odd
		String result1 = isEven(4);
		String result2 = isEven(5);

		System.out.println(result1);
		System.out.println(result2);
	}

	private static String isEven(int num) {

		String str;

		if (num % 2 == 0)
			str = num + " is Even";
		else
			str = num +" is odd";

		return str;
	}
}
