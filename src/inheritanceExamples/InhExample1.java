package inheritanceExamples;  // single level inheritance

class A {
	int a;

	void main() {
		System.out.println(a);
	}
}

class B extends A {
	int b;

	void m2() {
		System.out.println(b);
	}
}

class C extends B{ //2. Multilevel inheritance
	int c;
	void m3() {
		System.out.println(c);
	}
}

public class InhExample1 {
	public static void main(String[] args) {

		/*A aobj = new A();
		aobj.a = 100;
		aobj.main();
		
		B bobj=new B();
		bobj.b=211;
		bobj.m2();*/
		
		C cobj= new C();
		cobj.a=11;
		cobj.b=12;
		cobj.c=13;
		cobj.main();
		cobj.m2();
		cobj.m3();
	}
}
