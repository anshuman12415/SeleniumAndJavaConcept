package inheritanceExamples;

public class FinalVariable {
	final int speed=10; //final variable, can't change it's value
	
	public static void main(String[] args) {
		FinalVariable fv= new FinalVariable();
		//fv.speed=100; //comile time error
		System.out.println(fv.speed);
		
	}

}
