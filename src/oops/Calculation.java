package oops;

public class Calculation {

	int x = 10;
	int y = 20;

	/*
	 * int sum() { return (x+y); }
	 */

	/*
	 * void sum(int a, int b) { System.out.println(a + b); }
	 */

	int sum(int a, int b) { //case 4- method is taking parameter and also returning value
		return (a + b);
	}

	
	public static void main(String[] args) {
		Calculation cal = new Calculation();

		// cal.sum(); //case 1
		/*
		 * int res = cal.sum(); // case 2 System.out.println(res);
		 * System.out.println(cal.sum());
		 */
		//cal.sum(100, 200); // case 3 (taking parameter, but not returning anything
		System.out.println(cal.sum(200, 200)); 
	}
}
