package oops;

public class ConstructorOverloading {

	ConstructorOverloading(int a, int b) { // 1
		System.out.println(a + b);
	}

	ConstructorOverloading(double a, int b) { // 2
		System.out.println(a + b);
	}

	ConstructorOverloading(double a, double b) { // 3
		System.out.println(a + b);
	}

	ConstructorOverloading(int a, int b, int c) { // 4
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		ConstructorOverloading CO = new ConstructorOverloading(10, 20, 30);

	}

}
