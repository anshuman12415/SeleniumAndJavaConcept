package loops;

public class ForLoop {
	public static void main(String[] args) {

		int i;
		for (i = 1; i < 10; i++) {
			
		
		if (i == 5 || i==3 || i==2) { //or
			continue;  // break;

		}
		System.out.println(i);
	}

}
}