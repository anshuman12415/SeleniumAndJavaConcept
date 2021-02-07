package arrayDT;

public class ArrayQuestions {
	public static void main(String[] args) {

		// WAP to calcualte sum value of an array

		int a[] = { 1, 2, 3, 14 };
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		System.out.println("sum of array is " + sum);

	}

}
