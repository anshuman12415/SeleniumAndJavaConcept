package accessModifiers;

class A{
	private int data =11; // accessible within the class
	private void m1() {
		
	}
}

public class Private {

	public static void main(String[] args) {
		A obj= new A();
	//	obj.data=20; //compile time error
	//	obj.m1(); //compile time error
	}
}
