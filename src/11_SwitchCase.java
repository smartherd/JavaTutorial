
/**
 *
 *  Switch Case Statements
 * */
public class Main {

	public static void main(String[] args) {

		char grade = 'B';

		switch (grade) {
			case 'A':
				System.out.println("Excellent. Grade A.");
				break;
			case 'B':
				System.out.println("Well Done. Grade B.");
				break;
			case 'C':
				System.out.println("You Passed. Grade C");
				break;
			case 'F':
				System.out.println("Failed, Grade F");
				break;
			default:
				System.out.println("Invalid Grade Entered");
		}
	}
}
