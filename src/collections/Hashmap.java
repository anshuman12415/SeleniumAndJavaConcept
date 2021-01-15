package collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static void main(String[] args) {
		
	
	//Hashmap hm= new Hashmap();
	
	HashMap<Integer,String> hm= new HashMap<Integer, String>();
	
	// add value
	hm.put(1, "anshuman");
	hm.put(2, "kumar");
	hm.put(3, "ray");
	
	System.out.println(hm);
	System.out.println(hm.get(2));
	hm.remove(2);
	hm.size();
	System.out.println(hm);
	
	System.out.println("===============");
	
	// read value from for loop
	for(Map.Entry m:hm.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
}}
