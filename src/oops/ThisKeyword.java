package oops;

public class ThisKeyword {
	
	int a, b; //instance/class variable
	
	void getvalue(int a, int b) { //method variable/external var
		this.a=a;
		this.b=b;
	}
	void printValue() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		ThisKeyword tk=new ThisKeyword();
		tk.getvalue(10, 20);
		tk.printValue();
		
	}

}
