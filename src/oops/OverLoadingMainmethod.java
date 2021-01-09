package oops;

public class OverLoadingMainmethod {

	public void main(int x) {
		System.out.println(x);
	}

	public void main(int x, int y) {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		OverLoadingMainmethod MO= new OverLoadingMainmethod();
		MO.main(12);
		MO.main(13, 15);
	}
}
