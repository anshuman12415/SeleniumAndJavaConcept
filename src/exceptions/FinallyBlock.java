package exceptions;

public class FinallyBlock {
	public static void main(String[] args) {
		System.out.println("program started");
		
		int a=100;
		try {
			System.out.println(a/0);
		}catch(NullPointerException e) {
			System.out.println("entered in catch block");
		}
		finally {
			System.out.println("program executed");
		}
	}

}
