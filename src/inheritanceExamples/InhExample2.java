package inheritanceExamples;

class Parent {
	int a;

	void display() {
		System.out.println(a);
	}
}

class child1 extends Parent {
	int x;

	void show() {
		System.out.println(x);
	}

}

class child2 extends Parent {
	int y;

	void print() {
		System.out.println(y);
	}
}

public class InhExample2 {

	public static void main(String[] args) {
		child1 c1= new child1();
		c1.a=21;
		c1.x=11;
		c1.display();
		c1.show();
	}
}
