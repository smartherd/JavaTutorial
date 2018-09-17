
/**
 *
 *  Relational Operator
 * */
public class Main {

	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		int z = 3;

		// Greater than and Greater than equal to
		boolean r1 = x > y; 	// r1 = false
		boolean r2 = y >= z;	// r2 = true

		// Less than or less than equal to
		boolean r3 = y < x;		// r3 = false
		boolean r4 = x <= y;	// r4 = true

		// Is equal to and Is not equal to
		boolean r5 = x == y;	// r5 = false
		boolean r6 = (x != y);	// r6 = true

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		System.out.println(r6);
	}
}
