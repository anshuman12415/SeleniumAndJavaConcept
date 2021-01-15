package exceptions;

public class ExceptionHandling {
	public static void main(String[] args) {

		String s2=null;
		//int b = 100;

		//int a1[] = new int[5];

		try {
			System.out.println(s2.length());
			

		} catch (Exception e) {
			System.out.println("entered into catch block");

		}
	}
}
