package javaProg;

public class ConditionalStatements {

	public static void main(String[] args) {

		int age = 18;

		/*
		 * if(age>=18) { System.out.println("eligible for voting"); }
		 * System.out.println("prgm exited");
		 */

		if (age >= 18) {
			System.out.println("eligible for voting");
		} else {
			System.out.println("not eligible for vote");
		}

		int day = 9;
		switch (day) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("twesday");
			break;

		default:  //if not match, default will come and display
			System.out.println("saturday");
			break;
		}
	}

}
