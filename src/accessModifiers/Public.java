package accessModifiers;

class K{
	public int data=12;
	public void m3() {
		System.out.println(data);
	}
}
public class Public {
	public static void main(String[] args) {
		K p=new K();
		p.m3();
		
	}

	
}
