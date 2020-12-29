package iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class array {

	public static void main(String[] args) {
		int[] num = { 1, 33, 2, 21, 45, 11 };
		int largest = num[0];
		int smallest = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				largest = num[i];

			} else if (num[i] < smallest) {
				smallest = num[i];
			}
		}
		System.out.println("num are=" + Arrays.toString(num));
		System.out.println("largest=" + largest);
		System.out.println("smallest=" + smallest);

	}
}
