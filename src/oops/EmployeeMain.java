package oops;

public class EmployeeMain {
	public static void main(String args[]) {

		Employee emp1 = new Employee();
		emp1.eid = 101;
		emp1.ename = "anshuman";
		emp1.sal = 121.5;
		emp1.depno = 111;
		emp1.job = "QA";
		emp1.display();

	
	Employee emp2 = new Employee();
	System.out.println("==============");
	emp2.eid = 111;
	emp2.ename = "anshuman";
	emp2.sal = 121.5;
	emp2.depno = 111;
	emp2.job = "QA";
	emp2.display();
	}
}
