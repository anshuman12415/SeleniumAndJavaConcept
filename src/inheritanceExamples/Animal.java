package inheritanceExamples;

public class Animal {
	String color = "white";
	
	void eating() {
		System.out.println("eating");
	}
	Animal(){
		System.out.println("animal created");
	}
	
}

class dog extends Animal {
	String color = "black";
	
	dog(){
		super();// immediate parent class constructor
		System.out.println("dog is created");
		
	}
	
	/*void eating() { //immediate parent class method
		System.out.println("eating bread.....");
		super.eating();
	}
*/

	/*void displayclolor() {
		System.out.println(color);
		System.out.println(super.color);//immediate parent class variable will call
	}*/
}
