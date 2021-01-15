package absExamples;

interface ABC{
	int a=10;
	void m1();
}
interface xyz{
	int b=21;
	void m2();
}
public class MultipleInheritance implements ABC, xyz { // multiple inher can be able to get by implement keyword

	public void m1() {
		System.out.println(a);
	}
	public void m2() {
		System.out.println(b);
	}
	public static void main(String[] args) {
		MultipleInheritance mt= new MultipleInheritance();
		mt.m1();
		mt.m2();
	}
}
