package oops;

public class MethodOverloading {

	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(double a, int b) {
		System.out.println(a + b);
	}

	void add(double a, double b) {
		System.out.println(a + b);
	}

	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		MethodOverloading MO = new MethodOverloading();
		MO.add(10, 20);
		MO.add(11.12, 12);
		MO.add(23.00, 44);
		MO.add(11, 12, 13);
	}

}
