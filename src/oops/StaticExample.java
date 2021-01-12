package oops;

public class StaticExample {

	int a = 10; // non static variable
	static int b = 11; // static variable

	static void m1() {
		System.out.println("static method");
	}

	void m2() {
		System.out.println("non static method");
	}
	void m3() {
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
		 StaticExample se= new StaticExample();
		System.out.println(b);
		// System.out.println(m2);
		m1();
		se.m3();
	}
}
