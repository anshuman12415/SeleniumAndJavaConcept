package inheritanceExamples;

class dog1 {
	 void bark() {//use here,final //can't overide this method in child class
		System.out.println("barking");
	}
}

class cat extends dog1 {
	void bark() { //compile time error
		System.out.println("cat run faster");
	}
}

public class FinalMethod {
	public static void main(String[] args) {
		
	}

}
