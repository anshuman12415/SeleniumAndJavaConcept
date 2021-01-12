package inheritanceExamples;

/*final*/ class bike { //final class not be extend
	int speed = 10;

	void run() {
		System.out.println(speed);
	}
}

class honda extends bike { //compile time error
	int speed = 100;

	void run() {
		System.out.println(speed);
	}
}

public class FinalClass {
	public static void main(String[] args) {

	}

}
