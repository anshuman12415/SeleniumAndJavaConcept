package collections;

import java.util.HashSet;
import java.util.Iterator;

import loops.WhileLoop;

public class HashSetCollection {
	public static void main(String[] args) {

		// HashSet hs= new HashSet();
		HashSet<String> hs = new HashSet<String>();
		hs.add("rohit");
		hs.add("kumar");

		System.out.println(hs.size());
		System.out.println("=============");

		for (String s : hs) {
			System.out.println(s);
			System.out.println("=================");
		}

		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
