package oops;

public class Student1 {
	int Sid;
	String Sname;
	int Sub1;
	int Sub2;
	int Sub3;
	
	public void getStudata() {
		Sid=101;
		Sname="Anshuman";
		
	}
	public void getStuMarks() {
		Sub1=32;
		Sub2=34;
		Sub3=39;
		
	}
	public void totalMarks() {
		System.out.println("total marks of"+Sname+"="+(Sub1+Sub2+Sub3));
		
	}
	public static void main(String[] args) {
		Student1 std1=new Student1();
		std1.getStuMarks();
		std1.getStudata();
		std1.totalMarks();
		
	}

}
