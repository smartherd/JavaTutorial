
/**
 *
 *  IF ELSE, NESTED IF ELSE
 * */
public class Main {

	public static void main(String[] args) {

		int salary = 25000;

		if (salary > 15000) {
			if (salary > 20000) {
				System.out.println("You got Promotion + Bonus. Congratulations !");
			} else {
				System.out.println("You got promotion. Congratulations !");
			}
		} else {
			System.out.println("You need to work hard !");
		}
	}
}
