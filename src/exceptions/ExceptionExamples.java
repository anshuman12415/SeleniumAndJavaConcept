package exceptions;

public class ExceptionExamples {
	
	public static void main(String[] args) {
		
		System.out.println("program is started");
		System.out.println("program is in progress");
		
		/*int a=100;
		System.out.println(a/0);*/  // arithmetic ex
		
		/*String s="ABC";
		int x= Integer.parseInt(s);
		System.out.println(x);*/  // number format ex
		
		/*String s=null;
		System.out.println(s.length());*/ //null pointer
		
		int a[] = new int[5];
		a[10]=20;
		System.out.println(a); //ArrayIndexOutOfBoundsException 
		
		System.out.println("program is Completed");
		System.out.println("program is in Exited");
		
	}

}
