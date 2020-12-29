package iteration;

public class AnshumanOverloading {
	public void add(int a, int b) {
		int z = a + b;
		System.out.println("z=" + z);
	}

	public void add(int a, int b, int c) {
		int z = a + b + c;
		System.out.println("z=" + z);

	}

	public static void main(String[] args) {
		AnshumanOverloading a = new AnshumanOverloading();
		a.add(11, 12);
		a.add(1, 2, 44);
	}
}
