package oops;

class bank {
	double RateofInterest() {
		return 0;
	}
}

class sbi extends bank {
	double RateofInterest() {
		return 10.5;
	}
}

class icici extends bank {
	double RateofInterest() {
		return 9.7;
	}
}

public class MethodoverridingExample {
	public static void main(String[] args) {

		sbi s = new sbi();
		System.out.println(s.RateofInterest());

		icici ic = new icici();
		System.out.println(ic.RateofInterest());
	}
}
