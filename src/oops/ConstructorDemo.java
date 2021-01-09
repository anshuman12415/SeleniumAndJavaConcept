package oops;

public class ConstructorDemo {
	int x;
	int y;

	ConstructorDemo() { // default constructor
		x = 10;
		y = 20;
	}

	ConstructorDemo(int a, int b) {
		x = a;
		y = b;
	}

	void display() {
		System.out.println(x + y);
	}

	public static void main(String args[]) {
		ConstructorDemo demo = new ConstructorDemo(); // invoke default constructor
		ConstructorDemo demo1 = new ConstructorDemo(100,200); //parametrized constructor
		demo.display();
		demo1.display();

	}
}
