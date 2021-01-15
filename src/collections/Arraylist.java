package collections;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(); // store any type of element
		// ArrayList<String> al = new ArrayList<String>(); // string type
		// ArrayList<Integer> AI = new ArrayList<Integer>();//integer type

		// adding values in arraylistg
		al.add("anshuman");
		al.add("sonam");
		al.add("man");
		al.add(123);
		al.add('a');

		// getting size of al
		System.out.println(al.size());
		System.out.println(" before removing element" + al);

		// remove element
		al.remove(1);
		System.out.println(al.size());
		System.out.println("after removing element" + al);

		al.add(1, "sonam");
		System.out.println(al.size());
		System.out.println("after inserting" + al);

		System.out.println("===============");

		// read value from arraylist using for each loop
		/*
		 * for(String s:al) { System.out.println(s);
		 * 
		 * }
		 */

		for (Object s : al) { // object type variable can hold any type of data value
			System.out.println(s);

		}
	}

}
