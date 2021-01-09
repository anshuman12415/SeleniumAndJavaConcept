package stringsDT;

public class Stringmethods {
public static void main(String[] args) {
	
	String s="I am";
	String s1="Anshuman";
	System.out.println(s1.length());
	System.out.println(s1.charAt(3));
	System.out.println(s1.lastIndexOf(s1));
	System.out.println(s.concat(" "+ s1));
	System.out.println(s1.contains("nsh"));
	System.out.println(s.equals("I am"));
	System.out.println(s1.equalsIgnoreCase("anshuman"));
	System.out.println(s1.equalsIgnoreCase("Anshuman"));
	System.out.println(s1.replace('s', 'v'));
	System.out.println(s.replace("I", "He"));
	
	s="     welcome    ";
	System.out.println(s.trim()); //removing spaces
	System.out.println(s.substring(1,3));  // starting index--> starts from 0, Ending index starts from 1
	// charAt(3), 
	System.out.println(s1.substring(1, 3));
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
}
}
